package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.cae_query_search;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent;
import com.cyc.cycjava.cycl.rtp.rtp_datastructures;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.function.Supplier;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cae_query_search.*;
import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHT_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ELEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIFTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOURTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.MINUS_ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NINETEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NINE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVENTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIXTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIX_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THIRTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWELVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWENTY_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class cae_query_search extends SubLTranslatedFile {
    public static final SubLFile me = new cae_query_search();

    public static final String myName = "com.cyc.cycjava.cycl.cae_query_search";

    public static final String myFingerPrint = "5adc54c228cadeb9490bd9844ea5cd211f5746ea3a3455da0dfb6fad19a8c32e";

    // defparameter
    // Definitions
    private static final SubLSymbol $query_search_filter_tree$ = makeSymbol("*QUERY-SEARCH-FILTER-TREE*");

    // defparameter
    public static final SubLSymbol $cae_include_semtrans_fragmentsP$ = makeSymbol("*CAE-INCLUDE-SEMTRANS-FRAGMENTS?*");

    // deflexical
    private static final SubLSymbol $cae_query_search_table_lock$ = makeSymbol("*CAE-QUERY-SEARCH-TABLE-LOCK*");

    // defparameter
    private static final SubLSymbol $use_new_query_search$ = makeSymbol("*USE-NEW-QUERY-SEARCH*");

    // defparameter
    public static final SubLSymbol $cae_query_search_skip_nl_generation$ = makeSymbol("*CAE-QUERY-SEARCH-SKIP-NL-GENERATION*");

    // defparameter
    private static final SubLSymbol $cure_use_inference_for_questions$ = makeSymbol("*CURE-USE-INFERENCE-FOR-QUESTIONS*");

    // defparameter
    private static final SubLSymbol $cae_query_search_inference_parameters$ = makeSymbol("*CAE-QUERY-SEARCH-INFERENCE-PARAMETERS*");

    // defparameter
    public static final SubLSymbol $cae_query_search_skip_nl_generationP$ = makeSymbol("*CAE-QUERY-SEARCH-SKIP-NL-GENERATION?*");



    // defparameter
    /**
     * The default value should remain NIL. The only purpose for this variable is to
     * allow code to override the information available from the task, when there is
     * no appropriate task available
     */
    public static final SubLSymbol $cae_query_search_default_mt$ = makeSymbol("*CAE-QUERY-SEARCH-DEFAULT-MT*");









    // deflexical
    /**
     * The listp of all mts for which the KB has been scanned and rules haves added
     * to *genl/isa-args-to-queries*
     */
    private static final SubLSymbol $cae_query_search_initialized_mts$ = makeSymbol("*CAE-QUERY-SEARCH-INITIALIZED-MTS*");

    // deflexical
    private static final SubLSymbol $cae_combine_fragmentsP$ = makeSymbol("*CAE-COMBINE-FRAGMENTS?*");







    // deflexical
    private static final SubLSymbol $cae_default_variable_format$ = makeSymbol("*CAE-DEFAULT-VARIABLE-FORMAT*");

    // deflexical
    // Note -- These are ordered in the order we want them displayed.
    private static final SubLSymbol $cae_categorized_query_folders$ = makeSymbol("*CAE-CATEGORIZED-QUERY-FOLDERS*");



    // deflexical
    private static final SubLSymbol $fragment_formulas_equalP_caching_state$ = makeSymbol("*FRAGMENT-FORMULAS-EQUAL?-CACHING-STATE*");





    // defparameter
    private static final SubLSymbol $sanity_check_glossesP$ = makeSymbol("*SANITY-CHECK-GLOSSES?*");

    // defvar
    private static final SubLSymbol $allow_full_sentence_query_interps$ = makeSymbol("*ALLOW-FULL-SENTENCE-QUERY-INTERPS*");

    // deflexical
    private static final SubLSymbol $suggested_free_position_for_predP_caching_state$ = makeSymbol("*SUGGESTED-FREE-POSITION-FOR-PRED?-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $any_not_isa_cachedP_caching_state$ = makeSymbol("*ANY-NOT-ISA-CACHED?-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $any_isa_cachedP_caching_state$ = makeSymbol("*ANY-ISA-CACHED?-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $any_not_genl_cachedP_caching_state$ = makeSymbol("*ANY-NOT-GENL-CACHED?-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $query_search_irreflexiveP_caching_state$ = makeSymbol("*QUERY-SEARCH-IRREFLEXIVE?-CACHING-STATE*");







    // deflexical
    // Result sets larger than this are not useful.
    private static final SubLSymbol $superstring_match_max_useful_hit_count$ = makeSymbol("*SUPERSTRING-MATCH-MAX-USEFUL-HIT-COUNT*");

    // deflexical
    private static final SubLSymbol $cae_query_search_wordifiers$ = makeSymbol("*CAE-QUERY-SEARCH-WORDIFIERS*");

    // defparameter
    private static final SubLSymbol $new_keyword_vars$ = makeSymbol("*NEW-KEYWORD-VARS*");



    // defvar
    private static final SubLSymbol $cae_query_term_augmentations$ = makeSymbol("*CAE-QUERY-TERM-AUGMENTATIONS*");















    // defparameter
    // parser to parse CAE queries
    private static final SubLSymbol $cae_query_translation_parser$ = makeSymbol("*CAE-QUERY-TRANSLATION-PARSER*");

    // defparameter
    // lexicon used during CAE query translation
    private static final SubLSymbol $cae_query_translation_lexicon$ = makeSymbol("*CAE-QUERY-TRANSLATION-LEXICON*");

    // defparameter
    // functions translating specific syntactic constructions into CycL
    private static final SubLSymbol $cae_query_translators$ = makeSymbol("*CAE-QUERY-TRANSLATORS*");

    // defparameter
    private static final SubLSymbol $cae_query_translation_wff_mt$ = makeSymbol("*CAE-QUERY-TRANSLATION-WFF-MT*");

    // defparameter
    private static final SubLSymbol $cae_query_translation_ontology_mt$ = makeSymbol("*CAE-QUERY-TRANSLATION-ONTOLOGY-MT*");

    // defparameter
    private static final SubLSymbol $cae_query_translation_parsing_mt$ = makeSymbol("*CAE-QUERY-TRANSLATION-PARSING-MT*");

    // defparameter
    private static final SubLSymbol $cae_query_translation_domain_mt$ = makeSymbol("*CAE-QUERY-TRANSLATION-DOMAIN-MT*");

    // defconstant
    public static final SubLSymbol $dtp_justified_interpretation$ = makeSymbol("*DTP-JUSTIFIED-INTERPRETATION*");

    // defconstant
    public static final SubLSymbol $dtp_term_record$ = makeSymbol("*DTP-TERM-RECORD*");

    // defparameter
    /**
     * list of functions that take a justified-interpretation and a cycl map and
     * return true if the ji passes the constraint, nil otherwise
     */
    private static final SubLSymbol $qs_global_syntactic_constraints$ = makeSymbol("*QS-GLOBAL-SYNTACTIC-CONSTRAINTS*");

    // deflexical
    private static final SubLSymbol $individualP_cached_caching_state$ = makeSymbol("*INDIVIDUAL?-CACHED-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $isa_collectionP_cached_caching_state$ = makeSymbol("*ISA-COLLECTION?-CACHED-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $collection_passes_constraintsP_caching_state$ = makeSymbol("*COLLECTION-PASSES-CONSTRAINTS?-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $individual_passes_constraintsP_caching_state$ = makeSymbol("*INDIVIDUAL-PASSES-CONSTRAINTS?-CACHING-STATE*");

    // defparameter
    private static final SubLSymbol $comparator_predicates$ = makeSymbol("*COMPARATOR-PREDICATES*");

    // defparameter
    // comparator string patterns to match
    private static final SubLSymbol $comparator_regexes$ = makeSymbol("*COMPARATOR-REGEXES*");

    // defparameter
    // comparator compiled regular expression patterns to match
    private static final SubLSymbol $comparator_patterns$ = makeSymbol("*COMPARATOR-PATTERNS*");

    // defconstant
    public static final SubLSymbol $dtp_token_record$ = makeSymbol("*DTP-TOKEN-RECORD*");



    // deflexical
    private static final SubLSymbol $bad_query_search_strings$ = makeSymbol("*BAD-QUERY-SEARCH-STRINGS*");

    // deflexical
    private static final SubLSymbol $bad_query_search_queries$ = makeSymbol("*BAD-QUERY-SEARCH-QUERIES*");

    // Internal Constants
    public static final SubLString $str0$data_query_search_filter_tree_txt = makeString("data/query-search-filter-tree.txt");

    private static final SubLString $$$CAE_Query_Search_Table_Lock = makeString("CAE Query Search Table Lock");

    private static final SubLList $list2 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), TWO_INTEGER);

    public static final SubLSymbol $current_cae_task$ = makeSymbol("*CURRENT-CAE-TASK*");



    private static final SubLSymbol WITH_CURRENT_CAE_TASK = makeSymbol("WITH-CURRENT-CAE-TASK");

    private static final SubLList $list6 = list(makeSymbol("TASK"), makeSymbol("&BODY"), makeSymbol("BODY"));





    private static final SubLList $list9 = list(makeSymbol("FORT-P"));



    private static final SubLObject $$GeneralCycKETask_Allotment = reader_make_constant_shell(makeString("GeneralCycKETask-Allotment"));

    private static final SubLObject $$CAETask_Indexical = reader_make_constant_shell(makeString("CAETask-Indexical"));

    private static final SubLSymbol INDEXICAL_CAE_TASK = makeSymbol("INDEXICAL-CAE-TASK");

    private static final SubLSymbol CAE_QUERY_SEARCH_DEFAULT_MT = makeSymbol("CAE-QUERY-SEARCH-DEFAULT-MT");

    private static final SubLSymbol CAE_DEFAULT_QUERY_MT = makeSymbol("CAE-DEFAULT-QUERY-MT");

    private static final SubLSymbol CAE_DEFAULT_WFF_CHECKING_MT = makeSymbol("CAE-DEFAULT-WFF-CHECKING-MT");

    private static final SubLSymbol $genl_args_to_queries$ = makeSymbol("*GENL-ARGS-TO-QUERIES*");

    private static final SubLSymbol $isa_args_to_queries$ = makeSymbol("*ISA-ARGS-TO-QUERIES*");

    private static final SubLSymbol $genl_args_to_suppressed_queries$ = makeSymbol("*GENL-ARGS-TO-SUPPRESSED-QUERIES*");

    private static final SubLSymbol $isa_args_to_suppressed_queries$ = makeSymbol("*ISA-ARGS-TO-SUPPRESSED-QUERIES*");

    private static final SubLSymbol $sym21$_CAE_COMBINE_FRAGMENTS__ = makeSymbol("*CAE-COMBINE-FRAGMENTS?*");





    private static final SubLSymbol ADD_QUERY_SEARCH_TABLE_ASSERTION = makeSymbol("ADD-QUERY-SEARCH-TABLE-ASSERTION");

    private static final SubLSymbol REMOVE_QUERY_SEARCH_TABLE_ASSERTION = makeSymbol("REMOVE-QUERY-SEARCH-TABLE-ASSERTION");









    private static final SubLList $list30 = list(makeString("don't care"));



    private static final SubLString $str32$Error_adding__S_to_query_search_t = makeString("Error adding ~S to query search table:~% ~S");

    private static final SubLSymbol MAKE_FORMULA_FOR_RULE_RHS_CACHED = makeSymbol("MAKE-FORMULA-FOR-RULE-RHS-CACHED");

    private static final SubLSymbol $make_formula_for_rule_rhs_cached_caching_state$ = makeSymbol("*MAKE-FORMULA-FOR-RULE-RHS-CACHED-CACHING-STATE*");

    private static final SubLInteger $int$3000 = makeInteger(3000);

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLSymbol $sym37$_X = makeSymbol("?X");

    private static final SubLSymbol STANDARD_XYZ_ARGLIST = makeSymbol("STANDARD-XYZ-ARGLIST");



    private static final SubLSymbol $standard_xyz_arglist_caching_state$ = makeSymbol("*STANDARD-XYZ-ARGLIST-CACHING-STATE*");

    private static final SubLObject $$StatisticalPredicate = reader_make_constant_shell(makeString("StatisticalPredicate"));







    private static final SubLString $str45$Initializing_query_search_tables_ = makeString("Initializing query search tables from ");

    private static final SubLString $str46$____ = makeString(" ...");











    private static final SubLObject $$UnaryPredicate = reader_make_constant_shell(makeString("UnaryPredicate"));

    private static final SubLList $list53 = list(makeSymbol("?PRED"), makeSymbol("?X"));

    private static final SubLSymbol $sym54$_PRED = makeSymbol("?PRED");

    private static final SubLObject $$BinaryPredicate = reader_make_constant_shell(makeString("BinaryPredicate"));

    private static final SubLList $list56 = list(makeSymbol("?PRED"), makeSymbol("?X"), makeSymbol("?Y"));

    private static final SubLObject $$TernaryPredicate = reader_make_constant_shell(makeString("TernaryPredicate"));

    private static final SubLList $list58 = list(makeSymbol("?PRED"), makeSymbol("?X"), makeSymbol("?Y"), makeSymbol("?Z"));

    private static final SubLObject $$QuaternaryPredicate = reader_make_constant_shell(makeString("QuaternaryPredicate"));

    private static final SubLList $list60 = list(makeSymbol("?PRED"), makeSymbol("?W"), makeSymbol("?X"), makeSymbol("?Y"), makeSymbol("?Z"));

    private static final SubLObject $$QuintaryPredicate = reader_make_constant_shell(makeString("QuintaryPredicate"));

    public static final SubLList $list62 = list(makeSymbol("?PRED"), makeSymbol("?V"), makeSymbol("?W"), makeSymbol("?X"), makeSymbol("?Y"), makeSymbol("?Z"));

    public static final SubLList $list63 = list(reader_make_constant_shell(makeString("suppressIsaFormulasForCollections")), reader_make_constant_shell(makeString("True")));

    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    private static final SubLList $list65 = list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), makeSymbol("?X"));



    private static final SubLSymbol QUERY_SEARCH_TABLE_PREDS = makeSymbol("QUERY-SEARCH-TABLE-PREDS");

    private static final SubLString $str68$4095f840_8499_11db_8000_0002b3620 = makeString("4095f840-8499-11db-8000-0002b3620a7d");

    private static final SubLString $str69$eb3635f0_d045_11dc_8000_0013728ef = makeString("eb3635f0-d045-11dc-8000-0013728ef690");

    private static final SubLString $str70$9a90ebe1_c1e3_11df_8f35_00219b490 = makeString("9a90ebe1-c1e3-11df-8f35-00219b49082c");

    private static final SubLString $str71$b4d3b60a_8491_11db_8000_0002b3620 = makeString("b4d3b60a-8491-11db-8000-0002b3620a7d");

    private static final SubLString $str72$4d2c9d5a_d044_11dc_8000_0013728ef = makeString("4d2c9d5a-d044-11dc-8000-0013728ef690");

    private static final SubLString $str73$9a90ebe0_c1e3_11df_8f35_00219b490 = makeString("9a90ebe0-c1e3-11df-8f35-00219b49082c");

    private static final SubLString $str74$016b748a_5bf5_4f4a_a05b_7e34d70e2 = makeString("016b748a-5bf5-4f4a-a05b-7e34d70e22c1");

    private static final SubLString $str75$0a832e0f_5677_41c5_ae13_610018a49 = makeString("0a832e0f-5677-41c5-ae13-610018a49026");

    private static final SubLSymbol $query_search_table_preds_caching_state$ = makeSymbol("*QUERY-SEARCH-TABLE-PREDS-CACHING-STATE*");

    public static final SubLList $list77 = list(makeSymbol("?TERM"), makeSymbol("?SET"));

    private static final SubLObject $$assertedSentence = reader_make_constant_shell(makeString("assertedSentence"));



    private static final SubLList $list80 = list(makeSymbol("PRED"), makeSymbol("TYPE"), makeSymbol("SUPPLEMENTAL?"));

    private static final SubLList $list81 = list(makeSymbol("TERM"), makeSymbol("SET"));

    private static final SubLSymbol $sym82$_ELEM = makeSymbol("?ELEM");

    private static final SubLObject $$elementOf = reader_make_constant_shell(makeString("elementOf"));

    private static final SubLString $str84$Unable_to_add_query_search_templa = makeString("Unable to add query search template for rule (~A ?X ~A) -> ~A~%");

    private static final SubLSymbol $sym85$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLSymbol $sym86$_NONE = makeSymbol("?NONE");



    private static final SubLList $list88 = list(reader_make_constant_shell(makeString("generatePredFormulasWithSpecInArg")), reader_make_constant_shell(makeString("generatePredFormulasWithInstanceInArg")));

    private static final SubLList $list89 = list(makeKeyword("GENLS"), makeKeyword("ISA"));

    public static final SubLList $list90 = list(makeSymbol("GEN-PRED"), makeSymbol("TERM"), makeSymbol("ARG-POS"));

    private static final SubLList $list91 = list(makeSymbol("?X"));

    private static final SubLList $list92 = list(makeSymbol("?X"), makeSymbol("?Y"));

    private static final SubLList $list93 = list(makeSymbol("?X"), makeSymbol("?Y"), makeSymbol("?Z"));

    private static final SubLList $list94 = list(makeSymbol("?W"), makeSymbol("?X"), makeSymbol("?Y"), makeSymbol("?Z"));

    private static final SubLList $list95 = list(makeSymbol("?V"), makeSymbol("?W"), makeSymbol("?X"), makeSymbol("?Y"), makeSymbol("?Z"));

    private static final SubLString $str96$Trying_to_add_a_template_for__S__ = makeString("Trying to add a template for ~S, with arity ~S.  Skipping.");

    private static final SubLList $list97 = list(makeSymbol("?GEN-PRED"), makeSymbol("?TERM"), makeSymbol("?ARG-POS"));

    private static final SubLList $list98 = list(reader_make_constant_shell(makeString("generateSentenceForInstances")), reader_make_constant_shell(makeString("generateSentenceForSpecs")));

    public static final SubLList $list99 = list(makeKeyword("ISA"), makeKeyword("GENLS"));

    private static final SubLList $list100 = list(makeSymbol("SENTENCE"), makeSymbol("TERM"));

    private static final SubLObject $$TheQuerySearchFocalTerm = reader_make_constant_shell(makeString("TheQuerySearchFocalTerm"));



    private static final SubLList $list103 = list(makeSymbol("?SENT"), makeSymbol("?TERM"));



    private static final SubLSymbol INDEXED_QUERIES_FROM_STRING_WITH_CONFIDENCES = makeSymbol("INDEXED-QUERIES-FROM-STRING-WITH-CONFIDENCES");





    private static final SubLList $list108 = list(makeKeyword("NOT"), list(makeKeyword("TEST"), makeSymbol("GROUND?")));

    private static final SubLSymbol INDEXED_QUERIES_FROM_TERMS_WITH_CONFIDENCES = makeSymbol("INDEXED-QUERIES-FROM-TERMS-WITH-CONFIDENCES");

    private static final SubLSymbol GET_GLOSS_FOR_INDEXED_QUERY = makeSymbol("GET-GLOSS-FOR-INDEXED-QUERY");



    private static final SubLSymbol $sym112$CYC_VAR_ = makeSymbol("CYC-VAR?");





    private static final SubLList $list115 = list(reader_make_constant_shell(makeString("tensed")));



    private static final SubLString $str117$No_NL_generation_available_for__S = makeString("No NL generation available for ~S");

    private static final SubLSymbol $sym118$_EXIT = makeSymbol("%EXIT");



    private static final SubLSymbol EL_CONJUNCTION_P = makeSymbol("EL-CONJUNCTION-P");



    private static final SubLList $list122 = cons(makeSymbol("OLD-VAR"), makeSymbol("NEW-VAR"));





    private static final SubLList $list125 = list(cons(makeKeyword("FULLY-BOUND"), makeString("Yes/No Questions")), cons(makeKeyword("SIMPLE"), makeString("Simple Fragments")), cons(makeKeyword("TEMPORAL"), makeString("Temporal Questions")), cons(makeKeyword("UNBOUND"), makeString("General Fragments")), cons(makeKeyword("SUPPLEMENTAL"), makeString("Supplemental Fragments")), cons(makeKeyword("COMPLEX"), makeString("Complex Questions")), cons(makeKeyword("STATISTICAL"), makeString("Statistical Questions")));

    private static final SubLSymbol FORMAT_INDEXED_QUERIES_FROM_WITH_CONFIDENCES = makeSymbol("FORMAT-INDEXED-QUERIES-FROM-WITH-CONFIDENCES");

    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    private static final SubLFloat $float$1_0 = makeDouble(1.0);





    private static final SubLSymbol $sym131$CAE_FOLDER_TITLE_PRECEDES_ = makeSymbol("CAE-FOLDER-TITLE-PRECEDES?");





    private static final SubLObject $$QueryTemplateFromSentenceAndIDFn = reader_make_constant_shell(makeString("QueryTemplateFromSentenceAndIDFn"));



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));

    private static final SubLObject $$yesNoQueryFolderEnabled = reader_make_constant_shell(makeString("yesNoQueryFolderEnabled"));

    private static final SubLObject $$SpecificationVariantFn = reader_make_constant_shell(makeString("SpecificationVariantFn"));





    private static final SubLList $list142 = list(makeSymbol("FORMULA"), makeSymbol("VARIABLE"), makeSymbol("GLOSS-TEMPLATE"), makeSymbol("CATEGORY"), makeSymbol("OPAQUE"));

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLList $list144 = list(reader_make_constant_shell(makeString("generateFormulasForElements-TermIsa")), reader_make_constant_shell(makeString("generateSupplementalFormulasForElements-TermIsa")), reader_make_constant_shell(makeString("generateSentenceForInstances")), reader_make_constant_shell(makeString("generateOpaqueSentenceForInstances")));

    private static final SubLList $list145 = list(reader_make_constant_shell(makeString("generateFormulasForElements-TermGenls")), reader_make_constant_shell(makeString("generateSupplementalFormulasForElements-TermGenls")), reader_make_constant_shell(makeString("generateSentenceForSpecs")), reader_make_constant_shell(makeString("generateOpaqueSentenceForSpecs")));

    private static final SubLList $list146 = list(reader_make_constant_shell(makeString("suppressFormulasForElements-TermIsa")));

    public static final SubLList $list147 = list(reader_make_constant_shell(makeString("suppressFormulasForElements-TermGenls")));

    private static final SubLList $list148 = cons(makeSymbol("TYPE"), makeSymbol("MT"));





    private static final SubLList $list151 = list(reader_make_constant_shell(makeString("generateOpaqueSentenceForSpecs")), reader_make_constant_shell(makeString("generateSentenceForSpecs")), reader_make_constant_shell(makeString("generateOpaqueSentenceForInstances")), reader_make_constant_shell(makeString("generateSentenceForInstances")));

    private static final SubLList $list152 = list(reader_make_constant_shell(makeString("generateOpaqueSentenceForSpecs")), reader_make_constant_shell(makeString("generateOpaqueSentenceForInstances")));



    public static final SubLList $list154 = list(makeKeyword("SENTENCE"));



    private static final SubLSymbol GET_CACHED_TEMPLATES_FROM_ASSERTION = makeSymbol("GET-CACHED-TEMPLATES-FROM-ASSERTION");

    private static final SubLSymbol $get_cached_templates_from_assertion_caching_state$ = makeSymbol("*GET-CACHED-TEMPLATES-FROM-ASSERTION-CACHING-STATE*");

    private static final SubLInteger $int$5000 = makeInteger(5000);

    private static final SubLString $str159$unable_to_determine_queries_from_ = makeString("unable to determine queries from ~S");

    private static final SubLSymbol $sym160$TRIGGER_ONLY_TERM_ = makeSymbol("TRIGGER-ONLY-TERM?");

    private static final SubLList $list161 = list(reader_make_constant_shell(makeString("generateSentenceForSpecs")), reader_make_constant_shell(makeString("generateSentenceForInstances")), reader_make_constant_shell(makeString("generateOpaqueSentenceForSpecs")), reader_make_constant_shell(makeString("generateOpaqueSentenceForInstances")));

    public static final SubLList $list162 = list(reader_make_constant_shell(makeString("generateSupplementalFormulasForElements-TermGenls")), reader_make_constant_shell(makeString("generateSupplementalFormulasForElements-TermIsa")), reader_make_constant_shell(makeString("generateFormulasForElements-TermGenls")), reader_make_constant_shell(makeString("generateFormulasForElements-TermIsa")), reader_make_constant_shell(makeString("suppressFormulasForElements-TermGenls")), reader_make_constant_shell(makeString("suppressFormulasForElements-TermIsa")));

    private static final SubLList $list163 = list(reader_make_constant_shell(makeString("generateSupplementalFormulasForElements-TermGenls")), reader_make_constant_shell(makeString("generateSupplementalFormulasForElements-TermIsa")));

    private static final SubLObject $$SymmetricBinaryPredicate = reader_make_constant_shell(makeString("SymmetricBinaryPredicate"));

    private static final SubLSymbol $sym165$FRAGMENT_FORMULAS_EQUAL_ = makeSymbol("FRAGMENT-FORMULAS-EQUAL?");

    private static final SubLSymbol $sym166$_FRAGMENT_FORMULAS_EQUAL__CACHING_STATE_ = makeSymbol("*FRAGMENT-FORMULAS-EQUAL?-CACHING-STATE*");



    public static final SubLList $list168 = list(makeSymbol("FORMULA"), makeSymbol("GLOSS"), makeSymbol("CATEGORY"));

    private static final SubLObject $const169$TermAcceptableForQuerySearch_Inst = reader_make_constant_shell(makeString("TermAcceptableForQuerySearch-InstantiationOnly"));

    private static final SubLSymbol CAE_QUERY_SEARCH_FRAGMENT_FORMULA = makeSymbol("CAE-QUERY-SEARCH-FRAGMENT-FORMULA");







    private static final SubLList $list174 = cons(makeSymbol("TERM"), makeSymbol("PARAPHRASE"));

    private static final SubLSymbol EQUAL_FRAGMENTS = makeSymbol("EQUAL-FRAGMENTS");

    private static final SubLSymbol FILL_IN_DEFAULT_VALUES_FOR_QUERY = makeSymbol("FILL-IN-DEFAULT-VALUES-FOR-QUERY");

    private static final SubLSymbol $sym177$QUERY_HAS_ALL_REQUIRED_ARGS_BOUND_ = makeSymbol("QUERY-HAS-ALL-REQUIRED-ARGS-BOUND?");

    private static final SubLSymbol TRY_SUGGESTIONS_FOR_QUERY = makeSymbol("TRY-SUGGESTIONS-FOR-QUERY");

    private static final SubLString $str179$ = makeString("");

    private static final SubLList $list180 = cons(makeSymbol("TOKEN"), makeSymbol("TERM-LIST"));

    private static final SubLSymbol $sym181$QUERY_FRAGMENT_PARTIALLY_INSTANTIATES_AND_SHARES_CATEGORY_ = makeSymbol("QUERY-FRAGMENT-PARTIALLY-INSTANTIATES-AND-SHARES-CATEGORY?");

    private static final SubLSymbol $sym182$QUERY_FRAGMENT_SUBSUMES_ = makeSymbol("QUERY-FRAGMENT-SUBSUMES?");

    private static final SubLSymbol $sym183$FRAGMENT_ = makeSymbol("FRAGMENT<");

    private static final SubLSymbol ADD_UNBOUND_FRAGMENTS = makeSymbol("ADD-UNBOUND-FRAGMENTS");







    private static final SubLList $list188 = list(makeSymbol("CAE-TEST-CASE-TABLES"));







    public static final SubLObject $list192 = _constant_192_initializer();



    private static final SubLSymbol $sym194$_MORE = makeSymbol("?MORE");

    private static final SubLSymbol ADD_ELEMENTS_FOR_GENLS = makeSymbol("ADD-ELEMENTS-FOR-GENLS");

    private static final SubLSymbol $sym196$_SET = makeSymbol("?SET");

    private static final SubLObject $$addElementsToValidTermSet_Genls = reader_make_constant_shell(makeString("addElementsToValidTermSet-Genls"));

    private static final SubLList $list198 = list(makeSymbol("?SET"));

    private static final SubLSymbol $add_elements_for_genls_caching_state$ = makeSymbol("*ADD-ELEMENTS-FOR-GENLS-CACHING-STATE*");

    private static final SubLInteger $int$1024 = makeInteger(1024);

    private static final SubLSymbol CLEAR_ADD_ELEMENTS_FOR_GENLS = makeSymbol("CLEAR-ADD-ELEMENTS-FOR-GENLS");

    private static final SubLSymbol ADD_ELEMENTS_FOR_ISA = makeSymbol("ADD-ELEMENTS-FOR-ISA");

    private static final SubLObject $$addElementsToValidTermSet_Isa = reader_make_constant_shell(makeString("addElementsToValidTermSet-Isa"));

    private static final SubLSymbol $add_elements_for_isa_caching_state$ = makeSymbol("*ADD-ELEMENTS-FOR-ISA-CACHING-STATE*");

    private static final SubLSymbol CLEAR_ADD_ELEMENTS_FOR_ISA = makeSymbol("CLEAR-ADD-ELEMENTS-FOR-ISA");

    private static final SubLList $list206 = cons(makeSymbol("STRING"), makeSymbol("POSITION-MAP"));

    private static final SubLList $list207 = cons(makeUninternedSymbol("KEY"), makeSymbol("POSITIONS"));

    private static final SubLList $list208 = cons(makeSymbol("START"), makeSymbol("LENGTH"));

    private static final SubLString $str209$_S_is_off_the_end_of__S = makeString("~S is off the end of ~S");

    private static final SubLString $str210$_S_is_not_on__S = makeString("~S is not on ~S");

    private static final SubLObject $$BiologyTemplateMt = reader_make_constant_shell(makeString("BiologyTemplateMt"));





    private static final SubLString $str214$do_broad_mt_index = makeString("do-broad-mt-index");









    private static final SubLSymbol MARK_DUPLICATED_UNBOUND_QUERIES = makeSymbol("MARK-DUPLICATED-UNBOUND-QUERIES");



    private static final SubLList $list221 = list(list(list(list(list(list(reader_make_constant_shell(makeString("lessThan")), makeSymbol("?QUANTITY"), makeSymbol("?QUANTITY-2")), list(makeString("X is less than Y."), list(makeSymbol("?QUANTITY"), cons(ZERO_INTEGER, ONE_INTEGER)), list(makeSymbol("?QUANTITY-2"), cons(FIFTEEN_INTEGER, ONE_INTEGER))), makeKeyword("SUPPLEMENTAL")), list(list(reader_make_constant_shell(makeString("lessThan")), makeSymbol("?X"), makeInteger(50)), list(makeString("What quantities are less than 50?"), list(makeSymbol("?X"), cons(ZERO_INTEGER, FOUR_INTEGER), cons(FOUR_INTEGER, ONE_INTEGER), cons(FIVE_INTEGER, TEN_INTEGER))), makeKeyword("SIMPLE")))), list(list(list(reader_make_constant_shell(makeString("lessThan")), makeSymbol("?QUANTITY"), makeSymbol("?QUANTITY-2")), list(makeString("X is less than Y."), list(makeSymbol("?QUANTITY"), cons(ZERO_INTEGER, ONE_INTEGER)), list(makeSymbol("?QUANTITY-2"), cons(FIFTEEN_INTEGER, ONE_INTEGER))), makeKeyword("UNBOUND")), list(list(reader_make_constant_shell(makeString("lessThan")), makeSymbol("?X"), makeInteger(50)), list(makeString("What quantities are less than 50?"), list(makeSymbol("?X"), cons(ZERO_INTEGER, FOUR_INTEGER), cons(FOUR_INTEGER, ONE_INTEGER), cons(FIVE_INTEGER, TEN_INTEGER))), makeKeyword("SIMPLE")))));

    private static final SubLSymbol GET_FRAGMENTS_FOR_STRING_AND_TASK = makeSymbol("GET-FRAGMENTS-FOR-STRING-AND-TASK");

    private static final SubLSymbol $sym223$FRAGMENTS_CONTAIN_SENTENCE_ = makeSymbol("FRAGMENTS-CONTAIN-SENTENCE?");

    private static final SubLList $list224 = list(new SubLObject[]{ list(list(makeString("earnings per share are greater than 5 dollars"), reader_make_constant_shell(makeString("FinancialQuestionAnsweringTask"))), list(reader_make_constant_shell(makeString("greaterThan")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("Dollar-UnitedStates")), FIVE_INTEGER))), list(list(makeString("earning per share are greater than 5 dollars"), reader_make_constant_shell(makeString("GeneralCycKETask-Allotment"))), list(reader_make_constant_shell(makeString("greaterThan")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("Dollar-UnitedStates")), FIVE_INTEGER))), list(list(makeString("duplicated chromosome"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment"))), list(reader_make_constant_shell(makeString("partTypesFactsForType")), reader_make_constant_shell(makeString("DuplicatedChromosome")), makeSymbol("?Y"))), list(list(makeString("transduction pathways"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("SignalTransduction-CellularProcess-MultiStageReaction")))), list(list(makeString("transduction pathways"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment"))), list(list(reader_make_constant_shell(makeString("QuantifiedVersionOfBinaryPredicateFn")), reader_make_constant_shell(makeString("relationAllExists")), reader_make_constant_shell(makeString("secondMessengerObject-CellularSignaling"))), reader_make_constant_shell(makeString("SignalTransduction-CellularProcess-MultiStageReaction")), makeSymbol("?TYPE-OF-CHEMICAL-OBJECT"))), list(list(makeString("The number of chromosomes in a kangaroo liver cell is 12. How many chromosomes are there in a kangaroo sperm cell?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Kangaroo")))), list(list(makeString("The number of chromosomes in a kangaroo liver cell is 12. How many chromosomes are there in a kangaroo sperm cell?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("LiverCell")))), list(list(makeString("The number of chromosomes in a kangaroo liver cell is 12. How many chromosomes are there in a kangaroo sperm cell?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment"))), list(reader_make_constant_shell(makeString("cellSource")), makeSymbol("?CELL"), makeSymbol("?LIVING-THING"))), list(list(makeString("The number of chromosomes in a kangaroo liver cell is 12. How many chromosomes are there in a kangaroo sperm cell?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment"))), list(reader_make_constant_shell(makeString("cellHasNumberOfChromosomes")), makeSymbol("?X"), makeSymbol("?Y"))) });

    private static final SubLSymbol GET_FRAGMENTS_FOR_STRING = makeSymbol("GET-FRAGMENTS-FOR-STRING");

    private static final SubLSymbol $sym226$EQUAL_FRAGMENT_LISTS_ = makeSymbol("EQUAL-FRAGMENT-LISTS?");

    private static final SubLObject $list227 = _constant_227_initializer();

    private static final SubLSymbol $sym228$SUGGESTED_FREE_POSITION_FOR_PRED_ = makeSymbol("SUGGESTED-FREE-POSITION-FOR-PRED?");

    private static final SubLObject $$suggestedOpenPositionForPred = reader_make_constant_shell(makeString("suggestedOpenPositionForPred"));

    private static final SubLList $list230 = list(makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL"));

    private static final SubLSymbol $sym231$_SUGGESTED_FREE_POSITION_FOR_PRED__CACHING_STATE_ = makeSymbol("*SUGGESTED-FREE-POSITION-FOR-PRED?-CACHING-STATE*");





    private static final SubLSymbol $sym234$ANY_NOT_ISA_CACHED_ = makeSymbol("ANY-NOT-ISA-CACHED?");

    private static final SubLSymbol $sym235$_ANY_NOT_ISA_CACHED__CACHING_STATE_ = makeSymbol("*ANY-NOT-ISA-CACHED?-CACHING-STATE*");

    private static final SubLSymbol $sym236$CLEAR_ANY_NOT_ISA_CACHED_ = makeSymbol("CLEAR-ANY-NOT-ISA-CACHED?");

    private static final SubLSymbol $sym237$ANY_ISA_CACHED_ = makeSymbol("ANY-ISA-CACHED?");

    private static final SubLSymbol $sym238$_ANY_ISA_CACHED__CACHING_STATE_ = makeSymbol("*ANY-ISA-CACHED?-CACHING-STATE*");

    private static final SubLSymbol $sym239$CLEAR_ANY_ISA_CACHED_ = makeSymbol("CLEAR-ANY-ISA-CACHED?");

    private static final SubLSymbol $sym240$ANY_NOT_GENL_CACHED_ = makeSymbol("ANY-NOT-GENL-CACHED?");

    private static final SubLSymbol $sym241$_ANY_NOT_GENL_CACHED__CACHING_STATE_ = makeSymbol("*ANY-NOT-GENL-CACHED?-CACHING-STATE*");

    private static final SubLSymbol $sym242$CLEAR_ANY_NOT_GENL_CACHED_ = makeSymbol("CLEAR-ANY-NOT-GENL-CACHED?");

    private static final SubLSymbol TRY_SUBSTITUTION = makeSymbol("TRY-SUBSTITUTION");

    private static final SubLList $list244 = list(list(list(new SubLObject[]{ list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2008)), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("PericardialWindow-SurgicalProcedure"))), makeString("pericardial windows in 2008"), list(makeString("THING is an instance of pericardial window."), list(makeSymbol("?THING"), cons(ZERO_INTEGER, FIVE_INTEGER)), list(makeSymbol("?X"), cons(makeInteger(24), EIGHTEEN_INTEGER))), makeKeyword("SIMPLE"), list(makeKeyword("ISA"), reader_make_constant_shell(makeString("PericardialWindow-SurgicalProcedure")), reader_make_constant_shell(makeString("Collection"))), makeInteger(23), makeInteger(27), reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), makeKeyword("BLANKS"), T }), list(list(list(reader_make_constant_shell(makeString("isa")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2008)), reader_make_constant_shell(makeString("PericardialWindow-SurgicalProcedure"))), list(makeString("2008 is an instance of pericardial window."), list(makeSymbol("?THING"), cons(ZERO_INTEGER, FOUR_INTEGER)), list(makeSymbol("?X"), cons(makeInteger(23), EIGHTEEN_INTEGER))), makeKeyword("SIMPLE"), list(makeKeyword("ISA"), reader_make_constant_shell(makeString("PericardialWindow-SurgicalProcedure")), reader_make_constant_shell(makeString("Collection"))), makeInteger(23), makeInteger(27)))));

    private static final SubLObject $$interArgReln = reader_make_constant_shell(makeString("interArgReln"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLSymbol $sym247$QUERY_SEARCH_IRREFLEXIVE_ = makeSymbol("QUERY-SEARCH-IRREFLEXIVE?");

    private static final SubLObject $$interArgDifferent = reader_make_constant_shell(makeString("interArgDifferent"));

    public static final SubLList $list249 = list(ONE_INTEGER, TWO_INTEGER);

    private static final SubLSymbol $sym250$_QUERY_SEARCH_IRREFLEXIVE__CACHING_STATE_ = makeSymbol("*QUERY-SEARCH-IRREFLEXIVE?-CACHING-STATE*");



    private static final SubLSymbol $sym252$CLEAR_QUERY_SEARCH_IRREFLEXIVE_ = makeSymbol("CLEAR-QUERY-SEARCH-IRREFLEXIVE?");

    private static final SubLSymbol $sym253$STRONG_QUERY_SEARCH_ACCEPTABILITY_CHECKS_ALLOWED_ = makeSymbol("STRONG-QUERY-SEARCH-ACCEPTABILITY-CHECKS-ALLOWED?");

    private static final SubLObject $const254$softwareParameterValueInSpecifica = reader_make_constant_shell(makeString("softwareParameterValueInSpecification"));

    private static final SubLList $list255 = list(ONE_INTEGER, THREE_INTEGER);

    private static final SubLList $list256 = list(makeSymbol("TASK"), makeSymbol("THIS-SPECIFICATION"));

    private static final SubLObject $$analysisTask = reader_make_constant_shell(makeString("analysisTask"));

    private static final SubLObject $const258$allowsStrongQuerySearchAcceptabil = reader_make_constant_shell(makeString("allowsStrongQuerySearchAcceptabilityChecks"));

    private static final SubLObject $const259$HaloBiologyQuestionAnsweringTask_ = reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment"));



    private static final SubLSymbol HALO_TEST_PASSES_INTER_ARG_RELN_REQUIREMENTS = makeSymbol("HALO-TEST-PASSES-INTER-ARG-RELN-REQUIREMENTS");

    private static final SubLList $list262 = list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("properPhysicalPartTypeCount")), reader_make_constant_shell(makeString("Cell")), reader_make_constant_shell(makeString("Anaphase")), makeSymbol("?NUMBER")), reader_make_constant_shell(makeString("CytologicalProcessesRecommendedWFFCheckingMt"))), NIL), list(list(list(reader_make_constant_shell(makeString("properPhysicalPartTypeCount")), reader_make_constant_shell(makeString("MitoticSpindle")), reader_make_constant_shell(makeString("MitoticSpindle")), makeSymbol("?NUMBER")), reader_make_constant_shell(makeString("CytologicalProcessesRecommendedWFFCheckingMt"))), NIL), list(list(list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("CyclicAdenosineMonophosphate")), reader_make_constant_shell(makeString("CellularSignalingSecondMessenger"))), reader_make_constant_shell(makeString("CytologicalProcessesRecommendedWFFCheckingMt"))), NIL), list(list(list(reader_make_constant_shell(makeString("phasesAlternateInCycleType")), reader_make_constant_shell(makeString("TheEukaryoticCellCycle")), makeSymbol("?TYPE-OF-EVENT"), reader_make_constant_shell(makeString("EukaryoticCellCycle"))), reader_make_constant_shell(makeString("CytologicalProcessesRecommendedWFFCheckingMt"))), NIL), list(list(list(reader_make_constant_shell(makeString("isa")), TWELVE_INTEGER, reader_make_constant_shell(makeString("LiverCell"))), reader_make_constant_shell(makeString("CytologicalProcessesRecommendedWFFCheckingMt"))), NIL), list(list(list(reader_make_constant_shell(makeString("primaryConstituent-TypeType")), reader_make_constant_shell(makeString("Chromosome")), reader_make_constant_shell(makeString("LiverCell"))), reader_make_constant_shell(makeString("CytologicalProcessesRecommendedWFFCheckingMt"))), NIL), list(list(list(reader_make_constant_shell(makeString("genls")), reader_make_constant_shell(makeString("Cell")), reader_make_constant_shell(makeString("Synapsis"))), reader_make_constant_shell(makeString("CytologicalProcessesRecommendedWFFCheckingMt"))), NIL), list(list(list(reader_make_constant_shell(makeString("genls")), reader_make_constant_shell(makeString("Synapsis")), reader_make_constant_shell(makeString("Cell"))), reader_make_constant_shell(makeString("CytologicalProcessesRecommendedWFFCheckingMt"))), NIL), list(list(list(reader_make_constant_shell(makeString("properPartTypeCount")), reader_make_constant_shell(makeString("Cell")), reader_make_constant_shell(makeString("Metaphase")), makeSymbol("?NUMBER")), reader_make_constant_shell(makeString("CytologicalProcessesRecommendedWFFCheckingMt"))), NIL) });

    private static final SubLSymbol REQUIRED_BOUND_ARGS_FOR_PREDS = makeSymbol("REQUIRED-BOUND-ARGS-FOR-PREDS");

    private static final SubLList $list264 = cons(makeSymbol("?PRED"), makeSymbol("?ARGPOS"));

    private static final SubLList $list265 = list(reader_make_constant_shell(makeString("requiredBoundArgInQuerySearch")), makeSymbol("?PRED"), makeSymbol("?ARGPOS"));

    public static final SubLList $list266 = cons(makeSymbol("PRED"), makeSymbol("ARGPOS"));

    public static final SubLList $list267 = list(makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL"), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

    private static final SubLSymbol $required_bound_args_for_preds_caching_state$ = makeSymbol("*REQUIRED-BOUND-ARGS-FOR-PREDS-CACHING-STATE*");

    private static final SubLSymbol CLEAR_REQUIRED_BOUND_ARGS_FOR_PREDS = makeSymbol("CLEAR-REQUIRED-BOUND-ARGS-FOR-PREDS");

    private static final SubLSymbol $sym270$SENTENCE_HAS_ALL_REQUIRED_ARGS_BOUND_ = makeSymbol("SENTENCE-HAS-ALL-REQUIRED-ARGS-BOUND?");

    private static final SubLList $list271 = list(list(list(list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Cyc")), reader_make_constant_shell(makeString("Emu")))), T), list(list(list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Cyc")), makeSymbol("?X")), reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"))), NIL), list(list(list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Cyc")), list(reader_make_constant_shell(makeString("ComputerUserWithUserModelForApplicationFn")), reader_make_constant_shell(makeString("CycAnalyticEnvironment-TheProgram"))))), T), list(list(list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Cyc")), list(reader_make_constant_shell(makeString("ComputerUserWithUserModelForApplicationFn")), makeSymbol("?X"))), reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"))), NIL));

    private static final SubLSymbol DEFAULT_VALUES_FOR_PRED = makeSymbol("DEFAULT-VALUES-FOR-PRED");

    private static final SubLList $list273 = list(makeSymbol("?ARGPOS"), makeSymbol("?VALUE"));

    private static final SubLObject $$defaultValueForPredInArg = reader_make_constant_shell(makeString("defaultValueForPredInArg"));

    private static final SubLList $list275 = list(makeSymbol("ARGPOS"), makeSymbol("VALUE"));

    private static final SubLSymbol $default_values_for_pred_caching_state$ = makeSymbol("*DEFAULT-VALUES-FOR-PRED-CACHING-STATE*");

    private static final SubLSymbol CLEAR_DEFAULT_VALUES_FOR_PRED = makeSymbol("CLEAR-DEFAULT-VALUES-FOR-PRED");

    private static final SubLSymbol DEFAULT_VALUES_FOR_SENTENCE = makeSymbol("DEFAULT-VALUES-FOR-SENTENCE");

    private static final SubLList $list279 = cons(makeSymbol("ARGPOS"), makeSymbol("VALUE"));

    private static final SubLList $list280 = list(makeKeyword("OPAQUE"), T);

    private static final SubLObject $const281$TermAcceptableForQuerySearch_Trig = reader_make_constant_shell(makeString("TermAcceptableForQuerySearch-TriggerOnly"));

    private static final SubLObject $$ThePrototypicalCAERecipe = reader_make_constant_shell(makeString("ThePrototypicalCAERecipe"));

    private static final SubLObject $$CAERecipe = reader_make_constant_shell(makeString("CAERecipe"));



    private static final SubLSymbol FORMULA_FREE_VARIABLES = makeSymbol("FORMULA-FREE-VARIABLES");

    private static final SubLString $str286$__Looking_for_ingredients_for_CAE = makeString("~&Looking for ingredients for CAERecipe ~S... ");

    private static final SubLSymbol $sym287$_N = makeSymbol("?N");

    private static final SubLObject $$numberOfComponentsInCAERecipe = reader_make_constant_shell(makeString("numberOfComponentsInCAERecipe"));

    private static final SubLList $list289 = list(makeSymbol("?N"));

    private static final SubLObject $$GeneralCAEGuidanceMt = reader_make_constant_shell(makeString("GeneralCAEGuidanceMt"));

    private static final SubLString $str291$no_match_for_component__S__ = makeString("no match for component ~S~%");

    private static final SubLObject $$Quote = reader_make_constant_shell(makeString("Quote"));

    private static final SubLObject $$matchesCAERecipeComponent = reader_make_constant_shell(makeString("matchesCAERecipeComponent"));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLList $list295 = list(makeKeyword("INFERENCE-MODE"), makeKeyword("SHALLOW"));



    private static final SubLSymbol TERM_CLASSIFICATION_TREE_INFO = makeSymbol("TERM-CLASSIFICATION-TREE-INFO");

    private static final SubLSymbol $sym298$_TREE = makeSymbol("?TREE");

    private static final SubLObject $$conceptFilterDecisionTree = reader_make_constant_shell(makeString("conceptFilterDecisionTree"));

    private static final SubLList $list300 = list(makeSymbol("?TREENAT"));

    private static final SubLList $list301 = list(list(reader_make_constant_shell(makeString("evaluate")), makeSymbol("?TREE"), makeSymbol("?TREENAT")));

    private static final SubLSymbol $term_classification_tree_info_caching_state$ = makeSymbol("*TERM-CLASSIFICATION-TREE-INFO-CACHING-STATE*");

    private static final SubLSymbol CAE_QUERY_SUPERSTRINGS = makeSymbol("CAE-QUERY-SUPERSTRINGS");

    private static final SubLList $list304 = list(makeSymbol("START"), makeSymbol("END"), makeSymbol("STRINGS"));







    private static final SubLSymbol $sym308$TERM__ = makeSymbol("TERM-<");

    private static final SubLList $list309 = list(makeSymbol("CYCL"), makeSymbol("SEM-SUPPORTS"), makeSymbol("START"), makeSymbol("END"));

    private static final SubLInteger $int$999 = makeInteger(999);

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLObject $const312$GenericMedicalResearchTask_Allotm = reader_make_constant_shell(makeString("GenericMedicalResearchTask-Allotment"));

    private static final SubLString $str313$__Unfiltered_Superstrings_____S__ = makeString("~%Unfiltered Superstrings: ~%~S~%");

    private static final SubLList $list314 = list(makeSymbol("START"), makeSymbol("END"), makeSymbol("SUPER-STRINGS"));

    private static final SubLSymbol $sym315$_ = makeSymbol(">");

    private static final SubLString $str316$__Unfiltered_Cycls_for_Superstrin = makeString("~%Unfiltered Cycls for Superstrings: ~%~S~%");

    private static final SubLString $str317$__Filtered_Superstrings_____S__ = makeString("~%Filtered Superstrings: ~%~S~%");

    private static final SubLString $str318$__Filtered_Cycls_____S__ = makeString("~%Filtered Cycls: ~%~S~%");

    private static final SubLSymbol GET_TERMS_FROM_CAE_QUERY_SEARCH = makeSymbol("GET-TERMS-FROM-CAE-QUERY-SEARCH");

    private static final SubLSymbol TOKEN_RECORD_PLIST = makeSymbol("TOKEN-RECORD-PLIST");

    private static final SubLList $list321 = list(makeSymbol("FST-STRING-WORDIFY"), makeSymbol("STRING-WORDIFY"));

    private static final SubLSymbol TERMS_FROM_CAE_QUERY_INT = makeSymbol("TERMS-FROM-CAE-QUERY-INT");





    private static final SubLSymbol $sym325$TOKEN_RECORD_SUBSUMES_ = makeSymbol("TOKEN-RECORD-SUBSUMES?");



    private static final SubLObject $$ClosedClassWord = reader_make_constant_shell(makeString("ClosedClassWord"));

    private static final SubLSymbol FST_STRING_WORDIFY = makeSymbol("FST-STRING-WORDIFY");



    private static final SubLSymbol $sym330$VALID_QUERY_SEARCH_TERM_ = makeSymbol("VALID-QUERY-SEARCH-TERM?");

    private static final SubLSymbol VAR_FROM_KEYWORD = makeSymbol("VAR-FROM-KEYWORD");

    private static final SubLSymbol GET_CAE_QUERY_SEARCH_LEXICON_INT = makeSymbol("GET-CAE-QUERY-SEARCH-LEXICON-INT");







    private static final SubLSymbol SET_BASE_MT = makeSymbol("SET-BASE-MT");



    private static final SubLSymbol STANFORD_NER_DATE_LEARN = makeSymbol("STANFORD-NER-DATE-LEARN");

    private static final SubLSymbol SCALAR_INTERVAL_LEARN = makeSymbol("SCALAR-INTERVAL-LEARN");

    private static final SubLSymbol SIMPLE_DATE_LEARN = makeSymbol("SIMPLE-DATE-LEARN");

    private static final SubLSymbol ADD_CONCEPT_FILTER_SPEC = makeSymbol("ADD-CONCEPT-FILTER-SPEC");



    private static final SubLSymbol $get_cae_query_search_lexicon_int_caching_state$ = makeSymbol("*GET-CAE-QUERY-SEARCH-LEXICON-INT-CACHING-STATE*");

    private static final SubLList $list344 = list(makeSymbol("SOURCE-TERM"), makeSymbol("&REST"), makeSymbol("AUGMENTATION-TERMS"));

    private static final SubLList $list345 = list(makeSymbol("?X"), makeSymbol("?Z"));

    private static final SubLList $list346 = list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("unknownSentence")), list(reader_make_constant_shell(makeString("argN")), reader_make_constant_shell(makeString("NonDavidsonianPredFn")), ZERO_INTEGER, makeSymbol("?Z"))), list(reader_make_constant_shell(makeString("nonDavidsonianPredReln")), makeSymbol("?X"), makeSymbol("?Y"), makeSymbol("?Z")));

    private static final SubLList $list347 = list(reader_make_constant_shell(makeString("RoleInAttackPredicate")), reader_make_constant_shell(makeString("AgentCasualtyPredicate")), reader_make_constant_shell(makeString("NonagentCasualtyPredicate")));

    private static final SubLList $list348 = list(makeSymbol("?COLL"), makeSymbol("?ROLE-LIST"));

    private static final SubLList $list349 = list(reader_make_constant_shell(makeString("verbSemTrans-Canonical")), makeSymbol("?WORD"), makeSymbol("?NUM"), makeSymbol("?FRAME"), makeSymbol("?COLL"), makeSymbol("?ROLE-LIST"));

    private static final SubLList $list350 = list(makeSymbol("COLL"), makeSymbol("ROLES"));

    private static final SubLObject $const351$GenericIntelligenceAnalysis_CAE_A = reader_make_constant_shell(makeString("GenericIntelligenceAnalysis-CAE-Allotment"));

    private static final SubLObject $$TerrorismCAEGuidanceMt = reader_make_constant_shell(makeString("TerrorismCAEGuidanceMt"));

    private static final SubLSymbol $sym353$EQUALS_EL_ = makeSymbol("EQUALS-EL?");

    private static final SubLString $str354$Fragment__A_missing_from____clet_ = makeString("Fragment ~A missing from~% (clet ((*current-cae-task* #$GenericIntelligenceAnalysis-CAE-Allotment))~%  (get-fragments-for-string ~S nil #$TerrorismRecommendedWffCheckingMt))");

    private static final SubLSymbol $sym355$TEST_GET_FRAGMENTS_FOR_STRING_AGAINST_EXPECTED_LITERALS_NON_BLOCK = makeSymbol("TEST-GET-FRAGMENTS-FOR-STRING-AGAINST-EXPECTED-LITERALS-NON-BLOCKING");

    private static final SubLList $list356 = list(list(list(makeString("When was Hezbollah formed?"), list(list(reader_make_constant_shell(makeString("foundingDate")), reader_make_constant_shell(makeString("LebaneseHizballah")), makeSymbol("?DATE")))), NIL), list(list(makeString("Who founded Hezbollah?"), list(list(reader_make_constant_shell(makeString("foundingAgent")), makeSymbol("?WHO"), reader_make_constant_shell(makeString("LebaneseHizballah"))))), NIL), list(list(makeString("What Hezbollah members have been assassinated?"), list(list(reader_make_constant_shell(makeString("hasMembers")), reader_make_constant_shell(makeString("LebaneseHizballah")), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("organismKilled")), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("AssassinatingSomeone"))))), NIL), list(list(makeString("What Hezbollah members have been assassinated by Israel?"), list(list(reader_make_constant_shell(makeString("hasMembers")), reader_make_constant_shell(makeString("LebaneseHizballah")), makeSymbol("?GUY")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?ASSASS"), reader_make_constant_shell(makeString("AssassinatingSomeone"))), list(reader_make_constant_shell(makeString("agentAssassinated")), makeSymbol("?ASSASS"), makeSymbol("?GUY")))), NIL));

    private static final SubLSymbol FILL_IN_GLOSS_TEMPLATE_CACHED = makeSymbol("FILL-IN-GLOSS-TEMPLATE-CACHED");

    private static final SubLList $list358 = listS(makeSymbol("THIS-VARIABLE"), makeSymbol("START"), makeSymbol("LENGTH"));

    private static final SubLList $list359 = cons(makeSymbol("NEW-MAP-VARIABLE"), makeSymbol("POSITIONS"));

    private static final SubLSymbol $fill_in_gloss_template_cached_caching_state$ = makeSymbol("*FILL-IN-GLOSS-TEMPLATE-CACHED-CACHING-STATE*");

    private static final SubLList $list361 = cons(makeSymbol("THIS-VARIABLE"), makeSymbol("POSITIONS"));

    private static final SubLSymbol $sym362$POSITION__ = makeSymbol("POSITION->");

    private static final SubLSymbol POSITION_INFO_FROM_MAP = makeSymbol("POSITION-INFO-FROM-MAP");

    public static final SubLList $list364 = list(list(list(list(list(makeSymbol("?THING"), cons(ZERO_INTEGER, FIVE_INTEGER)), list(makeSymbol("?X"), cons(TWELVE_INTEGER, ONE_INTEGER)))), list(listS(makeSymbol("?X"), TWELVE_INTEGER, ONE_INTEGER), listS(makeSymbol("?THING"), ZERO_INTEGER, FIVE_INTEGER))));

    public static final SubLList $list365 = cons(makeSymbol("VAR"), makeSymbol("VAR-POSITIONS"));

    private static final SubLSymbol $sym366$_ = makeSymbol("<");



    private static final SubLSymbol MNEMONIC_VARMAP_FOR_FORMULA_CACHED = makeSymbol("MNEMONIC-VARMAP-FOR-FORMULA-CACHED");

    private static final SubLSymbol $mnemonic_varmap_for_formula_cached_caching_state$ = makeSymbol("*MNEMONIC-VARMAP-FOR-FORMULA-CACHED-CACHING-STATE*");

    private static final SubLString $str370$Unable_to_generate_NL_for__S___No = makeString("Unable to generate NL for ~S.  Not adding to query-search tables");

    private static final SubLSymbol GENERATE_TEMPLATE_FOR_ISA_CONSTRAINT_CACHED = makeSymbol("GENERATE-TEMPLATE-FOR-ISA-CONSTRAINT-CACHED");

    private static final SubLSymbol $generate_template_for_isa_constraint_cached_caching_state$ = makeSymbol("*GENERATE-TEMPLATE-FOR-ISA-CONSTRAINT-CACHED-CACHING-STATE*");

    private static final SubLSymbol GET_VARIABLES_OF_TYPE_IN_FORMULA = makeSymbol("GET-VARIABLES-OF-TYPE-IN-FORMULA");

    private static final SubLList $list374 = list(makeKeyword("AND"), list(makeKeyword("TEST"), makeSymbol("CYC-VAR?")), list(makeKeyword("BIND"), makeSymbol("VAR")));



    private static final SubLList $list376 = list(makeKeyword("TEST"), makeSymbol("EL-FORT-P"));



    private static final SubLSymbol $get_variables_of_type_in_formula_caching_state$ = makeSymbol("*GET-VARIABLES-OF-TYPE-IN-FORMULA-CACHING-STATE*");

    private static final SubLSymbol CLEAR_GET_VARIABLES_OF_TYPE_IN_FORMULA = makeSymbol("CLEAR-GET-VARIABLES-OF-TYPE-IN-FORMULA");

    private static final SubLSymbol $cae_fragment_refinements$ = makeSymbol("*CAE-FRAGMENT-REFINEMENTS*");

    private static final SubLList $list381 = cons(makeSymbol("THIS-MT"), makeSymbol("THIS-DEREFINEMENT-TEMPLATE"));

    private static final SubLSymbol CONCEPTS_TO_ADD_FOR_CONCEPT = makeSymbol("CONCEPTS-TO-ADD-FOR-CONCEPT");

    private static final SubLSymbol $sym383$_NEW_CONCEPT = makeSymbol("?NEW-CONCEPT");

    private static final SubLObject $const384$addFormulaFromConceptToFormulasWi = reader_make_constant_shell(makeString("addFormulaFromConceptToFormulasWithConcept"));

    private static final SubLSymbol $concepts_to_add_for_concept_caching_state$ = makeSymbol("*CONCEPTS-TO-ADD-FOR-CONCEPT-CACHING-STATE*");

    private static final SubLSymbol CLEAR_CONCEPTS_TO_ADD_FOR_CONCEPT = makeSymbol("CLEAR-CONCEPTS-TO-ADD-FOR-CONCEPT");

    private static final SubLSymbol ADD_CONCEPT_TO_FORMULA = makeSymbol("ADD-CONCEPT-TO-FORMULA");

    private static final SubLObject $list388 = _constant_388_initializer();

    private static final SubLSymbol GET_TYPES_TO_EXISTENTIALLY_BIND = makeSymbol("GET-TYPES-TO-EXISTENTIALLY-BIND");

    private static final SubLSymbol $sym390$_TYPE = makeSymbol("?TYPE");

    private static final SubLList $list391 = list(reader_make_constant_shell(makeString("assertedSentence")), list(reader_make_constant_shell(makeString("existentiallyCloseVariablesOfType")), makeSymbol("?TYPE")));

    private static final SubLSymbol $get_types_to_existentially_bind_caching_state$ = makeSymbol("*GET-TYPES-TO-EXISTENTIALLY-BIND-CACHING-STATE*");

    private static final SubLList $list393 = list(reader_make_constant_shell(makeString("or")), reader_make_constant_shell(makeString("and")));

    private static final SubLSymbol TOOLTIP_TERMS_FOR_SENTENCE = makeSymbol("TOOLTIP-TERMS-FOR-SENTENCE");

    private static final SubLList $list395 = list(reader_make_constant_shell(makeString("not")), reader_make_constant_shell(makeString("unknownSentence")), reader_make_constant_shell(makeString("assertedSentence")));

    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));





    private static final SubLSymbol TOOLTIP_FOR_QUERY_SEARCH_SENTENCE = makeSymbol("TOOLTIP-FOR-QUERY-SEARCH-SENTENCE");

    private static final SubLString $str400$_A__ = makeString("~A~%");

    private static final SubLString $str401$_____A__ = makeString("    ~A: ");

    private static final SubLString $str402$_A_ = makeString("~A ");

    private static final SubLString $str403$__ = makeString("~%");





    private static final SubLString $str406$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str407$_A__ = makeString("~A. ");

    private static final SubLString $str408$String___A__ = makeString("String: ~A~%");

    private static final SubLString $str409$Terms_Found___ = makeString("Terms Found:~%");

    private static final SubLString $str410$___S_____S__ = makeString("  ~S -> ~S~%");

    private static final SubLString $str411$Valid_Terms_Found___ = makeString("Valid Terms Found:~%");

    private static final SubLString $str412$____No_added_terms___ = makeString("    No added terms.~%");

    private static final SubLString $str413$____Added_terms___S__ = makeString("    Added terms: ~S~%");

    private static final SubLString $str414$Fragments___ = makeString("Fragments:~%");

    private static final SubLString $str415$_____S___S____because__S_______A_ = makeString("~%  ~S (~S)~% because ~S~%    ~A~%");

    private static final SubLString $str416$_____Second_pass_gloss________A__ = makeString("~&   Second-pass gloss:~%    ~A~%");

    private static final SubLString $str417$Fragment_combinations___ = makeString("Fragment combinations:~%");

    private static final SubLString $str418$_____S__ = makeString("~%  ~S~%");

    private static final SubLObject $$TerrorismRecommendedWffCheckingMt = reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"));

    private static final SubLList $list420 = list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("unknownSentence")), list(reader_make_constant_shell(makeString("termFormulas")), reader_make_constant_shell(makeString("PredicateNamedFn")), makeSymbol("?X"))), list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("AttackRoleReplacement"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("OrgRoleReplacement"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("OrgToOrgRoleReplacement"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("PersonalAssociationPredReplacement"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("CasualtyPredicate")))), list(reader_make_constant_shell(makeString("evaluate")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("EvaluateSubLFn")), list(reader_make_constant_shell(makeString("ExpandSubLFn")), list(makeSymbol("?X")), list(makeSymbol("ALL-PHRASES-FOR-TERM"), makeSymbol("?X"))))));

    private static final SubLString $$$cdolist = makeString("cdolist");

    public static final SubLList $list422 = list(makeSymbol("TERM"), makeSymbol("STRINGS"));

    private static final SubLSymbol $sym423$MEMBER_ = makeSymbol("MEMBER?");

    private static final SubLSymbol TOKEN_RECORD_DENOTATIONS = makeSymbol("TOKEN-RECORD-DENOTATIONS");

    public static final SubLList $list425 = list(new SubLObject[]{ makeString("Has Hizballah ever staged, or been accused of staging, a terrorist attack in the United Kingdom?"), makeString("Did any senior Hizballah leader travel to the southern cone of Latin America between Hizballah's 1992 and 1994 attacks on Israeli targets in Buenos Aires, Argentina?"), makeString("Were any Egyptian terrorists trained in Hizballah's training camps in Lebanon's Biqa Valley between 1985 and 1995?"), makeString("Which major Hizballah religious leader is said to have been kidnapped and never released by Libya?"), makeString("When did the last units of Iran's Islamic Revolutionary Guard Corps leave Lebanon?"), makeString("What Israeli targets did Hizballah destroy in Buenos Aires, Argentina in 1992 and 1994?"), makeString("What was the year and the target of the only terrorist attack Hizballah has staged in Thailand?"), makeString("Who commanded the Hizballah fighters sent to fight alongside the Bosnian Muslims against the Serbs and the Croats in the early 1990s?"), makeString("Hizballah has cells in which major Canadian cities?"), makeString("What are the top three criminal activities engaged in by Hizballah to raise money?"), makeString("Is Hizballah's presence stronger in the countries of West Africa or in the three countries of Indonesia, Malaysia, and the Philippines?"), makeString("Was Hizballah responsible for the attack on a Christian Church in Zuk, Lebanon, in February, 1994, that led to the cancellation of Pope John Paul II's scheduled visit to Lebanon?"), makeString("Did Hizballah operations chief Imad Mughniyah meet Osama bin Laden in either Khartoum, Sudan, or Tehran, Iran in the 1990s?"), makeString("What town in Bosnia served as the base for fighters from Hizballah and Iran's Islamic revolutionary Guard Corps?"), makeString("In what year did Osama bin Laden leave Saudi Arabia permanently?"), makeString("What types of businesses did Osama bin Laden own while he lived in Sudan from 1991 until 1996?"), makeString("Compare the number of countries in which Hizballah has a presence to the number of countries in which al-Qaeda has a presence?"), makeString("What are the names of the suicide bombers who attacked the Israeli Embassy (1992) and the Jewish Community Center (1994) in Buenos Aires, Argentina?"), makeString("How many terrorist attacks did Hizballah stage in Western Europe between 1985 and 1995?"), makeString("What member of Hizballah leader Hasan Nasrullah's family was killed fighting Israeli forces in southern Lebanon?"), makeString("Which countries in Eastern Europe have a Hizballah presence?"), makeString("Has Hizballah ever used motorcycles (or mopeds, scooters, etc.) in staging a terrorist attack?"), makeString("What was the name of the Khartoum-based company formed in the early 1990s by Sudanese leader Hasan al-Turabi and bin Laden to produce weapons and other military equipment?"), makeString("Which al-Qaeda leader was killed in 2002 while serving as a combat commander for the Chechen insurgents fighting against the Russians?  "), makeString("The capital city of what African country is said to have been the third target for al-Qaeda when it attacked the U.S. embassies in Nairobi, Kenya, and Dar es Salaam, Tanzania, in August, 1998?"), makeString("How many suicide car-bomb attacks has Hizballah staged against Israeli and Western interests since 1982?"), makeString("What position does Ibrahim Aqil hold in Hizballah's terrorist organization?"), makeString("Has Hizballah ever staged a terrorist attack in either Saudi Arabia or Kuwait?"), makeString("Which al-Qaeda leader was killed by Israel in the Ayn al-Hilwah refugee camp in Lebanon in early 2003?"), makeString("For the period 1985-2000, compare the number of Hizballah attacks against U.S. interests with the number of al-Qaeda attacks against U.S. interest? ") });

    private static final SubLString $str426$Bad_filter_string__ = makeString("Bad filter string: ");

    private static final SubLString $str427$Couldn_t_find_a_constant_for_ = makeString("Couldn't find a constant for ");

    private static final SubLSymbol DECISION_TREE_CONCEPT_FILTER_BUILDS_SUCCESSFULLY = makeSymbol("DECISION-TREE-CONCEPT-FILTER-BUILDS-SUCCESSFULLY");

    private static final SubLList $list429 = list(list(list(reader_make_constant_shell(makeString("CAEMedicalResearchFilterTree"))), T), list(list(reader_make_constant_shell(makeString("CAETerrorismFilterTree"))), T));

    private static final SubLList $list430 = list(new SubLObject[]{ makeSymbol("EXTRACT-DURING-DATE"), makeSymbol("EXTRACT-IN-DATE"), makeSymbol("EXTRACT-ON-DATE"), makeSymbol("EXTRACT-BEFORE-DATE"), makeSymbol("EXTRACT-AFTER-DATE"), makeSymbol("EXTRACT-SINCE-DATE"), makeSymbol("EXTRACT-BEFORE-PROCEDURE"), makeSymbol("EXTRACT-PRIOR-TO-PROCEDURE"), makeSymbol("EXTRACT-AFTER-PROCEDURE"), makeSymbol("EXTRACT-BETWEEN-THROUGH"), makeSymbol("EXTRACT-BETWEEN-AND"), makeSymbol("EXTRACT-FROM-TO"), makeSymbol("EXTRACT-FROM-THROUGH") });

    private static final SubLObject $const431$MedicalResearchRecommendedWFFChec = reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt"));

    private static final SubLObject $$CCFOntologyMt = reader_make_constant_shell(makeString("CCFOntologyMt"));

    private static final SubLObject $$CCFTemplateMt = reader_make_constant_shell(makeString("CCFTemplateMt"));

    private static final SubLSymbol JUSTIFIED_INTERPRETATION = makeSymbol("JUSTIFIED-INTERPRETATION");

    private static final SubLSymbol JUSTIFIED_INTERPRETATION_P = makeSymbol("JUSTIFIED-INTERPRETATION-P");

    private static final SubLList $list436 = list(makeSymbol("CYCL"), makeSymbol("WORDS"), makeSymbol("ARG-RECORDS"));

    private static final SubLList $list437 = list(makeKeyword("CYCL"), makeKeyword("WORDS"), makeKeyword("ARG-RECORDS"));

    private static final SubLList $list438 = list(makeSymbol("JI-CYCL"), makeSymbol("JI-WORDS"), makeSymbol("JI-ARG-RECORDS"));

    private static final SubLList $list439 = list(makeSymbol("_CSETF-JI-CYCL"), makeSymbol("_CSETF-JI-WORDS"), makeSymbol("_CSETF-JI-ARG-RECORDS"));

    private static final SubLSymbol JI_PRINT = makeSymbol("JI-PRINT");

    private static final SubLSymbol JUSTIFIED_INTERPRETATION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("JUSTIFIED-INTERPRETATION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list442 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("JUSTIFIED-INTERPRETATION-P"));

    private static final SubLSymbol JI_CYCL = makeSymbol("JI-CYCL");

    private static final SubLSymbol _CSETF_JI_CYCL = makeSymbol("_CSETF-JI-CYCL");

    private static final SubLSymbol JI_WORDS = makeSymbol("JI-WORDS");

    private static final SubLSymbol _CSETF_JI_WORDS = makeSymbol("_CSETF-JI-WORDS");

    private static final SubLSymbol JI_ARG_RECORDS = makeSymbol("JI-ARG-RECORDS");

    private static final SubLSymbol _CSETF_JI_ARG_RECORDS = makeSymbol("_CSETF-JI-ARG-RECORDS");







    private static final SubLString $str452$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_JUSTIFIED_INTERPRETATION = makeSymbol("MAKE-JUSTIFIED-INTERPRETATION");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_JUSTIFIED_INTERPRETATION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-JUSTIFIED-INTERPRETATION-METHOD");





    private static final SubLSymbol WORD_P = makeSymbol("WORD-P");

    private static final SubLSymbol TERM_RECORD_P = makeSymbol("TERM-RECORD-P");

    private static final SubLString $str462$__JI_ = makeString("#<JI ");

    private static final SubLString $str463$_ = makeString("/");

    private static final SubLString $str464$_ = makeString("?");

    private static final SubLString $str465$___ = makeString("...");

    private static final SubLString $str466$__ = makeString(": ");

    private static final SubLString $str467$_ = makeString(">");

    private static final SubLSymbol TERM_RECORD_WORD = makeSymbol("TERM-RECORD-WORD");

    private static final SubLSymbol TERM_RECORD = makeSymbol("TERM-RECORD");

    public static final SubLList $list470 = list(makeSymbol("TERM"), makeSymbol("WORD"), makeSymbol("LITERAL"));

    public static final SubLList $list471 = list(makeKeyword("TERM"), makeKeyword("WORD"), makeKeyword("LITERAL"));

    public static final SubLList $list472 = list(makeSymbol("TERM-RECORD-TERM"), makeSymbol("TERM-RECORD-WORD"), makeSymbol("TERM-RECORD-LITERAL"));

    private static final SubLList $list473 = list(makeSymbol("_CSETF-TERM-RECORD-TERM"), makeSymbol("_CSETF-TERM-RECORD-WORD"), makeSymbol("_CSETF-TERM-RECORD-LITERAL"));

    private static final SubLSymbol TERM_RECORD_PRINT = makeSymbol("TERM-RECORD-PRINT");

    private static final SubLSymbol TERM_RECORD_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TERM-RECORD-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list476 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TERM-RECORD-P"));

    private static final SubLSymbol TERM_RECORD_TERM = makeSymbol("TERM-RECORD-TERM");

    private static final SubLSymbol _CSETF_TERM_RECORD_TERM = makeSymbol("_CSETF-TERM-RECORD-TERM");

    private static final SubLSymbol _CSETF_TERM_RECORD_WORD = makeSymbol("_CSETF-TERM-RECORD-WORD");

    private static final SubLSymbol TERM_RECORD_LITERAL = makeSymbol("TERM-RECORD-LITERAL");

    private static final SubLSymbol _CSETF_TERM_RECORD_LITERAL = makeSymbol("_CSETF-TERM-RECORD-LITERAL");







    private static final SubLSymbol MAKE_TERM_RECORD = makeSymbol("MAKE-TERM-RECORD");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TERM_RECORD_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TERM-RECORD-METHOD");

    private static final SubLString $str487$__TR_ = makeString("#<TR ");





    private static final SubLString $str490$Error_getting_temporal_fragments_ = makeString("Error getting temporal fragments for ~S:~% ~S");

    private static final SubLString $str491$Can_t_initialize_query_translatio = makeString("Can't initialize query translation parser and lexicon parameters");





    private static final SubLList $list494 = cons(makeSymbol("CYCL"), makeSymbol("SCORE"));

    private static final SubLList $list495 = list(makeSymbol("LOCAL-PP-ATTACHMENT-CONSTRAINT"));

    private static final SubLList $list496 = cons(makeSymbol("WORDS"), makeSymbol("JIS"));

    private static final SubLSymbol JI_EQUAL = makeSymbol("JI-EQUAL");

    private static final SubLObject $$temporallyBetween_Inclusive = reader_make_constant_shell(makeString("temporallyBetween-Inclusive"));

    private static final SubLString $$$between = makeString("between");

    private static final SubLString $$$through = makeString("through");

    private static final SubLString $$$and = makeString("and");

    private static final SubLString $$$from = makeString("from");

    private static final SubLString $$$to = makeString("to");

    private static final SubLSymbol GET_ROOT = makeSymbol("GET-ROOT");



    private static final SubLString $$$after = makeString("after");

    private static final SubLObject $$after_CCF = reader_make_constant_shell(makeString("after-CCF"));





    private static final SubLString $$$before = makeString("before");

    private static final SubLString $$$prior = makeString("prior");

    private static final SubLString $$$prior_to = makeString("prior to");

    private static final SubLString $$$since = makeString("since");

    private static final SubLObject $$laterThan = reader_make_constant_shell(makeString("laterThan"));

    private static final SubLObject $$maxDateForEvent = reader_make_constant_shell(makeString("maxDateForEvent"));

    private static final SubLSymbol $sym516$_MAX = makeSymbol("?MAX");

    private static final SubLList $list517 = list(makeSymbol("?MAX"));





    private static final SubLString $$$during = makeString("during");

    private static final SubLString $$$in = makeString("in");

    private static final SubLString $$$on = makeString("on");

    private static final SubLObject $$dateOfEvent_CAE = reader_make_constant_shell(makeString("dateOfEvent-CAE"));





    private static final SubLObject $$equals = reader_make_constant_shell(makeString("equals"));

    private static final SubLList $list527 = list(makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("ARG3"), makeSymbol("WORDKEY"));

    private static final SubLString $$$ARG = makeString("ARG");









    private static final SubLSymbol TERM_RECORD_EQUAL = makeSymbol("TERM-RECORD-EQUAL");

    private static final SubLList $list534 = cons(makeSymbol("?TERM"), makeSymbol("?SET"));

    private static final SubLSymbol $sym535$_TERM = makeSymbol("?TERM");

    private static final SubLObject $$TheSet = reader_make_constant_shell(makeString("TheSet"));

    private static final SubLList $list537 = list(list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?TERM"), makeSymbol("?X")), list(reader_make_constant_shell(makeString("generateFormulasForElements-TermIsa")), makeSymbol("?X"), makeSymbol("?SET"))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("genls")), makeSymbol("?TERM"), makeSymbol("?X")), list(reader_make_constant_shell(makeString("generateFormulasForElements-TermGenls")), makeSymbol("?X"), makeSymbol("?SET")))));

    private static final SubLString $str538$Can_t_check_constraints_on__a = makeString("Can't check constraints on ~a");

    private static final SubLSymbol $sym539$INDIVIDUAL__CACHED = makeSymbol("INDIVIDUAL?-CACHED");

    private static final SubLSymbol $sym540$_INDIVIDUAL__CACHED_CACHING_STATE_ = makeSymbol("*INDIVIDUAL?-CACHED-CACHING-STATE*");

    private static final SubLSymbol $sym541$CLEAR_INDIVIDUAL__CACHED = makeSymbol("CLEAR-INDIVIDUAL?-CACHED");

    private static final SubLSymbol $sym542$ISA_COLLECTION__CACHED = makeSymbol("ISA-COLLECTION?-CACHED");

    private static final SubLSymbol $sym543$_ISA_COLLECTION__CACHED_CACHING_STATE_ = makeSymbol("*ISA-COLLECTION?-CACHED-CACHING-STATE*");

    private static final SubLSymbol $sym544$CLEAR_ISA_COLLECTION__CACHED = makeSymbol("CLEAR-ISA-COLLECTION?-CACHED");

    private static final SubLSymbol $sym545$COLLECTION_PASSES_CONSTRAINTS_ = makeSymbol("COLLECTION-PASSES-CONSTRAINTS?");

    private static final SubLSymbol $sym546$_COLLECTION_PASSES_CONSTRAINTS__CACHING_STATE_ = makeSymbol("*COLLECTION-PASSES-CONSTRAINTS?-CACHING-STATE*");

    private static final SubLSymbol $sym547$CLEAR_COLLECTION_PASSES_CONSTRAINTS_ = makeSymbol("CLEAR-COLLECTION-PASSES-CONSTRAINTS?");

    private static final SubLSymbol $sym548$INDIVIDUAL_PASSES_CONSTRAINTS_ = makeSymbol("INDIVIDUAL-PASSES-CONSTRAINTS?");

    private static final SubLSymbol $sym549$_INDIVIDUAL_PASSES_CONSTRAINTS__CACHING_STATE_ = makeSymbol("*INDIVIDUAL-PASSES-CONSTRAINTS?-CACHING-STATE*");

    private static final SubLSymbol $sym550$CLEAR_INDIVIDUAL_PASSES_CONSTRAINTS_ = makeSymbol("CLEAR-INDIVIDUAL-PASSES-CONSTRAINTS?");









    private static final SubLString $str555$_S_is_not_one_of__S = makeString("~S is not one of ~S");



    private static final SubLString $str557$_less_than__a_zA_Z0_9___s__days__ = makeString("(less than [a-zA-Z0-9\\-\\s]+days? )");

    private static final SubLString $str558$_less_than__a_zA_Z0_9___s__months = makeString("(less than [a-zA-Z0-9\\-\\s]+months? )");

    private static final SubLString $str559$_less_than__a_zA_Z0_9___s__weeks_ = makeString("(less than [a-zA-Z0-9\\-\\s]+weeks? )");

    private static final SubLString $str560$_less_than__a_zA_Z0_9___s__years_ = makeString("(less than [a-zA-Z0-9\\-\\s]+years? )");

    private static final SubLString $str561$_more_than__a_zA_Z0_9___s__days__ = makeString("(more than [a-zA-Z0-9\\-\\s]+days? )");

    private static final SubLString $str562$_more_than__a_zA_Z0_9___s__months = makeString("(more than [a-zA-Z0-9\\-\\s]+months? )");

    private static final SubLString $str563$_more_than__a_zA_Z0_9___s__weeks_ = makeString("(more than [a-zA-Z0-9\\-\\s]+weeks? )");

    private static final SubLString $str564$_more_than__a_zA_Z0_9___s__years_ = makeString("(more than [a-zA-Z0-9\\-\\s]+years? )");

    private static final SubLString $str565$_no_later_than__a_zA_Z0_9___s__da = makeString("(no later than [a-zA-Z0-9\\-\\s]+days? )");

    private static final SubLString $str566$_no_later_than__a_zA_Z0_9___s__mo = makeString("(no later than [a-zA-Z0-9\\-\\s]+months? )");

    private static final SubLString $str567$_no_later_than__a_zA_Z0_9___s__we = makeString("(no later than [a-zA-Z0-9\\-\\s]+weeks? )");

    private static final SubLString $str568$_no_later_than__a_zA_Z0_9___s__ye = makeString("(no later than [a-zA-Z0-9\\-\\s]+years? )");



    private static final SubLObject $$TemporalModifierTemplate = reader_make_constant_shell(makeString("TemporalModifierTemplate"));

    private static final SubLSymbol TEMP_RELATION_EQUAL = makeSymbol("TEMP-RELATION-EQUAL");

    private static final SubLList $list572 = list(makeSymbol("FORMULA1"), cons(makeSymbol("GLOSS1"), makeSymbol("VARMAP1")), makeSymbol("CATEGORY1"));

    private static final SubLList $list573 = list(makeSymbol("FORMULA2"), cons(makeSymbol("GLOSS2"), makeSymbol("VARMAP2")), makeSymbol("CATEGORY2"));

    private static final SubLList $list574 = list(reader_make_constant_shell(makeString("greaterThan")), reader_make_constant_shell(makeString("greaterThanOrEqualTo")), reader_make_constant_shell(makeString("lessThan")), reader_make_constant_shell(makeString("lessThanOrEqualTo")));

    private static final SubLList $list575 = list(cons(makeString("or less"), reader_make_constant_shell(makeString("greaterThanOrEqualTo"))), cons(makeString("or greater"), reader_make_constant_shell(makeString("lessThanOrEqualTo"))), cons(makeString("or more"), reader_make_constant_shell(makeString("lessThanOrEqualTo"))), cons(makeString("equal or greater than"), reader_make_constant_shell(makeString("greaterThanOrEqualTo"))), cons(makeString("equal or less than"), reader_make_constant_shell(makeString("lessThanOrEqualTo"))));

    private static final SubLList $list576 = cons(makeSymbol("START"), makeSymbol("END"));

    private static final SubLSymbol TOKEN_RECORD = makeSymbol("TOKEN-RECORD");

    private static final SubLSymbol TOKEN_RECORD_P = makeSymbol("TOKEN-RECORD-P");

    private static final SubLList $list579 = list(makeSymbol("STRING"), makeSymbol("DENOTATIONS"), makeSymbol("OFFSET"), makeSymbol("END"));

    private static final SubLList $list580 = list(makeKeyword("STRING"), makeKeyword("DENOTATIONS"), makeKeyword("OFFSET"), makeKeyword("END"));

    private static final SubLList $list581 = list(makeSymbol("TR-STRING"), makeSymbol("TR-DENOTATIONS"), makeSymbol("TR-OFFSET"), makeSymbol("TR-END"));

    private static final SubLList $list582 = list(makeSymbol("_CSETF-TR-STRING"), makeSymbol("_CSETF-TR-DENOTATIONS"), makeSymbol("_CSETF-TR-OFFSET"), makeSymbol("_CSETF-TR-END"));

    private static final SubLSymbol PRINT_TOKEN_RECORD = makeSymbol("PRINT-TOKEN-RECORD");

    private static final SubLSymbol TOKEN_RECORD_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TOKEN-RECORD-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list585 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TOKEN-RECORD-P"));

    private static final SubLSymbol TR_STRING = makeSymbol("TR-STRING");

    private static final SubLSymbol _CSETF_TR_STRING = makeSymbol("_CSETF-TR-STRING");

    private static final SubLSymbol TR_DENOTATIONS = makeSymbol("TR-DENOTATIONS");

    private static final SubLSymbol _CSETF_TR_DENOTATIONS = makeSymbol("_CSETF-TR-DENOTATIONS");

    private static final SubLSymbol TR_OFFSET = makeSymbol("TR-OFFSET");

    private static final SubLSymbol _CSETF_TR_OFFSET = makeSymbol("_CSETF-TR-OFFSET");

    private static final SubLSymbol TR_END = makeSymbol("TR-END");

    private static final SubLSymbol _CSETF_TR_END = makeSymbol("_CSETF-TR-END");





    private static final SubLSymbol MAKE_TOKEN_RECORD = makeSymbol("MAKE-TOKEN-RECORD");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TOKEN_RECORD_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TOKEN-RECORD-METHOD");

    private static final SubLString $str598$_TOKEN_RECORD__S__S__S__S_ = makeString("<TOKEN-RECORD ~S ~S ~S ~S>");

    private static final SubLSymbol SXHASH_TOKEN_RECORD_METHOD = makeSymbol("SXHASH-TOKEN-RECORD-METHOD");

    private static final SubLObject $$CycLQuerySpecification = reader_make_constant_shell(makeString("CycLQuerySpecification"));

    private static final SubLSymbol GET_REIFIED_QUERIES_FROM_STRING = makeSymbol("GET-REIFIED-QUERIES-FROM-STRING");

    private static final SubLSymbol TOKEN_RECORD_FOCAL_STRING = makeSymbol("TOKEN-RECORD-FOCAL-STRING");

    private static final SubLSymbol $sym603$REIFIED_QUERY_SEARCH_SUPPORTS_SCORE__ = makeSymbol("REIFIED-QUERY-SEARCH-SUPPORTS-SCORE->");

    private static final SubLSymbol $get_reified_queries_from_string_caching_state$ = makeSymbol("*GET-REIFIED-QUERIES-FROM-STRING-CACHING-STATE*");

    private static final SubLSymbol CLEAR_GET_REIFIED_QUERIES_FROM_STRING = makeSymbol("CLEAR-GET-REIFIED-QUERIES-FROM-STRING");

    private static final SubLObject $const606$sentenceParameterValueInSpecifica = reader_make_constant_shell(makeString("sentenceParameterValueInSpecification"));

    private static final SubLSymbol $sym607$REIFIED_QUERY_SEARCH_SUPPORT_SCORE__ = makeSymbol("REIFIED-QUERY-SEARCH-SUPPORT-SCORE->");

    private static final SubLList $list608 = list(makeSymbol("TOKEN-RECORD"), makeSymbol("TERM"));

    private static final SubLSymbol LEX_ENTRY_DENOT = makeSymbol("LEX-ENTRY-DENOT");

    private static final SubLFloat $float$0_75 = makeDouble(0.75);

    private static final SubLSymbol LEXICON_LOOKUP_MEMOIZED = makeSymbol("LEXICON-LOOKUP-MEMOIZED");

    private static final SubLList $list612 = list(makeString("Which one, if any, of the following statements is false?"));

    private static final SubLList $list613 = list(list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhichDifferenceBetweenMitosisAndMeiosisIsTrue"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatIsTrueOfTyrosineKinaseReceptorActivation"))), list(reader_make_constant_shell(makeString("TestQueryFn")), list(reader_make_constant_shell(makeString("OpenSubqueryKBCTestFn")), reader_make_constant_shell(makeString("CPTTest-WhichOfTheFollowingIsTrueOfReceptorMolecules")))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-RelationBetweenHaploidAndMonoploidNumbersInHumans"))));











    private static final SubLString $str619$_A_is_not_a__A = makeString("~A is not a ~A");





    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str624$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLObject $$queryContentString = reader_make_constant_shell(makeString("queryContentString"));

    private static final SubLString $str626$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str627$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLList $list628 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    private static final SubLString $str629$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLString $str630$_define_test_case_table_get_reifi = makeString("(define-test-case-table get-reified-queries-from-string (:owner \"baxter\" :kb :full :classes \'(cae-test-case-tables)\n\t\t\t\t\t\t\t\t:test \'reified-query-answer-found?\n\t\t\t\t\t\t\t\t:working? t)\n");

    private static final SubLString $str631$_ = makeString(")");

    private static final SubLSymbol REIFIED_QUERY_SEARCH_SCORE_FROM_SUPPORTS = makeSymbol("REIFIED-QUERY-SEARCH-SCORE-FROM-SUPPORTS");

    private static final SubLSymbol $sym633$REIFIED_QUERY_ANSWER_FOUND_ = makeSymbol("REIFIED-QUERY-ANSWER-FOUND?");

    private static final SubLObject $list634 = _constant_634_initializer();

    private static final SubLSymbol FILTERED_TERMS_FROM_MEDICAL_CAE_QUERY = makeSymbol("FILTERED-TERMS-FROM-MEDICAL-CAE-QUERY");

    private static final SubLList $list636 = list(list(list(makeString("pseudo-aneurysm")), list(list(makeString("pseudo-aneurysm"), reader_make_constant_shell(makeString("Pseudoaneurysm"))))), list(list(makeString("pseudoaneurysm")), list(list(makeString("pseudoaneurysm"), reader_make_constant_shell(makeString("Pseudoaneurysm"))))));

    private static final SubLObject $$MedicalResearchCAEGuidanceMt = reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt"));

    private static final SubLSymbol GET_FRAGMENTS_FOR_MEDICAL_TERMS = makeSymbol("GET-FRAGMENTS-FOR-MEDICAL-TERMS");

    private static final SubLObject $list639 = _constant_639_initializer();

    private static final SubLSymbol TEST_FILL_IN_GLOSS_TEMPLATE_STRING = makeSymbol("TEST-FILL-IN-GLOSS-TEMPLATE-STRING");

    private static final SubLObject $list641 = _constant_641_initializer();

    private static final SubLSymbol TEST_GET_TEMPORAL_FRAGMENTS_FOR_STRING = makeSymbol("TEST-GET-TEMPORAL-FRAGMENTS-FOR-STRING");

    private static final SubLSymbol TEMP_RELATIONS_EQUAL = makeSymbol("TEMP-RELATIONS-EQUAL");

    private static final SubLObject $list644 = _constant_644_initializer();

    private static final SubLObject $$CytologicalProcessesCAEGuidanceMt = reader_make_constant_shell(makeString("CytologicalProcessesCAEGuidanceMt"));

    private static final SubLSymbol GET_ONLY_FRAGMENTS_FOR_HALO_STRING = makeSymbol("GET-ONLY-FRAGMENTS-FOR-HALO-STRING");

    private static final SubLSymbol $sym647$EL_FORMULAS_SUPERSET_ = makeSymbol("EL-FORMULAS-SUPERSET?");

    private static final SubLList $list648 = list(list(list(makeString("If a cell contains 60 chromatids at the start of mitosis, how many chromosomes will be found in each daughter cell at the completion of M-phase?")), list(list(reader_make_constant_shell(makeString("daughterCells")), makeSymbol("?M"), makeSymbol("?OUTPUT")))), list(list(makeString("Suppose the production of microtubules is inhibited. What else will be inhibited?")), list(list(reader_make_constant_shell(makeString("inhibits-SitSitType")), makeSymbol("?EVT"), makeSymbol("?WHAT")))), list(list(makeString("An event which prevents DNA synthesis would mean a cell is arrested in which part of the cell cycle?")), list(list(reader_make_constant_shell(makeString("processInterruptedAtStep")), makeSymbol("?CC"), makeSymbol("?PHASE")))), list(list(makeString("Suppose the number of chromosomes in a human liver cell were 12. How many chromosomes would there be in a human sperm cell?")), list(list(reader_make_constant_shell(makeString("cellSource")), makeSymbol("?CELL"), makeSymbol("?ORGANISM")), list(reader_make_constant_shell(makeString("cellSource")), makeSymbol("?SPERM"), makeSymbol("?ORGANISM")), list(reader_make_constant_shell(makeString("cellHasNumberOfChromosomes")), makeSymbol("?SPERM"), makeSymbol("?N")))));

    public static SubLObject with_current_cae_task(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject task = NIL;
        destructuring_bind_must_consp(current, datum, $list6);
        task = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(CHECK_TYPE, task, $list9), listS(CLET, list(list($current_cae_task$, task)), append(body, NIL)));
    }

    public static SubLObject current_cae_task() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != misc_utilities.initialized_p($current_cae_task$.getDynamicValue(thread)) ? $current_cae_task$.getDynamicValue(thread) : $$GeneralCycKETask_Allotment;
    }

    public static SubLObject indexical_cae_task() {
        return current_cae_task();
    }

    public static SubLObject cae_query_search_default_mt(SubLObject task) {
        if (task == UNPROVIDED) {
            task = current_cae_task();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $cae_query_search_default_mt$.getDynamicValue(thread) ? $cae_query_search_default_mt$.getDynamicValue(thread) : query_library_utils.get_default_cae_guidance_mt(task);
    }

    public static SubLObject cae_default_query_mt(SubLObject task) {
        if (task == UNPROVIDED) {
            task = current_cae_task();
        }
        return query_library_utils.query_library_default_query_mt(task);
    }

    public static SubLObject cae_default_wff_checking_mt(SubLObject task) {
        if (task == UNPROVIDED) {
            task = current_cae_task();
        }
        return query_library_utils.get_default_wff_checking_mt(task);
    }

    public static SubLObject clear_query_search_caches() {
        clear_default_values_for_pred();
        clear_suggested_free_position_for_predP();
        query_library_utils.clear_cae_query_search_filter_specification();
        clear_any_not_isa_cachedP();
        clear_term_classification_tree_info();
        clear_get_cae_query_search_lexicon_int();
        clear_fill_in_gloss_template_cached();
        clear_mnemonic_varmap_for_formula_cached();
        clear_get_types_to_existentially_bind();
        clear_any_not_isa_cachedP();
        clear_any_not_genl_cachedP();
        clear_required_bound_args_for_preds();
        clear_concepts_to_add_for_concept();
        clear_individualP_cached();
        clear_isa_collectionP_cached();
        clear_collection_passes_constraintsP();
        clear_individual_passes_constraintsP();
        clear_get_variables_of_type_in_formula();
        clear_fragment_formulas_equalP();
        return NIL;
    }

    public static SubLObject genl_args_to_queries() {
        ensure_cae_query_search_tables_initialization();
        return $genl_args_to_queries$.getGlobalValue();
    }

    public static SubLObject isa_args_to_queries() {
        ensure_cae_query_search_tables_initialization();
        return $isa_args_to_queries$.getGlobalValue();
    }

    public static SubLObject genl_args_to_suppressed_queries() {
        ensure_cae_query_search_tables_initialization();
        return $genl_args_to_suppressed_queries$.getGlobalValue();
    }

    public static SubLObject isa_args_to_suppressed_queries() {
        ensure_cae_query_search_tables_initialization();
        return $isa_args_to_suppressed_queries$.getGlobalValue();
    }

    public static SubLObject ensure_cae_query_search_tables_initialization() {
        if ((((NIL == misc_utilities.initialized_p($genl_args_to_suppressed_queries$.getGlobalValue())) || (NIL == misc_utilities.initialized_p($genl_args_to_queries$.getGlobalValue()))) || (NIL == misc_utilities.initialized_p($isa_args_to_suppressed_queries$.getGlobalValue()))) || (NIL == misc_utilities.initialized_p($isa_args_to_queries$.getGlobalValue()))) {
            initialize_query_search_tables_from_applicable_mts(UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject ensure_query_search_tables_initialized_for_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == $use_new_query_search$.getDynamicValue(thread)) && (NIL == subl_promotions.memberP(mt, $cae_query_search_initialized_mts$.getGlobalValue(), EQUAL, UNPROVIDED))) {
            initialize_query_search_tables(mt);
        }
        return NIL;
    }

    public static SubLObject dump_cae_query_search_tables_to_stream(final SubLObject stream) {
        SubLObject release = NIL;
        try {
            release = seize_lock($cae_query_search_table_lock$.getGlobalValue());
            cfasl_output($genl_args_to_queries$.getGlobalValue(), stream);
            cfasl_output($isa_args_to_queries$.getGlobalValue(), stream);
            cfasl_output($cae_query_search_initialized_mts$.getGlobalValue(), stream);
            cfasl_output(list($SUPPRESSED_GENLS, $genl_args_to_suppressed_queries$.getGlobalValue(), $SUPPRESSED_ISA, $isa_args_to_suppressed_queries$.getGlobalValue()), stream);
        } finally {
            if (NIL != release) {
                release_lock($cae_query_search_table_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject load_cae_query_search_tables_from_stream(final SubLObject stream) {
        SubLObject release = NIL;
        try {
            release = seize_lock($cae_query_search_table_lock$.getGlobalValue());
            $genl_args_to_queries$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
            $isa_args_to_queries$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
            $cae_query_search_initialized_mts$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
            final SubLObject additional_info = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            $genl_args_to_suppressed_queries$.setGlobalValue(getf(additional_info, $SUPPRESSED_GENLS, dictionary.new_dictionary(EQUAL, UNPROVIDED)));
            $isa_args_to_suppressed_queries$.setGlobalValue(getf(additional_info, $SUPPRESSED_ISA, dictionary.new_dictionary(EQUAL, UNPROVIDED)));
        } finally {
            if (NIL != release) {
                release_lock($cae_query_search_table_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject clear_cae_query_search_tables() {
        SubLObject release = NIL;
        try {
            release = seize_lock($cae_query_search_table_lock$.getGlobalValue());
            $genl_args_to_queries$.setGlobalValue(dictionary.new_dictionary(EQUAL, UNPROVIDED));
            $isa_args_to_queries$.setGlobalValue(dictionary.new_dictionary(EQUAL, UNPROVIDED));
            $genl_args_to_suppressed_queries$.setGlobalValue(dictionary.new_dictionary(EQUAL, UNPROVIDED));
            $isa_args_to_suppressed_queries$.setGlobalValue(dictionary.new_dictionary(EQUAL, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($cae_query_search_table_lock$.getGlobalValue());
            }
        }
        $cae_query_search_initialized_mts$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject add_query_search_table_assertion(final SubLObject argument, final SubLObject assertion) {
        return NIL;
    }

    public static SubLObject remove_query_search_table_assertion(final SubLObject argument, final SubLObject assertion) {
        return NIL;
    }

    public static SubLObject add_template_to_query_search_table(final SubLObject type, final SubLObject constraint, final SubLObject mt, final SubLObject formula, final SubLObject metavariable, final SubLObject category, SubLObject variable_format, SubLObject opaque) {
        if (variable_format == UNPROVIDED) {
            variable_format = $cae_default_variable_format$.getGlobalValue();
        }
        if (opaque == UNPROVIDED) {
            opaque = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject table = NIL;
        SubLObject gen_template = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if (type.eql($ISA)) {
                        table = $isa_args_to_queries$.getGlobalValue();
                        gen_template = generate_template_for_isa_constraint(formula, metavariable, constraint, variable_format);
                    } else
                        if (type.eql($GENLS)) {
                            table = $genl_args_to_queries$.getGlobalValue();
                            gen_template = generate_template_for_genls_constraint(formula, metavariable, constraint, variable_format);
                        } else
                            if (type.eql($SUPPRESS_ISA)) {
                                table = $isa_args_to_suppressed_queries$.getGlobalValue();
                                gen_template = $list30;
                            } else
                                if (type.eql($SUPPRESS_GENLS)) {
                                    table = $genl_args_to_suppressed_queries$.getGlobalValue();
                                    gen_template = $list30;
                                }



                    if ((NIL != gen_template) || (NIL != used_as_predicateP(metavariable, formula))) {
                        final SubLObject template_value = list(formula, metavariable, gen_template, category, opaque);
                        SubLObject release = NIL;
                        try {
                            release = seize_lock($cae_query_search_table_lock$.getGlobalValue());
                            dictionary_utilities.dictionary_pushnew(table, constraint_from_term_and_mt(constraint, mt), template_value, EQUAL, UNPROVIDED);
                        } finally {
                            if (NIL != release) {
                                release_lock($cae_query_search_table_lock$.getGlobalValue());
                            }
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_message) {
            Errors.warn($str32$Error_adding__S_to_query_search_t, formula, error_message);
        }
        return NIL;
    }

    public static SubLObject constraint_from_term_and_mt(final SubLObject v_term, final SubLObject mt) {
        return cons(v_term, mt);
    }

    public static SubLObject clear_make_formula_for_rule_rhs_cached() {
        final SubLObject cs = $make_formula_for_rule_rhs_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_make_formula_for_rule_rhs_cached(final SubLObject v_term, final SubLObject optimize_var_namesP, final SubLObject domain_mt) {
        return memoization_state.caching_state_remove_function_results_with_args($make_formula_for_rule_rhs_cached_caching_state$.getGlobalValue(), list(v_term, optimize_var_namesP, domain_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject make_formula_for_rule_rhs_cached_internal(final SubLObject v_term, final SubLObject optimize_var_namesP, final SubLObject domain_mt) {
        return make_formula_for_rule_rhs(v_term, optimize_var_namesP, domain_mt);
    }

    public static SubLObject make_formula_for_rule_rhs_cached(final SubLObject v_term, final SubLObject optimize_var_namesP, final SubLObject domain_mt) {
        SubLObject caching_state = $make_formula_for_rule_rhs_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(MAKE_FORMULA_FOR_RULE_RHS_CACHED, $make_formula_for_rule_rhs_cached_caching_state$, $int$3000, EQUAL, THREE_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, optimize_var_namesP, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (optimize_var_namesP.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(make_formula_for_rule_rhs_cached_internal(v_term, optimize_var_namesP, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, optimize_var_namesP, domain_mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject make_formula_for_rule_rhs(final SubLObject v_term, SubLObject optimize_var_namesP, SubLObject domain_mt) {
        if (optimize_var_namesP == UNPROVIDED) {
            optimize_var_namesP = T;
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = cae_query_search_default_mt(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject formula = NIL;
        if (NIL != fort_types_interface.isa_predicateP(v_term, domain_mt)) {
            final SubLObject v_arity = arity.min_arity(v_term);
            if (NIL != v_arity) {
                formula = make_el_formula(v_term, standard_xyz_arglist(v_arity), UNPROVIDED);
            }
        } else
            if (NIL != fort_types_interface.isa_collectionP(v_term, domain_mt)) {
                formula = list($$isa, $sym37$_X, v_term);
            }

        return (NIL != optimize_var_namesP) && (NIL != el_formula_p(formula)) ? nth_value_step_2(nth_value_step_1(ZERO_INTEGER), optimize_el_formula_variable_names(formula, narts_high.nart_substitute(pph_vars.$pph_language_mt$.getDynamicValue(thread)), narts_high.nart_substitute(domain_mt), UNPROVIDED)) : formula;
    }

    public static SubLObject clear_standard_xyz_arglist() {
        final SubLObject cs = $standard_xyz_arglist_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_standard_xyz_arglist(final SubLObject v_arity) {
        return memoization_state.caching_state_remove_function_results_with_args($standard_xyz_arglist_caching_state$.getGlobalValue(), list(v_arity), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject standard_xyz_arglist_internal(final SubLObject v_arity) {
        assert NIL != subl_promotions.non_negative_integer_p(v_arity) : "subl_promotions.non_negative_integer_p(v_arity) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(v_arity) " + v_arity;
        if (v_arity.isZero()) {
            return NIL;
        }
        final SubLObject one_smaller = standard_xyz_arglist(number_utilities.f_1_(v_arity));
        return list_utilities.add_to_end(next_named_var(one_smaller, $sym37$_X), one_smaller);
    }

    public static SubLObject standard_xyz_arglist(final SubLObject v_arity) {
        SubLObject caching_state = $standard_xyz_arglist_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(STANDARD_XYZ_ARGLIST, $standard_xyz_arglist_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_arity, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(standard_xyz_arglist_internal(v_arity)));
            memoization_state.caching_state_put(caching_state, v_arity, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject category_for_term(final SubLObject v_term, SubLObject mt, SubLObject supplementalP) {
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        if (supplementalP == UNPROVIDED) {
            supplementalP = NIL;
        }
        if (NIL != isa.isaP(v_term, $$StatisticalPredicate, mt, UNPROVIDED)) {
            return $STATISTICAL;
        }
        if (NIL != supplementalP) {
            return $SUPPLEMENTAL;
        }
        return $SIMPLE;
    }

    public static SubLObject initialize_query_search_tables_from_applicable_mts(SubLObject mts) {
        if (mts == UNPROVIDED) {
            mts = query_library_utils.get_all_default_wff_checking_mts();
        }
        clear_cae_query_search_tables();
        SubLObject cdolist_list_var = mts;
        SubLObject mt = NIL;
        mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            initialize_query_search_tables(mt);
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject initialize_query_search_tables(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject str;
        final SubLObject note = str = cconcatenate($str45$Initializing_query_search_tables_, new SubLObject[]{ format_nil.format_nil_a_no_copy(mt), $str46$____ });
        final SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
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
            clear_query_search_caches();
            final SubLObject _prev_bind_0_$1 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
            try {
                pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
                thread.resetMultipleValues();
                final SubLObject _prev_bind_0_$2 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                try {
                    pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                    final SubLObject reuseP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    try {
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$3 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                            final SubLObject new_or_reused = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject _prev_bind_0_$4 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                            try {
                                pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                final SubLObject _prev_bind_0_$5 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                    try {
                                        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                        final SubLObject _prev_bind_0_$6 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$7 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$8 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                            SubLObject problem_store = NIL;
                                            try {
                                                problem_store = inference_datastructures_problem_store.new_problem_store(NIL);
                                                final SubLObject inference_properties = list($INFERENCE_MODE, $MINIMAL, $ANSWER_LANGUAGE, $HL, $PROBLEM_STORE, problem_store);
                                                add_templates_to_query_search_tables(mt, inference_properties);
                                            } finally {
                                                final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values = getValuesAsVector();
                                                    inference_datastructures_problem_store.destroy_problem_store(problem_store);
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                                }
                                            }
                                            add_template_to_query_search_table($ISA, $$UnaryPredicate, mt, $list53, $sym54$_PRED, $SIMPLE, UNPROVIDED, UNPROVIDED);
                                            add_template_to_query_search_table($ISA, $$BinaryPredicate, mt, $list56, $sym54$_PRED, $SIMPLE, UNPROVIDED, UNPROVIDED);
                                            add_template_to_query_search_table($ISA, $$TernaryPredicate, mt, $list58, $sym54$_PRED, $SIMPLE, UNPROVIDED, UNPROVIDED);
                                            add_template_to_query_search_table($ISA, $$QuaternaryPredicate, mt, $list60, $sym54$_PRED, $SIMPLE, UNPROVIDED, UNPROVIDED);
                                            add_template_to_query_search_table($ISA, $$QuintaryPredicate, mt, $list62, $sym54$_PRED, $SIMPLE, UNPROVIDED, UNPROVIDED);
                                            if (NIL == ask_utilities.query_boolean($list63, mt, UNPROVIDED)) {
                                                add_template_to_query_search_table($ISA, $$Collection, mt, $list65, $sym37$_X, $SIMPLE, UNPROVIDED, UNPROVIDED);
                                            }
                                        } finally {
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2_$8, thread);
                                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$7, thread);
                                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$6, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                                        }
                                    }
                                } finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$5, thread);
                                }
                            } finally {
                                pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$4, thread);
                            }
                            if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                            }
                        } finally {
                            pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$3, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values3 = getValuesAsVector();
                            if (NIL == reuseP) {
                                pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                            }
                            restoreValuesFromVector(_values3);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                        }
                    }
                } finally {
                    pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$2, thread);
                }
            } finally {
                pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$1, thread);
            }
            noting_progress_postamble();
        } finally {
            $silent_progressP$.rebind(_prev_bind_8, thread);
            $is_noting_progressP$.rebind(_prev_bind_7, thread);
            $progress_count$.rebind(_prev_bind_6, thread);
            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            $progress_notification_count$.rebind(_prev_bind_4, thread);
            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            $progress_start_time$.rebind(_prev_bind_0, thread);
        }
        $cae_query_search_initialized_mts$.setGlobalValue(cons(mt, $cae_query_search_initialized_mts$.getGlobalValue()));
        return NIL;
    }

    public static SubLObject clear_query_search_table_preds() {
        final SubLObject cs = $query_search_table_preds_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_query_search_table_preds() {
        return memoization_state.caching_state_remove_function_results_with_args($query_search_table_preds_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject query_search_table_preds_internal() {
        return list(list(constants_high.find_constant_by_guid_string($str68$4095f840_8499_11db_8000_0002b3620), $ISA, NIL), list(constants_high.find_constant_by_guid_string($str69$eb3635f0_d045_11dc_8000_0013728ef), $ISA, T), list(constants_high.find_constant_by_guid_string($str70$9a90ebe1_c1e3_11df_8f35_00219b490), $ISA, NIL), list(constants_high.find_constant_by_guid_string($str71$b4d3b60a_8491_11db_8000_0002b3620), $GENLS, NIL), list(constants_high.find_constant_by_guid_string($str72$4d2c9d5a_d044_11dc_8000_0013728ef), $GENLS, T), list(constants_high.find_constant_by_guid_string($str73$9a90ebe0_c1e3_11df_8f35_00219b490), $GENLS, NIL), list(constants_high.find_constant_by_guid_string($str74$016b748a_5bf5_4f4a_a05b_7e34d70e2), $SUPPRESS_ISA, NIL), list(constants_high.find_constant_by_guid_string($str75$0a832e0f_5677_41c5_ae13_610018a49), $SUPPRESS_GENLS, NIL));
    }

    public static SubLObject query_search_table_preds() {
        SubLObject caching_state = $query_search_table_preds_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(QUERY_SEARCH_TABLE_PREDS, $query_search_table_preds_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(query_search_table_preds_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject add_templates_to_query_search_tables(final SubLObject mt, final SubLObject inference_properties) {
        final SubLObject vars = $list77;
        final SubLObject query = list($$assertedSentence, bq_cons($PRED, vars));
        SubLObject cdolist_list_var = query_search_table_preds();
        SubLObject info = NIL;
        info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = info;
            SubLObject pred = NIL;
            SubLObject type = NIL;
            SubLObject supplementalP = NIL;
            destructuring_bind_must_consp(current, datum, $list80);
            pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list80);
            type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list80);
            supplementalP = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject cdolist_list_var_$12 = ask_utilities.query_template(vars, cycl_utilities.expression_subst(pred, $PRED, query, UNPROVIDED, UNPROVIDED), mt, copy_list(inference_properties));
                SubLObject result = NIL;
                result = cdolist_list_var_$12.first();
                while (NIL != cdolist_list_var_$12) {
                    SubLObject current_$14;
                    final SubLObject datum_$13 = current_$14 = result;
                    SubLObject v_term = NIL;
                    SubLObject v_set = NIL;
                    destructuring_bind_must_consp(current_$14, datum_$13, $list81);
                    v_term = current_$14.first();
                    current_$14 = current_$14.rest();
                    destructuring_bind_must_consp(current_$14, datum_$13, $list81);
                    v_set = current_$14.first();
                    current_$14 = current_$14.rest();
                    if (NIL == current_$14) {
                        add_templates_internal(v_term, v_set, mt, supplementalP, type, inference_properties);
                    } else {
                        cdestructuring_bind_error(datum_$13, $list81);
                    }
                    cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                    result = cdolist_list_var_$12.first();
                } 
            } else {
                cdestructuring_bind_error(datum, $list80);
            }
            cdolist_list_var = cdolist_list_var.rest();
            info = cdolist_list_var.first();
        } 
        add_templates_with_specified_arg_positions_to_query_search_tables(mt, inference_properties);
        return NIL;
    }

    public static SubLObject add_templates_internal(final SubLObject v_term, final SubLObject v_set, final SubLObject mt, final SubLObject supplementalP, final SubLObject type, final SubLObject inference_properties) {
        final SubLObject other_terms = ask_utilities.query_variable($sym82$_ELEM, list($$elementOf, $sym82$_ELEM, v_set), mt, inference_properties);
        SubLObject added_formulas = NIL;
        SubLObject cdolist_list_var = other_terms;
        SubLObject element = NIL;
        element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject formula = make_formula_for_rule_rhs(element, T, mt);
            final SubLObject category = category_for_term(element, mt, supplementalP);
            if (NIL == formula) {
                Errors.warn($str84$Unable_to_add_query_search_templa, type, v_term, element);
            } else {
                final SubLObject unboundP = sublisp_null(list_utilities.find_if_not($sym85$EL_VAR_, cycl_utilities.formula_args(formula, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                SubLObject added_partially_boundP = NIL;
                if (NIL != el_extensional_set_p(v_set)) {
                    SubLObject cdolist_list_var_$15 = remove(element, other_terms, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject other_term = NIL;
                    other_term = cdolist_list_var_$15.first();
                    while (NIL != cdolist_list_var_$15) {
                        SubLObject cdolist_list_var_$16 = try_substitution_simple(other_term, formula, mt, UNPROVIDED);
                        SubLObject another_formula = NIL;
                        another_formula = cdolist_list_var_$16.first();
                        while (NIL != cdolist_list_var_$16) {
                            add_template_to_query_search_table(type, v_term, mt, another_formula, $sym86$_NONE, category, UNPROVIDED, UNPROVIDED);
                            added_formulas = cons(another_formula, added_formulas);
                            if ((NIL != unboundP) && (NIL != list_utilities.find_if_not($sym85$EL_VAR_, cycl_utilities.formula_args(another_formula, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                added_partially_boundP = T;
                            }
                            cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                            another_formula = cdolist_list_var_$16.first();
                        } 
                        cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                        other_term = cdolist_list_var_$15.first();
                    } 
                }
                add_template_to_query_search_table(type, v_term, mt, formula, $sym86$_NONE, (NIL != unboundP) && (NIL != added_partially_boundP) ? $UNBOUND : category, UNPROVIDED, UNPROVIDED);
                added_formulas = cons(formula, added_formulas);
            }
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        } 
        return values(v_term, added_formulas);
    }

    public static SubLObject add_templates_with_specified_arg_positions_to_query_search_tables(final SubLObject mt, final SubLObject inference_properties) {
        SubLObject added_sentences = NIL;
        SubLObject sentence = NIL;
        SubLObject pred = NIL;
        SubLObject pred_$17 = NIL;
        SubLObject type = NIL;
        SubLObject type_$18 = NIL;
        pred = $list88;
        pred_$17 = pred.first();
        type = $list89;
        type_$18 = type.first();
        while ((NIL != type) || (NIL != pred)) {
            SubLObject cdolist_list_var = ask_utilities.query_template($list97, bq_cons(pred_$17, $list97), mt, inference_properties);
            SubLObject v_bindings = NIL;
            v_bindings = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = v_bindings;
                SubLObject gen_pred = NIL;
                SubLObject v_term = NIL;
                SubLObject arg_pos = NIL;
                destructuring_bind_must_consp(current, datum, $list90);
                gen_pred = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list90);
                v_term = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list90);
                arg_pos = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pcase_var;
                    final SubLObject v_arity = pcase_var = arity.arity(gen_pred);
                    if (pcase_var.eql(ONE_INTEGER)) {
                        sentence = bq_cons(gen_pred, $list91);
                    } else
                        if (pcase_var.eql(TWO_INTEGER)) {
                            sentence = bq_cons(gen_pred, $list92);
                        } else
                            if (pcase_var.eql(THREE_INTEGER)) {
                                sentence = bq_cons(gen_pred, $list93);
                            } else
                                if (pcase_var.eql(FOUR_INTEGER)) {
                                    sentence = bq_cons(gen_pred, $list94);
                                } else
                                    if (pcase_var.eql(FIVE_INTEGER)) {
                                        sentence = bq_cons(gen_pred, $list95);
                                    } else {
                                        Errors.warn($str96$Trying_to_add_a_template_for__S__, gen_pred, v_arity);
                                    }




                    add_template_to_query_search_table(type_$18, v_term, mt, sentence, cycl_utilities.formula_arg_position(sentence, list(arg_pos), UNPROVIDED), $SIMPLE, UNPROVIDED, UNPROVIDED);
                    added_sentences = cons(sentence, added_sentences);
                } else {
                    cdestructuring_bind_error(datum, $list90);
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_bindings = cdolist_list_var.first();
            } 
            pred = pred.rest();
            pred_$17 = pred.first();
            type = type.rest();
            type_$18 = type.first();
        } 
        pred = NIL;
        SubLObject pred_$18 = NIL;
        type = NIL;
        SubLObject type_$19 = NIL;
        pred = $list98;
        pred_$18 = pred.first();
        type = $list99;
        type_$19 = type.first();
        while ((NIL != type) || (NIL != pred)) {
            SubLObject cdolist_list_var = ask_utilities.query_template($list103, bq_cons(pred_$18, $list103), mt, inference_properties);
            SubLObject v_bindings = NIL;
            v_bindings = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = v_bindings;
                SubLObject sentence_$21 = NIL;
                SubLObject v_term = NIL;
                destructuring_bind_must_consp(current, datum, $list100);
                sentence_$21 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list100);
                v_term = current.first();
                current = current.rest();
                if (NIL == current) {
                    add_template_to_query_search_table(type_$19, v_term, mt, sentence_$21, $$TheQuerySearchFocalTerm, $SIMPLE, $cae_default_variable_format$.getGlobalValue(), $OPAQUE);
                    added_sentences = cons(sentence_$21, added_sentences);
                } else {
                    cdestructuring_bind_error(datum, $list100);
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_bindings = cdolist_list_var.first();
            } 
            pred = pred.rest();
            pred_$18 = pred.first();
            type = type.rest();
            type_$19 = type.first();
        } 
        return added_sentences;
    }

    public static SubLObject add_templates_internal_templates_added(final SubLObject v_term, final SubLObject v_set, final SubLObject mt, final SubLObject supplementalP, final SubLObject type, final SubLObject inference_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject returned_term = add_templates_internal(v_term, v_set, mt, supplementalP, type, inference_properties);
        final SubLObject templates_added = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return templates_added;
    }

    public static SubLObject indexed_queries_from_string_with_confidences(final SubLObject string, SubLObject must_include_all_tokensP, SubLObject variable_format) {
        if (must_include_all_tokensP == UNPROVIDED) {
            must_include_all_tokensP = NIL;
        }
        if (variable_format == UNPROVIDED) {
            variable_format = $cae_default_variable_format$.getGlobalValue();
        }
        if (variable_format == $DEFAULT) {
            variable_format = $cae_default_variable_format$.getGlobalValue();
        }
        final SubLObject output_pattern = (NIL != cae_task_with_yes_no_folder_enabledP(UNPROVIDED)) ? $ANYTHING : $list108;
        final SubLObject fragments = get_fragments_for_string(string, must_include_all_tokensP, cae_query_search_default_mt(UNPROVIDED), variable_format, output_pattern, UNPROVIDED);
        return format_indexed_queries_from_with_confidences(fragments, UNPROVIDED);
    }

    public static SubLObject indexed_queries_from_terms_with_confidences(final SubLObject list_of_token_term_list_pairs, SubLObject must_include_all_tokensP, SubLObject variable_format) {
        if (must_include_all_tokensP == UNPROVIDED) {
            must_include_all_tokensP = NIL;
        }
        if (variable_format == UNPROVIDED) {
            variable_format = $cae_default_variable_format$.getGlobalValue();
        }
        if (variable_format == $DEFAULT) {
            variable_format = $cae_default_variable_format$.getGlobalValue();
        }
        final SubLObject queries_with_glosses = get_fragments_for_terms(list_of_token_term_list_pairs, must_include_all_tokensP, cae_query_search_default_mt(UNPROVIDED), variable_format, T, $list108);
        return format_indexed_queries_from_with_confidences(queries_with_glosses, UNPROVIDED);
    }

    public static SubLObject get_gloss_for_indexed_query(final SubLObject query_sentence, SubLObject language_mt, SubLObject domain_mt, SubLObject variable_format, SubLObject nl_force) {
        if (language_mt == UNPROVIDED) {
            language_mt = query_library_utils.cae_default_paraphrase_mt(current_cae_task());
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = cae_query_search_default_mt(UNPROVIDED);
        }
        if (variable_format == UNPROVIDED) {
            variable_format = $cae_default_variable_format$.getGlobalValue();
        }
        if (nl_force == UNPROVIDED) {
            nl_force = $DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (variable_format == $DEFAULT) {
            variable_format = $cae_default_variable_format$.getGlobalValue();
        }
        SubLObject javalist = NIL;
        thread.resetMultipleValues();
        final SubLObject arg_position_map = get_params_for_indexed_query_paraphrase(query_sentence, language_mt, domain_mt, variable_format, nl_force);
        final SubLObject reverse_var_map = thread.secondMultipleValue();
        final SubLObject query_sentence_to_paraphrase = thread.thirdMultipleValue();
        final SubLObject force = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject _prev_bind_0 = pph_vars.$pph_terse_modeP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$paraphrase_mode$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$pph_replace_bulleted_list_tagsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pph_vars.$use_parenthetical_disambiguationsP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        final SubLObject _prev_bind_7 = pph_vars.$pph_terse_mt_scopeP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = pph_vars.$pph_maximize_linksP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = pph_vars.$pph_link_arg0P$.currentBinding(thread);
        final SubLObject _prev_bind_10 = pph_vars.$pph_consolidate_output_list_for_natP$.currentBinding(thread);
        final SubLObject _prev_bind_11 = pph_vars.$pph_use_smart_variable_replacementP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
        final SubLObject _prev_bind_13 = pph_vars.$pph_use_title_capitalizationP$.currentBinding(thread);
        final SubLObject _prev_bind_14 = pph_vars.$pph_use_indexical_datesP$.currentBinding(thread);
        final SubLObject _prev_bind_15 = pph_vars.$pph_speaker$.currentBinding(thread);
        final SubLObject _prev_bind_16 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
        try {
            pph_vars.$pph_terse_modeP$.bind(T, thread);
            pph_vars.$paraphrase_mode$.bind($HTML, thread);
            pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
            pph_vars.$pph_replace_bulleted_list_tagsP$.bind(NIL, thread);
            pph_vars.$use_parenthetical_disambiguationsP$.bind(T, thread);
            pph_vars.$paraphrase_precision$.bind(cycl_utilities.expression_find_if($sym112$CYC_VAR_, query_sentence_to_paraphrase, UNPROVIDED, UNPROVIDED), thread);
            pph_vars.$pph_terse_mt_scopeP$.bind(T, thread);
            pph_vars.$pph_maximize_linksP$.bind(T, thread);
            pph_vars.$pph_link_arg0P$.bind(T, thread);
            pph_vars.$pph_consolidate_output_list_for_natP$.bind(NIL, thread);
            pph_vars.$pph_use_smart_variable_replacementP$.bind(T, thread);
            pph_vars.$pph_demerit_cutoff$.bind(number_utilities.positive_infinity(), thread);
            pph_vars.$pph_use_title_capitalizationP$.bind(NIL, thread);
            pph_vars.$pph_use_indexical_datesP$.bind(NIL, thread);
            pph_vars.$pph_speaker$.bind($UNKNOWN, thread);
            pph_vars.$pph_quantify_varsP$.bind(NIL, thread);
            final SubLObject blanksP = eql(variable_format, $BLANKS);
            final SubLObject _prev_bind_0_$22 = pph_vars.$pph_blanks_for_varsP$.currentBinding(thread);
            try {
                pph_vars.$pph_blanks_for_varsP$.bind(makeBoolean((NIL != blanksP) && (nl_force != $INTERROGATIVE)), thread);
                final SubLObject raw_javalist = pph_main.generate_phrase_for_java(query_sentence_to_paraphrase, $list115, force, language_mt, domain_mt, UNPROVIDED);
                javalist = ((NIL != pph_utilities.pph_identity_map_p(arg_position_map)) || (NIL == raw_javalist)) ? raw_javalist : pph_utilities.nadjust_javalist_wrt_map(raw_javalist, arg_position_map);
            } finally {
                pph_vars.$pph_blanks_for_varsP$.rebind(_prev_bind_0_$22, thread);
            }
        } finally {
            pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_16, thread);
            pph_vars.$pph_speaker$.rebind(_prev_bind_15, thread);
            pph_vars.$pph_use_indexical_datesP$.rebind(_prev_bind_14, thread);
            pph_vars.$pph_use_title_capitalizationP$.rebind(_prev_bind_13, thread);
            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_12, thread);
            pph_vars.$pph_use_smart_variable_replacementP$.rebind(_prev_bind_11, thread);
            pph_vars.$pph_consolidate_output_list_for_natP$.rebind(_prev_bind_10, thread);
            pph_vars.$pph_link_arg0P$.rebind(_prev_bind_9, thread);
            pph_vars.$pph_maximize_linksP$.rebind(_prev_bind_8, thread);
            pph_vars.$pph_terse_mt_scopeP$.rebind(_prev_bind_7, thread);
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_6, thread);
            pph_vars.$use_parenthetical_disambiguationsP$.rebind(_prev_bind_5, thread);
            pph_vars.$pph_replace_bulleted_list_tagsP$.rebind(_prev_bind_4, thread);
            pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_3, thread);
            pph_vars.$paraphrase_mode$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_terse_modeP$.rebind(_prev_bind_0, thread);
        }
        if (variable_format.eql($XYZ)) {
            javalist = pph_utilities.pph_javalist_sort_xyz_paraphrases(javalist);
        }
        if (NIL == javalist) {
            Errors.warn($str117$No_NL_generation_available_for__S, query_sentence);
        }
        return NIL != javalist ? pph_utilities.nadjust_javalist_wrt_var_map(javalist, reverse_var_map) : NIL;
    }

    public static SubLObject get_gloss_olist_for_indexed_query(final SubLObject query_sentence, SubLObject language_mt, SubLObject domain_mt, SubLObject variable_format, SubLObject nl_force, SubLObject maximize_linksP) {
        if (language_mt == UNPROVIDED) {
            language_mt = query_library_utils.cae_default_paraphrase_mt(current_cae_task());
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = cae_query_search_default_mt(UNPROVIDED);
        }
        if (variable_format == UNPROVIDED) {
            variable_format = $cae_default_variable_format$.getGlobalValue();
        }
        if (nl_force == UNPROVIDED) {
            nl_force = $DEFAULT;
        }
        if (maximize_linksP == UNPROVIDED) {
            maximize_linksP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (variable_format == $DEFAULT) {
            variable_format = $cae_default_variable_format$.getGlobalValue();
        }
        final SubLObject javalist = NIL;
        thread.resetMultipleValues();
        final SubLObject arg_position_map = get_params_for_indexed_query_paraphrase(query_sentence, language_mt, domain_mt, variable_format, nl_force);
        final SubLObject reverse_var_map = thread.secondMultipleValue();
        final SubLObject query_sentence_to_paraphrase = thread.thirdMultipleValue();
        final SubLObject force = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject _prev_bind_0 = pph_vars.$pph_terse_modeP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$paraphrase_mode$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$pph_replace_bulleted_list_tagsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pph_vars.$use_parenthetical_disambiguationsP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = pph_vars.$pph_terse_mt_scopeP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = pph_vars.$pph_maximize_linksP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = pph_vars.$pph_link_arg0P$.currentBinding(thread);
        final SubLObject _prev_bind_9 = pph_vars.$pph_consolidate_output_list_for_natP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = pph_vars.$pph_use_smart_variable_replacementP$.currentBinding(thread);
        final SubLObject _prev_bind_11 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
        final SubLObject _prev_bind_12 = pph_vars.$pph_use_title_capitalizationP$.currentBinding(thread);
        final SubLObject _prev_bind_13 = pph_vars.$pph_use_indexical_datesP$.currentBinding(thread);
        final SubLObject _prev_bind_14 = pph_vars.$pph_speaker$.currentBinding(thread);
        final SubLObject _prev_bind_15 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
        try {
            pph_vars.$pph_terse_modeP$.bind(T, thread);
            pph_vars.$paraphrase_mode$.bind($HTML, thread);
            pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
            pph_vars.$pph_replace_bulleted_list_tagsP$.bind(NIL, thread);
            pph_vars.$use_parenthetical_disambiguationsP$.bind(T, thread);
            pph_vars.$pph_terse_mt_scopeP$.bind(T, thread);
            pph_vars.$pph_maximize_linksP$.bind(NIL != maximize_linksP ? T : pph_vars.$pph_maximize_linksP$.getDynamicValue(thread), thread);
            pph_vars.$pph_link_arg0P$.bind(NIL != maximize_linksP ? T : pph_vars.$pph_link_arg0P$.getDynamicValue(thread), thread);
            pph_vars.$pph_consolidate_output_list_for_natP$.bind(NIL, thread);
            pph_vars.$pph_use_smart_variable_replacementP$.bind(T, thread);
            pph_vars.$pph_demerit_cutoff$.bind(number_utilities.positive_infinity(), thread);
            pph_vars.$pph_use_title_capitalizationP$.bind(NIL, thread);
            pph_vars.$pph_use_indexical_datesP$.bind(NIL, thread);
            pph_vars.$pph_speaker$.bind($UNKNOWN, thread);
            pph_vars.$pph_quantify_varsP$.bind(NIL, thread);
            final SubLObject blanksP = eql(variable_format, $BLANKS);
            final SubLObject _prev_bind_0_$23 = pph_vars.$pph_blanks_for_varsP$.currentBinding(thread);
            try {
                pph_vars.$pph_blanks_for_varsP$.bind(makeBoolean((NIL != blanksP) && (nl_force != $INTERROGATIVE)), thread);
                final SubLObject olist = pph_main.generate_pph_output_list(query_sentence_to_paraphrase, $DEFAULT, language_mt, domain_mt, $HTML, force);
                return olist;
            } finally {
                pph_vars.$pph_blanks_for_varsP$.rebind(_prev_bind_0_$23, thread);
            }
        } finally {
            pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_15, thread);
            pph_vars.$pph_speaker$.rebind(_prev_bind_14, thread);
            pph_vars.$pph_use_indexical_datesP$.rebind(_prev_bind_13, thread);
            pph_vars.$pph_use_title_capitalizationP$.rebind(_prev_bind_12, thread);
            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_11, thread);
            pph_vars.$pph_use_smart_variable_replacementP$.rebind(_prev_bind_10, thread);
            pph_vars.$pph_consolidate_output_list_for_natP$.rebind(_prev_bind_9, thread);
            pph_vars.$pph_link_arg0P$.rebind(_prev_bind_8, thread);
            pph_vars.$pph_maximize_linksP$.rebind(_prev_bind_7, thread);
            pph_vars.$pph_terse_mt_scopeP$.rebind(_prev_bind_6, thread);
            pph_vars.$use_parenthetical_disambiguationsP$.rebind(_prev_bind_5, thread);
            pph_vars.$pph_replace_bulleted_list_tagsP$.rebind(_prev_bind_4, thread);
            pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_3, thread);
            pph_vars.$paraphrase_mode$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_terse_modeP$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject get_params_for_indexed_query_paraphrase(final SubLObject query_sentence, final SubLObject language_mt, final SubLObject domain_mt, SubLObject variable_format, final SubLObject nl_force) {
        SubLObject arg_position_map = pph_utilities.pph_identity_map();
        SubLObject var_map = NIL;
        SubLObject reverse_var_map = NIL;
        final SubLObject derefinement_template = lookup_cae_fragment_derefinement_template(query_sentence, domain_mt);
        SubLObject query_sentence_to_paraphrase = copy_expression(query_sentence);
        if (NIL == pph_utilities.pph_identity_template_p(derefinement_template)) {
            query_sentence_to_paraphrase = pph_utilities.pph_apply_template(derefinement_template, query_sentence_to_paraphrase);
            arg_position_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, derefinement_template);
        }
        while (NIL != el_existential_p(query_sentence_to_paraphrase)) {
            query_sentence_to_paraphrase = cycl_utilities.formula_arg2(query_sentence_to_paraphrase, UNPROVIDED);
            arg_position_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, $ARG2);
        } 
        if (variable_format.eql($BLANKS) && (NIL != cycl_utilities.expression_find_if(EL_CONJUNCTION_P, query_sentence_to_paraphrase, UNPROVIDED, UNPROVIDED))) {
            variable_format = $MNEMONIC;
        }
        final SubLObject pcase_var = variable_format;
        if (pcase_var.eql($XYZ)) {
            var_map = xyz_varmap_for_formula(query_sentence_to_paraphrase);
        } else
            if (pcase_var.eql($MNEMONIC)) {
                var_map = mnemonic_varmap_for_formula(query_sentence_to_paraphrase, language_mt, domain_mt);
            }

        SubLObject cdolist_list_var = var_map;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject old_var = NIL;
            SubLObject new_var = NIL;
            destructuring_bind_must_consp(current, datum, $list122);
            old_var = current.first();
            current = new_var = current.rest();
            query_sentence_to_paraphrase = cycl_utilities.expression_nsubst(new_var, old_var, query_sentence_to_paraphrase, UNPROVIDED, UNPROVIDED);
            reverse_var_map = list_utilities.alist_enter(reverse_var_map, new_var, old_var, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        final SubLObject blanksP = eql(variable_format, $BLANKS);
        final SubLObject force = (nl_force != $DEFAULT) ? nl_force : NIL == el_formula_p(query_sentence_to_paraphrase) ? $NONE : NIL != blanksP ? $INTERROGATIVE : $DECLARATIVE;
        return values(arg_position_map, reverse_var_map, query_sentence_to_paraphrase, force);
    }

    public static SubLObject format_indexed_queries_from_with_confidences(final SubLObject fragments, SubLObject query_mt) {
        if (query_mt == UNPROVIDED) {
            query_mt = cae_default_query_mt(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_queries_with_confidences = NIL;
        final SubLObject results_dictionary = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
        final SubLObject default_weight = $float$0_5;
        SubLObject cdolist_list_var = fragments;
        SubLObject fragment = NIL;
        fragment = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sentence = cae_query_search_fragment_formula(fragment);
            final SubLObject gloss = cae_query_search_fragment_gloss(fragment);
            final SubLObject category = cae_query_search_fragment_category(fragment);
            final SubLObject offset = cae_query_search_fragment_offset(fragment);
            final SubLObject end = cae_query_search_fragment_end(fragment);
            final SubLObject justification = cae_query_search_fragment_justification(fragment);
            if (NIL != collection_defns.cycl_sentence_askableP(sentence)) {
                final SubLObject weight = divide($float$1_0, add(length(sentence_free_variables(sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED)), ONE_INTEGER));
                final SubLObject v_2nd_weight = default_weight;
                final SubLObject template_id = new_temporary_query_id(sentence);
                final SubLObject template = formula_templates.new_formula_template(template_id, UNPROVIDED);
                final SubLObject query_spec = new_cycl_query_specification.create_new_cycl_query_specification();
                formula_templates.formula_template_set_gloss(template, string_from_gloss_template(gloss));
                new_cycl_query_specification.set_new_cycl_query_specification_comment(query_spec, formula_templates.formula_template_gloss(template));
                new_cycl_query_specification.set_new_cycl_query_specification_formula(query_spec, sentence);
                new_cycl_query_specification.set_new_cycl_query_specification_mt(query_spec, query_mt);
                new_cycl_query_specification.set_new_cycl_query_specification_properties(query_spec, inference_datastructures_enumerated_types.merge_query_properties(new_cycl_query_specification.new_cycl_query_specification_properties(query_spec), query_library_api.guess_inference_parameters_for_query(sentence, query_mt)));
                new_cycl_query_specification.set_new_cycl_query_specification_cycl_id(query_spec, template_id);
                formula_templates.formula_template_set_elmt(template, query_mt);
                formula_templates.formula_template_set_query_specification(template, query_spec);
                query_library_utils.store_original_string_for_template_id(template_id, format_nil.format_nil_a(template_id));
                SubLObject xml_string = NIL;
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                    try {
                        xml_vars.$xml_stream$.bind(stream, thread);
                        formula_templates.xml_serialize_formula_template_as_document(template, UNPROVIDED);
                    } finally {
                        xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                    }
                    xml_string = get_output_stream_string(stream);
                } finally {
                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        close(stream, UNPROVIDED);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                    }
                }
                final SubLObject xml_string_with_confidence = query_library_utils.new_weighted_xml(xml_string, weight, v_2nd_weight, offset, end, justification);
                if (NIL != list_utilities.empty_list_p(sentence_free_variables(sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    dictionary_utilities.dictionary_push(results_dictionary, $FULLY_BOUND, xml_string_with_confidence);
                } else
                    if (NIL != list_utilities.alist_has_keyP($cae_categorized_query_folders$.getGlobalValue(), category, UNPROVIDED)) {
                        dictionary_utilities.dictionary_push(results_dictionary, category, xml_string_with_confidence);
                    } else {
                        dictionary_utilities.dictionary_push(results_dictionary, $SIMPLE, xml_string_with_confidence);
                    }

            }
            cdolist_list_var = cdolist_list_var.rest();
            fragment = cdolist_list_var.first();
        } 
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(results_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject category2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject queries = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((!category2.eql($FULLY_BOUND)) || (NIL != cae_task_with_yes_no_folder_enabledP(UNPROVIDED))) {
                new_queries_with_confidences = cons(listS($FOLDER, list_utilities.alist_lookup_without_values($cae_categorized_query_folders$.getGlobalValue(), category2, UNPROVIDED, UNPROVIDED), queries), new_queries_with_confidences);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return sort_cae_queries_by_folder(new_queries_with_confidences);
    }

    public static SubLObject sort_cae_queries_by_folder(final SubLObject queries_with_confidences) {
        return Sort.sort(queries_with_confidences, symbol_function($sym131$CAE_FOLDER_TITLE_PRECEDES_), symbol_function(SECOND));
    }

    public static SubLObject cae_folder_title_precedesP(final SubLObject title1, final SubLObject title2) {
        return cae_folder_category_precedesP(title1, title2, symbol_function(CDR));
    }

    public static SubLObject cae_folder_category_precedesP(final SubLObject cat1, final SubLObject cat2, final SubLObject key) {
        final SubLObject pos1 = position(cat1, $cae_categorized_query_folders$.getGlobalValue(), symbol_function(EQUAL), key, UNPROVIDED, UNPROVIDED);
        final SubLObject pos2 = position(cat2, $cae_categorized_query_folders$.getGlobalValue(), symbol_function(EQUAL), key, UNPROVIDED, UNPROVIDED);
        return makeBoolean(((NIL != pos1) && (NIL != pos2)) && pos1.numL(pos2));
    }

    public static SubLObject new_temporary_query_id(final SubLObject sentence) {
        return make_formula($$QueryTemplateFromSentenceAndIDFn, list(sentence, Guids.guid_to_string(Guids.new_guid())), UNPROVIDED);
    }

    public static SubLObject cae_task_with_yes_no_folder_enabledP(SubLObject task) {
        if (task == UNPROVIDED) {
            task = current_cae_task();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if ((NIL != task) && (NIL == result)) {
            SubLObject csome_list_var = kb_mapping.gather_nart_arg_index(task, THREE_INTEGER, $$SpecificationVariantFn);
            SubLObject spec_var_tou = NIL;
            spec_var_tou = csome_list_var.first();
            while ((NIL == result) && (NIL != csome_list_var)) {
                final SubLObject spec_var_nart = cycl_utilities.formula_arg1(spec_var_tou, UNPROVIDED);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    if ($$True.eql(kb_mapping_utilities.fpred_value(spec_var_nart, $$yesNoQueryFolderEnabled, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                        result = T;
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
                csome_list_var = csome_list_var.rest();
                spec_var_tou = csome_list_var.first();
            } 
        }
        return result;
    }

    public static SubLObject get_fragments_for_term(final SubLObject token, final SubLObject v_term, SubLObject mt, SubLObject variable_format, SubLObject offset, SubLObject end, SubLObject token_is_paraphraseP) {
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        if (variable_format == UNPROVIDED) {
            variable_format = $cae_default_variable_format$.getGlobalValue();
        }
        if (offset == UNPROVIDED) {
            offset = NIL;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (token_is_paraphraseP == UNPROVIDED) {
            token_is_paraphraseP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        ensure_query_search_tables_initialized_for_mt(mt);
        SubLObject term_queries = NIL;
        SubLObject suppressed_term_queries = NIL;
        final SubLObject v_genls = (NIL != fort_types_interface.collectionP(v_term)) ? genls.all_genls(v_term, mt, UNPROVIDED) : NIL;
        final SubLObject isas = isa.all_isa(v_term, mt, UNPROVIDED);
        SubLObject cdolist_list_var = v_genls;
        SubLObject genl = NIL;
        genl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            term_queries = cconcatenate(term_queries, get_superior_fragments_for_type(token, v_term, genl, $GENL, mt, variable_format, offset, end, token_is_paraphraseP));
            suppressed_term_queries = cconcatenate(suppressed_term_queries, get_superior_fragments_for_type(token, v_term, genl, $SUPPRESS_GENL, mt, variable_format, offset, end, token_is_paraphraseP));
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        } 
        cdolist_list_var = isas;
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            term_queries = cconcatenate(term_queries, get_superior_fragments_for_type(token, v_term, v_isa, $ISA, mt, variable_format, offset, end, token_is_paraphraseP));
            suppressed_term_queries = cconcatenate(suppressed_term_queries, get_superior_fragments_for_type(token, v_term, v_isa, $SUPPRESS_ISA, mt, variable_format, offset, end, token_is_paraphraseP));
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        } 
        if (NIL != $cure_use_inference_for_questions$.getDynamicValue(thread)) {
            thread.resetMultipleValues();
            final SubLObject questions = get_queries_via_inference(constraint_from_term_and_mt(v_term, mt), UNPROVIDED);
            final SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject q = NIL;
            SubLObject q_$24 = NIL;
            SubLObject j = NIL;
            SubLObject j_$25 = NIL;
            q = questions;
            q_$24 = q.first();
            j = justifications;
            j_$25 = j.first();
            while ((NIL != j) || (NIL != q)) {
                SubLObject current;
                final SubLObject datum = current = q_$24;
                SubLObject formula = NIL;
                SubLObject variable = NIL;
                SubLObject gloss_template = NIL;
                SubLObject category = NIL;
                SubLObject opaque = NIL;
                destructuring_bind_must_consp(current, datum, $list142);
                formula = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list142);
                variable = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list142);
                gloss_template = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list142);
                category = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list142);
                opaque = current.first();
                current = current.rest();
                if (NIL == current) {
                    term_queries = cons(fill_out_query_with_extra_info(v_term, token_is_paraphraseP, j_$25, variable_format, token, offset, end, formula, variable, gloss_template, category, opaque), term_queries);
                } else {
                    cdestructuring_bind_error(datum, $list142);
                }
                q = q.rest();
                q_$24 = q.first();
                j = j.rest();
                j_$25 = j.first();
            } 
        }
        term_queries = remove_duplicates(term_queries, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        suppressed_term_queries = remove_duplicates(suppressed_term_queries, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        term_queries = remove_if_instantiated_by_blocked_term(term_queries, mt);
        term_queries = remove_suppressed_queries(term_queries, suppressed_term_queries, mt);
        return term_queries;
    }

    public static SubLObject get_superior_fragments_for_type(final SubLObject token_string, final SubLObject token_term, final SubLObject v_super, final SubLObject isa_or_genl, final SubLObject mt, final SubLObject variable_format, final SubLObject offset, final SubLObject end, final SubLObject token_is_paraphraseP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject term_queries = NIL;
        final SubLObject optimize_var_namesP = eq(variable_format, $MNEMONIC);
        thread.resetMultipleValues();
        final SubLObject superior_queries = (isa_or_genl == $GENL) ? lookup_genl_queries(constraint_from_term_and_mt(v_super, mt), optimize_var_namesP) : isa_or_genl == $ISA ? lookup_isa_queries(constraint_from_term_and_mt(v_super, mt), optimize_var_namesP) : isa_or_genl == $SUPPRESS_GENL ? lookup_suppressed_genls_queries(constraint_from_term_and_mt(v_super, mt), optimize_var_namesP) : isa_or_genl == $SUPPRESS_ISA ? lookup_suppressed_isa_queries(constraint_from_term_and_mt(v_super, mt), optimize_var_namesP) : NIL;
        final SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject superior_query = NIL;
        SubLObject superior_query_$26 = NIL;
        SubLObject justification = NIL;
        SubLObject justification_$27 = NIL;
        superior_query = superior_queries;
        superior_query_$26 = superior_query.first();
        justification = justifications;
        justification_$27 = justification.first();
        while ((NIL != justification) || (NIL != superior_query)) {
            SubLObject current;
            final SubLObject datum = current = superior_query_$26;
            SubLObject formula = NIL;
            SubLObject variable = NIL;
            SubLObject gloss_template = NIL;
            SubLObject category = NIL;
            SubLObject opaque = NIL;
            destructuring_bind_must_consp(current, datum, $list142);
            formula = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list142);
            variable = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list142);
            gloss_template = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list142);
            category = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list142);
            opaque = current.first();
            current = current.rest();
            if (NIL == current) {
                term_queries = cons(fill_out_query_with_extra_info(token_term, token_is_paraphraseP, list($$and, justification_$27, list(isa_or_genl, token_term, v_super)), variable_format, token_string, offset, end, formula, variable, gloss_template, category, opaque), term_queries);
            } else {
                cdestructuring_bind_error(datum, $list142);
            }
            superior_query = superior_query.rest();
            superior_query_$26 = superior_query.first();
            justification = justification.rest();
            justification_$27 = justification.first();
        } 
        return term_queries;
    }

    public static SubLObject fill_out_query_with_extra_info(final SubLObject token_term, final SubLObject token_is_paraphraseP, final SubLObject justification, final SubLObject variable_format, final SubLObject token_string, final SubLObject offset, final SubLObject end, final SubLObject formula, final SubLObject variable, final SubLObject gloss_template, final SubLObject category, final SubLObject opaqueP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_formula = cycl_utilities.expression_subst(token_term, variable, formula, UNPROVIDED, UNPROVIDED);
        SubLObject new_gloss = NIL;
        if (NIL == $cae_query_search_skip_nl_generationP$.getDynamicValue(thread)) {
            final SubLObject new_gloss_template = (new_formula.equal(formula)) ? gloss_template : generate_query_search_gloss_template(new_formula, variable_format, $DECLARATIVE, UNPROVIDED, UNPROVIDED);
            new_gloss = fill_in_gloss_template(new_gloss_template, variable, token_string, new_formula, variable_format, $DECLARATIVE, offset, end, token_is_paraphraseP);
        }
        return new_cae_query_search_fragment(new_formula, new_gloss, category, justification, offset, end, opaqueP);
    }

    public static SubLObject lookup_isa_queries(final SubLObject constraint, SubLObject optimize_var_namesP) {
        if (optimize_var_namesP == UNPROVIDED) {
            optimize_var_namesP = T;
        }
        return lookup_queries_int(constraint, $list144, optimize_var_namesP);
    }

    public static SubLObject lookup_genl_queries(final SubLObject constraint, SubLObject optimize_var_namesP) {
        if (optimize_var_namesP == UNPROVIDED) {
            optimize_var_namesP = T;
        }
        return lookup_queries_int(constraint, $list145, optimize_var_namesP);
    }

    public static SubLObject lookup_suppressed_isa_queries(final SubLObject constraint, SubLObject optimize_var_namesP) {
        if (optimize_var_namesP == UNPROVIDED) {
            optimize_var_namesP = T;
        }
        return lookup_queries_int(constraint, $list146, optimize_var_namesP);
    }

    public static SubLObject lookup_suppressed_genls_queries(final SubLObject constraint, SubLObject optimize_var_namesP) {
        if (optimize_var_namesP == UNPROVIDED) {
            optimize_var_namesP = T;
        }
        return lookup_queries_int(constraint, $list147, optimize_var_namesP);
    }

    public static SubLObject lookup_queries_int(final SubLObject constraint, final SubLObject preds, SubLObject optimize_var_namesP) {
        if (optimize_var_namesP == UNPROVIDED) {
            optimize_var_namesP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject justifications = NIL;
        SubLObject type = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(constraint, constraint, $list148);
        type = constraint.first();
        final SubLObject current = mt = constraint.rest();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = preds;
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject pred_var = pred;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(type, ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(type, ONE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$28 = NIL;
                                final SubLObject token_var_$29 = NIL;
                                while (NIL == done_var_$28) {
                                    final SubLObject v_assert = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$29);
                                    final SubLObject valid_$30 = makeBoolean(!token_var_$29.eql(v_assert));
                                    if (NIL != valid_$30) {
                                        SubLObject cdolist_list_var_$31;
                                        final SubLObject queries = cdolist_list_var_$31 = get_templates_from_assertion(v_assert, mt, optimize_var_namesP);
                                        SubLObject query = NIL;
                                        query = cdolist_list_var_$31.first();
                                        while (NIL != cdolist_list_var_$31) {
                                            result = cons(query, result);
                                            justifications = cons(cycl_utilities.hl_to_el(assertions_high.assertion_ist_formula(v_assert)), justifications);
                                            cdolist_list_var_$31 = cdolist_list_var_$31.rest();
                                            query = cdolist_list_var_$31.first();
                                        } 
                                    }
                                    done_var_$28 = makeBoolean(NIL == valid_$30);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return values(result, justifications);
    }

    public static SubLObject get_queries_via_inference(final SubLObject constraint, SubLObject query_preds) {
        if (query_preds == UNPROVIDED) {
            query_preds = $list151;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject justifications = NIL;
        final SubLObject opaque_preds = $list152;
        SubLObject type = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(constraint, constraint, $list148);
        type = constraint.first();
        final SubLObject current = mt = constraint.rest();
        SubLObject cdolist_list_var = query_preds;
        SubLObject query_pred = NIL;
        query_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$33 = ask_utilities.query_variable($SENTENCE, listS(query_pred, type, $list154), mt, $cae_query_search_inference_parameters$.getDynamicValue(thread));
            SubLObject formula = NIL;
            formula = cdolist_list_var_$33.first();
            while (NIL != cdolist_list_var_$33) {
                final SubLObject gen_template = generate_template_for_genls_constraint(formula, $$TheQuerySearchFocalTerm, NIL, $cae_default_variable_format$.getGlobalValue());
                final SubLObject query_template = list(formula, $$TheQuerySearchFocalTerm, gen_template, $SIMPLE, NIL != subl_promotions.memberP(query_pred, opaque_preds, UNPROVIDED, UNPROVIDED) ? $OPAQUE : NIL);
                result = cons(query_template, result);
                justifications = cons(list($QUERY, listS(query_pred, type, $list154)), justifications);
                cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                formula = cdolist_list_var_$33.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            query_pred = cdolist_list_var.first();
        } 
        return values(result, justifications);
    }

    public static SubLObject get_templates_from_assertion(final SubLObject v_assert, SubLObject mt, SubLObject optimize_var_namesP) {
        if (optimize_var_namesP == UNPROVIDED) {
            optimize_var_namesP = T;
        }
        if (NIL == assertion_uses_non_extensional_setP(v_assert)) {
            mt = assertions_high.assertion_mt(v_assert);
        }
        return get_cached_templates_from_assertion(v_assert, mt, optimize_var_namesP);
    }

    public static SubLObject clear_get_cached_templates_from_assertion() {
        final SubLObject cs = $get_cached_templates_from_assertion_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_cached_templates_from_assertion(final SubLObject v_assert, final SubLObject mt, SubLObject optimize_var_namesP) {
        if (optimize_var_namesP == UNPROVIDED) {
            optimize_var_namesP = T;
        }
        return memoization_state.caching_state_remove_function_results_with_args($get_cached_templates_from_assertion_caching_state$.getGlobalValue(), list(v_assert, mt, optimize_var_namesP), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_cached_templates_from_assertion_internal(final SubLObject v_assert, final SubLObject mt, final SubLObject optimize_var_namesP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject templates = NIL;
        final SubLObject opaque = full_sentence_opaque_query_predP(cycl_utilities.formula_arg0(v_assert));
        thread.resetMultipleValues();
        final SubLObject formulas = get_query_formulas_from_assertion(v_assert, mt, optimize_var_namesP);
        final SubLObject categories = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject formula = NIL;
        SubLObject formula_$34 = NIL;
        SubLObject category = NIL;
        SubLObject category_$35 = NIL;
        formula = formulas;
        formula_$34 = formula.first();
        category = categories;
        category_$35 = category.first();
        while ((NIL != category) || (NIL != formula)) {
            final SubLObject gen_template = generate_template_for_isa_constraint(formula_$34, $$TheQuerySearchFocalTerm, NIL, $cae_default_variable_format$.getGlobalValue());
            final SubLObject query_template = list(formula_$34, $$TheQuerySearchFocalTerm, gen_template, category_$35, NIL != opaque ? $OPAQUE : NIL);
            templates = cons(query_template, templates);
            formula = formula.rest();
            formula_$34 = formula.first();
            category = category.rest();
            category_$35 = category.first();
        } 
        return templates;
    }

    public static SubLObject get_cached_templates_from_assertion(final SubLObject v_assert, final SubLObject mt, SubLObject optimize_var_namesP) {
        if (optimize_var_namesP == UNPROVIDED) {
            optimize_var_namesP = T;
        }
        SubLObject caching_state = $get_cached_templates_from_assertion_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_CACHED_TEMPLATES_FROM_ASSERTION, $get_cached_templates_from_assertion_caching_state$, $int$5000, EQUAL, THREE_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_assert, mt, optimize_var_namesP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_assert.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && optimize_var_namesP.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_cached_templates_from_assertion_internal(v_assert, mt, optimize_var_namesP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_assert, mt, optimize_var_namesP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject get_query_formulas_from_assertion(final SubLObject v_assert, SubLObject mt, SubLObject optimize_var_namesP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (optimize_var_namesP == UNPROVIDED) {
            optimize_var_namesP = T;
        }
        final SubLObject assert_pred = cycl_utilities.formula_arg0(v_assert);
        if (NIL != full_sentence_query_predP(assert_pred)) {
            if (NIL != optimize_var_namesP) {
                return values(list(optimize_el_formula_variable_names(cycl_utilities.formula_arg2(v_assert, UNPROVIDED), query_library_utils.cae_default_paraphrase_mt(current_cae_task()), mt, UNPROVIDED)), list($SIMPLE));
            }
            return values(list(cycl_utilities.formula_arg2(v_assert, UNPROVIDED)), list($SIMPLE));
        } else {
            if (NIL != set_based_query_predP(assert_pred)) {
                return get_query_sentences_for_set_based_assertion(v_assert, mt, optimize_var_namesP);
            }
            Errors.warn($str159$unable_to_determine_queries_from_, v_assert);
            return values(NIL, NIL);
        }
    }

    public static SubLObject get_query_sentences_for_set_based_assertion(final SubLObject v_assert, SubLObject mt, SubLObject optimize_var_namesP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (optimize_var_namesP == UNPROVIDED) {
            optimize_var_namesP = T;
        }
        final SubLObject v_set = cycl_utilities.formula_arg2(v_assert, UNPROVIDED);
        if (NIL == mt) {
            mt = assertions_high.assertion_mt(v_assert);
        }
        final SubLObject evoked_terms = el_set_elts(v_set, mt);
        SubLObject query_sentences = NIL;
        SubLObject categories = NIL;
        SubLObject cdolist_list_var = evoked_terms;
        SubLObject evoked_term = NIL;
        evoked_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject formula = make_formula_for_rule_rhs_cached(evoked_term, optimize_var_namesP, mt);
            final SubLObject supplementalP = supplemental_formula_predP(cycl_utilities.formula_arg0(v_assert));
            final SubLObject category = category_for_term(evoked_term, mt, supplementalP);
            final SubLObject unboundP = sentence_has_no_bound_argsP(formula);
            SubLObject bound_version_addedP = NIL;
            if (NIL != formula) {
                SubLObject cdolist_list_var_$36 = remove_if($sym160$TRIGGER_ONLY_TERM_, remove(evoked_term, evoked_terms, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject other_term = NIL;
                other_term = cdolist_list_var_$36.first();
                while (NIL != cdolist_list_var_$36) {
                    SubLObject cdolist_list_var_$37 = try_substitution_simple(other_term, formula, mt, UNPROVIDED);
                    SubLObject substituted = NIL;
                    substituted = cdolist_list_var_$37.first();
                    while (NIL != cdolist_list_var_$37) {
                        bound_version_addedP = T;
                        query_sentences = cons(substituted, query_sentences);
                        categories = cons(category, categories);
                        cdolist_list_var_$37 = cdolist_list_var_$37.rest();
                        substituted = cdolist_list_var_$37.first();
                    } 
                    cdolist_list_var_$36 = cdolist_list_var_$36.rest();
                    other_term = cdolist_list_var_$36.first();
                } 
                query_sentences = cons(formula, query_sentences);
                categories = cons((NIL != unboundP) && (NIL != bound_version_addedP) ? $UNBOUND : category, categories);
            }
            cdolist_list_var = cdolist_list_var.rest();
            evoked_term = cdolist_list_var.first();
        } 
        return values(query_sentences, categories);
    }

    public static SubLObject assertion_uses_non_extensional_setP(final SubLObject v_assert) {
        return makeBoolean((NIL != set_based_query_predP(cycl_utilities.formula_arg0(v_assert))) && (NIL != el_extensional_set_p(cycl_utilities.formula_arg2(v_assert, UNPROVIDED))));
    }

    public static SubLObject sentence_has_no_bound_argsP(final SubLObject formula) {
        return sublisp_null(list_utilities.find_if_not($sym85$EL_VAR_, cycl_utilities.formula_args(formula, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject full_sentence_opaque_query_predP(final SubLObject pred) {
        return subl_promotions.memberP(pred, $list152, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject full_sentence_query_predP(final SubLObject pred) {
        return subl_promotions.memberP(pred, $list161, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject set_based_query_predP(final SubLObject pred) {
        return subl_promotions.memberP(pred, $list162, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject supplemental_formula_predP(final SubLObject pred) {
        return subl_promotions.memberP(pred, $list163, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject el_set_elts(final SubLObject v_set, final SubLObject mt) {
        if (NIL != el_extensional_set_p(v_set)) {
            return cycl_utilities.formula_args(v_set, UNPROVIDED);
        }
        return ask_utilities.query_variable($sym82$_ELEM, list($$elementOf, $sym82$_ELEM, v_set), mt, UNPROVIDED);
    }

    public static SubLObject symmetric_binary_literalP(final SubLObject literal, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        return makeBoolean((literal.isList() && (NIL != list_utilities.lengthE(literal, THREE_INTEGER, UNPROVIDED))) && (NIL != isa.isaP(literal.first(), $$SymmetricBinaryPredicate, mt, UNPROVIDED)));
    }

    public static SubLObject clear_fragment_formulas_equalP() {
        final SubLObject cs = $fragment_formulas_equalP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_fragment_formulas_equalP(final SubLObject frag1, final SubLObject frag2) {
        return memoization_state.caching_state_remove_function_results_with_args($fragment_formulas_equalP_caching_state$.getGlobalValue(), list(frag1, frag2), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fragment_formulas_equalP_internal(final SubLObject frag1, final SubLObject frag2) {
        if (!cycl_utilities.formula_arg0(cae_query_search_fragment_formula(frag1)).equal(cycl_utilities.formula_arg0(cae_query_search_fragment_formula(frag2)))) {
            return NIL;
        }
        if (frag1.equalp(frag2)) {
            return T;
        }
        return czer_utilities.equals_el_memoizedP(cae_query_search_fragment_formula(frag1), cae_query_search_fragment_formula(frag2), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fragment_formulas_equalP(final SubLObject frag1, final SubLObject frag2) {
        SubLObject caching_state = $fragment_formulas_equalP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym165$FRAGMENT_FORMULAS_EQUAL_, $sym166$_FRAGMENT_FORMULAS_EQUAL__CACHING_STATE_, $int$1000, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(frag1, frag2);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (frag1.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && frag2.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(fragment_formulas_equalP_internal(frag1, frag2)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(frag1, frag2));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject equal_fragments(final SubLObject frag1, final SubLObject frag2) {
        return makeBoolean(cae_query_search_fragment_category(frag1).eql(cae_query_search_fragment_category(frag2)) && (NIL != fragment_formulas_equalP(frag1, frag2)));
    }

    public static SubLObject fragmentL(final SubLObject frag1, final SubLObject frag2) {
        final SubLObject diff = subtract(length(sentence_free_variables(frag1.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED)), length(sentence_free_variables(frag2.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        if (diff.numE(ZERO_INTEGER)) {
            return kb_utilities.term_L(string_from_gloss_template(second(frag1)), string_from_gloss_template(second(frag2)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return numL(diff, ZERO_INTEGER);
    }

    public static SubLObject fragment_includes_all_tokensP(final SubLObject query, final SubLObject token_list) {
        SubLObject formula = NIL;
        SubLObject gloss = NIL;
        SubLObject category = NIL;
        destructuring_bind_must_consp(query, query, $list168);
        formula = query.first();
        SubLObject current = query.rest();
        destructuring_bind_must_consp(current, query, $list168);
        gloss = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, query, $list168);
        category = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject includes_all_tokensP = T;
            SubLObject cdolist_list_var = token_list;
            SubLObject token_term_list = NIL;
            token_term_list = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject includes_some_termP = NIL;
                SubLObject cdolist_list_var_$38;
                final SubLObject term_list = cdolist_list_var_$38 = token_term_list.rest();
                SubLObject v_term = NIL;
                v_term = cdolist_list_var_$38.first();
                while (NIL != cdolist_list_var_$38) {
                    if (NIL != list_utilities.tree_find(v_term, formula, UNPROVIDED, UNPROVIDED)) {
                        includes_some_termP = T;
                    }
                    cdolist_list_var_$38 = cdolist_list_var_$38.rest();
                    v_term = cdolist_list_var_$38.first();
                } 
                if (NIL == includes_some_termP) {
                    includes_all_tokensP = NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                token_term_list = cdolist_list_var.first();
            } 
            return includes_all_tokensP;
        }
        cdestructuring_bind_error(query, $list168);
        return NIL;
    }

    public static SubLObject remove_unless_fragment_includes_all_tokens(final SubLObject queries, final SubLObject token_list) {
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = queries;
        SubLObject query = NIL;
        query = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != fragment_includes_all_tokensP(query, token_list)) {
                ans = cons(query, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query = cdolist_list_var.first();
        } 
        return reverse(ans);
    }

    public static SubLObject fragment_instantiated_by_blocked_termP(final SubLObject fragment, final SubLObject mt) {
        final SubLObject formula = cae_query_search_fragment_formula(fragment);
        if ((((NIL != list_utilities.lengthE(formula, THREE_INTEGER, UNPROVIDED)) && formula.first().equal($$isa)) && (NIL != term.el_fort_p(third(formula)))) && (NIL != isa.quoted_isaP(third(formula), $const169$TermAcceptableForQuerySearch_Inst, mt, UNPROVIDED))) {
            return third(formula);
        }
        if (((NIL != list_utilities.lengthG(formula, ZERO_INTEGER, UNPROVIDED)) && (NIL != term.el_fort_p(formula.first()))) && (NIL != isa.quoted_isaP(formula.first(), $const169$TermAcceptableForQuerySearch_Inst, mt, UNPROVIDED))) {
            return formula.first();
        }
        return NIL;
    }

    public static SubLObject new_cae_query_search_fragment(final SubLObject formula, final SubLObject gloss, final SubLObject category, final SubLObject justification, SubLObject offset, SubLObject end, SubLObject opaque) {
        if (offset == UNPROVIDED) {
            offset = NIL;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (opaque == UNPROVIDED) {
            opaque = NIL;
        }
        return NIL != opaque ? list(formula, gloss, category, justification, offset, end, opaque) : NIL != offset ? list(formula, gloss, category, justification, offset, end) : list(formula, gloss, category, justification);
    }

    public static SubLObject cae_query_search_fragment_formula(final SubLObject fragment) {
        return fragment.first();
    }

    public static SubLObject set_cae_query_search_fragment_formula(final SubLObject fragment, final SubLObject v_new) {
        return list_utilities.nreplace_nth(ZERO_INTEGER, v_new, fragment);
    }

    public static SubLObject cae_query_search_fragment_gloss(final SubLObject fragment) {
        return second(fragment);
    }

    public static SubLObject set_cae_query_search_fragment_gloss(final SubLObject fragment, final SubLObject v_new) {
        return list_utilities.nreplace_nth(ONE_INTEGER, v_new, fragment);
    }

    public static SubLObject cae_query_search_fragment_category(final SubLObject fragment) {
        return third(fragment);
    }

    public static SubLObject set_cae_query_search_fragment_category(final SubLObject fragment, final SubLObject v_new) {
        return list_utilities.nreplace_nth(TWO_INTEGER, v_new, fragment);
    }

    public static SubLObject cae_query_search_fragment_justification(final SubLObject fragment) {
        return fourth(fragment);
    }

    public static SubLObject set_cae_query_search_fragment_justification(final SubLObject fragment, final SubLObject v_new) {
        return list_utilities.nreplace_nth(THREE_INTEGER, v_new, fragment);
    }

    public static SubLObject cae_query_search_fragment_offset(final SubLObject fragment) {
        return fifth(fragment);
    }

    public static SubLObject set_cae_query_search_fragment_offset(final SubLObject fragment, final SubLObject v_new) {
        assert NIL != subl_promotions.non_negative_integer_p(v_new) : "subl_promotions.non_negative_integer_p(v_new) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(v_new) " + v_new;
        while (NIL != list_utilities.lengthL(fragment, SIX_INTEGER, UNPROVIDED)) {
            list_utilities.nadd_to_end(NIL, fragment);
        } 
        return list_utilities.nreplace_nth(FOUR_INTEGER, v_new, fragment);
    }

    public static SubLObject cae_query_search_fragment_end(final SubLObject fragment) {
        return sixth(fragment);
    }

    public static SubLObject set_cae_query_search_fragment_end(final SubLObject fragment, final SubLObject v_new) {
        assert NIL != subl_promotions.non_negative_integer_p(v_new) : "subl_promotions.non_negative_integer_p(v_new) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(v_new) " + v_new;
        return list_utilities.nreplace_nth(FIVE_INTEGER, v_new, fragment);
    }

    public static SubLObject cae_query_search_fragment_opaque(final SubLObject fragment) {
        return seventh(fragment);
    }

    public static SubLObject set_cae_query_search_fragment_opaque(final SubLObject fragment, final SubLObject v_new) {
        return list_utilities.nreplace_nth(SIX_INTEGER, v_new, fragment);
    }

    public static SubLObject remove_if_instantiated_by_blocked_term(final SubLObject queries, final SubLObject mt) {
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = queries;
        SubLObject query = NIL;
        query = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == fragment_instantiated_by_blocked_termP(query, mt)) {
                ans = cons(query, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query = cdolist_list_var.first();
        } 
        return reverse(ans);
    }

    public static SubLObject remove_suppressed_queries(final SubLObject queries, final SubLObject suppressed_queries, final SubLObject mt) {
        SubLObject allowed_queries = NIL;
        SubLObject cdolist_list_var = queries;
        SubLObject query = NIL;
        query = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject query_cycl = cae_query_search_fragment_formula(query);
            if (NIL == member(query_cycl, suppressed_queries, EQUAL, CAE_QUERY_SEARCH_FRAGMENT_FORMULA)) {
                allowed_queries = cons(query, allowed_queries);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query = cdolist_list_var.first();
        } 
        return nreverse(allowed_queries);
    }

    public static SubLObject get_fragments_for_terms(final SubLObject token_list, SubLObject must_include_all_tokensP, SubLObject mt, SubLObject variable_format, SubLObject tight_constraint_matchingP, SubLObject output_pattern) {
        if (must_include_all_tokensP == UNPROVIDED) {
            must_include_all_tokensP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        if (variable_format == UNPROVIDED) {
            variable_format = $cae_default_variable_format$.getGlobalValue();
        }
        if (tight_constraint_matchingP == UNPROVIDED) {
            tight_constraint_matchingP = T;
        }
        if (output_pattern == UNPROVIDED) {
            output_pattern = $ANYTHING;
        }
        return get_fragments_for_token_records(create_token_records(token_list), must_include_all_tokensP, mt, variable_format, tight_constraint_matchingP, output_pattern);
    }

    public static SubLObject get_fragments_for_token_records(final SubLObject token_list, SubLObject must_include_all_tokensP, SubLObject mt, SubLObject variable_format, SubLObject tight_constraint_matchingP, SubLObject output_pattern) {
        if (must_include_all_tokensP == UNPROVIDED) {
            must_include_all_tokensP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        if (variable_format == UNPROVIDED) {
            variable_format = $cae_default_variable_format$.getGlobalValue();
        }
        if (tight_constraint_matchingP == UNPROVIDED) {
            tight_constraint_matchingP = T;
        }
        if (output_pattern == UNPROVIDED) {
            output_pattern = $ANYTHING;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != hlmt.possibly_hlmt_p(mt) : "hlmt.possibly_hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.possibly_hlmt_p(mt) " + mt;
        assert NIL != keywordp(variable_format) : "Types.keywordp(variable_format) " + "CommonSymbols.NIL != Types.keywordp(variable_format) " + variable_format;
        SubLObject unbound_fragments = NIL;
        SubLObject fragments = NIL;
        final SubLObject _prev_bind_0 = $cae_query_search_default_mt$.currentBinding(thread);
        try {
            $cae_query_search_default_mt$.bind(mt, thread);
            final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$39 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
            final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
            try {
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                final SubLObject _prev_bind_0_$40 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_1_$41 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2_$42 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    SubLObject new_tokens = NIL;
                    SubLObject cdolist_list_var = token_list;
                    SubLObject token_record = NIL;
                    token_record = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject token = token_record_string(token_record);
                        final SubLObject terms = token_record_denotations(token_record);
                        final SubLObject offset = token_record_offset(token_record);
                        final SubLObject end = token_record_end(token_record);
                        final SubLObject term_list = possibly_augment_query_search_terms(terms, mt);
                        final SubLObject term_paraphrases = (NIL != $cae_query_search_skip_nl_generationP$.getDynamicValue(thread)) ? generate_bogus_disambiguation_phrases(term_list) : pph_main.generate_disambiguation_phrases(term_list, $NONE, $DEFAULT, pph_vars.$pph_language_mt$.getDynamicValue(thread), mt, $TEXT, UNPROVIDED);
                        SubLObject term_fragments = NIL;
                        SubLObject cdolist_list_var_$43 = term_paraphrases;
                        SubLObject term_paraphrase = NIL;
                        term_paraphrase = cdolist_list_var_$43.first();
                        while (NIL != cdolist_list_var_$43) {
                            SubLObject current;
                            final SubLObject datum = current = term_paraphrase;
                            SubLObject v_term = NIL;
                            SubLObject paraphrase = NIL;
                            destructuring_bind_must_consp(current, datum, $list174);
                            v_term = current.first();
                            current = paraphrase = current.rest();
                            if (NIL == member(v_term, terms, symbol_function(EQUAL), UNPROVIDED)) {
                                final SubLObject item_var = new_token_record(paraphrase, list(v_term), ZERO_INTEGER, NIL);
                                if (NIL == member(item_var, new_tokens, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    new_tokens = cons(item_var, new_tokens);
                                }
                            }
                            SubLObject cdolist_list_var_$44;
                            term_fragments = cdolist_list_var_$44 = get_fragments_for_term(paraphrase, czer_main.canonicalize_term(v_term, UNPROVIDED), mt, variable_format, offset, end, T);
                            SubLObject fragment = NIL;
                            fragment = cdolist_list_var_$44.first();
                            while (NIL != cdolist_list_var_$44) {
                                SubLObject item_var2 = fragment;
                                if (NIL == member(item_var2, fragments, EQUAL_FRAGMENTS, symbol_function(IDENTITY))) {
                                    fragments = cons(item_var2, fragments);
                                }
                                item_var2 = fragment;
                                if (NIL == member(item_var2, unbound_fragments, EQUAL_FRAGMENTS, symbol_function(IDENTITY))) {
                                    unbound_fragments = cons(item_var2, unbound_fragments);
                                }
                                cdolist_list_var_$44 = cdolist_list_var_$44.rest();
                                fragment = cdolist_list_var_$44.first();
                            } 
                            cdolist_list_var_$43 = cdolist_list_var_$43.rest();
                            term_paraphrase = cdolist_list_var_$43.first();
                        } 
                        cdolist_list_var = cdolist_list_var.rest();
                        token_record = cdolist_list_var.first();
                    } 
                    final SubLObject augmented_token_list = append(token_list, new_tokens);
                    fragments = try_substitutions(augmented_token_list, fragments, cae_default_wff_checking_mt(UNPROVIDED), variable_format, tight_constraint_matchingP, NIL, output_pattern);
                    fragments = remove_excess_query_fragments(fragments);
                    fragments = Mapping.mapcar(symbol_function(FILL_IN_DEFAULT_VALUES_FOR_QUERY), fragments);
                    fragments = list_utilities.remove_if_not(symbol_function($sym177$QUERY_HAS_ALL_REQUIRED_ARGS_BOUND_), fragments, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    fragments = Mapping.mapcar(symbol_function(TRY_SUGGESTIONS_FOR_QUERY), fragments);
                    SubLObject cdolist_list_var2 = unbound_fragments;
                    SubLObject unbound = NIL;
                    unbound = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        set_cae_query_search_fragment_category(unbound, $UNBOUND);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        unbound = cdolist_list_var2.first();
                    } 
                    unbound_fragments = list_utilities.remove_if_not(symbol_function($sym177$QUERY_HAS_ALL_REQUIRED_ARGS_BOUND_), unbound_fragments, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    fragments = add_unbound_fragments(fragments, unbound_fragments, must_include_all_tokensP, token_list);
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$42, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$41, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$40, thread);
                }
                SubLObject refined_fragments = NIL;
                SubLObject cdolist_list_var3 = fragments;
                SubLObject query = NIL;
                query = cdolist_list_var3.first();
                while (NIL != cdolist_list_var3) {
                    refined_fragments = cons(refine_fragment(query, mt), refined_fragments);
                    cdolist_list_var3 = cdolist_list_var3.rest();
                    query = cdolist_list_var3.first();
                } 
                fragments = nreverse(refined_fragments);
            } finally {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$39, thread);
            }
        } finally {
            $cae_query_search_default_mt$.rebind(_prev_bind_0, thread);
        }
        return fragments;
    }

    public static SubLObject generate_bogus_disambiguation_phrases(final SubLObject term_list) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = term_list;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(bq_cons(v_term, $str179$), result);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject create_token_records(final SubLObject token_term_list_pairs) {
        SubLObject token_records = NIL;
        SubLObject cdolist_list_var = token_term_list_pairs;
        SubLObject token_term_list_pair = NIL;
        token_term_list_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = token_term_list_pair;
            SubLObject token = NIL;
            SubLObject term_list = NIL;
            destructuring_bind_must_consp(current, datum, $list180);
            token = current.first();
            current = term_list = current.rest();
            token_records = cons(new_token_record(token, term_list, ZERO_INTEGER, NIL), token_records);
            cdolist_list_var = cdolist_list_var.rest();
            token_term_list_pair = cdolist_list_var.first();
        } 
        return nreverse(token_records);
    }

    public static SubLObject remove_excess_query_fragments(final SubLObject queries) {
        return Sort.sort(list_utilities.delete_subsumed_items(list_utilities.delete_subsumed_items(remove_duplicates(queries, EQUAL_FRAGMENTS, UNPROVIDED, UNPROVIDED, UNPROVIDED), $sym181$QUERY_FRAGMENT_PARTIALLY_INSTANTIATES_AND_SHARES_CATEGORY_, UNPROVIDED), $sym182$QUERY_FRAGMENT_SUBSUMES_, UNPROVIDED), $sym183$FRAGMENT_, UNPROVIDED);
    }

    public static SubLObject query_fragment_partially_instantiates_and_shares_categoryP(final SubLObject frag1, final SubLObject frag2) {
        return makeBoolean(((cae_query_search_fragment_category(frag1).eql(cae_query_search_fragment_category(frag2)) && cycl_utilities.formula_operator(cae_query_search_fragment_formula(frag1)).eql(cycl_utilities.formula_operator(cae_query_search_fragment_formula(frag2)))) && (NIL == list_utilities.find_if_not($sym85$EL_VAR_, cycl_utilities.formula_args(cae_query_search_fragment_formula(frag2), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != list_utilities.find_if_not($sym85$EL_VAR_, cycl_utilities.formula_args(cae_query_search_fragment_formula(frag1), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject add_unbound_fragments(SubLObject fragments, final SubLObject unbound_fragments, final SubLObject must_include_all_tokensP, final SubLObject token_list) {
        SubLObject cdolist_list_var = unbound_fragments;
        SubLObject unbound_query = NIL;
        unbound_query = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == find(unbound_query, fragments, symbol_function($sym165$FRAGMENT_FORMULAS_EQUAL_), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                fragments = list_utilities.add_to_end(unbound_query, fragments);
            }
            cdolist_list_var = cdolist_list_var.rest();
            unbound_query = cdolist_list_var.first();
        } 
        if (NIL != must_include_all_tokensP) {
            fragments = remove_unless_fragment_includes_all_tokens(fragments, token_list);
        }
        fragments = remove_excess_query_fragments(fragments);
        return fragments;
    }

    public static SubLObject query_fragment_subsumesP(final SubLObject frag1, final SubLObject frag2) {
        return makeBoolean((NIL != fragment_formulas_equalP(frag1, frag2)) && (NIL != cae_folder_category_precedesP(cae_query_search_fragment_category(frag1), cae_query_search_fragment_category(frag2), symbol_function(CAR))));
    }

    public static SubLObject possibly_augment_query_search_terms(final SubLObject terms, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        SubLObject augmented = copy_list(terms);
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != fort_types_interface.isa_collectionP(v_term, mt)) {
                SubLObject cdolist_list_var_$45 = genls.all_genls(v_term, mt, UNPROVIDED);
                SubLObject genl = NIL;
                genl = cdolist_list_var_$45.first();
                while (NIL != cdolist_list_var_$45) {
                    SubLObject cdolist_list_var_$46 = add_elements_for_genls(genl, mt);
                    SubLObject supplemental_set = NIL;
                    supplemental_set = cdolist_list_var_$46.first();
                    while (NIL != cdolist_list_var_$46) {
                        SubLObject cdolist_list_var_$47 = ask_utilities.query_variable($sym194$_MORE, list($$elementOf, $sym194$_MORE, supplemental_set), mt, UNPROVIDED);
                        SubLObject supplemental_term = NIL;
                        supplemental_term = cdolist_list_var_$47.first();
                        while (NIL != cdolist_list_var_$47) {
                            final SubLObject item_var = supplemental_term;
                            if (NIL == member(item_var, augmented, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                augmented = cons(item_var, augmented);
                            }
                            cdolist_list_var_$47 = cdolist_list_var_$47.rest();
                            supplemental_term = cdolist_list_var_$47.first();
                        } 
                        cdolist_list_var_$46 = cdolist_list_var_$46.rest();
                        supplemental_set = cdolist_list_var_$46.first();
                    } 
                    cdolist_list_var_$45 = cdolist_list_var_$45.rest();
                    genl = cdolist_list_var_$45.first();
                } 
            }
            SubLObject cdolist_list_var_$48 = isa.all_isa(v_term, mt, UNPROVIDED);
            SubLObject v_isa = NIL;
            v_isa = cdolist_list_var_$48.first();
            while (NIL != cdolist_list_var_$48) {
                SubLObject cdolist_list_var_$49 = add_elements_for_isa(v_isa, mt);
                SubLObject supplemental_set = NIL;
                supplemental_set = cdolist_list_var_$49.first();
                while (NIL != cdolist_list_var_$49) {
                    SubLObject cdolist_list_var_$50 = ask_utilities.query_variable($sym194$_MORE, list($$elementOf, $sym194$_MORE, supplemental_set), mt, UNPROVIDED);
                    SubLObject supplemental_term = NIL;
                    supplemental_term = cdolist_list_var_$50.first();
                    while (NIL != cdolist_list_var_$50) {
                        final SubLObject item_var = supplemental_term;
                        if (NIL == member(item_var, augmented, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            augmented = cons(item_var, augmented);
                        }
                        cdolist_list_var_$50 = cdolist_list_var_$50.rest();
                        supplemental_term = cdolist_list_var_$50.first();
                    } 
                    cdolist_list_var_$49 = cdolist_list_var_$49.rest();
                    supplemental_set = cdolist_list_var_$49.first();
                } 
                cdolist_list_var_$48 = cdolist_list_var_$48.rest();
                v_isa = cdolist_list_var_$48.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return augmented;
    }

    public static SubLObject clear_add_elements_for_genls() {
        final SubLObject cs = $add_elements_for_genls_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_add_elements_for_genls(final SubLObject v_term, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($add_elements_for_genls_caching_state$.getGlobalValue(), list(v_term, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject add_elements_for_genls_internal(final SubLObject v_term, final SubLObject mt) {
        return backward.removal_ask_variable($sym196$_SET, listS($$addElementsToValidTermSet_Genls, v_term, $list198), mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject add_elements_for_genls(final SubLObject v_term, final SubLObject mt) {
        SubLObject caching_state = $add_elements_for_genls_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(ADD_ELEMENTS_FOR_GENLS, $add_elements_for_genls_caching_state$, $int$1024, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_ADD_ELEMENTS_FOR_GENLS);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(add_elements_for_genls_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_add_elements_for_isa() {
        final SubLObject cs = $add_elements_for_isa_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_add_elements_for_isa(final SubLObject v_term, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($add_elements_for_isa_caching_state$.getGlobalValue(), list(v_term, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject add_elements_for_isa_internal(final SubLObject v_term, final SubLObject mt) {
        return backward.removal_ask_variable($sym196$_SET, listS($$addElementsToValidTermSet_Isa, v_term, $list198), mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject add_elements_for_isa(final SubLObject v_term, final SubLObject mt) {
        SubLObject caching_state = $add_elements_for_isa_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(ADD_ELEMENTS_FOR_ISA, $add_elements_for_isa_caching_state$, $int$1024, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_ADD_ELEMENTS_FOR_ISA);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(add_elements_for_isa_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject sanity_check_gloss(final SubLObject gloss, SubLObject var, SubLObject formula) {
        if (var == UNPROVIDED) {
            var = NIL;
        }
        if (formula == UNPROVIDED) {
            formula = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $sanity_check_glossesP$.getDynamicValue(thread)) {
            SubLObject string = NIL;
            SubLObject position_map = NIL;
            destructuring_bind_must_consp(gloss, gloss, $list206);
            string = gloss.first();
            final SubLObject current = gloss.rest();
            SubLObject cdolist_list_var;
            position_map = cdolist_list_var = current;
            SubLObject cons = NIL;
            cons = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current_$52;
                final SubLObject datum_$51 = current_$52 = cons;
                SubLObject key = NIL;
                SubLObject positions = NIL;
                destructuring_bind_must_consp(current_$52, datum_$51, $list207);
                key = current_$52.first();
                current_$52 = current_$52.rest();
                SubLObject cdolist_list_var_$53;
                positions = cdolist_list_var_$53 = current_$52;
                SubLObject position = NIL;
                position = cdolist_list_var_$53.first();
                while (NIL != cdolist_list_var_$53) {
                    SubLObject current_$53;
                    final SubLObject datum_$52 = current_$53 = position;
                    SubLObject start = NIL;
                    SubLObject length = NIL;
                    destructuring_bind_must_consp(current_$53, datum_$52, $list208);
                    start = current_$53.first();
                    current_$53 = length = current_$53.rest();
                    if (NIL == list_utilities.lengthGE(string, add(start, length), UNPROVIDED)) {
                        Errors.sublisp_break($str209$_S_is_off_the_end_of__S, new SubLObject[]{ position, string });
                    }
                    cdolist_list_var_$53 = cdolist_list_var_$53.rest();
                    position = cdolist_list_var_$53.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            } 
            if ((NIL != var) && (NIL == list_utilities.alist_has_keyP(position_map, var, UNPROVIDED))) {
                Errors.sublisp_break($str210$_S_is_not_on__S, new SubLObject[]{ var, position_map });
            }
            if (NIL != formula) {
                cdolist_list_var = obsolete.formula_variables(formula, UNPROVIDED, UNPROVIDED);
                SubLObject formula_var = NIL;
                formula_var = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL == list_utilities.alist_has_keyP(position_map, formula_var, UNPROVIDED)) {
                        Errors.sublisp_break($str210$_S_is_not_on__S, new SubLObject[]{ formula_var, position_map });
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    formula_var = cdolist_list_var.first();
                } 
            }
        }
        return T;
    }

    public static SubLObject get_fragments_for_string(final SubLObject string, SubLObject must_include_all_tokensP, SubLObject mt, SubLObject variable_format, SubLObject output_pattern, SubLObject task) {
        if (must_include_all_tokensP == UNPROVIDED) {
            must_include_all_tokensP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        if (variable_format == UNPROVIDED) {
            variable_format = $cae_default_variable_format$.getGlobalValue();
        }
        if (output_pattern == UNPROVIDED) {
            output_pattern = $ANYTHING;
        }
        if (task == UNPROVIDED) {
            task = current_cae_task();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_terms = NIL;
        SubLObject terms = NIL;
        SubLObject standard_fragments = NIL;
        SubLObject scalar_comparison_fragments = NIL;
        SubLObject temporal_fragments = NIL;
        SubLObject semtrans_fragments = NIL;
        SubLObject full_sentence_fragments = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject _prev_bind_0_$56 = $current_cae_task$.currentBinding(thread);
                try {
                    $current_cae_task$.bind(task, thread);
                    all_terms = terms_from_cae_query(string, UNPROVIDED);
                    terms = filter_terms_from_cae_query(all_terms, mt);
                    standard_fragments = get_fragments_for_token_records(terms, must_include_all_tokensP, mt, variable_format, T, output_pattern);
                    scalar_comparison_fragments = get_scalar_comparison_fragments_for_string(string, all_terms, variable_format);
                    temporal_fragments = get_temporal_fragments_for_string(string, standard_fragments);
                    semtrans_fragments = (NIL != $cae_include_semtrans_fragmentsP$.getDynamicValue(thread)) ? get_semtrans_fragments_for_string(string, terms, mt, variable_format, standard_fragments) : NIL;
                    full_sentence_fragments = (NIL != $allow_full_sentence_query_interps$.getDynamicValue(thread)) ? get_fragments_from_full_sentence_interp(string, $$BiologyTemplateMt, variable_format) : NIL;
                } finally {
                    $current_cae_task$.rebind(_prev_bind_0_$56, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$57 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$57, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return mark_duplicated_unbound_queries(append(new SubLObject[]{ standard_fragments, scalar_comparison_fragments, temporal_fragments, semtrans_fragments, full_sentence_fragments }));
    }

    public static SubLObject enable_full_sentence_cae_interpretation() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $allow_full_sentence_query_interps$.setDynamicValue(T, thread);
        final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method($$BiologyTemplateMt);
        if (pcase_var.eql($MT)) {
            if (NIL != kb_mapping_macros.do_mt_index_key_validator($$BiologyTemplateMt, NIL)) {
                final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec($$BiologyTemplateMt);
                SubLObject final_index_iterator = NIL;
                try {
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject v_assert = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(v_assert));
                        if (NIL != valid) {
                            rtp_datastructures.add_template_assertion(assertions_high.assertion_arguments(v_assert).first(), v_assert);
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
        } else
            if (pcase_var.eql($BROAD_MT) && (NIL != kb_mapping_macros.do_broad_mt_index_key_validator($$BiologyTemplateMt, NIL))) {
                final SubLObject idx = assertion_handles.do_assertions_table();
                final SubLObject mess = $str214$do_broad_mt_index;
                final SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                final SubLObject _prev_bind_2 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble(mess);
                        final SubLObject idx_$58 = idx;
                        if (NIL == id_index_objects_empty_p(idx_$58, $SKIP)) {
                            final SubLObject idx_$59 = idx_$58;
                            if (NIL == id_index_dense_objects_empty_p(idx_$59, $SKIP)) {
                                final SubLObject vector_var = id_index_dense_objects(idx_$59);
                                final SubLObject backwardP_var = NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject a_id;
                                SubLObject a_handle;
                                SubLObject v_assert2;
                                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                    a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                    a_handle = aref(vector_var, a_id);
                                    if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        if (NIL != id_index_tombstone_p(a_handle)) {
                                            a_handle = $SKIP;
                                        }
                                        v_assert2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                        if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(v_assert2, $$BiologyTemplateMt, NIL, NIL)) {
                                            rtp_datastructures.add_template_assertion(assertions_high.assertion_arguments(v_assert2).first(), v_assert2);
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                    }
                                }
                            }
                            final SubLObject idx_$60 = idx_$58;
                            if ((NIL == id_index_sparse_objects_empty_p(idx_$60)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                final SubLObject sparse = id_index_sparse_objects(idx_$60);
                                SubLObject a_id2 = id_index_sparse_id_threshold(idx_$60);
                                final SubLObject end_id = id_index_next_id(idx_$60);
                                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                while (a_id2.numL(end_id)) {
                                    final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                        final SubLObject v_assert3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                        if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(v_assert3, $$BiologyTemplateMt, NIL, NIL)) {
                                            rtp_datastructures.add_template_assertion(assertions_high.assertion_arguments(v_assert3).first(), v_assert3);
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                    }
                                    a_id2 = add(a_id2, ONE_INTEGER);
                                } 
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$61 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$61, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_2, thread);
                }
            }

        return $READY;
    }

    public static SubLObject get_fragments_from_full_sentence_interp(final SubLObject string, final SubLObject parsing_mt, final SubLObject variable_format) {
        final SubLObject sentences = rkf_text_processors.parse_a_question_completely(string, parsing_mt, UNPROVIDED);
        SubLObject fragments = NIL;
        SubLObject cdolist_list_var = sentences;
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject gloss = generate_query_search_gloss_template(sentence, variable_format, $DECLARATIVE, UNPROVIDED, UNPROVIDED);
            final SubLObject category = (NIL != collection_defns.cycl_closed_formulaP(sentence)) ? $FULLY_BOUND : $SIMPLE;
            final SubLObject fragment = new_cae_query_search_fragment(sentence, gloss, category, listS($SENTENCE_PARSE, string, $list154), ZERO_INTEGER, length(string), UNPROVIDED);
            fragments = cons(fragment, fragments);
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        return fragments;
    }

    public static SubLObject mark_duplicated_unbound_queries(final SubLObject fragments) {
        SubLObject cdolist_list_var = fragments;
        SubLObject fragment = NIL;
        fragment = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == list_utilities.find_if_not($sym112$CYC_VAR_, cycl_utilities.formula_args(cae_query_search_fragment_formula(fragment), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                final SubLObject arg0 = cycl_utilities.formula_arg0(cae_query_search_fragment_formula(fragment));
                SubLObject duplicateP = NIL;
                if (NIL == duplicateP) {
                    SubLObject csome_list_var = fragments;
                    SubLObject other_fragment = NIL;
                    other_fragment = csome_list_var.first();
                    while ((NIL == duplicateP) && (NIL != csome_list_var)) {
                        if ((NIL != el_formula_with_operator_p(cae_query_search_fragment_formula(other_fragment), arg0)) && (NIL != list_utilities.find_if_not($sym112$CYC_VAR_, cycl_utilities.formula_args(cae_query_search_fragment_formula(other_fragment), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                            duplicateP = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        other_fragment = csome_list_var.first();
                    } 
                }
                if (NIL != duplicateP) {
                    set_cae_query_search_fragment_category(fragment, $UNBOUND);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            fragment = cdolist_list_var.first();
        } 
        return fragments;
    }

    public static SubLObject get_fragments_for_string_and_task(final SubLObject string, final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $current_cae_task$.currentBinding(thread);
        try {
            $current_cae_task$.bind(task, thread);
            final SubLObject fragments = get_fragments_for_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return fragments;
        } finally {
            $current_cae_task$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject fragments_contain_sentenceP(final SubLObject fragment_list, final SubLObject sentence) {
        SubLObject cdolist_list_var = fragment_list;
        SubLObject fragment = NIL;
        fragment = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != czer_utilities.equals_elP(cae_query_search_fragment_formula(fragment), sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            fragment = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject equal_fragment_listsP(final SubLObject list1, final SubLObject list2) {
        return list_utilities.sets_equalP(list1, list2, EQUAL_FRAGMENTS);
    }

    public static SubLObject clear_suggested_free_position_for_predP() {
        final SubLObject cs = $suggested_free_position_for_predP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_suggested_free_position_for_predP(final SubLObject pred, final SubLObject pos, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args($suggested_free_position_for_predP_caching_state$.getGlobalValue(), list(pred, pos, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject suggested_free_position_for_predP_internal(final SubLObject pred, final SubLObject pos, final SubLObject mt) {
        final SubLObject formula = list($$suggestedOpenPositionForPred, pred, pos);
        final SubLObject ip = $list230;
        if (NIL != inference_kernel.new_cyc_query(formula, mt, ip)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject suggested_free_position_for_predP(final SubLObject pred, final SubLObject pos, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        SubLObject caching_state = $suggested_free_position_for_predP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym228$SUGGESTED_FREE_POSITION_FOR_PRED_, $sym231$_SUGGESTED_FREE_POSITION_FOR_PRED__CACHING_STATE_, $int$256, EQUAL, THREE_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(pred, pos, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pos.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(suggested_free_position_for_predP_internal(pred, pos, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, pos, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject substitutable_variableP(final SubLObject variable, final SubLObject formula) {
        SubLObject cdolist_list_var = cycl_utilities.arg_positions_dfs(variable, formula, UNPROVIDED);
        SubLObject var_pos = NIL;
        var_pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pos = last(var_pos, UNPROVIDED).first();
            final SubLObject literal_pos = butlast(var_pos, ONE_INTEGER);
            final SubLObject pred_pos = append(literal_pos, list(ZERO_INTEGER));
            final SubLObject pred = cycl_utilities.formula_arg_position(formula, pred_pos, UNPROVIDED);
            if (NIL != suggested_free_position_for_predP(pred, pos, UNPROVIDED)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            var_pos = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject variables_that_term_can_replace(final SubLObject v_term, final SubLObject formula, SubLObject mt, SubLObject tight_constraint_matchingP) {
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        if (tight_constraint_matchingP == UNPROVIDED) {
            tight_constraint_matchingP = T;
        }
        SubLObject cdolist_list_var;
        SubLObject v_variables = cdolist_list_var = sentence_free_variables(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject variable = NIL;
        variable = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == substitutable_variableP(variable, formula)) {
                v_variables = remove(variable, v_variables, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            variable = cdolist_list_var.first();
        } 
        SubLObject pos = ZERO_INTEGER;
        SubLObject cdolist_list_var2;
        final SubLObject args = cdolist_list_var2 = cycl_utilities.formula_args(formula, $IGNORE);
        SubLObject variable2 = NIL;
        variable2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            pos = add(pos, ONE_INTEGER);
            SubLObject some_constraint_matches = NIL;
            if (variable2.equal(v_term)) {
                v_variables = remove(variable2, v_variables, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != find(variable2, v_variables, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                final SubLObject isas = kb_accessors.argn_isa(formula.first(), pos, mt);
                final SubLObject v_genls = kb_accessors.argn_genl(formula.first(), pos, mt);
                if (NIL != tight_constraint_matchingP) {
                    if ((NIL == qs_all_isaP(v_term, isas, mt)) || (NIL == qs_all_genlP(v_term, v_genls, mt))) {
                        v_variables = remove(variable2, v_variables, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                } else {
                    if (((NIL == term.el_fort_p(v_term)) || (NIL != any_isa_cachedP(v_term, isas, mt))) || (NIL != genls.any_genlP(v_term, v_genls, mt, UNPROVIDED))) {
                        some_constraint_matches = T;
                    }
                    if ((NIL != any_not_isa_cachedP(isas, v_term, mt)) || (NIL != any_not_genl_cachedP(v_term, v_genls, mt))) {
                        v_variables = remove(variable2, v_variables, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            if (((NIL != subl_promotions.memberP(variable2, v_variables, UNPROVIDED, UNPROVIDED)) && (NIL == tight_constraint_matchingP)) && (NIL == some_constraint_matches)) {
                v_variables = remove(variable2, v_variables, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            variable2 = cdolist_list_var2.first();
        } 
        return v_variables;
    }

    public static SubLObject qs_all_isaP(final SubLObject v_term, final SubLObject isas, final SubLObject mt) {
        if (NIL != term.el_fort_p(v_term)) {
            return isa.all_isaP(v_term, isas, mt, UNPROVIDED);
        }
        SubLObject cdolist_list_var = isas;
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == at_defns.isa_via_defnsP(v_term, v_isa, mt)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject qs_all_genlP(final SubLObject v_term, final SubLObject isas, final SubLObject mt) {
        return makeBoolean((NIL == isas) || ((NIL != term.el_fort_p(v_term)) && (NIL != genls.all_genlP(v_term, isas, mt, UNPROVIDED))));
    }

    public static SubLObject clear_any_not_isa_cachedP() {
        final SubLObject cs = $any_not_isa_cachedP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_any_not_isa_cachedP(final SubLObject isas, final SubLObject v_term, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($any_not_isa_cachedP_caching_state$.getGlobalValue(), list(isas, v_term, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject any_not_isa_cachedP_internal(final SubLObject isas, final SubLObject v_term, final SubLObject mt) {
        return constraint_filters.any_not_isaP(isas, v_term, mt);
    }

    public static SubLObject any_not_isa_cachedP(final SubLObject isas, final SubLObject v_term, final SubLObject mt) {
        SubLObject caching_state = $any_not_isa_cachedP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym234$ANY_NOT_ISA_CACHED_, $sym235$_ANY_NOT_ISA_CACHED__CACHING_STATE_, $int$1024, EQUAL, THREE_INTEGER, ZERO_INTEGER);
            memoization_state.register_isa_dependent_cache_clear_callback($sym236$CLEAR_ANY_NOT_ISA_CACHED_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(isas, v_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (isas.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (v_term.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(any_not_isa_cachedP_internal(isas, v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(isas, v_term, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_any_isa_cachedP() {
        final SubLObject cs = $any_isa_cachedP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_any_isa_cachedP(final SubLObject v_term, final SubLObject isas, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($any_isa_cachedP_caching_state$.getGlobalValue(), list(v_term, isas, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject any_isa_cachedP_internal(final SubLObject v_term, final SubLObject isas, final SubLObject mt) {
        return isa.any_isaP(v_term, isas, mt, UNPROVIDED);
    }

    public static SubLObject any_isa_cachedP(final SubLObject v_term, final SubLObject isas, final SubLObject mt) {
        SubLObject caching_state = $any_isa_cachedP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym237$ANY_ISA_CACHED_, $sym238$_ANY_ISA_CACHED__CACHING_STATE_, $int$1024, EQUAL, THREE_INTEGER, ZERO_INTEGER);
            memoization_state.register_isa_dependent_cache_clear_callback($sym239$CLEAR_ANY_ISA_CACHED_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, isas, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (isas.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(any_isa_cachedP_internal(v_term, isas, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, isas, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_any_not_genl_cachedP() {
        final SubLObject cs = $any_not_genl_cachedP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_any_not_genl_cachedP(final SubLObject v_genls, final SubLObject v_term, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($any_not_genl_cachedP_caching_state$.getGlobalValue(), list(v_genls, v_term, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject any_not_genl_cachedP_internal(final SubLObject v_genls, final SubLObject v_term, final SubLObject mt) {
        return genls.any_not_genlP(v_genls, v_term, mt, UNPROVIDED);
    }

    public static SubLObject any_not_genl_cachedP(final SubLObject v_genls, final SubLObject v_term, final SubLObject mt) {
        SubLObject caching_state = $any_not_genl_cachedP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym240$ANY_NOT_GENL_CACHED_, $sym241$_ANY_NOT_GENL_CACHED__CACHING_STATE_, $int$1024, EQUAL, THREE_INTEGER, ZERO_INTEGER);
            memoization_state.register_genls_dependent_cache_clear_callback($sym242$CLEAR_ANY_NOT_GENL_CACHED_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_genls, v_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_genls.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (v_term.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(any_not_genl_cachedP_internal(v_genls, v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_genls, v_term, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject try_substitution(final SubLObject v_term, final SubLObject formula, final SubLObject token, final SubLObject gloss, final SubLObject category, final SubLObject justification, final SubLObject offset, final SubLObject end, SubLObject mt, SubLObject variable_format, SubLObject tight_constraint_matchingP, SubLObject output_pattern, SubLObject token_is_paraphraseP) {
        if (mt == UNPROVIDED) {
            mt = cae_default_wff_checking_mt(UNPROVIDED);
        }
        if (variable_format == UNPROVIDED) {
            variable_format = $cae_default_variable_format$.getGlobalValue();
        }
        if (tight_constraint_matchingP == UNPROVIDED) {
            tight_constraint_matchingP = T;
        }
        if (output_pattern == UNPROVIDED) {
            output_pattern = $ANYTHING;
        }
        if (token_is_paraphraseP == UNPROVIDED) {
            token_is_paraphraseP = NIL;
        }
        SubLObject results = NIL;
        SubLObject cdolist_list_var;
        final SubLObject free_variables = cdolist_list_var = variables_that_term_can_replace(v_term, formula, mt, tight_constraint_matchingP);
        SubLObject variable = NIL;
        variable = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_formula = sublis(list(bq_cons(variable, v_term)), formula, UNPROVIDED, UNPROVIDED);
            final SubLObject new_gloss = fill_in_gloss_template(gloss, variable, token, new_formula, variable_format, $DECLARATIVE, offset, end, token_is_paraphraseP);
            if ((NIL != formula_pattern_match.formula_matches_pattern(new_formula, output_pattern)) && (NIL != query_search_wffP(new_formula, mt, tight_constraint_matchingP))) {
                final SubLObject item_var = new_cae_query_search_fragment(new_formula, new_gloss, category, justification, offset, end, UNPROVIDED);
                if (NIL == member(item_var, results, EQUAL, symbol_function(IDENTITY))) {
                    results = cons(item_var, results);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            variable = cdolist_list_var.first();
        } 
        return results;
    }

    public static SubLObject try_substitution_simple(final SubLObject v_term, final SubLObject formula, SubLObject mt, SubLObject tight_wff_checkingP) {
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        if (tight_wff_checkingP == UNPROVIDED) {
            tight_wff_checkingP = T;
        }
        SubLObject results = NIL;
        SubLObject cdolist_list_var;
        final SubLObject free_variables = cdolist_list_var = variables_that_term_can_replace(v_term, formula, mt, UNPROVIDED);
        SubLObject variable = NIL;
        variable = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_formula = sublis(list(bq_cons(variable, v_term)), formula, UNPROVIDED, UNPROVIDED);
            if (NIL != query_search_wffP(new_formula, mt, tight_wff_checkingP)) {
                final SubLObject item_var = new_formula;
                if (NIL == member(item_var, results, EQUAL, symbol_function(IDENTITY))) {
                    results = cons(item_var, results);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            variable = cdolist_list_var.first();
        } 
        return results;
    }

    public static SubLObject query_search_wffP(final SubLObject sentence, final SubLObject mt, SubLObject tight_wff_checkingP) {
        if (tight_wff_checkingP == UNPROVIDED) {
            tight_wff_checkingP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wffP = T;
        if (NIL != tight_wff_checkingP) {
            final SubLObject _prev_bind_0 = parsing_vars.$storing_cyclifier_wff_results$.currentBinding(thread);
            try {
                parsing_vars.$storing_cyclifier_wff_results$.bind(NIL, thread);
                wffP = cyclifier.cyclifier_wffP(sentence, mt);
            } finally {
                parsing_vars.$storing_cyclifier_wff_results$.rebind(_prev_bind_0, thread);
            }
        }
        return makeBoolean((NIL != wffP) && (NIL != passes_inter_arg_reln_requirements(sentence, mt)));
    }

    public static SubLObject passes_inter_arg_reln_requirements(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.formula_arg0(sentence);
        SubLObject failP = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != somewhere_cache.some_pred_assertion_somewhereP($$interArgReln, pred, ONE_INTEGER, UNPROVIDED)) {
                final SubLObject pred_var = $$interArgReln;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(pred, ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(pred, ONE_INTEGER, pred_var);
                    SubLObject done_var = failP;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$62 = failP;
                                final SubLObject token_var_$63 = NIL;
                                while (NIL == done_var_$62) {
                                    final SubLObject v_assert = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$63);
                                    final SubLObject valid_$64 = makeBoolean(!token_var_$63.eql(v_assert));
                                    if (NIL != valid_$64) {
                                        final SubLObject arg1_argpos = cycl_utilities.formula_arg2(v_assert, UNPROVIDED);
                                        final SubLObject arg2_argpos = cycl_utilities.formula_arg3(v_assert, UNPROVIDED);
                                        final SubLObject arg0 = cycl_utilities.formula_arg(v_assert, FOUR_INTEGER, UNPROVIDED);
                                        final SubLObject arg2 = cycl_utilities.formula_arg(sentence, arg1_argpos, UNPROVIDED);
                                        final SubLObject arg3 = cycl_utilities.formula_arg(sentence, arg2_argpos, UNPROVIDED);
                                        if (((NIL == collection_defns.el_variableP(arg2)) && (NIL == collection_defns.el_variableP(arg3))) && (NIL == bindings.unification_success_token_p(backward.removal_ask_bindings(list(arg0, arg2, arg3), mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).first()))) {
                                            failP = T;
                                        }
                                    }
                                    done_var_$62 = makeBoolean((NIL == valid_$64) || (NIL != failP));
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$65 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$65, thread);
                                }
                            }
                        }
                        done_var = makeBoolean((NIL == valid) || (NIL != failP));
                    } 
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (((NIL == failP) && (NIL != query_search_irreflexiveP(pred))) && cycl_utilities.formula_arg1(sentence, UNPROVIDED).equal(cycl_utilities.formula_arg2(sentence, UNPROVIDED))) {
            failP = T;
        }
        if ((NIL == failP) && (NIL != strong_query_search_acceptability_checks_allowedP())) {
            if ((NIL != variables.fully_bound_p(sentence)) && literal_arg0(sentence, UNPROVIDED).eql($$genls)) {
                if (NIL == wff.el_wff_assertibleP(sentence, mt, UNPROVIDED)) {
                    failP = T;
                }
            } else {
                final SubLObject _prev_bind_4 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_5 = at_vars.$at_check_defining_mtsP$.currentBinding(thread);
                final SubLObject _prev_bind_6 = at_vars.$at_check_arg_genlsP$.currentBinding(thread);
                final SubLObject _prev_bind_7 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = at_vars.$at_check_arg_isaP$.currentBinding(thread);
                final SubLObject _prev_bind_9 = at_vars.$at_check_arg_not_isaP$.currentBinding(thread);
                final SubLObject _prev_bind_10 = at_vars.$at_check_arg_quoted_isaP$.currentBinding(thread);
                final SubLObject _prev_bind_11 = at_vars.$at_check_not_isa_disjointP$.currentBinding(thread);
                final SubLObject _prev_bind_12 = at_vars.$at_check_not_quoted_isa_disjointP$.currentBinding(thread);
                final SubLObject _prev_bind_13 = at_vars.$at_check_not_genls_disjointP$.currentBinding(thread);
                final SubLObject _prev_bind_14 = at_vars.$at_check_inter_arg_differentP$.currentBinding(thread);
                final SubLObject _prev_bind_15 = at_vars.$at_check_inter_arg_isaP$.currentBinding(thread);
                final SubLObject _prev_bind_16 = at_vars.$at_check_inter_arg_genlP$.currentBinding(thread);
                final SubLObject _prev_bind_17 = at_vars.$at_check_inter_arg_not_genlP$.currentBinding(thread);
                final SubLObject _prev_bind_18 = at_vars.$at_check_inter_arg_isa_genlP$.currentBinding(thread);
                final SubLObject _prev_bind_19 = at_vars.$at_check_inter_arg_genl_isaP$.currentBinding(thread);
                final SubLObject _prev_bind_20 = at_vars.$at_check_inter_arg_formatP$.currentBinding(thread);
                final SubLObject _prev_bind_21 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                final SubLObject _prev_bind_22 = at_vars.$at_some_arg_isa_requiredP$.currentBinding(thread);
                try {
                    at_vars.$at_check_arg_typesP$.bind(T, thread);
                    at_vars.$at_check_defining_mtsP$.bind(NIL, thread);
                    at_vars.$at_check_arg_genlsP$.bind(T, thread);
                    at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                    at_vars.$at_check_arg_isaP$.bind(T, thread);
                    at_vars.$at_check_arg_not_isaP$.bind(T, thread);
                    at_vars.$at_check_arg_quoted_isaP$.bind(NIL, thread);
                    at_vars.$at_check_not_isa_disjointP$.bind(T, thread);
                    at_vars.$at_check_not_quoted_isa_disjointP$.bind(NIL, thread);
                    at_vars.$at_check_not_genls_disjointP$.bind(T, thread);
                    at_vars.$at_check_inter_arg_differentP$.bind(T, thread);
                    at_vars.$at_check_inter_arg_isaP$.bind(T, thread);
                    at_vars.$at_check_inter_arg_genlP$.bind(T, thread);
                    at_vars.$at_check_inter_arg_not_genlP$.bind(T, thread);
                    at_vars.$at_check_inter_arg_isa_genlP$.bind(NIL, thread);
                    at_vars.$at_check_inter_arg_genl_isaP$.bind(NIL, thread);
                    at_vars.$at_check_inter_arg_formatP$.bind(NIL, thread);
                    at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                    at_vars.$at_some_arg_isa_requiredP$.bind(NIL, thread);
                    final SubLObject mt_var2 = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    final SubLObject _prev_bind_0_$66 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$67 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$68 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var2), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var2), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var2), thread);
                        if (NIL == at_admitted.admitted_sentenceP(sentence, mt)) {
                            failP = T;
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$68, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$67, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$66, thread);
                    }
                } finally {
                    at_vars.$at_some_arg_isa_requiredP$.rebind(_prev_bind_22, thread);
                    at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_21, thread);
                    at_vars.$at_check_inter_arg_formatP$.rebind(_prev_bind_20, thread);
                    at_vars.$at_check_inter_arg_genl_isaP$.rebind(_prev_bind_19, thread);
                    at_vars.$at_check_inter_arg_isa_genlP$.rebind(_prev_bind_18, thread);
                    at_vars.$at_check_inter_arg_not_genlP$.rebind(_prev_bind_17, thread);
                    at_vars.$at_check_inter_arg_genlP$.rebind(_prev_bind_16, thread);
                    at_vars.$at_check_inter_arg_isaP$.rebind(_prev_bind_15, thread);
                    at_vars.$at_check_inter_arg_differentP$.rebind(_prev_bind_14, thread);
                    at_vars.$at_check_not_genls_disjointP$.rebind(_prev_bind_13, thread);
                    at_vars.$at_check_not_quoted_isa_disjointP$.rebind(_prev_bind_12, thread);
                    at_vars.$at_check_not_isa_disjointP$.rebind(_prev_bind_11, thread);
                    at_vars.$at_check_arg_quoted_isaP$.rebind(_prev_bind_10, thread);
                    at_vars.$at_check_arg_not_isaP$.rebind(_prev_bind_9, thread);
                    at_vars.$at_check_arg_isaP$.rebind(_prev_bind_8, thread);
                    at_vars.$at_check_arg_formatP$.rebind(_prev_bind_7, thread);
                    at_vars.$at_check_arg_genlsP$.rebind(_prev_bind_6, thread);
                    at_vars.$at_check_defining_mtsP$.rebind(_prev_bind_5, thread);
                    at_vars.$at_check_arg_typesP$.rebind(_prev_bind_4, thread);
                }
            }
        }
        return makeBoolean(NIL == failP);
    }

    public static SubLObject clear_query_search_irreflexiveP() {
        final SubLObject cs = $query_search_irreflexiveP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_query_search_irreflexiveP(final SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args($query_search_irreflexiveP_caching_state$.getGlobalValue(), list(pred), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject query_search_irreflexiveP_internal(final SubLObject pred) {
        return makeBoolean((NIL != fort_types_interface.irreflexive_binary_predicate_p(pred)) || (NIL != ask_utilities.query_boolean(listS($$interArgDifferent, pred, $list249), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject query_search_irreflexiveP(final SubLObject pred) {
        SubLObject caching_state = $query_search_irreflexiveP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym247$QUERY_SEARCH_IRREFLEXIVE_, $sym250$_QUERY_SEARCH_IRREFLEXIVE__CACHING_STATE_, $int$64, EQL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback($sym252$CLEAR_QUERY_SEARCH_IRREFLEXIVE_);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(query_search_irreflexiveP_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject strong_query_search_acceptability_checks_allowedP_internal() {
        final SubLObject task_specification_pairs = kb_mapping_utilities.pred_value_tuples(current_cae_task(), $const254$softwareParameterValueInSpecifica, TWO_INTEGER, $list255, UNPROVIDED);
        SubLObject specification = NIL;
        if (NIL == specification) {
            SubLObject csome_list_var = task_specification_pairs;
            SubLObject task_specification_pair = NIL;
            task_specification_pair = csome_list_var.first();
            while ((NIL == specification) && (NIL != csome_list_var)) {
                SubLObject current;
                final SubLObject datum = current = task_specification_pair;
                SubLObject task = NIL;
                SubLObject this_specification = NIL;
                destructuring_bind_must_consp(current, datum, $list256);
                task = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list256);
                this_specification = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (task.eql($$analysisTask)) {
                        specification = this_specification;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list256);
                }
                csome_list_var = csome_list_var.rest();
                task_specification_pair = csome_list_var.first();
            } 
        }
        if ((NIL != specification) && $$True.eql(kb_mapping_utilities.fpred_value_in_any_mt(specification, $const258$allowsStrongQuerySearchAcceptabil, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject strong_query_search_acceptability_checks_allowedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return strong_query_search_acceptability_checks_allowedP_internal();
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym253$STRONG_QUERY_SEARCH_ACCEPTABILITY_CHECKS_ALLOWED_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym253$STRONG_QUERY_SEARCH_ACCEPTABILITY_CHECKS_ALLOWED_, ZERO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym253$STRONG_QUERY_SEARCH_ACCEPTABILITY_CHECKS_ALLOWED_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(strong_query_search_acceptability_checks_allowedP_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject halo_test_passes_inter_arg_reln_requirements(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        assert NIL != forts.fort_p($const259$HaloBiologyQuestionAnsweringTask_) : "forts.fort_p(cae_query_search.$const259$HaloBiologyQuestionAnsweringTask_) " + "CommonSymbols.NIL != forts.fort_p(cae_query_search.$const259$HaloBiologyQuestionAnsweringTask_) " + $const259$HaloBiologyQuestionAnsweringTask_;
        final SubLObject _prev_bind_0 = $current_cae_task$.currentBinding(thread);
        try {
            $current_cae_task$.bind($const259$HaloBiologyQuestionAnsweringTask_, thread);
            result = passes_inter_arg_reln_requirements(sentence, mt);
        } finally {
            $current_cae_task$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject clear_required_bound_args_for_preds() {
        final SubLObject cs = $required_bound_args_for_preds_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_required_bound_args_for_preds(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args($required_bound_args_for_preds_caching_state$.getGlobalValue(), list(mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject required_bound_args_for_preds_internal(final SubLObject mt) {
        final SubLObject template = $list264;
        final SubLObject query = $list265;
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = ask_utilities.query_template(template, query, mt, $list267);
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject pred = NIL;
            SubLObject argpos = NIL;
            destructuring_bind_must_consp(current, datum, $list266);
            pred = current.first();
            current = argpos = current.rest();
            ans = list_utilities.alist_push(ans, pred, argpos, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject required_bound_args_for_preds(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        SubLObject caching_state = $required_bound_args_for_preds_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(REQUIRED_BOUND_ARGS_FOR_PREDS, $required_bound_args_for_preds_caching_state$, $int$64, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_REQUIRED_BOUND_ARGS_FOR_PREDS);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(required_bound_args_for_preds_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject sentence_has_all_required_args_boundP(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        SubLObject failP = NIL;
        if (((NIL != el_formula_p(sentence)) && (NIL != fort_types_interface.predicate_p(cycl_utilities.formula_arg0(sentence)))) && (NIL == failP)) {
            SubLObject csome_list_var = list_utilities.alist_lookup_without_values(required_bound_args_for_preds(mt), cycl_utilities.formula_arg0(sentence), UNPROVIDED, UNPROVIDED);
            SubLObject argpos = NIL;
            argpos = csome_list_var.first();
            while ((NIL == failP) && (NIL != csome_list_var)) {
                if ((NIL != formula_arityGE(sentence, argpos, UNPROVIDED)) && (NIL != cycl_utilities.expression_find_if($sym112$CYC_VAR_, cycl_utilities.formula_arg(sentence, argpos, UNPROVIDED), UNPROVIDED, UNPROVIDED))) {
                    failP = T;
                }
                csome_list_var = csome_list_var.rest();
                argpos = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == failP);
    }

    public static SubLObject query_has_all_required_args_boundP(final SubLObject query, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        final SubLObject formula = cae_query_search_fragment_formula(query);
        return sentence_has_all_required_args_boundP(formula, mt);
    }

    public static SubLObject try_suggestions_for_query(final SubLObject fragment, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        final SubLObject formula = cae_query_search_fragment_formula(fragment);
        final SubLObject gloss = cae_query_search_fragment_gloss(fragment);
        final SubLObject category = cae_query_search_fragment_category(fragment);
        final SubLObject justification = cae_query_search_fragment_justification(fragment);
        final SubLObject offset = cae_query_search_fragment_offset(fragment);
        final SubLObject end = cae_query_search_fragment_end(fragment);
        if (NIL == isa.isaP(cycl_utilities.formula_arg0(formula), $$StatisticalPredicate, UNPROVIDED, UNPROVIDED)) {
            return fragment;
        }
        SubLObject new_formula = formula;
        SubLObject replacements = gke_main.candidate_replacements_for_variables(new_formula, mt);
        SubLObject next_variables;
        SubLObject v_variables = next_variables = sentence_free_variables(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject progress = T;
        while (NIL != progress) {
            progress = NIL;
            SubLObject cdolist_list_var = v_variables;
            SubLObject variable = NIL;
            variable = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject variable_replacements = list_utilities.alist_lookup(replacements, variable, symbol_function(EQUAL), UNPROVIDED);
                if (NIL != variable_replacements) {
                    progress = T;
                    new_formula = sublis(list(bq_cons(variable, variable_replacements.first())), new_formula, UNPROVIDED, UNPROVIDED);
                    replacements = gke_main.candidate_replacements_for_variables(new_formula, mt);
                    next_variables = remove(variable, next_variables, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                variable = cdolist_list_var.first();
            } 
            v_variables = next_variables;
        } 
        return new_cae_query_search_fragment(new_formula, gloss, category, justification, offset, end, UNPROVIDED);
    }

    public static SubLObject clear_default_values_for_pred() {
        final SubLObject cs = $default_values_for_pred_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_default_values_for_pred(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args($default_values_for_pred_caching_state$.getGlobalValue(), list(pred, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject default_values_for_pred_internal(final SubLObject pred, final SubLObject mt) {
        SubLObject ans = NIL;
        final SubLObject vars = $list273;
        final SubLObject query = listS($$defaultValueForPredInArg, pred, vars);
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = ask_utilities.query_template(vars, query, mt, $list230);
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = result;
            SubLObject argpos = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list275);
            argpos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list275);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                ans = list_utilities.alist_enter(ans, argpos, value, symbol_function(EQUAL));
            } else {
                cdestructuring_bind_error(datum, $list275);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject default_values_for_pred(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        SubLObject caching_state = $default_values_for_pred_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(DEFAULT_VALUES_FOR_PRED, $default_values_for_pred_caching_state$, $int$1024, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_DEFAULT_VALUES_FOR_PRED);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(default_values_for_pred_internal(pred, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject default_values_for_sentence(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        SubLObject ans = NIL;
        if (sentence.isList()) {
            SubLObject list_var = NIL;
            SubLObject item = NIL;
            SubLObject pos = NIL;
            list_var = sentence;
            item = list_var.first();
            for (pos = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , item = list_var.first() , pos = add(ONE_INTEGER, pos)) {
                final SubLObject replacement_alist = default_values_for_sentence(item, mt);
                SubLObject cdolist_list_var = list_utilities.alist_keys(replacement_alist);
                SubLObject key = NIL;
                key = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$69 = list_utilities.alist_lookup(replacement_alist, key, UNPROVIDED, UNPROVIDED);
                    SubLObject replacement = NIL;
                    replacement = cdolist_list_var_$69.first();
                    while (NIL != cdolist_list_var_$69) {
                        ans = list_utilities.alist_pushnew(ans, cons(pos, key), replacement, symbol_function(EQUAL), UNPROVIDED);
                        cdolist_list_var_$69 = cdolist_list_var_$69.rest();
                        replacement = cdolist_list_var_$69.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    key = cdolist_list_var.first();
                } 
            }
            final SubLObject pred = sentence.first();
            SubLObject cdolist_list_var2;
            final SubLObject values = cdolist_list_var2 = default_values_for_pred(pred, mt);
            SubLObject cons = NIL;
            cons = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject argpos = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list279);
                argpos = current.first();
                current = value = current.rest();
                ans = list_utilities.alist_enter(ans, list(argpos), value, symbol_function(EQUAL));
                cdolist_list_var2 = cdolist_list_var2.rest();
                cons = cdolist_list_var2.first();
            } 
        }
        return ans;
    }

    public static SubLObject fill_in_default_values_for_query(final SubLObject fragment, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        final SubLObject formula = cae_query_search_fragment_formula(fragment);
        final SubLObject gloss = cae_query_search_fragment_gloss(fragment);
        final SubLObject category = cae_query_search_fragment_category(fragment);
        final SubLObject justification = cae_query_search_fragment_justification(fragment);
        final SubLObject offset = cae_query_search_fragment_offset(fragment);
        final SubLObject end = cae_query_search_fragment_end(fragment);
        SubLObject new_formula = formula;
        SubLObject cdolist_list_var;
        final SubLObject values = cdolist_list_var = default_values_for_sentence(formula, mt);
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject argpos = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list279);
            argpos = current.first();
            current = value = current.rest();
            if (NIL != cycl_variables.cyc_varP(cycl_utilities.formula_arg_position(new_formula, argpos, UNPROVIDED))) {
                new_formula = cycl_utilities.formula_arg_position_subst(value, argpos, new_formula);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return new_cae_query_search_fragment(new_formula, gloss, category, justification, offset, end, UNPROVIDED);
    }

    public static SubLObject try_substitutions_for_query(final SubLObject token_list, final SubLObject fragment, SubLObject mt, SubLObject variable_format, SubLObject tight_wff_checkingP, SubLObject disallow_self_substitutionsP, SubLObject output_pattern) {
        if (mt == UNPROVIDED) {
            mt = cae_default_wff_checking_mt(UNPROVIDED);
        }
        if (variable_format == UNPROVIDED) {
            variable_format = $cae_default_variable_format$.getGlobalValue();
        }
        if (tight_wff_checkingP == UNPROVIDED) {
            tight_wff_checkingP = T;
        }
        if (disallow_self_substitutionsP == UNPROVIDED) {
            disallow_self_substitutionsP = NIL;
        }
        if (output_pattern == UNPROVIDED) {
            output_pattern = $ANYTHING;
        }
        SubLObject substitutions = NIL;
        final SubLObject formula = cae_query_search_fragment_formula(fragment);
        final SubLObject gloss = cae_query_search_fragment_gloss(fragment);
        final SubLObject category = cae_query_search_fragment_category(fragment);
        final SubLObject justification = cae_query_search_fragment_justification(fragment);
        final SubLObject offset = cae_query_search_fragment_offset(fragment);
        final SubLObject end = cae_query_search_fragment_end(fragment);
        final SubLObject opaque = cae_query_search_fragment_opaque(fragment);
        if (NIL != subl_promotions.memberP(opaque, $list280, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        SubLObject cdolist_list_var = token_list;
        SubLObject token_record = NIL;
        token_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject token = token_record_string(token_record);
            final SubLObject term_list = token_record_denotations(token_record);
            final SubLObject token_offset = token_record_offset(token_record);
            final SubLObject token_end = token_record_end(token_record);
            if (((NIL == disallow_self_substitutionsP) || (!offset.equal(token_offset))) || (!end.equal(token_end))) {
                SubLObject cdolist_list_var_$70 = term_list;
                SubLObject v_term = NIL;
                v_term = cdolist_list_var_$70.first();
                while (NIL != cdolist_list_var_$70) {
                    if (NIL == trigger_only_termP(v_term, UNPROVIDED)) {
                        SubLObject cdolist_list_var_$71;
                        final SubLObject new_queries = cdolist_list_var_$71 = try_substitution(v_term, formula, token, gloss, category, justification, token_record_offset(token_record), token_record_end(token_record), mt, variable_format, tight_wff_checkingP, output_pattern, NIL);
                        SubLObject new_query = NIL;
                        new_query = cdolist_list_var_$71.first();
                        while (NIL != cdolist_list_var_$71) {
                            substitutions = cons(new_query, substitutions);
                            cdolist_list_var_$71 = cdolist_list_var_$71.rest();
                            new_query = cdolist_list_var_$71.first();
                        } 
                    }
                    cdolist_list_var_$70 = cdolist_list_var_$70.rest();
                    v_term = cdolist_list_var_$70.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            token_record = cdolist_list_var.first();
        } 
        return substitutions;
    }

    public static SubLObject trigger_only_termP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        return isa.quoted_isaP(v_term, $const281$TermAcceptableForQuerySearch_Trig, mt, UNPROVIDED);
    }

    public static SubLObject try_substitutions(final SubLObject token_list, final SubLObject queries, SubLObject mt, SubLObject variable_format, SubLObject tight_wff_checkingP, SubLObject disallow_self_substitutionsP, SubLObject output_pattern) {
        if (mt == UNPROVIDED) {
            mt = cae_default_wff_checking_mt(UNPROVIDED);
        }
        if (variable_format == UNPROVIDED) {
            variable_format = $cae_default_variable_format$.getGlobalValue();
        }
        if (tight_wff_checkingP == UNPROVIDED) {
            tight_wff_checkingP = T;
        }
        if (disallow_self_substitutionsP == UNPROVIDED) {
            disallow_self_substitutionsP = NIL;
        }
        if (output_pattern == UNPROVIDED) {
            output_pattern = $ANYTHING;
        }
        SubLObject v_agenda = queries;
        SubLObject new_queries = NIL;
        while (NIL != v_agenda) {
            final SubLObject query = v_agenda.first();
            final SubLObject substitutions = try_substitutions_for_query(token_list, query, mt, variable_format, tight_wff_checkingP, disallow_self_substitutionsP, output_pattern);
            v_agenda = v_agenda.rest();
            if (NIL == substitutions) {
                final SubLObject item_var = query;
                if (NIL == member(item_var, new_queries, EQUAL, symbol_function(IDENTITY))) {
                    new_queries = cons(item_var, new_queries);
                }
            }
            SubLObject cdolist_list_var = substitutions;
            SubLObject new_query = NIL;
            new_query = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                v_agenda = cons(new_query, v_agenda);
                cdolist_list_var = cdolist_list_var.rest();
                new_query = cdolist_list_var.first();
            } 
        } 
        return new_queries;
    }

    public static SubLObject combine_cae_fragments(final SubLObject fragments) {
        final SubLObject recipes = remove($$ThePrototypicalCAERecipe, isa.all_instances($$CAERecipe, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject combos = NIL;
        SubLObject cdolist_list_var = recipes;
        SubLObject recipe = NIL;
        recipe = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_combos = cae_recipe_combinations(recipe, fragments);
            if (NIL != new_combos) {
                combos = append(new_combos, combos);
            }
            cdolist_list_var = cdolist_list_var.rest();
            recipe = cdolist_list_var.first();
        } 
        return combos;
    }

    public static SubLObject cae_recipe_combinations(final SubLObject recipe, final SubLObject fragments) {
        final SubLObject raw_combos = find_ingredients_for_cae_recipe(recipe, fragments);
        SubLObject combos = NIL;
        SubLObject cdolist_list_var = raw_combos;
        SubLObject raw_combo = NIL;
        raw_combo = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_frag = make_cae_fragment_combination(raw_combo);
            final SubLObject new_formula = cae_query_search_fragment_formula(new_frag);
            if ((NIL != wff.el_wffP(parse_tree.quantify_existentially(new_formula, UNPROVIDED), cae_query_search_default_mt(UNPROVIDED), UNPROVIDED)) && (NIL != list_utilities.lengthL(obsolete.formula_free_variables(new_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED), number_utilities.summation(Mapping.mapcar(LENGTH, Mapping.mapcar(FORMULA_FREE_VARIABLES, Mapping.mapcar(CAE_QUERY_SEARCH_FRAGMENT_FORMULA, raw_combo)))), UNPROVIDED))) {
                combos = cons(new_frag, combos);
            }
            cdolist_list_var = cdolist_list_var.rest();
            raw_combo = cdolist_list_var.first();
        } 
        return combos;
    }

    public static SubLObject find_ingredients_for_cae_recipe(final SubLObject recipe, final SubLObject fragments) {
        format(T, $str286$__Looking_for_ingredients_for_CAE, recipe);
        SubLObject n = ask_utilities.query_variable($sym287$_N, listS($$numberOfComponentsInCAERecipe, recipe, $list289), $$GeneralCAEGuidanceMt, UNPROVIDED);
        SubLObject ingredients = NIL;
        if (NIL != n) {
            SubLObject i;
            SubLObject index;
            SubLObject matching_fragments;
            SubLObject cdolist_list_var;
            SubLObject frag;
            SubLObject formula;
            for (n = n.first(), i = NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
                index = add(i, ONE_INTEGER);
                matching_fragments = NIL;
                cdolist_list_var = fragments;
                frag = NIL;
                frag = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    formula = cae_derefine(cae_query_search_fragment_formula(frag));
                    if (NIL != formula_matches_cae_recipe_componentP(formula, recipe, index)) {
                        matching_fragments = cons(frag, matching_fragments);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    frag = cdolist_list_var.first();
                } 
                if (NIL == matching_fragments) {
                    format(T, $str291$no_match_for_component__S__, index);
                    return NIL;
                }
                ingredients = cons(matching_fragments, ingredients);
            }
            return list_utilities.cross_products(ingredients);
        }
        return NIL;
    }

    public static SubLObject formula_matches_cae_recipe_componentP(final SubLObject formula, final SubLObject recipe, final SubLObject component) {
        final SubLObject quoted_formula = make_el_formula($$Quote, list(formula), UNPROVIDED);
        final SubLObject v_answer = list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(make_el_formula($$matchesCAERecipeComponent, list(quoted_formula, recipe, component), UNPROVIDED), $$InferencePSC, $list295));
        return v_answer;
    }

    public static SubLObject make_cae_fragment_combination(final SubLObject fragments) {
        SubLObject new_formula = NIL;
        final SubLObject gloss = NIL;
        SubLObject category = NIL;
        final SubLObject justification = NIL;
        final SubLObject offset = NIL;
        final SubLObject end = NIL;
        category = $COMBINED;
        SubLObject cdolist_list_var = fragments;
        SubLObject fragment = NIL;
        fragment = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject frag_formula = cae_query_search_fragment_formula(fragment);
            final SubLObject frag_justification = cae_query_search_fragment_justification(fragment);
            if (NIL != new_formula) {
                new_formula = query_library_api.combine_formulas_at_position(new_formula, frag_formula, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                new_formula = frag_formula;
            }
            cdolist_list_var = cdolist_list_var.rest();
            fragment = cdolist_list_var.first();
        } 
        return new_cae_query_search_fragment(new_formula, gloss, category, justification, offset, end, UNPROVIDED);
    }

    public static SubLObject valid_query_search_termP(final SubLObject v_term, SubLObject mt, SubLObject filter) {
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        if (filter == UNPROVIDED) {
            filter = query_library_utils.cae_query_search_filter(current_cae_task());
        }
        SubLObject result = T;
        if ((NIL != filter) && ((NIL != cycl_grammar.cycl_nat_p(v_term)) || (NIL != term.el_fort_p(v_term)))) {
            if (NIL != cycl_grammar.cycl_nat_p(v_term)) {
                if (NIL != nart_handles.nart_p(v_term)) {
                    if ((NIL != narts_high.nart_el_formula(v_term)) && (NIL != valid_query_search_termP(cycl_utilities.nat_functor(v_term), mt, UNPROVIDED))) {
                        return T;
                    }
                } else
                    if (NIL != valid_query_search_termP(v_term.first(), mt, UNPROVIDED)) {
                        return T;
                    }

            }
            result = term_passes_classification_tree_filterP(filter, v_term, mt);
        }
        return result;
    }

    public static SubLObject term_fails_classification_tree_filterP(final SubLObject filter, final SubLObject v_term, final SubLObject mt) {
        return makeBoolean(NIL == term_passes_classification_tree_filterP(filter, v_term, mt));
    }

    public static SubLObject term_passes_classification_tree_filterP(final SubLObject filter, final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = term_classification_tree.$term_classification_tree_mt$.currentBinding(thread);
        try {
            term_classification_tree.$term_classification_tree_mt$.bind(mt, thread);
            thread.resetMultipleValues();
            final SubLObject filter_string = term_classification_tree_info(filter);
            final SubLObject _prev_bind_0_$72 = term_classification_tree.$term_classification_tree$.currentBinding(thread);
            final SubLObject _prev_bind_2 = term_classification_tree.$term_classification_tree_collections$.currentBinding(thread);
            try {
                term_classification_tree.$term_classification_tree$.bind(thread.secondMultipleValue(), thread);
                term_classification_tree.$term_classification_tree_collections$.bind(thread.thirdMultipleValue(), thread);
                thread.resetMultipleValues();
                result = makeBoolean(filter_string.isString() && (NIL != term_classification_tree.term_good_wrt_classification_treeP(v_term, filter_string, UNPROVIDED)));
            } finally {
                term_classification_tree.$term_classification_tree_collections$.rebind(_prev_bind_2, thread);
                term_classification_tree.$term_classification_tree$.rebind(_prev_bind_0_$72, thread);
            }
        } finally {
            term_classification_tree.$term_classification_tree_mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject clear_term_classification_tree_info() {
        final SubLObject cs = $term_classification_tree_info_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_term_classification_tree_info(final SubLObject filter) {
        return memoization_state.caching_state_remove_function_results_with_args($term_classification_tree_info_caching_state$.getGlobalValue(), list(filter), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject term_classification_tree_info_internal(final SubLObject filter) {
        if (NIL == filter) {
            return values(NIL, NIL, NIL);
        }
        final SubLObject filter_string = ask_utilities.query_variable($sym298$_TREE, listS($$and, listS($$conceptFilterDecisionTree, filter, $list300), $list301), $$InferencePSC, UNPROVIDED).first();
        final SubLObject filter_tree = decision_tree.new_decision_tree_from_weka_j48_format(filter_string);
        final SubLObject filter_classification_tree = term_classification_tree.create_term_classification_tree_collections(filter_tree);
        return values(filter_string, filter_tree, filter_classification_tree);
    }

    public static SubLObject term_classification_tree_info(final SubLObject filter) {
        SubLObject caching_state = $term_classification_tree_info_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(TERM_CLASSIFICATION_TREE_INFO, $term_classification_tree_info_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, filter, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(term_classification_tree_info_internal(filter)));
            memoization_state.caching_state_put(caching_state, filter, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject cae_query_superstrings(final SubLObject string, SubLObject mt, SubLObject best_onlyP, SubLObject lexicon) {
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        if (best_onlyP == UNPROVIDED) {
            best_onlyP = T;
        }
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject valid_strings = NIL;
        SubLObject valid_cycls = NIL;
        final SubLObject results = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        SubLObject cdolist_list_var = cae_query_superstrings_case_variants(string);
        SubLObject cased_string = NIL;
        cased_string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            lexicon = (NIL != lexicon) ? lexicon : get_cae_query_search_lexicon(UNPROVIDED);
            SubLObject cdolist_list_var_$73 = cae_query_superstrings_from_larger_string(string_utilities.right_trim_whitespace(cased_string), best_onlyP);
            SubLObject superstring = NIL;
            superstring = cdolist_list_var_$73.first();
            while (NIL != cdolist_list_var_$73) {
                SubLObject current;
                final SubLObject datum = current = superstring;
                SubLObject start = NIL;
                SubLObject end = NIL;
                SubLObject strings = NIL;
                destructuring_bind_must_consp(current, datum, $list304);
                start = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list304);
                end = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list304);
                strings = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject cdolist_list_var_$74 = strings;
                    SubLObject superstring_$75 = NIL;
                    superstring_$75 = cdolist_list_var_$74.first();
                    while (NIL != cdolist_list_var_$74) {
                        SubLObject validP = NIL;
                        if (NIL == validP) {
                            SubLObject csome_list_var = lexicon_lookup_memoized(lexicon, superstring_$75);
                            SubLObject entry = NIL;
                            entry = csome_list_var.first();
                            while ((NIL == validP) && (NIL != csome_list_var)) {
                                final SubLObject cycl = methods.funcall_instance_method_with_1_args(entry, GET, $DENOT);
                                if (NIL != valid_query_search_termP(cycl, mt, UNPROVIDED)) {
                                    final SubLObject trie_entry = methods.funcall_instance_method_with_1_args(entry, GET, $TRIE_ENTRY);
                                    final SubLObject sem_supports = (NIL != trie_entry) ? nl_trie.nl_trie_entry_semantic_support_list(trie_entry) : NIL;
                                    final SubLObject sorted_sem_supports = (NIL != sem_supports) ? Sort.sort(copy_list(sem_supports), $sym308$TERM__, UNPROVIDED) : NIL;
                                    dictionary_utilities.dictionary_pushnew(results, list(cycl, sorted_sem_supports, start, end), superstring_$75, UNPROVIDED, UNPROVIDED);
                                    validP = T;
                                }
                                csome_list_var = csome_list_var.rest();
                                entry = csome_list_var.first();
                            } 
                        }
                        cdolist_list_var_$74 = cdolist_list_var_$74.rest();
                        superstring_$75 = cdolist_list_var_$74.first();
                    } 
                } else {
                    cdestructuring_bind_error(datum, $list304);
                }
                cdolist_list_var_$73 = cdolist_list_var_$73.rest();
                superstring = cdolist_list_var_$73.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            cased_string = cdolist_list_var.first();
        } 
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(results)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject cycl_and_location = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject strings2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject current2;
            final SubLObject datum2 = current2 = cycl_and_location;
            SubLObject cycl2 = NIL;
            SubLObject sem_supports2 = NIL;
            SubLObject start2 = NIL;
            SubLObject end2 = NIL;
            destructuring_bind_must_consp(current2, datum2, $list309);
            cycl2 = current2.first();
            current2 = current2.rest();
            destructuring_bind_must_consp(current2, datum2, $list309);
            sem_supports2 = current2.first();
            current2 = current2.rest();
            destructuring_bind_must_consp(current2, datum2, $list309);
            start2 = current2.first();
            current2 = current2.rest();
            destructuring_bind_must_consp(current2, datum2, $list309);
            end2 = current2.first();
            current2 = current2.rest();
            if (NIL == current2) {
                valid_cycls = cons(cycl2, valid_cycls);
                valid_strings = cons(list(start2, end2, number_utilities.minimum(strings2, symbol_function(LENGTH))), valid_strings);
            } else {
                cdestructuring_bind_error(datum2, $list309);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return values(valid_strings, valid_cycls);
    }

    public static SubLObject cae_query_superstrings_from_larger_string(final SubLObject string, SubLObject best_onlyP) {
        if (best_onlyP == UNPROVIDED) {
            best_onlyP = NIL;
        }
        final SubLObject split_positions = nreverse(cons(MINUS_ONE_INTEGER, string_utilities.search_all($$$_, string, UNPROVIDED, UNPROVIDED)));
        SubLObject result = NIL;
        final SubLObject length = length(string);
        SubLObject failureP = NIL;
        if (NIL == failureP) {
            SubLObject csome_list_var = split_positions;
            SubLObject split_position = NIL;
            split_position = csome_list_var.first();
            while ((NIL == failureP) && (NIL != csome_list_var)) {
                final SubLObject start_position = add(ONE_INTEGER, split_position);
                final SubLObject words = string_utilities.substring(string, start_position, UNPROVIDED);
                if (NIL == lexicon_accessors.closed_lexical_class_stringP(words, UNPROVIDED)) {
                    final SubLObject search_result = lexicon_subword_index.nl_trie_subword_index_search(words, UNPROVIDED);
                    if (NIL != list_utilities.empty_list_p(search_result)) {
                        failureP = T;
                    } else
                        if (NIL == list_utilities.lengthG(search_result, $superstring_match_max_useful_hit_count$.getGlobalValue(), UNPROVIDED)) {
                            result = cons(list(start_position, length, search_result), result);
                        }

                }
                csome_list_var = csome_list_var.rest();
                split_position = csome_list_var.first();
            } 
        }
        if ((NIL != best_onlyP) && (NIL != list_utilities.non_empty_list_p(result))) {
            result = list(result.first());
        }
        return result;
    }

    public static SubLObject cae_query_superstrings_case_variants(final SubLObject string) {
        return delete_duplicates(list(string, pph_utilities.add_title_capitalization(Strings.string_downcase(string, UNPROVIDED, UNPROVIDED)), Strings.string_upcase(string, UNPROVIDED, UNPROVIDED), Strings.string_downcase(string, UNPROVIDED, UNPROVIDED)), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject debug_cae_query_superstrings(final SubLObject string, SubLObject task, SubLObject out) {
        if (task == UNPROVIDED) {
            task = $const312$GenericMedicalResearchTask_Allotm;
        }
        if (out == UNPROVIDED) {
            out = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $current_cae_task$.currentBinding(thread);
        try {
            $current_cae_task$.bind(task, thread);
            final SubLObject mt = cae_query_search_default_mt(UNPROVIDED);
            final SubLObject base_strings_and_locations = cae_query_superstrings_from_larger_string(string, UNPROVIDED);
            SubLObject valid_strings = NIL;
            SubLObject valid_cycls = NIL;
            SubLObject all_cycls = NIL;
            final SubLObject lexicon = get_cae_query_search_lexicon(UNPROVIDED);
            final SubLObject results = dictionary.new_dictionary(EQUAL, UNPROVIDED);
            format(out, $str313$__Unfiltered_Superstrings_____S__, base_strings_and_locations);
            SubLObject cdolist_list_var = base_strings_and_locations;
            SubLObject superstrings_and_location = NIL;
            superstrings_and_location = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = superstrings_and_location;
                SubLObject start = NIL;
                SubLObject end = NIL;
                SubLObject super_strings = NIL;
                destructuring_bind_must_consp(current, datum, $list314);
                start = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list314);
                end = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list314);
                super_strings = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject cdolist_list_var_$76 = super_strings;
                    SubLObject superstring = NIL;
                    superstring = cdolist_list_var_$76.first();
                    while (NIL != cdolist_list_var_$76) {
                        SubLObject validP = NIL;
                        if (NIL == validP) {
                            SubLObject csome_list_var = lexicon_lookup_memoized(lexicon, superstring);
                            SubLObject entry = NIL;
                            entry = csome_list_var.first();
                            while ((NIL == validP) && (NIL != csome_list_var)) {
                                final SubLObject item_var;
                                final SubLObject cycl = item_var = methods.funcall_instance_method_with_1_args(entry, GET, $DENOT);
                                if (NIL == member(item_var, all_cycls, EQUAL, symbol_function(IDENTITY))) {
                                    all_cycls = cons(item_var, all_cycls);
                                }
                                if (NIL != valid_query_search_termP(cycl, mt, UNPROVIDED)) {
                                    dictionary_utilities.dictionary_pushnew(results, cycl, superstring, EQUAL, UNPROVIDED);
                                    validP = T;
                                }
                                csome_list_var = csome_list_var.rest();
                                entry = csome_list_var.first();
                            } 
                        }
                        cdolist_list_var_$76 = cdolist_list_var_$76.rest();
                        superstring = cdolist_list_var_$76.first();
                    } 
                } else {
                    cdestructuring_bind_error(datum, $list314);
                }
                cdolist_list_var = cdolist_list_var.rest();
                superstrings_and_location = cdolist_list_var.first();
            } 
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(results)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject cycl2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject strings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                valid_cycls = cons(cycl2, valid_cycls);
                valid_strings = cons(Sort.sort(strings, $sym315$_, LENGTH).first(), valid_strings);
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            format(out, $str316$__Unfiltered_Cycls_for_Superstrin, all_cycls);
            format(out, $str317$__Filtered_Superstrings_____S__, valid_strings);
            format(out, $str318$__Filtered_Cycls_____S__, valid_cycls);
        } finally {
            $current_cae_task$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject filtered_terms_from_cae_query(final SubLObject string, SubLObject mt, SubLObject lexicon) {
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        if (lexicon == UNPROVIDED) {
            lexicon = get_cae_query_search_lexicon(UNPROVIDED);
        }
        final SubLObject token_list = terms_from_cae_query(string, lexicon);
        return filter_terms_from_cae_query(token_list, mt);
    }

    public static SubLObject filter_terms_from_cae_query(final SubLObject token_records, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        SubLObject filtered_token_records = NIL;
        SubLObject cdolist_list_var = token_records;
        SubLObject token_record = NIL;
        token_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject term_list = token_record_denotations(token_record);
            SubLObject bad_denots = NIL;
            SubLObject cdolist_list_var_$77 = term_list;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var_$77.first();
            while (NIL != cdolist_list_var_$77) {
                if (NIL == valid_query_search_termP(v_term, mt, UNPROVIDED)) {
                    bad_denots = cons(v_term, bad_denots);
                }
                cdolist_list_var_$77 = cdolist_list_var_$77.rest();
                v_term = cdolist_list_var_$77.first();
            } 
            if (NIL != list_utilities.greater_length_p(term_list, bad_denots)) {
                if (NIL != list_utilities.empty_list_p(bad_denots)) {
                    filtered_token_records = cons(token_record, filtered_token_records);
                } else {
                    filtered_token_records = cons(new_token_record(token_record_string(token_record), set_difference(term_list, bad_denots, symbol_function(EQUAL), UNPROVIDED), token_record_offset(token_record), token_record_end(token_record)), filtered_token_records);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            token_record = cdolist_list_var.first();
        } 
        return nreverse(filtered_token_records);
    }

    public static SubLObject get_terms_from_cae_query_search(final SubLObject string, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = get_cae_query_search_lexicon(UNPROVIDED);
        }
        return Mapping.mapcar(TOKEN_RECORD_PLIST, terms_from_cae_query(string, lexicon));
    }

    public static SubLObject terms_from_cae_query(final SubLObject string, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        return terms_from_cae_query_int(string, NIL != lexicon ? lexicon : get_cae_query_search_lexicon(UNPROVIDED), UNPROVIDED);
    }

    public static SubLObject terms_from_cae_query_int_internal(final SubLObject string, final SubLObject lex, SubLObject task) {
        if (task == UNPROVIDED) {
            task = current_cae_task();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $current_cae_task$.currentBinding(thread);
        try {
            $current_cae_task$.bind(task, thread);
            final SubLObject learned_results = methods.funcall_instance_method_with_1_args(lex, LEARN, string);
            SubLObject cdolist_list_var = $cae_query_search_wordifiers$.getGlobalValue();
            SubLObject wordifier = NIL;
            wordifier = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject sentence = document.new_sentence(string, wordifier);
                final SubLObject lexified_sentence = methods.funcall_instance_method_with_1_args(lex, LEXIFY_SENTENCE, sentence);
                SubLObject cdolist_list_var_$78 = document.sentence_yield_exhaustive(lexified_sentence);
                SubLObject word = NIL;
                word = cdolist_list_var_$78.first();
                while (NIL != cdolist_list_var_$78) {
                    final SubLObject denots = terms_from_cae_query_word(word);
                    if (NIL != denots) {
                        final SubLObject offset = document.word_offset(word);
                        final SubLObject end = number_utilities.f_1_(add(offset, document.word_length(word)));
                        final SubLObject item_var = new_token_record(string, denots, offset, end);
                        if (NIL == member(item_var, result, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                            result = cons(item_var, result);
                        }
                    }
                    cdolist_list_var_$78 = cdolist_list_var_$78.rest();
                    word = cdolist_list_var_$78.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                wordifier = cdolist_list_var.first();
            } 
            return list_utilities.delete_subsumed_items(nreverse(result), $sym325$TOKEN_RECORD_SUBSUMES_, UNPROVIDED);
        } finally {
            $current_cae_task$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject terms_from_cae_query_int(final SubLObject string, final SubLObject lex, SubLObject task) {
        if (task == UNPROVIDED) {
            task = current_cae_task();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return terms_from_cae_query_int_internal(string, lex, task);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TERMS_FROM_CAE_QUERY_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TERMS_FROM_CAE_QUERY_INT, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, TERMS_FROM_CAE_QUERY_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(string, lex, task);
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
                    if (lex.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && task.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(terms_from_cae_query_int_internal(string, lex, task)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(string, lex, task));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject token_record_subsumesP(final SubLObject record1, final SubLObject record2) {
        return makeBoolean(token_record_offset(record1).numLE(token_record_offset(record2)) && token_record_end(record1).numGE(token_record_end(record2)));
    }

    public static SubLObject terms_from_cae_query_word(final SubLObject word) {
        final SubLObject word_string = document.word_string(word);
        final SubLObject lex_entries = document.word_info(word);
        SubLObject denots = NIL;
        if (NIL != lexicon_utilities.denots_of_string_stop_word(word_string)) {
            SubLObject cdolist_list_var = lex_entries;
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != lexicon_accessors.genl_posP(methods.funcall_instance_method_with_1_args(entry, GET, $CYC_POS), $$ClosedClassWord, UNPROVIDED)) {
                    final SubLObject item_var = methods.funcall_instance_method_with_1_args(entry, GET, $DENOT);
                    if (NIL == member(item_var, denots, symbol_function(EQL), symbol_function(IDENTITY))) {
                        denots = cons(item_var, denots);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
        } else {
            SubLObject cdolist_list_var = lex_entries;
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject item_var = methods.funcall_instance_method_with_1_args(entry, GET, $DENOT);
                if (NIL == member(item_var, denots, symbol_function(EQL), symbol_function(IDENTITY))) {
                    denots = cons(item_var, denots);
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
        }
        if (NIL != denots) {
            denots = cae_query_search_augment_denot_list(denots);
            return denots;
        }
        return NIL;
    }

    public static SubLObject get_semtrans_fragments_for_string(final SubLObject string, final SubLObject terms, final SubLObject mt, final SubLObject variable_format, final SubLObject standard_fragments) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fragments = NIL;
        final SubLObject _prev_bind_0 = semtrans_lexicon.$manufacture_semtrans_assertionsP$.currentBinding(thread);
        try {
            semtrans_lexicon.$manufacture_semtrans_assertionsP$.bind(NIL, thread);
            final SubLObject lex = semtrans_lexicon.new_semtrans_lexicon();
            final SubLObject sentence = document.new_sentence(string, FST_STRING_WORDIFY);
            final SubLObject lexified_sentence = methods.funcall_instance_method_with_1_args(lex, LEXIFY_SENTENCE, sentence);
            SubLObject cdolist_list_var = document.sentence_yield_exhaustive(lexified_sentence);
            SubLObject word = NIL;
            word = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject offset = document.word_offset(word);
                final SubLObject end = number_utilities.f_1_(add(offset, document.word_length(word)));
                final SubLObject lex_entries = document.word_info(word);
                final SubLObject category = $SEMTRANS;
                SubLObject justification = NIL;
                SubLObject cdolist_list_var_$79 = lex_entries;
                SubLObject entry = NIL;
                entry = cdolist_list_var_$79.first();
                while (NIL != cdolist_list_var_$79) {
                    final SubLObject formula = convert_keywords_to_variables(methods.funcall_instance_method_with_1_args(entry, GET, $SEMTRANS));
                    final SubLObject gloss = (NIL != el_formula_p(formula)) ? generate_query_search_gloss_template(formula, variable_format, $DECLARATIVE, UNPROVIDED, UNPROVIDED) : NIL;
                    if ((NIL != el_formula_p(formula)) && (NIL != list_utilities.every_in_list($sym330$VALID_QUERY_SEARCH_TERM_, remove_if($sym85$EL_VAR_, list_utilities.flatten(formula), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED))) {
                        justification = cons($SEMTRANS, abstract_lexicon.lex_entry_trie_entry(entry));
                        final SubLObject new_fragment = new_cae_query_search_fragment(formula, gloss, category, justification, offset, end, UNPROVIDED);
                        if (NIL == find(new_fragment, standard_fragments, $sym165$FRAGMENT_FORMULAS_EQUAL_, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            fragments = cons(new_fragment, fragments);
                        }
                    }
                    cdolist_list_var_$79 = cdolist_list_var_$79.rest();
                    entry = cdolist_list_var_$79.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            } 
            cdolist_list_var = fragments;
            SubLObject fragment = NIL;
            fragment = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject all_new_fragments = NIL;
                final SubLObject cleaned_terms = remove_if($sym160$TRIGGER_ONLY_TERM_, terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject new_fragments = try_substitutions(cleaned_terms, list(fragment), cae_default_wff_checking_mt(UNPROVIDED), variable_format, T, T, UNPROVIDED);
                if (NIL == list_utilities.lengthG(new_fragments, THREE_INTEGER, UNPROVIDED)) {
                    all_new_fragments = append(new_fragments, all_new_fragments);
                }
                cdolist_list_var = cdolist_list_var.rest();
                fragment = cdolist_list_var.first();
            } 
        } finally {
            semtrans_lexicon.$manufacture_semtrans_assertionsP$.rebind(_prev_bind_0, thread);
        }
        return delete_duplicates(fragments, EQUAL, CAE_QUERY_SEARCH_FRAGMENT_FORMULA, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject convert_keywords_to_variables(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_result = NIL;
        SubLObject new_key_vars = NIL;
        final SubLObject _prev_bind_0 = $new_keyword_vars$.currentBinding(thread);
        try {
            $new_keyword_vars$.bind(NIL, thread);
            new_result = cycl_utilities.expression_transform(obj, KEYWORDP, VAR_FROM_KEYWORD, UNPROVIDED, UNPROVIDED);
            new_key_vars = $new_keyword_vars$.getDynamicValue(thread);
        } finally {
            $new_keyword_vars$.rebind(_prev_bind_0, thread);
        }
        return values(new_result, remove_duplicates(new_key_vars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject var_from_keyword(final SubLObject keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        result = cycl_variables.make_el_var(princ_to_string(keyword));
        if (NIL != result) {
            $new_keyword_vars$.setDynamicValue(cons(result, $new_keyword_vars$.getDynamicValue(thread)), thread);
        }
        return result;
    }

    public static SubLObject get_cae_query_search_lexicon(SubLObject task) {
        if (task == UNPROVIDED) {
            task = current_cae_task();
        }
        return get_cae_query_search_lexicon_int(task);
    }

    public static SubLObject clear_get_cae_query_search_lexicon_int() {
        final SubLObject cs = $get_cae_query_search_lexicon_int_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_cae_query_search_lexicon_int(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($get_cae_query_search_lexicon_int_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_cae_query_search_lexicon_int_internal(final SubLObject task) {
        final SubLObject lexicon = object.new_class_instance(TERM_LEXICON);
        methods.funcall_instance_method_with_1_args(lexicon, SET_CASE_SENSITIVITY, $OFF);
        methods.funcall_instance_method_with_1_args(lexicon, SET_BASE_MT, query_library_utils.cae_default_parsing_mt(task));
        methods.funcall_instance_method_with_1_args(lexicon, ADD_LEARNER, STANFORD_NER_DATE_LEARN);
        methods.funcall_instance_method_with_1_args(lexicon, ADD_LEARNER, SCALAR_INTERVAL_LEARN);
        methods.funcall_instance_method_with_1_args(lexicon, ADD_LEARNER, SIMPLE_DATE_LEARN);
        final SubLObject filter_spec = query_library_utils.cae_query_search_filter_specification(task);
        if (NIL != filter_spec) {
            methods.funcall_instance_method_with_1_args(lexicon, ADD_CONCEPT_FILTER_SPEC, filter_spec);
        }
        methods.funcall_instance_method_with_0_args(lexicon, IGNORE_CACHE);
        return lexicon;
    }

    public static SubLObject get_cae_query_search_lexicon_int(final SubLObject task) {
        SubLObject caching_state = $get_cae_query_search_lexicon_int_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_CAE_QUERY_SEARCH_LEXICON_INT, $get_cae_query_search_lexicon_int_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(get_cae_query_search_lexicon_int_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject cae_query_search_augment_denot_list(final SubLObject denot_list) {
        SubLObject resulting_list = denot_list;
        SubLObject cdolist_list_var = denot_list;
        SubLObject denot = NIL;
        denot = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            resulting_list = cconcatenate(get_cae_query_term_augmentations_for_term(denot, UNPROVIDED), resulting_list);
            cdolist_list_var = cdolist_list_var.rest();
            denot = cdolist_list_var.first();
        } 
        return remove_duplicates(resulting_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_cae_query_term_augmentations_for_term(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == dictionary.dictionary_p($cae_query_term_augmentations$.getDynamicValue(thread))) {
            initialize_query_term_augmentations(mt);
        }
        return dictionary.dictionary_lookup($cae_query_term_augmentations$.getDynamicValue(thread), v_term, UNPROVIDED);
    }

    public static SubLObject initialize_query_term_augmentations(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cae_query_term_augmentations$.setDynamicValue(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
        SubLObject cdolist_list_var;
        final SubLObject augmentations = cdolist_list_var = get_cae_query_term_augmentations(mt);
        SubLObject augmentation = NIL;
        augmentation = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = augmentation;
            SubLObject source_term = NIL;
            destructuring_bind_must_consp(current, datum, $list344);
            source_term = current.first();
            current = current.rest();
            SubLObject cdolist_list_var_$80;
            final SubLObject augmentation_terms = cdolist_list_var_$80 = current;
            SubLObject augmentation_term = NIL;
            augmentation_term = cdolist_list_var_$80.first();
            while (NIL != cdolist_list_var_$80) {
                dictionary_utilities.dictionary_pushnew($cae_query_term_augmentations$.getDynamicValue(thread), source_term, augmentation_term, UNPROVIDED, UNPROVIDED);
                cdolist_list_var_$80 = cdolist_list_var_$80.rest();
                augmentation_term = cdolist_list_var_$80.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            augmentation = cdolist_list_var.first();
        } 
        return $cae_query_term_augmentations$.getDynamicValue(thread);
    }

    public static SubLObject get_cae_query_term_augmentations(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        final SubLObject non_davidsonian_terms_and_augmentations = ask_utilities.query_template($list345, $list346, mt, UNPROVIDED);
        final SubLObject semtrans_augmentations = get_cae_query_term_augmentations_from_semtranses(UNPROVIDED, UNPROVIDED);
        return cconcatenate(non_davidsonian_terms_and_augmentations, semtrans_augmentations);
    }

    public static SubLObject get_cae_query_term_augmentations_from_semtranses(SubLObject mt, SubLObject restrict_to_roles_of_type) {
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        if (restrict_to_roles_of_type == UNPROVIDED) {
            restrict_to_roles_of_type = $list347;
        }
        final SubLObject simple_results = ask_utilities.query_template($list348, $list349, $$InferencePSC, UNPROVIDED);
        SubLObject term_and_roles = NIL;
        SubLObject cdolist_list_var = simple_results;
        SubLObject simple_result = NIL;
        simple_result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = simple_result;
            SubLObject coll = NIL;
            SubLObject roles = NIL;
            destructuring_bind_must_consp(current, datum, $list350);
            coll = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list350);
            roles = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject results_for_this_term = list(coll);
                SubLObject cdolist_list_var_$81 = roles.rest();
                SubLObject role = NIL;
                role = cdolist_list_var_$81.first();
                while (NIL != cdolist_list_var_$81) {
                    if (NIL != isa.any_isaP(role, restrict_to_roles_of_type, mt, UNPROVIDED)) {
                        results_for_this_term = cons(role, results_for_this_term);
                    }
                    cdolist_list_var_$81 = cdolist_list_var_$81.rest();
                    role = cdolist_list_var_$81.first();
                } 
                if (NIL != list_utilities.lengthG(results_for_this_term, ONE_INTEGER, UNPROVIDED)) {
                    term_and_roles = cons(nreverse(results_for_this_term), term_and_roles);
                }
            } else {
                cdestructuring_bind_error(datum, $list350);
            }
            cdolist_list_var = cdolist_list_var.rest();
            simple_result = cdolist_list_var.first();
        } 
        return term_and_roles;
    }

    public static SubLObject test_get_fragments_for_string_against_expected_literals_non_blocking(final SubLObject string, final SubLObject expected_literals) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fragment_literals = NIL;
        SubLObject failureP = NIL;
        final SubLObject _prev_bind_0 = $current_cae_task$.currentBinding(thread);
        try {
            $current_cae_task$.bind($const351$GenericIntelligenceAnalysis_CAE_A, thread);
            SubLObject cdolist_list_var = get_fragments_for_string(string, NIL, $$TerrorismCAEGuidanceMt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject fragment = NIL;
            fragment = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                fragment_literals = cons(fragment.first(), fragment_literals);
                cdolist_list_var = cdolist_list_var.rest();
                fragment = cdolist_list_var.first();
            } 
        } finally {
            $current_cae_task$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var2 = expected_literals;
        SubLObject expected_literal = NIL;
        expected_literal = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL == subl_promotions.memberP(expected_literal, fragment_literals, $sym353$EQUALS_EL_, UNPROVIDED)) {
                Errors.warn($str354$Fragment__A_missing_from____clet_, expected_literal, string);
                failureP = T;
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            expected_literal = cdolist_list_var2.first();
        } 
        return failureP;
    }

    public static SubLObject fill_in_gloss_template(final SubLObject gloss_template, final SubLObject variable, final SubLObject token, final SubLObject formula, final SubLObject variable_format, final SubLObject force, final SubLObject offset, final SubLObject end, final SubLObject token_is_paraphraseP) {
        return copy_tree(fill_in_gloss_template_cached(copy_tree(gloss_template), variable, token, formula, variable_format, force, offset, end, token_is_paraphraseP));
    }

    public static SubLObject clear_fill_in_gloss_template_cached() {
        final SubLObject cs = $fill_in_gloss_template_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_fill_in_gloss_template_cached(final SubLObject gloss_template, final SubLObject variable, final SubLObject token, final SubLObject formula, final SubLObject variable_format, final SubLObject force, final SubLObject offset, final SubLObject end, final SubLObject token_is_paraphraseP) {
        return memoization_state.caching_state_remove_function_results_with_args($fill_in_gloss_template_cached_caching_state$.getGlobalValue(), list(new SubLObject[]{ gloss_template, variable, token, formula, variable_format, force, offset, end, token_is_paraphraseP }), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fill_in_gloss_template_cached_internal(final SubLObject gloss_template, final SubLObject variable, final SubLObject token, final SubLObject formula, final SubLObject variable_format, final SubLObject force, final SubLObject offset, final SubLObject end, final SubLObject token_is_paraphraseP) {
        sanity_check_gloss(gloss_template, variable, formula);
        if (NIL != gloss_template) {
            SubLObject string = NIL;
            SubLObject position_map = NIL;
            destructuring_bind_must_consp(gloss_template, gloss_template, $list206);
            string = gloss_template.first();
            final SubLObject current = position_map = gloss_template.rest();
            final SubLObject var_map = (variable_format.eql($BLANKS)) ? NIL : variable_format.eql($XYZ) ? xyz_varmap_for_formula(formula) : mnemonic_varmap_for_formula(formula, UNPROVIDED, UNPROVIDED);
            final SubLObject adjusted_position_map = copy_tree(position_map);
            SubLObject cdolist_list_var = position_info_from_map(position_map);
            SubLObject info = NIL;
            info = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current_$83;
                final SubLObject datum_$82 = current_$83 = info;
                SubLObject this_variable = NIL;
                SubLObject start = NIL;
                SubLObject length = NIL;
                destructuring_bind_must_consp(current_$83, datum_$82, $list358);
                this_variable = current_$83.first();
                current_$83 = current_$83.rest();
                destructuring_bind_must_consp(current_$83, datum_$82, $list358);
                start = current_$83.first();
                current_$83 = length = current_$83.rest();
                final SubLObject term_gloss = (NIL != token_is_paraphraseP) ? token : string_utilities.substring(token, offset, (NIL != end) && (NIL != list_utilities.lengthG(token, end, UNPROVIDED)) ? number_utilities.f_1X(end) : NIL);
                final SubLObject variable_string = gloss_template_string_for_variable(this_variable, variable, term_gloss, var_map, variable_format);
                if (NIL != variable_string) {
                    final SubLObject end_$84 = add(start, length);
                    final SubLObject pre = string_utilities.substring(string, ZERO_INTEGER, start);
                    final SubLObject post = string_utilities.substring(string, end_$84, UNPROVIDED);
                    final SubLObject new_string = cconcatenate(pre, new SubLObject[]{ variable_string, post });
                    final SubLObject variable_string_length = length(variable_string);
                    final SubLObject delta = subtract(variable_string_length, length);
                    string = new_string;
                    if (!delta.isZero()) {
                        SubLObject cdolist_list_var_$85 = adjusted_position_map;
                        SubLObject cons = NIL;
                        cons = cdolist_list_var_$85.first();
                        while (NIL != cdolist_list_var_$85) {
                            SubLObject current_$84;
                            final SubLObject datum_$83 = current_$84 = cons;
                            SubLObject new_map_variable = NIL;
                            SubLObject positions = NIL;
                            destructuring_bind_must_consp(current_$84, datum_$83, $list359);
                            new_map_variable = current_$84.first();
                            current_$84 = current_$84.rest();
                            SubLObject cdolist_list_var_$86;
                            positions = cdolist_list_var_$86 = current_$84;
                            SubLObject position = NIL;
                            position = cdolist_list_var_$86.first();
                            while (NIL != cdolist_list_var_$86) {
                                final SubLObject this_start = position.first();
                                if (this_start.numG(start)) {
                                    rplaca(position, add(this_start, delta));
                                }
                                if (new_map_variable.eql(this_variable)) {
                                    rplacd(position, variable_string_length);
                                }
                                cdolist_list_var_$86 = cdolist_list_var_$86.rest();
                                position = cdolist_list_var_$86.first();
                            } 
                            cdolist_list_var_$85 = cdolist_list_var_$85.rest();
                            cons = cdolist_list_var_$85.first();
                        } 
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                info = cdolist_list_var.first();
            } 
            if (variable_format.eql($XYZ)) {
                string = sort_xyz_paraphrases(string, adjusted_position_map, variable);
            }
            final SubLObject new_gloss_template = cons(string, adjusted_position_map);
            sanity_check_gloss(gloss_template, variable, formula);
            sanity_check_gloss(new_gloss_template, variable, formula);
            return new_gloss_template;
        }
        return generate_query_search_gloss_template(formula, variable_format, force, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fill_in_gloss_template_cached(final SubLObject gloss_template, final SubLObject variable, final SubLObject token, final SubLObject formula, final SubLObject variable_format, final SubLObject force, final SubLObject offset, final SubLObject end, final SubLObject token_is_paraphraseP) {
        SubLObject caching_state = $fill_in_gloss_template_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(FILL_IN_GLOSS_TEMPLATE_CACHED, $fill_in_gloss_template_cached_caching_state$, NIL, EQUAL, NINE_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_9(gloss_template, variable, token, formula, variable_format, force, offset, end, token_is_paraphraseP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (gloss_template.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (variable.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (token.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (formula.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (variable_format.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (force.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (offset.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (end.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && token_is_paraphraseP.equal(cached_args.first())) {
                                                    return memoization_state.caching_results(results2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(fill_in_gloss_template_cached_internal(gloss_template, variable, token, formula, variable_format, force, offset, end, token_is_paraphraseP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(new SubLObject[]{ gloss_template, variable, token, formula, variable_format, force, offset, end, token_is_paraphraseP }));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject position_info_from_map(final SubLObject position_map) {
        SubLObject info = NIL;
        SubLObject cdolist_list_var = position_map;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject this_variable = NIL;
            SubLObject positions = NIL;
            destructuring_bind_must_consp(current, datum, $list361);
            this_variable = current.first();
            current = current.rest();
            SubLObject cdolist_list_var_$89;
            positions = cdolist_list_var_$89 = current;
            SubLObject position = NIL;
            position = cdolist_list_var_$89.first();
            while (NIL != cdolist_list_var_$89) {
                info = cons(cons(this_variable, position), info);
                cdolist_list_var_$89 = cdolist_list_var_$89.rest();
                position = cdolist_list_var_$89.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return Sort.sort(info, symbol_function($sym362$POSITION__), symbol_function(CDR));
    }

    public static SubLObject position_G(final SubLObject pos1, final SubLObject pos2) {
        return numG(pos1.first(), pos2.first());
    }

    public static SubLObject sort_xyz_paraphrases(final SubLObject string, final SubLObject adjusted_position_map, final SubLObject filled_in_var) {
        SubLObject used_vars = NIL;
        final SubLObject new_string = string_utilities.copy_string(string);
        SubLObject positions = NIL;
        SubLObject next_var = next_named_var(used_vars, $sym37$_X);
        SubLObject cdolist_list_var = adjusted_position_map;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject var = NIL;
            SubLObject var_positions = NIL;
            destructuring_bind_must_consp(current, datum, $list365);
            var = current.first();
            current = var_positions = current.rest();
            if (!var.eql(filled_in_var)) {
                SubLObject var_starts = NIL;
                SubLObject cdolist_list_var_$90 = var_positions;
                SubLObject startXlength = NIL;
                startXlength = cdolist_list_var_$90.first();
                while (NIL != cdolist_list_var_$90) {
                    SubLObject current_$92;
                    final SubLObject datum_$91 = current_$92 = startXlength;
                    SubLObject start = NIL;
                    SubLObject length = NIL;
                    destructuring_bind_must_consp(current_$92, datum_$91, $list208);
                    start = current_$92.first();
                    current_$92 = length = current_$92.rest();
                    if (ONE_INTEGER.eql(length)) {
                        final SubLObject item_var = start;
                        if (NIL == member(item_var, var_starts, symbol_function(EQL), symbol_function(IDENTITY))) {
                            var_starts = cons(item_var, var_starts);
                        }
                    }
                    cdolist_list_var_$90 = cdolist_list_var_$90.rest();
                    startXlength = cdolist_list_var_$90.first();
                } 
                if (NIL != var_starts) {
                    positions = cons(Sort.sort(var_starts, symbol_function($sym366$_), UNPROVIDED), positions);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        cdolist_list_var = Sort.sort(positions, symbol_function($sym366$_), symbol_function(FIRST));
        SubLObject starts = NIL;
        starts = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$91 = starts;
            SubLObject start2 = NIL;
            start2 = cdolist_list_var_$91.first();
            while (NIL != cdolist_list_var_$91) {
                string_utilities.set_nth_char(start2, new_string, string_utilities.first_char(cycl_variables.el_var_name_without_prefix(next_var)), UNPROVIDED);
                used_vars = cons(next_var, used_vars);
                next_var = next_named_var(used_vars, $sym37$_X);
                cdolist_list_var_$91 = cdolist_list_var_$91.rest();
                start2 = cdolist_list_var_$91.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            starts = cdolist_list_var.first();
        } 
        return new_string;
    }

    public static SubLObject xyz_varmap_for_formula(final SubLObject formula) {
        final SubLObject used_vars = obsolete.formula_variables(formula, $sym85$EL_VAR_, UNPROVIDED);
        SubLObject var_map = NIL;
        SubLObject list_var = NIL;
        SubLObject var = NIL;
        SubLObject i = NIL;
        list_var = copy_list(used_vars);
        var = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , var = list_var.first() , i = add(ONE_INTEGER, i)) {
            final SubLObject other_vars = remove(var, used_vars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject new_var = next_named_var(other_vars, var);
            if (!var.eql(new_var)) {
                var_map = list_utilities.alist_enter(var_map, var, new_var, UNPROVIDED);
                set_nth(i, used_vars, new_var);
            }
        }
        return var_map;
    }

    public static SubLObject mnemonic_varmap_for_formula(final SubLObject formula, SubLObject language_mt, SubLObject domain_mt) {
        if (language_mt == UNPROVIDED) {
            language_mt = query_library_utils.cae_default_paraphrase_mt(current_cae_task());
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = cae_query_search_default_mt(UNPROVIDED);
        }
        return copy_alist(mnemonic_varmap_for_formula_cached(copy_expression(formula), language_mt, domain_mt));
    }

    public static SubLObject clear_mnemonic_varmap_for_formula_cached() {
        final SubLObject cs = $mnemonic_varmap_for_formula_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_mnemonic_varmap_for_formula_cached(final SubLObject formula, final SubLObject language_mt, final SubLObject domain_mt) {
        return memoization_state.caching_state_remove_function_results_with_args($mnemonic_varmap_for_formula_cached_caching_state$.getGlobalValue(), list(formula, language_mt, domain_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject mnemonic_varmap_for_formula_cached_internal(final SubLObject formula, final SubLObject language_mt, final SubLObject domain_mt) {
        return nth_value_step_2(nth_value_step_1(ONE_INTEGER), optimize_el_formula_variable_names(formula, language_mt, domain_mt, UNPROVIDED));
    }

    public static SubLObject mnemonic_varmap_for_formula_cached(final SubLObject formula, final SubLObject language_mt, final SubLObject domain_mt) {
        SubLObject caching_state = $mnemonic_varmap_for_formula_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(MNEMONIC_VARMAP_FOR_FORMULA_CACHED, $mnemonic_varmap_for_formula_cached_caching_state$, $int$64, EQUAL, THREE_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(formula, language_mt, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (language_mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(mnemonic_varmap_for_formula_cached_internal(formula, language_mt, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(formula, language_mt, domain_mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject gloss_template_string_for_variable(final SubLObject variable, final SubLObject term_variable, final SubLObject term_gloss, final SubLObject var_map, final SubLObject variable_format) {
        if (term_variable.eql(variable)) {
            return term_gloss;
        }
        if (variable_format.eql($BLANKS)) {
            return NIL;
        }
        final SubLObject new_var = list_utilities.alist_lookup_without_values(var_map, variable, symbol_function(EQL), variable);
        assert NIL != cycl_variables.el_varP(new_var) : "cycl_variables.el_varP(new_var) " + "CommonSymbols.NIL != cycl_variables.el_varP(new_var) " + new_var;
        return cycl_variables.el_var_name_without_prefix(new_var);
    }

    public static SubLObject string_from_gloss_template(final SubLObject gloss_template) {
        return gloss_template.first();
    }

    public static SubLObject generate_query_search_gloss_template(SubLObject formula, final SubLObject variable_format, final SubLObject force, SubLObject language_mt, SubLObject domain_mt) {
        if (language_mt == UNPROVIDED) {
            language_mt = query_library_utils.cae_default_paraphrase_mt(current_cae_task());
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = cae_query_search_default_mt(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $cae_query_search_skip_nl_generation$.getDynamicValue(thread)) {
            return NIL;
        }
        while (NIL != el_existential_p(formula)) {
            formula = quantified_sub_sentence(formula);
        } 
        SubLObject gloss = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_blanks_for_varsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_use_smart_variable_replacementP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$pph_consolidate_javalistsP$.currentBinding(thread);
        try {
            pph_vars.$pph_blanks_for_varsP$.bind(eql(variable_format, $BLANKS), thread);
            pph_vars.$pph_quantify_varsP$.bind(NIL, thread);
            pph_vars.$pph_use_smart_variable_replacementP$.bind(T, thread);
            pph_vars.$pph_consolidate_javalistsP$.bind(T, thread);
            final SubLObject javalist = pph_main.generate_phrase_for_java(formula, $DEFAULT, force, language_mt, domain_mt, UNPROVIDED);
            final SubLObject string = (NIL != javalist) ? pph_utilities.pph_javalist_string(javalist) : NIL;
            SubLObject split_positions = NIL;
            if (NIL == javalist) {
                Errors.warn($str370$Unable_to_generate_NL_for__S___No, formula);
            } else {
                SubLObject cdolist_list_var = reverse(pph_utilities.pph_javalist_items(javalist));
                SubLObject javalist_item = NIL;
                javalist_item = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject cycl = pph_utilities.pph_javalist_item_cycl(javalist_item);
                    final SubLObject offset = pph_utilities.pph_javalist_item_start_char(javalist_item);
                    final SubLObject length = length(pph_utilities.pph_javalist_item_string(javalist_item));
                    if (cycl.eql($$TheQuerySearchFocalTerm) || (NIL != cycl_variables.cyc_varP(cycl))) {
                        split_positions = list_utilities.alist_pushnew(split_positions, cycl, cons(offset, length), UNPROVIDED, UNPROVIDED);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    javalist_item = cdolist_list_var.first();
                } 
                gloss = cons(string, split_positions);
            }
        } finally {
            pph_vars.$pph_consolidate_javalistsP$.rebind(_prev_bind_4, thread);
            pph_vars.$pph_use_smart_variable_replacementP$.rebind(_prev_bind_3, thread);
            pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_blanks_for_varsP$.rebind(_prev_bind_0, thread);
        }
        if (NIL != gloss) {
            sanity_check_gloss(gloss, NIL, formula);
        }
        return gloss;
    }

    public static SubLObject used_as_predicateP(final SubLObject variable, final SubLObject sentence) {
        SubLObject cdolist_list_var = cycl_utilities.arg_positions_bfs(variable, sentence, UNPROVIDED);
        SubLObject argpos = NIL;
        argpos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject last_index = last(argpos, UNPROVIDED).first();
            if (ZERO_INTEGER.numE(last_index)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            argpos = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject clear_generate_template_for_isa_constraint_cached() {
        final SubLObject cs = $generate_template_for_isa_constraint_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_generate_template_for_isa_constraint_cached(final SubLObject query_sentence, final SubLObject variable, final SubLObject constraint, final SubLObject variable_format) {
        return memoization_state.caching_state_remove_function_results_with_args($generate_template_for_isa_constraint_cached_caching_state$.getGlobalValue(), list(query_sentence, variable, constraint, variable_format), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject generate_template_for_isa_constraint_cached_internal(final SubLObject query_sentence, final SubLObject variable, final SubLObject constraint, final SubLObject variable_format) {
        return generate_template_for_isa_constraint(query_sentence, variable, constraint, variable_format);
    }

    public static SubLObject generate_template_for_isa_constraint_cached(final SubLObject query_sentence, final SubLObject variable, final SubLObject constraint, final SubLObject variable_format) {
        SubLObject caching_state = $generate_template_for_isa_constraint_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GENERATE_TEMPLATE_FOR_ISA_CONSTRAINT_CACHED, $generate_template_for_isa_constraint_cached_caching_state$, $int$3000, EQUAL, FOUR_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(query_sentence, variable, constraint, variable_format);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (query_sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (variable.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (constraint.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && variable_format.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(generate_template_for_isa_constraint_cached_internal(query_sentence, variable, constraint, variable_format)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(query_sentence, variable, constraint, variable_format));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject generate_template_for_isa_constraint(final SubLObject query_sentence, final SubLObject variable, final SubLObject constraint, final SubLObject variable_format) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $cae_query_search_skip_nl_generation$.getDynamicValue(thread)) || (NIL != used_as_predicateP(variable, query_sentence))) {
            return NIL;
        }
        return generate_query_search_gloss_template(query_sentence, variable_format, $DECLARATIVE, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject generate_template_for_genls_constraint(final SubLObject query_sentence, final SubLObject variable, final SubLObject constraint, final SubLObject variable_format) {
        return generate_template_for_isa_constraint(query_sentence, variable, $$Collection, variable_format);
    }

    public static SubLObject clear_get_variables_of_type_in_formula() {
        final SubLObject cs = $get_variables_of_type_in_formula_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_variables_of_type_in_formula(final SubLObject formula, final SubLObject type, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($get_variables_of_type_in_formula_caching_state$.getGlobalValue(), list(formula, type, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_variables_of_type_in_formula_internal(final SubLObject formula, final SubLObject type, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pattern = list($$isa, $list374, list($AND, $list376, list($GENLS, type)));
        SubLObject vars = NIL;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            thread.resetMultipleValues();
            final SubLObject success = formula_pattern_match.formula_matches_pattern(formula, pattern);
            final SubLObject v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != success) {
                final SubLObject var = list_utilities.alist_lookup_without_values(v_bindings, VAR, UNPROVIDED, UNPROVIDED);
                vars = list(var);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (NIL != list_utilities.empty_list_p(vars)) {
            mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject constraint_formula = at_var_types.formula_variables_arg_constraints(formula, mt, UNPROVIDED);
                SubLObject cdolist_list_var;
                final SubLObject constraints = cdolist_list_var = ((NIL != formula_arityGE(constraint_formula, ONE_INTEGER, UNPROVIDED)) && (NIL != el_conjunction_p(constraint_formula))) ? cycl_utilities.formula_args(constraint_formula, UNPROVIDED) : list(constraint_formula);
                SubLObject constraint = NIL;
                constraint = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject constraint_sentence = constraint;
                    thread.resetMultipleValues();
                    final SubLObject success2 = formula_pattern_match.formula_matches_pattern(constraint_sentence, pattern);
                    final SubLObject v_bindings2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != success2) {
                        final SubLObject var2 = list_utilities.alist_lookup_without_values(v_bindings2, VAR, UNPROVIDED, UNPROVIDED);
                        vars = cons(var2, vars);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    constraint = cdolist_list_var.first();
                } 
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return vars;
    }

    public static SubLObject get_variables_of_type_in_formula(final SubLObject formula, final SubLObject type, final SubLObject mt) {
        SubLObject caching_state = $get_variables_of_type_in_formula_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_VARIABLES_OF_TYPE_IN_FORMULA, $get_variables_of_type_in_formula_caching_state$, NIL, EQUAL, THREE_INTEGER, ZERO_INTEGER);
            memoization_state.register_genls_dependent_cache_clear_callback(CLEAR_GET_VARIABLES_OF_TYPE_IN_FORMULA);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(formula, type, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (type.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_variables_of_type_in_formula_internal(formula, type, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(formula, type, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject cae_fragment_refinements() {
        if (NIL != misc_utilities.uninitialized_p($cae_fragment_refinements$.getGlobalValue())) {
            $cae_fragment_refinements$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        }
        return $cae_fragment_refinements$.getGlobalValue();
    }

    public static SubLObject note_cae_fragment_refinement(final SubLObject query_sentence, final SubLObject derefinement_template, final SubLObject mt) {
        final SubLObject enhanced_query_sentence = cae_canonicalize_query_sentence(query_sentence);
        return dictionary_utilities.dictionary_pushnew(cae_fragment_refinements(), cycl_utilities.hl_to_el(enhanced_query_sentence), cons(mt, derefinement_template), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject cae_canonicalize_query_sentence(final SubLObject query_sentence) {
        SubLObject enhanced_query_sentence = copy_expression(query_sentence);
        final SubLObject vars = sentence_variables(enhanced_query_sentence, UNPROVIDED, UNPROVIDED);
        SubLObject list_var = NIL;
        SubLObject var = NIL;
        SubLObject i = NIL;
        list_var = vars;
        var = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , var = list_var.first() , i = add(ONE_INTEGER, i)) {
            enhanced_query_sentence = cycl_utilities.expression_nsubst(variables.get_variable(i), var, enhanced_query_sentence, UNPROVIDED, UNPROVIDED);
        }
        return enhanced_query_sentence;
    }

    public static SubLObject lookup_cae_fragment_derefinement_template(final SubLObject query_sentence, final SubLObject mt) {
        final SubLObject enhanced_query_sentence = cae_canonicalize_query_sentence(query_sentence);
        final SubLObject data = dictionary.dictionary_lookup_without_values(cae_fragment_refinements(), cycl_utilities.hl_to_el(enhanced_query_sentence), UNPROVIDED);
        SubLObject derefinement_template = $UNKNOWN;
        SubLObject cdolist_list_var = data;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject this_mt = NIL;
            SubLObject this_derefinement_template = NIL;
            destructuring_bind_must_consp(current, datum, $list381);
            this_mt = current.first();
            current = this_derefinement_template = current.rest();
            if (derefinement_template.eql($UNKNOWN)) {
                derefinement_template = this_derefinement_template;
            } else
                if (mt.eql(this_mt)) {
                    derefinement_template = this_derefinement_template;
                }

            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return derefinement_template.eql($UNKNOWN) ? pph_utilities.pph_identity_template() : copy_expression(derefinement_template);
    }

    public static SubLObject cae_derefine(SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject derefinement_template = lookup_cae_fragment_derefinement_template(sentence, $cae_query_translation_ontology_mt$.getDynamicValue(thread));
        if (NIL != derefinement_template) {
            sentence = pph_utilities.pph_apply_template(derefinement_template, sentence);
        }
        return sentence;
    }

    public static SubLObject modify_formula_by_adding_concepts(final SubLObject formula, final SubLObject mt) {
        SubLObject new_formula = formula;
        final SubLObject stack = stacks.create_stack();
        SubLObject literal = NIL;
        stacks.stack_push(formula, stack);
        while (NIL == stacks.stack_empty_p(stack)) {
            final SubLObject entry = stacks.stack_pop(stack);
            if (NIL != literalP(entry)) {
                literal = entry;
                final SubLObject arg0 = cycl_utilities.formula_arg0(literal);
                final SubLObject original_concept = (arg0.eql($$isa)) ? cycl_utilities.formula_arg2(literal, UNPROVIDED) : arg0;
                if (NIL != groundP(original_concept, UNPROVIDED)) {
                    final SubLObject concepts_to_add = concepts_to_add_for_concept(original_concept, mt);
                    final SubLObject position = variable_unification.arg_positions_eql(literal, formula).first();
                    SubLObject cdolist_list_var = concepts_to_add;
                    SubLObject new_concept = NIL;
                    new_concept = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        new_formula = add_concept_to_formula(new_concept, literal, mt, new_formula, position);
                        cdolist_list_var = cdolist_list_var.rest();
                        new_concept = cdolist_list_var.first();
                    } 
                }
            }
            SubLObject cdolist_list_var2 = cycl_utilities.formula_args(entry, UNPROVIDED);
            SubLObject arg2 = NIL;
            arg2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                stacks.stack_push(arg2, stack);
                cdolist_list_var2 = cdolist_list_var2.rest();
                arg2 = cdolist_list_var2.first();
            } 
        } 
        return el_remove_unnecessary_existentials(new_formula);
    }

    public static SubLObject clear_concepts_to_add_for_concept() {
        final SubLObject cs = $concepts_to_add_for_concept_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_concepts_to_add_for_concept(final SubLObject concept, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($concepts_to_add_for_concept_caching_state$.getGlobalValue(), list(concept, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject concepts_to_add_for_concept_internal(final SubLObject concept, final SubLObject mt) {
        return ask_utilities.query_variable($sym383$_NEW_CONCEPT, list($const384$addFormulaFromConceptToFormulasWi, $sym383$_NEW_CONCEPT, concept), mt, UNPROVIDED);
    }

    public static SubLObject concepts_to_add_for_concept(final SubLObject concept, final SubLObject mt) {
        SubLObject caching_state = $concepts_to_add_for_concept_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CONCEPTS_TO_ADD_FOR_CONCEPT, $concepts_to_add_for_concept_caching_state$, $int$256, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_CONCEPTS_TO_ADD_FOR_CONCEPT);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(concept, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (concept.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(concepts_to_add_for_concept_internal(concept, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(concept, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject add_concept_to_formula(final SubLObject new_concept, SubLObject literal, final SubLObject mt, SubLObject new_formula, SubLObject position) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject original_new_formula = new_formula;
        SubLObject new_fragment = query_library_api.create_formula_from_term(new_concept, mt, NIL);
        thread.resetMultipleValues();
        final SubLObject combined_formula = query_library_api.combine_formulas_at_position_int(new_formula, new_fragment, position, NIL, mt);
        final SubLObject old_variable_renames = thread.secondMultipleValue();
        final SubLObject new_variable_renames = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        new_formula = combined_formula;
        literal = bindings.apply_bindings(old_variable_renames, literal);
        final SubLObject original_new_fragment;
        new_fragment = original_new_fragment = bindings.apply_bindings(new_variable_renames, new_fragment);
        SubLObject unifications = variable_unification.attempt_to_combine_variables_in_complex_combination(new_formula, original_new_fragment, literal, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        new_formula = bindings.apply_bindings(unifications, new_formula);
        new_fragment = bindings.apply_bindings(unifications, new_fragment);
        unifications = variable_unification.attempt_to_combine_variables_in_complex_combination(new_formula, original_new_fragment, new_formula, mt, T, UNPROVIDED, UNPROVIDED);
        new_formula = bindings.apply_bindings(unifications, new_formula);
        new_fragment = bindings.apply_bindings(unifications, new_fragment);
        final SubLObject redundant_literals = variable_unification.find_redundant_literals(new_formula, mt);
        if ((NIL != find(new_fragment, redundant_literals, symbol_function(EQUAL), symbol_function(CAR), UNPROVIDED, UNPROVIDED)) || (NIL != find(new_fragment, redundant_literals, symbol_function(EQUAL), symbol_function(CDR), UNPROVIDED, UNPROVIDED))) {
            new_formula = original_new_formula;
        }
        return new_formula;
    }

    public static SubLObject clear_get_types_to_existentially_bind() {
        final SubLObject cs = $get_types_to_existentially_bind_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_types_to_existentially_bind(final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($get_types_to_existentially_bind_caching_state$.getGlobalValue(), list(mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_types_to_existentially_bind_internal(final SubLObject mt) {
        final SubLObject types = ask_utilities.query_variable($sym390$_TYPE, $list391, mt, $list230);
        return types;
    }

    public static SubLObject get_types_to_existentially_bind(final SubLObject mt) {
        SubLObject caching_state = $get_types_to_existentially_bind_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_TYPES_TO_EXISTENTIALLY_BIND, $get_types_to_existentially_bind_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(get_types_to_existentially_bind_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject existentially_bind_types(final SubLObject formula, final SubLObject mt) {
        SubLObject new_formula = formula;
        SubLObject cdolist_list_var;
        final SubLObject types = cdolist_list_var = get_types_to_existentially_bind(mt);
        SubLObject type = NIL;
        type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$94 = get_variables_of_type_in_formula(formula, type, mt);
            SubLObject variable = NIL;
            variable = cdolist_list_var_$94.first();
            while (NIL != cdolist_list_var_$94) {
                new_formula = make_existential(variable, new_formula);
                cdolist_list_var_$94 = cdolist_list_var_$94.rest();
                variable = cdolist_list_var_$94.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        } 
        return new_formula;
    }

    public static SubLObject refine_sentence(final SubLObject original_sentence, final SubLObject mt) {
        SubLObject derefinement_template = pph_utilities.pph_identity_template();
        SubLObject new_sentence = modify_formula_by_adding_concepts(original_sentence, mt);
        new_sentence = existentially_bind_types(new_sentence, mt);
        if (!original_sentence.equal(new_sentence)) {
            derefinement_template = original_sentence;
            final SubLObject arg_position = cycl_utilities.arg_positions_dfs(original_sentence, new_sentence, symbol_function(EQUAL)).first();
            if (NIL != arg_position) {
                derefinement_template = pph_utilities.pph_cycl_template_from_arg_position(arg_position);
            }
        }
        if (NIL == pph_utilities.pph_identity_template_p(derefinement_template)) {
            note_cae_fragment_refinement(new_sentence, derefinement_template, mt);
        }
        return new_sentence;
    }

    public static SubLObject refine_fragment(final SubLObject fragment, final SubLObject mt) {
        final SubLObject original_query_sentence = fragment.first();
        final SubLObject new_query_sentence = refine_sentence(original_query_sentence, mt);
        return cons(new_query_sentence, fragment.rest());
    }

    public static SubLObject tooltip_terms_for_sentence(final SubLObject sentence) {
        if (NIL != el_formula_with_any_of_operators_p(sentence, $list393)) {
            return remove_duplicates(Mapping.mapcan(symbol_function(TOOLTIP_TERMS_FOR_SENTENCE), cycl_utilities.formula_args(sentence, UNPROVIDED), EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != el_formula_with_any_of_operators_p(sentence, $list395)) {
            return tooltip_terms_for_sentence(cycl_utilities.formula_arg1(sentence, UNPROVIDED));
        }
        if (NIL != el_formula_with_operator_p(sentence, $$thereExists)) {
            return tooltip_terms_for_sentence(cycl_utilities.formula_arg2(sentence, UNPROVIDED));
        }
        if ((NIL != el_formula_with_operator_p(sentence, $$isa)) && (NIL != forts.fort_p(cycl_utilities.formula_arg2(sentence, UNPROVIDED)))) {
            return list(cycl_utilities.formula_arg2(sentence, UNPROVIDED));
        }
        if (NIL != forts.fort_p(cycl_utilities.formula_arg0(sentence))) {
            return list(cycl_utilities.formula_arg0(sentence));
        }
        return NIL;
    }

    public static SubLObject tooltip_for_sentence(final SubLObject sentence, final SubLObject mt) {
        final SubLObject terms = tooltip_terms_for_sentence(sentence);
        final SubLObject comments = Mapping.mapcar(symbol_function(COMMENT), terms, new SubLObject[]{ make_list(length(sentence.rest()), mt) });
        final SubLObject comment_string = string_utilities.join_strings(remove_if(symbol_function(NULL), comments, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), cconcatenate(format_nil.$format_nil_percent$.getGlobalValue(), format_nil.$format_nil_percent$.getGlobalValue()));
        return comment_string;
    }

    public static SubLObject tooltip_for_query_search_sentence(final SubLObject sentence, final SubLObject mt) {
        final SubLObject derefinement_template = lookup_cae_fragment_derefinement_template(sentence, mt);
        final SubLObject original_sentence = pph_utilities.pph_apply_template(derefinement_template, sentence);
        return tooltip_for_sentence(original_sentence, mt);
    }

    public static SubLObject write_terms_from_cae_query(final SubLObject query_string, final SubLObject output_stream) {
        format(output_stream, $str400$_A__, query_string);
        SubLObject cdolist_list_var = terms_from_cae_query(query_string, UNPROVIDED);
        SubLObject term_info = NIL;
        term_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject term_string = token_record_string(term_info);
            final SubLObject cyc_terms = token_record_denotations(term_info);
            format(output_stream, $str401$_____A__, term_string);
            SubLObject cdolist_list_var_$95 = cyc_terms;
            SubLObject cyc_term = NIL;
            cyc_term = cdolist_list_var_$95.first();
            while (NIL != cdolist_list_var_$95) {
                format(output_stream, $str402$_A_, cyc_term);
                cdolist_list_var_$95 = cdolist_list_var_$95.rest();
                cyc_term = cdolist_list_var_$95.first();
            } 
            format(output_stream, $str403$__);
            cdolist_list_var = cdolist_list_var.rest();
            term_info = cdolist_list_var.first();
        } 
        return $DONE;
    }

    public static SubLObject write_terms_from_cae_queries_to_file(final SubLObject query_strings, final SubLObject output_file) {
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(output_file, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str406$Unable_to_open__S, output_file);
            }
            final SubLObject s_out = stream;
            SubLObject list_var = NIL;
            SubLObject query_string = NIL;
            SubLObject query_index = NIL;
            list_var = query_strings;
            query_string = list_var.first();
            for (query_index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , query_string = list_var.first() , query_index = add(ONE_INTEGER, query_index)) {
                format(s_out, $str407$_A__, number_utilities.f_1X(query_index));
                write_terms_from_cae_query(query_string, s_out);
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
        return $DONE;
    }

    public static SubLObject debug_query_search_string(final SubLObject raw_string, SubLObject task, SubLObject must_include_all_tokensP, SubLObject out, SubLObject combine_fragmentsP) {
        if (task == UNPROVIDED) {
            task = $const312$GenericMedicalResearchTask_Allotm;
        }
        if (must_include_all_tokensP == UNPROVIDED) {
            must_include_all_tokensP = NIL;
        }
        if (out == UNPROVIDED) {
            out = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (combine_fragmentsP == UNPROVIDED) {
            combine_fragmentsP = $cae_combine_fragmentsP$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject _prev_bind_0_$96 = $cae_include_semtrans_fragmentsP$.currentBinding(thread);
                try {
                    $cae_include_semtrans_fragmentsP$.bind(NIL, thread);
                    final SubLObject string = string_utilities.strip_chars_meeting_test(raw_string, UNPROVIDED);
                    final SubLObject terms = terms_from_cae_query(string, UNPROVIDED);
                    final SubLObject _prev_bind_0_$97 = $current_cae_task$.currentBinding(thread);
                    try {
                        $current_cae_task$.bind(task, thread);
                        final SubLObject valid_terms = filtered_terms_from_cae_query(string, UNPROVIDED, UNPROVIDED);
                        final SubLObject fragments = get_fragments_for_string(string, must_include_all_tokensP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        format(out, $str408$String___A__, string);
                        format(out, $str409$Terms_Found___);
                        SubLObject cdolist_list_var = terms;
                        SubLObject v_term = NIL;
                        v_term = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            format(out, $str410$___S_____S__, token_record_focal_string(v_term), token_record_denotations(v_term));
                            cdolist_list_var = cdolist_list_var.rest();
                            v_term = cdolist_list_var.first();
                        } 
                        format(out, $str411$Valid_Terms_Found___);
                        cdolist_list_var = valid_terms;
                        SubLObject valid_term = NIL;
                        valid_term = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject string_$98 = token_record_focal_string(valid_term);
                            final SubLObject denots = token_record_denotations(valid_term);
                            format(out, $str410$___S_____S__, string_$98, denots);
                            final SubLObject augmented = possibly_augment_query_search_terms(denots, UNPROVIDED);
                            if (NIL != list_utilities.sets_equal_equalP(denots, augmented)) {
                                format(out, $str412$____No_added_terms___);
                            } else {
                                format(out, $str413$____Added_terms___S__, set_difference(augmented, denots, symbol_function(EQUAL), UNPROVIDED));
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            valid_term = cdolist_list_var.first();
                        } 
                        format(out, $str414$Fragments___);
                        cdolist_list_var = fragments;
                        SubLObject fragment = NIL;
                        fragment = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject sentence = cae_query_search_fragment_formula(fragment);
                            final SubLObject gloss = cae_query_search_fragment_gloss(fragment);
                            final SubLObject category = cae_query_search_fragment_category(fragment);
                            final SubLObject justification = cae_query_search_fragment_justification(fragment);
                            format(out, $str415$_____S___S____because__S_______A_, new SubLObject[]{ sentence, category, justification, string_from_gloss_template(gloss) });
                            final SubLObject second_pass_gloss_javalist = get_gloss_for_indexed_query(sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            final SubLObject second_pass_gloss = (NIL != pph_utilities.pph_javalist_p(second_pass_gloss_javalist)) ? pph_utilities.pph_javalist_string(second_pass_gloss_javalist) : NIL;
                            if (!second_pass_gloss.equal(string_from_gloss_template(gloss))) {
                                format(out, $str416$_____Second_pass_gloss________A__, second_pass_gloss);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            fragment = cdolist_list_var.first();
                        } 
                        if (NIL != combine_fragmentsP) {
                            format(out, $str417$Fragment_combinations___);
                            SubLObject cdolist_list_var2;
                            final SubLObject combined_fragments = cdolist_list_var2 = combine_cae_fragments(fragments);
                            SubLObject combo = NIL;
                            combo = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                final SubLObject sentence2 = cae_query_search_fragment_formula(combo);
                                format(out, $str418$_____S__, sentence2);
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                combo = cdolist_list_var2.first();
                            } 
                        }
                    } finally {
                        $current_cae_task$.rebind(_prev_bind_0_$97, thread);
                    }
                } finally {
                    $cae_include_semtrans_fragmentsP$.rebind(_prev_bind_0_$96, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$98 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$98, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject debug_query_search_strings(SubLObject must_include_all_tokensP, SubLObject out) {
        if (must_include_all_tokensP == UNPROVIDED) {
            must_include_all_tokensP = NIL;
        }
        if (out == UNPROVIDED) {
            out = T;
        }
        SubLObject cdolist_list_var = get_scheuer_qs();
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            debug_query_search_string(sentence, must_include_all_tokensP, out, $$TerrorismRecommendedWffCheckingMt, UNPROVIDED);
            format(out, $str403$__);
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject test_replacement_parsing() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject terms_and_strings = ask_utilities.query_template($list92, $list420, $$InferencePSC, UNPROVIDED);
        SubLObject missing = NIL;
        final SubLObject list_var = terms_and_strings;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$cdolist, thread);
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
                SubLObject term_and_strings = NIL;
                term_and_strings = csome_list_var.first();
                while (NIL != csome_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = term_and_strings;
                    SubLObject v_term = NIL;
                    SubLObject strings = NIL;
                    destructuring_bind_must_consp(current, datum, $list422);
                    v_term = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list422);
                    strings = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        SubLObject cdolist_list_var = strings;
                        SubLObject string = NIL;
                        string = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL == find(v_term, terms_from_cae_query(string, UNPROVIDED), symbol_function($sym423$MEMBER_), symbol_function(TOKEN_RECORD_DENOTATIONS), UNPROVIDED, UNPROVIDED)) {
                                missing = cons(list(string, v_term), missing);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            string = cdolist_list_var.first();
                        } 
                    } else {
                        cdestructuring_bind_error(datum, $list422);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    term_and_strings = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$100 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$100, thread);
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
        return missing;
    }

    public static SubLObject get_scheuer_qs() {
        return $list425;
    }

    public static SubLObject decision_tree_concept_filter_builds_successfully(final SubLObject filter_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject failure_string = NIL;
        thread.resetMultipleValues();
        final SubLObject filter_string = term_classification_tree_info(filter_term);
        final SubLObject _prev_bind_0 = term_classification_tree.$term_classification_tree$.currentBinding(thread);
        final SubLObject _prev_bind_2 = term_classification_tree.$term_classification_tree_collections$.currentBinding(thread);
        try {
            term_classification_tree.$term_classification_tree$.bind(thread.secondMultipleValue(), thread);
            term_classification_tree.$term_classification_tree_collections$.bind(thread.thirdMultipleValue(), thread);
            thread.resetMultipleValues();
            if (((!filter_string.isString()) || ((NIL == term_classification_tree.$term_classification_tree$.getDynamicValue(thread)) && (NIL == term_classification_tree.initialize_term_classification_tree(filter_string)))) || ((NIL == term_classification_tree.$term_classification_tree_collections$.getDynamicValue(thread)) && (NIL == term_classification_tree.initialize_term_classification_tree_collections()))) {
                failure_string = cconcatenate($str426$Bad_filter_string__, filter_string);
            }
            if (NIL == failure_string) {
                SubLObject csome_list_var = term_classification_tree.$term_classification_tree_collections$.getDynamicValue(thread);
                SubLObject col = NIL;
                col = csome_list_var.first();
                while ((NIL == failure_string) && (NIL != csome_list_var)) {
                    if (!term_classification_tree.tree_term_from_constant(col).isString()) {
                        failure_string = cconcatenate($str427$Couldn_t_find_a_constant_for_, string_utilities.str(col));
                    }
                    csome_list_var = csome_list_var.rest();
                    col = csome_list_var.first();
                } 
            }
        } finally {
            term_classification_tree.$term_classification_tree_collections$.rebind(_prev_bind_2, thread);
            term_classification_tree.$term_classification_tree$.rebind(_prev_bind_0, thread);
        }
        return NIL != failure_string ? failure_string : T;
    }

    public static SubLObject justified_interpretation_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        ji_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject justified_interpretation_p(final SubLObject v_object) {
        return v_object.getClass() == cae_query_search.$justified_interpretation_native.class ? T : NIL;
    }

    public static SubLObject ji_cycl(final SubLObject v_object) {
        assert NIL != justified_interpretation_p(v_object) : "cae_query_search.justified_interpretation_p(v_object) " + "CommonSymbols.NIL != cae_query_search.justified_interpretation_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject ji_words(final SubLObject v_object) {
        assert NIL != justified_interpretation_p(v_object) : "cae_query_search.justified_interpretation_p(v_object) " + "CommonSymbols.NIL != cae_query_search.justified_interpretation_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject ji_arg_records(final SubLObject v_object) {
        assert NIL != justified_interpretation_p(v_object) : "cae_query_search.justified_interpretation_p(v_object) " + "CommonSymbols.NIL != cae_query_search.justified_interpretation_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_ji_cycl(final SubLObject v_object, final SubLObject value) {
        assert NIL != justified_interpretation_p(v_object) : "cae_query_search.justified_interpretation_p(v_object) " + "CommonSymbols.NIL != cae_query_search.justified_interpretation_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_ji_words(final SubLObject v_object, final SubLObject value) {
        assert NIL != justified_interpretation_p(v_object) : "cae_query_search.justified_interpretation_p(v_object) " + "CommonSymbols.NIL != cae_query_search.justified_interpretation_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_ji_arg_records(final SubLObject v_object, final SubLObject value) {
        assert NIL != justified_interpretation_p(v_object) : "cae_query_search.justified_interpretation_p(v_object) " + "CommonSymbols.NIL != cae_query_search.justified_interpretation_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_justified_interpretation(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new cae_query_search.$justified_interpretation_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CYCL)) {
                _csetf_ji_cycl(v_new, current_value);
            } else
                if (pcase_var.eql($WORDS)) {
                    _csetf_ji_words(v_new, current_value);
                } else
                    if (pcase_var.eql($ARG_RECORDS)) {
                        _csetf_ji_arg_records(v_new, current_value);
                    } else {
                        Errors.error($str452$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_justified_interpretation(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_JUSTIFIED_INTERPRETATION, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CYCL, ji_cycl(obj));
        funcall(visitor_fn, obj, $SLOT, $WORDS, ji_words(obj));
        funcall(visitor_fn, obj, $SLOT, $ARG_RECORDS, ji_arg_records(obj));
        funcall(visitor_fn, obj, $END, MAKE_JUSTIFIED_INTERPRETATION, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_justified_interpretation_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_justified_interpretation(obj, visitor_fn);
    }

    public static SubLObject new_justified_interpretation(final SubLObject cycl, final SubLObject words, final SubLObject arg_records) {
        assert NIL != el_formula_p(cycl) : "el_utilities.el_formula_p(cycl) " + "CommonSymbols.NIL != el_utilities.el_formula_p(cycl) " + cycl;
        assert NIL != list_utilities.non_dotted_list_p(words) : "list_utilities.non_dotted_list_p(words) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(words) " + words;
        SubLObject cdolist_list_var = words;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != document.word_p(elem) : "document.word_p(elem) " + "CommonSymbols.NIL != document.word_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != list_utilities.non_dotted_list_p(arg_records) : "list_utilities.non_dotted_list_p(arg_records) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(arg_records) " + arg_records;
        cdolist_list_var = arg_records;
        elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != term_record_p(elem) : "cae_query_search.term_record_p(elem) " + "CommonSymbols.NIL != cae_query_search.term_record_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject ji = make_justified_interpretation(UNPROVIDED);
        _csetf_ji_cycl(ji, cycl);
        _csetf_ji_words(ji, words);
        _csetf_ji_arg_records(ji, arg_records);
        return ji;
    }

    public static SubLObject ji_print(final SubLObject ji, final SubLObject stream, final SubLObject depth) {
        final SubLObject trw = term_record_word(ji_arg1(ji));
        write_string($str462$__JI_, stream, UNPROVIDED, UNPROVIDED);
        if (NIL != trw) {
            write_string(document.word_string(trw), stream, UNPROVIDED, UNPROVIDED);
        } else {
            princ(trw, stream);
        }
        write_string($str463$_, stream, UNPROVIDED, UNPROVIDED);
        if (NIL != trw) {
            princ(document.word_index(trw), stream);
        } else {
            princ($str464$_, stream);
        }
        write_string($str465$___, stream, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = ji_words(ji);
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
            write_string(document.word_string(word), stream, UNPROVIDED, UNPROVIDED);
            write_string($str463$_, stream, UNPROVIDED, UNPROVIDED);
            princ(document.word_index(word), stream);
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        cdolist_list_var = ji_arg_records(ji).rest();
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject word2 = term_record_word(arg);
            write_string($str465$___, stream, UNPROVIDED, UNPROVIDED);
            if (NIL != word2) {
                write_string(document.word_string(word2), stream, UNPROVIDED, UNPROVIDED);
            } else {
                princ(word2, UNPROVIDED);
            }
            write_string($str463$_, stream, UNPROVIDED, UNPROVIDED);
            if (NIL != word2) {
                princ(document.word_index(word2), stream);
            } else {
                princ($str464$_, stream);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        write_string($str466$__, stream, UNPROVIDED, UNPROVIDED);
        princ(ji_cycl(ji), stream);
        write_string($str467$_, stream, UNPROVIDED, UNPROVIDED);
        return ji;
    }

    public static SubLObject ji_index(final SubLObject ji) {
        final SubLObject first_word = ji_words(ji).first();
        final SubLObject last_word = last(ji_words(ji), UNPROVIDED).first();
        return cons(document.word_index(first_word), document.word_index(last_word));
    }

    public static SubLObject ji_left_index(final SubLObject ji) {
        return ji_index(ji).first();
    }

    public static SubLObject ji_right_index(final SubLObject ji) {
        return ji_index(ji).rest();
    }

    public static SubLObject ji_arg1(final SubLObject ji) {
        return ji_arg_records(ji).first();
    }

    public static SubLObject ji_arg2(final SubLObject ji) {
        return second(ji_arg_records(ji));
    }

    public static SubLObject ji_arg3(final SubLObject ji) {
        return third(ji_arg_records(ji));
    }

    public static SubLObject ji_tokens(final SubLObject ji) {
        return append(ji_words(ji), Mapping.mapcar(TERM_RECORD_WORD, ji_arg_records(ji)));
    }

    public static SubLObject term_record_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        term_record_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject term_record_p(final SubLObject v_object) {
        return v_object.getClass() == cae_query_search.$term_record_native.class ? T : NIL;
    }

    public static SubLObject term_record_term(final SubLObject v_object) {
        assert NIL != term_record_p(v_object) : "cae_query_search.term_record_p(v_object) " + "CommonSymbols.NIL != cae_query_search.term_record_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject term_record_word(final SubLObject v_object) {
        assert NIL != term_record_p(v_object) : "cae_query_search.term_record_p(v_object) " + "CommonSymbols.NIL != cae_query_search.term_record_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject term_record_literal(final SubLObject v_object) {
        assert NIL != term_record_p(v_object) : "cae_query_search.term_record_p(v_object) " + "CommonSymbols.NIL != cae_query_search.term_record_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_term_record_term(final SubLObject v_object, final SubLObject value) {
        assert NIL != term_record_p(v_object) : "cae_query_search.term_record_p(v_object) " + "CommonSymbols.NIL != cae_query_search.term_record_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_term_record_word(final SubLObject v_object, final SubLObject value) {
        assert NIL != term_record_p(v_object) : "cae_query_search.term_record_p(v_object) " + "CommonSymbols.NIL != cae_query_search.term_record_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_term_record_literal(final SubLObject v_object, final SubLObject value) {
        assert NIL != term_record_p(v_object) : "cae_query_search.term_record_p(v_object) " + "CommonSymbols.NIL != cae_query_search.term_record_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_term_record(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new cae_query_search.$term_record_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TERM)) {
                _csetf_term_record_term(v_new, current_value);
            } else
                if (pcase_var.eql($WORD)) {
                    _csetf_term_record_word(v_new, current_value);
                } else
                    if (pcase_var.eql($LITERAL)) {
                        _csetf_term_record_literal(v_new, current_value);
                    } else {
                        Errors.error($str452$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_term_record(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_TERM_RECORD, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TERM, term_record_term(obj));
        funcall(visitor_fn, obj, $SLOT, $WORD, term_record_word(obj));
        funcall(visitor_fn, obj, $SLOT, $LITERAL, term_record_literal(obj));
        funcall(visitor_fn, obj, $END, MAKE_TERM_RECORD, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_term_record_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_term_record(obj, visitor_fn);
    }

    public static SubLObject new_term_record(final SubLObject v_term, final SubLObject word, SubLObject literal) {
        if (literal == UNPROVIDED) {
            literal = NIL;
        }
        final SubLObject tr = make_term_record(UNPROVIDED);
        _csetf_term_record_term(tr, v_term);
        _csetf_term_record_word(tr, word);
        _csetf_term_record_literal(tr, literal);
        return tr;
    }

    public static SubLObject term_record_ref(final SubLObject record) {
        return document.word_category(term_record_word(record));
    }

    public static SubLObject term_record_index(final SubLObject record) {
        final SubLObject word = term_record_word(record);
        if (NIL != word) {
            return document.word_index(word);
        }
        return NIL;
    }

    public static SubLObject term_record_print(final SubLObject record, final SubLObject stream, final SubLObject depth) {
        write_string($str487$__TR_, stream, UNPROVIDED, UNPROVIDED);
        princ(term_record_term(record), stream);
        write_string($str463$_, stream, UNPROVIDED, UNPROVIDED);
        princ(term_record_literal(record), stream);
        write_string($str467$_, stream, UNPROVIDED, UNPROVIDED);
        return record;
    }

    public static SubLObject term_record_equal(final SubLObject tr1, final SubLObject tr2) {
        return makeBoolean(term_record_term(tr1).equal(term_record_term(tr2)) && term_record_word(tr1).equal(term_record_word(tr2)));
    }

    public static SubLObject initialize_cae_query_translation() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $current_cae_task$.currentBinding(thread);
        try {
            $current_cae_task$.bind($const312$GenericMedicalResearchTask_Allotm, thread);
            if (NIL == parser.parser_p($cae_query_translation_parser$.getDynamicValue(thread))) {
                $cae_query_translation_parser$.setDynamicValue(parser.new_stanford_parser($THROW, TEN_INTEGER), thread);
            }
            if (NIL == abstract_lexicon.abstract_lexicon_p($cae_query_translation_lexicon$.getDynamicValue(thread))) {
                $cae_query_translation_lexicon$.setDynamicValue(get_cae_query_search_lexicon(UNPROVIDED), thread);
            }
        } finally {
            $current_cae_task$.rebind(_prev_bind_0, thread);
        }
        return makeBoolean((NIL != $cae_query_translation_parser$.getDynamicValue(thread)) && (NIL != $cae_query_translation_lexicon$.getDynamicValue(thread)));
    }

    public static SubLObject finalize_cae_query_translation() {
        $cae_query_translation_parser$.setDynamicValue(NIL);
        $cae_query_translation_lexicon$.setDynamicValue(NIL);
        $cae_query_translators$.setDynamicValue(NIL);
        $cae_query_translation_wff_mt$.setDynamicValue(NIL);
        return T;
    }

    public static SubLObject test_get_temporal_fragments_for_string(final SubLObject query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $current_cae_task$.currentBinding(thread);
        try {
            $current_cae_task$.bind($const312$GenericMedicalResearchTask_Allotm, thread);
            result = get_temporal_fragments_for_string(query, UNPROVIDED);
        } finally {
            $current_cae_task$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject get_temporal_fragments_for_string(final SubLObject query, SubLObject fragments) {
        if (fragments == UNPROVIDED) {
            fragments = get_fragments_for_token_records(filtered_terms_from_cae_query(query, UNPROVIDED, UNPROVIDED), NIL, cae_query_search_default_mt(UNPROVIDED), $cae_default_variable_format$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(query) : "Types.stringp(query) " + "CommonSymbols.NIL != Types.stringp(query) " + query;
        assert NIL != listp(fragments) : "Types.listp(fragments) " + "CommonSymbols.NIL != Types.listp(fragments) " + fragments;
        SubLObject results = NIL;
        SubLObject error_string = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject literals = extract_literals(fragments, list($SIMPLE));
                    SubLObject cdolist_list_var;
                    final SubLObject formulas = cdolist_list_var = cae_query_translation(string_utilities.reduce_whitespace(query), literals);
                    SubLObject formula = NIL;
                    formula = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject cdolist_list_var_$101 = refine_formula(formula, literals, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject f = NIL;
                        f = cdolist_list_var_$101.first();
                        while (NIL != cdolist_list_var_$101) {
                            results = cons(f, results);
                            cdolist_list_var_$101 = cdolist_list_var_$101.rest();
                            f = cdolist_list_var_$101.first();
                        } 
                        cdolist_list_var = cdolist_list_var.rest();
                        formula = cdolist_list_var.first();
                    } 
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_string = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_string) {
            Errors.warn($str490$Error_getting_temporal_fragments_, query, error_string);
        }
        return results;
    }

    public static SubLObject get_scalar_comparison_fragments_for_string(final SubLObject query, SubLObject processed_terms, SubLObject variable_format) {
        if (processed_terms == UNPROVIDED) {
            processed_terms = terms_from_cae_query(query, UNPROVIDED);
        }
        if (variable_format == UNPROVIDED) {
            variable_format = $cae_default_variable_format$.getGlobalValue();
        }
        assert NIL != stringp(query) : "Types.stringp(query) " + "CommonSymbols.NIL != Types.stringp(query) " + query;
        assert NIL != listp(processed_terms) : "Types.listp(processed_terms) " + "CommonSymbols.NIL != Types.listp(processed_terms) " + processed_terms;
        SubLObject results = NIL;
        SubLObject cdolist_list_var;
        final SubLObject formulas = cdolist_list_var = get_scalar_comparison_literals(query, processed_terms);
        SubLObject formula = NIL;
        formula = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$102 = refine_formula(formula, formulas, $SIMPLE, cae_query_search_default_mt(UNPROVIDED), variable_format);
            SubLObject f = NIL;
            f = cdolist_list_var_$102.first();
            while (NIL != cdolist_list_var_$102) {
                results = cons(f, results);
                cdolist_list_var_$102 = cdolist_list_var_$102.rest();
                f = cdolist_list_var_$102.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            formula = cdolist_list_var.first();
        } 
        return results;
    }

    public static SubLObject get_scalar_comparison_literals(final SubLObject query, final SubLObject processed_terms) {
        return translate_comparators(query, processed_terms);
    }

    public static SubLObject cae_query_translation(final SubLObject query, final SubLObject literals) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == initialize_cae_query_translation()) {
            Errors.error($str491$Can_t_initialize_query_translatio);
        }
        methods.funcall_instance_method_with_1_args($cae_query_translation_lexicon$.getDynamicValue(thread), LEARN, query);
        SubLObject cycl_map = NIL;
        final SubLObject tree = methods.funcall_instance_method_with_2_args($cae_query_translation_parser$.getDynamicValue(thread), PARSE, query, $cae_query_translation_lexicon$.getDynamicValue(thread));
        final SubLObject yield = (NIL != tree) ? methods.funcall_instance_method_with_0_args(tree, YIELD) : NIL;
        SubLObject sentence = document.new_sentence(query, UNPROVIDED);
        SubLObject formulas = NIL;
        SubLObject cycls = NIL;
        if ((NIL != tree) && (NIL != sentence)) {
            sentence = methods.funcall_instance_method_with_1_args($cae_query_translation_lexicon$.getDynamicValue(thread), LEXIFY_SENTENCE, sentence);
            add_word_references(sentence);
            SubLObject cdolist_list_var = $cae_query_translators$.getDynamicValue(thread);
            SubLObject extractor = NIL;
            extractor = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$103 = extract_all(extractor, yield, sentence, literals);
                SubLObject disjunction = NIL;
                disjunction = cdolist_list_var_$103.first();
                while (NIL != cdolist_list_var_$103) {
                    if (NIL != disjunction) {
                        cycl_map = record_interpretations(cycl_map, disjunction);
                    }
                    cdolist_list_var_$103 = cdolist_list_var_$103.rest();
                    disjunction = cdolist_list_var_$103.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                extractor = cdolist_list_var.first();
            } 
            formulas = cdolist_list_var = retrieve_cycl(apply_global_interpretation_constraints(cycl_map));
            SubLObject formula = NIL;
            formula = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL == member(formula, cycls, EQUAL, UNPROVIDED)) && (NIL != query_search_wffP(formula, cae_default_wff_checking_mt(UNPROVIDED), UNPROVIDED))) {
                    cycls = cons(formula, cycls);
                }
                cdolist_list_var = cdolist_list_var.rest();
                formula = cdolist_list_var.first();
            } 
        }
        return cycls;
    }

    public static SubLObject jis_score(final SubLObject jis) {
        SubLObject all_tokens = NIL;
        SubLObject cdolist_list_var = jis;
        SubLObject ji = NIL;
        ji = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$104 = ji_tokens(ji);
            SubLObject jt = NIL;
            jt = cdolist_list_var_$104.first();
            while (NIL != cdolist_list_var_$104) {
                final SubLObject item_var = jt;
                if (NIL == member(item_var, all_tokens, EQUAL, symbol_function(IDENTITY))) {
                    all_tokens = cons(item_var, all_tokens);
                }
                cdolist_list_var_$104 = cdolist_list_var_$104.rest();
                jt = cdolist_list_var_$104.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            ji = cdolist_list_var.first();
        } 
        return length(all_tokens);
    }

    public static SubLObject retrieve_cycl(final SubLObject cycl_map) {
        SubLObject cycls0 = NIL;
        SubLObject cycls2 = NIL;
        SubLObject jis_score = NIL;
        SubLObject hi_score = ZERO_INTEGER;
        SubLObject cdolist_list_var = list_utilities.cross_products(Mapping.mapcar(CDR, cycl_map));
        SubLObject jis = NIL;
        jis = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            jis_score = jis_score(jis);
            if (jis_score.numG(hi_score)) {
                hi_score = jis_score;
            }
            cycls0 = cons(cons(simplifier.conjoin(Mapping.mapcar(JI_CYCL, jis), UNPROVIDED), jis_score), cycls0);
            cdolist_list_var = cdolist_list_var.rest();
            jis = cdolist_list_var.first();
        } 
        cdolist_list_var = cycls0;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject cycl = NIL;
            SubLObject score = NIL;
            destructuring_bind_must_consp(current, datum, $list494);
            cycl = current.first();
            current = score = current.rest();
            if (score.numE(hi_score)) {
                cycls2 = cons(cycl, cycls2);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return cycls2;
    }

    public static SubLObject apply_global_interpretation_constraints(final SubLObject cycl_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = cycl_map;
        SubLObject wordsXjis = NIL;
        wordsXjis = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject new_values = NIL;
            SubLObject passP = NIL;
            SubLObject cdolist_list_var_$105 = wordsXjis.rest();
            SubLObject ji = NIL;
            ji = cdolist_list_var_$105.first();
            while (NIL != cdolist_list_var_$105) {
                passP = T;
                SubLObject cdolist_list_var_$106 = $qs_global_syntactic_constraints$.getDynamicValue(thread);
                SubLObject constraint = NIL;
                constraint = cdolist_list_var_$106.first();
                while (NIL != cdolist_list_var_$106) {
                    passP = makeBoolean((NIL != passP) && (NIL != funcall(constraint, ji, cycl_map)));
                    cdolist_list_var_$106 = cdolist_list_var_$106.rest();
                    constraint = cdolist_list_var_$106.first();
                } 
                if (NIL != passP) {
                    new_values = cons(ji, new_values);
                }
                cdolist_list_var_$105 = cdolist_list_var_$105.rest();
                ji = cdolist_list_var_$105.first();
            } 
            rplacd(wordsXjis, new_values);
            cdolist_list_var = cdolist_list_var.rest();
            wordsXjis = cdolist_list_var.first();
        } 
        return cycl_map;
    }

    public static SubLObject local_pp_attachment_constraint(final SubLObject ji, final SubLObject cycl_map) {
        final SubLObject ji_right_index = ji_right_index(ji);
        final SubLObject right_arg = ji_arg2(ji);
        final SubLObject right_arg_index = term_record_index(right_arg);
        if (NIL == right_arg_index) {
            return NIL;
        }
        SubLObject cdolist_list_var = cycl_map;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject words = NIL;
            SubLObject jis = NIL;
            destructuring_bind_must_consp(current, datum, $list496);
            words = current.first();
            current = jis = current.rest();
            if (document.word_index(words.first()).numG(ji_right_index)) {
                SubLObject cdolist_list_var_$107 = jis;
                SubLObject ji2 = NIL;
                ji2 = cdolist_list_var_$107.first();
                while (NIL != cdolist_list_var_$107) {
                    SubLObject cdolist_list_var_$108 = ji_arg_records(ji2).rest();
                    SubLObject arg = NIL;
                    arg = cdolist_list_var_$108.first();
                    while (NIL != cdolist_list_var_$108) {
                        if (term_record_index(arg).eql(right_arg_index)) {
                            return NIL;
                        }
                        cdolist_list_var_$108 = cdolist_list_var_$108.rest();
                        arg = cdolist_list_var_$108.first();
                    } 
                    cdolist_list_var_$107 = cdolist_list_var_$107.rest();
                    ji2 = cdolist_list_var_$107.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject record_interpretations(final SubLObject alist, final SubLObject ji_disjunction) {
        SubLObject new_alist = alist;
        SubLObject cdolist_list_var = ji_disjunction;
        SubLObject ji = NIL;
        ji = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject key = ji_words(ji);
            SubLObject old_cons = assoc(key, new_alist, EQUAL, UNPROVIDED);
            final SubLObject old_values = old_cons.rest();
            if (NIL == old_cons) {
                old_cons = cons(key, NIL);
                new_alist = cons(old_cons, new_alist);
            }
            rplacd(old_cons, cons(ji, old_values));
            cdolist_list_var = cdolist_list_var.rest();
            ji = cdolist_list_var.first();
        } 
        return new_alist;
    }

    public static SubLObject extract_all(final SubLObject extractor, final SubLObject yield, final SubLObject sentence, final SubLObject literals) {
        SubLObject i = ZERO_INTEGER;
        SubLObject conjunction = NIL;
        for (SubLObject disjunction = funcall(extractor, yield, sentence, literals, i); NIL != disjunction.first(); disjunction = funcall(extractor, yield, sentence, literals, i)) {
            conjunction = cons(get_new_interpretations(disjunction, conjunction), conjunction);
            i = add(i, ONE_INTEGER);
        }
        return conjunction;
    }

    public static SubLObject get_new_interpretations(final SubLObject disjunction, final SubLObject conjunction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_disjunction = NIL;
        SubLObject already_presentP = NIL;
        SubLObject cdolist_list_var = disjunction;
        SubLObject new_ji = NIL;
        new_ji = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            already_presentP = NIL;
            SubLObject cdolist_list_var_$109 = conjunction;
            SubLObject old_disj = NIL;
            old_disj = cdolist_list_var_$109.first();
            while (NIL != cdolist_list_var_$109) {
                if (NIL != member(new_ji, old_disj, JI_EQUAL, UNPROVIDED)) {
                    already_presentP = T;
                }
                cdolist_list_var_$109 = cdolist_list_var_$109.rest();
                old_disj = cdolist_list_var_$109.first();
            } 
            if ((NIL == already_presentP) && (NIL != query_search_wffP(ji_cycl(new_ji), $cae_query_translation_wff_mt$.getDynamicValue(thread), UNPROVIDED))) {
                new_disjunction = cons(new_ji, new_disjunction);
            }
            cdolist_list_var = cdolist_list_var.rest();
            new_ji = cdolist_list_var.first();
        } 
        return new_disjunction;
    }

    public static SubLObject ji_equal(final SubLObject ji1, final SubLObject ji2) {
        return makeBoolean(ji_index(ji1).equal(ji_index(ji2)) && ji_cycl(ji1).equal(ji_cycl(ji2)));
    }

    public static SubLObject extract_between_through(final SubLObject words, final SubLObject sentence, final SubLObject literals, SubLObject i) {
        if (i == UNPROVIDED) {
            i = ZERO_INTEGER;
        }
        return extract_two_word_temp_relation(words, sentence, literals, $$temporallyBetween_Inclusive, $$$between, $$$through, i);
    }

    public static SubLObject extract_between_and(final SubLObject words, final SubLObject sentence, final SubLObject literals, SubLObject i) {
        if (i == UNPROVIDED) {
            i = ZERO_INTEGER;
        }
        return extract_two_word_temp_relation(words, sentence, literals, $$temporallyBetween_Inclusive, $$$between, $$$and, i);
    }

    public static SubLObject extract_from_to(final SubLObject words, final SubLObject sentence, final SubLObject literals, SubLObject i) {
        if (i == UNPROVIDED) {
            i = ZERO_INTEGER;
        }
        return extract_two_word_temp_relation(words, sentence, literals, $$temporallyBetween_Inclusive, $$$from, $$$to, i);
    }

    public static SubLObject extract_from_through(final SubLObject words, final SubLObject sentence, final SubLObject literals, SubLObject i) {
        if (i == UNPROVIDED) {
            i = ZERO_INTEGER;
        }
        return extract_two_word_temp_relation(words, sentence, literals, $$temporallyBetween_Inclusive, $$$from, $$$through, i);
    }

    public static SubLObject extract_after_procedure(final SubLObject words, final SubLObject sentence, final SubLObject literals, SubLObject i) {
        if (i == UNPROVIDED) {
            i = ZERO_INTEGER;
        }
        SubLObject relations = NIL;
        final SubLObject root = methods.funcall_instance_method_with_0_args(words.first(), GET_ROOT);
        final SubLObject after = (NIL != root) ? methods.funcall_instance_method_with_2_args(root, SEARCH, $$$after, number_utilities.f_1X(i)) : NIL;
        final SubLObject split = sentence_split(sentence, $$$after, i);
        final SubLObject late = (NIL != split.first()) ? split.first() : NIL;
        final SubLObject prep = (NIL != second(split)) ? second(split) : NIL;
        final SubLObject early = (NIL != third(split)) ? third(split) : NIL;
        SubLObject temprel_modifier = NIL;
        SubLObject temprel_modifier_cycls = NIL;
        if (((NIL != late) && (NIL != after)) && (NIL != early)) {
            temprel_modifier = get_temprel_modifier(after);
            temprel_modifier_cycls = (NIL != temprel_modifier) ? interpret_temprel_modifier(temprel_modifier) : NIL;
            final SubLObject constraints = predicate_arg_constraints($$after_CCF);
            final SubLObject arg1_isa_constraints = constraints.first().first();
            final SubLObject arg1_genls_constraints = constraints.first().rest();
            final SubLObject arg2_isa_constraints = second(constraints).first();
            final SubLObject arg2_genls_constraints = second(constraints).rest();
            SubLObject cdolist_list_var = combinations(list(extract_terms(late, literals, arg1_isa_constraints, arg1_genls_constraints, UNPROVIDED), extract_terms(early, literals, arg2_isa_constraints, arg2_genls_constraints, UNPROVIDED)), list(temprel_modifier_cycls));
            SubLObject late_early_records = NIL;
            late_early_records = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject late_early = Mapping.mapcar(TERM_RECORD_LITERAL, late_early_records);
                final SubLObject late_var = cycl_utilities.formula_arg1(late_early.first(), UNPROVIDED);
                final SubLObject early_var = cycl_utilities.formula_arg1(second(late_early), UNPROVIDED);
                late_early = rename_temprel_vars(late_early, list(bq_cons($PRO1, late_var), bq_cons($PRO2, early_var)));
                relations = cons(new_justified_interpretation(simplifier.fold_equals(bq_cons($$and, append(late_early, list(list($$after_CCF, late_var, early_var))))), list(prep), late_early_records), relations);
                cdolist_list_var = cdolist_list_var.rest();
                late_early_records = cdolist_list_var.first();
            } 
        }
        return relations;
    }

    public static SubLObject extract_before_procedure_movement(final SubLObject words, final SubLObject sentence, final SubLObject literals, SubLObject i, SubLObject include_indirect_termsP) {
        if (i == UNPROVIDED) {
            i = ZERO_INTEGER;
        }
        if (include_indirect_termsP == UNPROVIDED) {
            include_indirect_termsP = T;
        }
        SubLObject relations = NIL;
        final SubLObject root = methods.funcall_instance_method_with_0_args(words.first(), GET_ROOT);
        final SubLObject before = (NIL != root) ? methods.funcall_instance_method_with_2_args(root, SEARCH, $$$before, number_utilities.f_1X(i)) : NIL;
        final SubLObject split = sentence_split(sentence, $$$before, i);
        final SubLObject early = (NIL != split.first()) ? split.first() : NIL;
        final SubLObject prep = second(split);
        final SubLObject late = (NIL != split.first()) ? split.first() : NIL;
        SubLObject temprel_modifier = NIL;
        SubLObject temprel_modifier_cycls = NIL;
        if (((NIL != early) && (NIL != before)) && (NIL != late)) {
            temprel_modifier = get_temprel_modifier(before);
            temprel_modifier_cycls = (NIL != temprel_modifier) ? interpret_temprel_modifier(temprel_modifier) : NIL;
            final SubLObject constraints = predicate_arg_constraints($$after_CCF);
            final SubLObject arg1_isa_constraints = constraints.first().first();
            final SubLObject arg1_genls_constraints = constraints.first().rest();
            final SubLObject arg2_isa_constraints = second(constraints).first();
            final SubLObject arg2_genls_constraints = second(constraints).rest();
            SubLObject cdolist_list_var = filter_identical_late_early(combinations(list(last(extract_terms(early, literals, arg1_isa_constraints, arg1_genls_constraints, include_indirect_termsP), UNPROVIDED), extract_terms(late, literals, arg2_isa_constraints, arg2_genls_constraints, include_indirect_termsP)), list(temprel_modifier_cycls)));
            SubLObject early_late_records = NIL;
            early_late_records = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject early_late = Mapping.mapcar(TERM_RECORD_LITERAL, early_late_records);
                final SubLObject early_var = cycl_utilities.formula_arg1(early_late.first(), UNPROVIDED);
                final SubLObject late_var = cycl_utilities.formula_arg1(second(early_late), UNPROVIDED);
                early_late = rename_temprel_vars(early_late, list(bq_cons($PRO1, late_var), bq_cons($PRO2, early_var)));
                relations = cons(new_justified_interpretation(simplifier.fold_equals(bq_cons($$and, append(early_late, list(list($$after_CCF, late_var, early_var))))), list(prep), early_late_records), relations);
                cdolist_list_var = cdolist_list_var.rest();
                early_late_records = cdolist_list_var.first();
            } 
        }
        return relations;
    }

    public static SubLObject filter_identical_late_early(final SubLObject early_late_records) {
        SubLObject filtered = NIL;
        SubLObject cdolist_list_var = early_late_records;
        SubLObject early_late_record = NIL;
        early_late_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == term_record_equal(early_late_record.first(), second(early_late_record))) {
                filtered = cons(early_late_record, filtered);
            }
            cdolist_list_var = cdolist_list_var.rest();
            early_late_record = cdolist_list_var.first();
        } 
        return filtered;
    }

    public static SubLObject extract_before_procedure_standard(final SubLObject words, final SubLObject sentence, final SubLObject literals, SubLObject i, SubLObject include_indirect_termsP) {
        if (i == UNPROVIDED) {
            i = ZERO_INTEGER;
        }
        if (include_indirect_termsP == UNPROVIDED) {
            include_indirect_termsP = T;
        }
        SubLObject relations = NIL;
        final SubLObject root = methods.funcall_instance_method_with_0_args(words.first(), GET_ROOT);
        final SubLObject before = (NIL != root) ? methods.funcall_instance_method_with_2_args(root, SEARCH, $$$before, number_utilities.f_1X(i)) : NIL;
        final SubLObject split = sentence_split(sentence, $$$before, i);
        final SubLObject early = (NIL != split.first()) ? split.first() : NIL;
        final SubLObject prep = second(split);
        final SubLObject late = (NIL != third(split)) ? third(split) : NIL;
        SubLObject temprel_modifier = NIL;
        SubLObject temprel_modifier_cycls = NIL;
        if (((NIL != early) && (NIL != before)) && (NIL != late)) {
            temprel_modifier = get_temprel_modifier(before);
            temprel_modifier_cycls = (NIL != temprel_modifier) ? interpret_temprel_modifier(temprel_modifier) : NIL;
            final SubLObject constraints = predicate_arg_constraints($$after_CCF);
            final SubLObject arg1_isa_constraints = constraints.first().first();
            final SubLObject arg1_genls_constraints = constraints.first().rest();
            final SubLObject arg2_isa_constraints = second(constraints).first();
            final SubLObject arg2_genls_constraints = second(constraints).rest();
            SubLObject cdolist_list_var = combinations(list(extract_terms(early, literals, arg1_isa_constraints, arg1_genls_constraints, include_indirect_termsP), extract_terms(late, literals, arg2_isa_constraints, arg2_genls_constraints, include_indirect_termsP)), list(temprel_modifier_cycls));
            SubLObject early_late_records = NIL;
            early_late_records = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject early_late = Mapping.mapcar(TERM_RECORD_LITERAL, early_late_records);
                final SubLObject early_var = cycl_utilities.formula_arg1(early_late.first(), UNPROVIDED);
                final SubLObject late_var = cycl_utilities.formula_arg1(second(early_late), UNPROVIDED);
                early_late = rename_temprel_vars(early_late, list(bq_cons($PRO1, late_var), bq_cons($PRO2, early_var)));
                relations = cons(new_justified_interpretation(simplifier.fold_equals(bq_cons($$and, append(early_late, list(list($$after_CCF, late_var, early_var))))), list(prep), early_late_records), relations);
                cdolist_list_var = cdolist_list_var.rest();
                early_late_records = cdolist_list_var.first();
            } 
        }
        return relations;
    }

    public static SubLObject extract_before_procedure(final SubLObject words, final SubLObject sentence, final SubLObject literals, SubLObject i) {
        if (i == UNPROVIDED) {
            i = ZERO_INTEGER;
        }
        SubLObject relations = extract_before_procedure_standard(words, sentence, literals, i, NIL);
        if (NIL == relations) {
            relations = extract_before_procedure_movement(words, sentence, literals, i, NIL);
        }
        if (NIL == relations) {
            relations = extract_before_procedure_standard(words, sentence, literals, i, T);
        }
        if (NIL == relations) {
            relations = extract_before_procedure_movement(words, sentence, literals, i, T);
        }
        return relations;
    }

    public static SubLObject extract_prior_to_procedure(final SubLObject words, final SubLObject sentence, final SubLObject literals, SubLObject i) {
        if (i == UNPROVIDED) {
            i = ZERO_INTEGER;
        }
        SubLObject relations = NIL;
        final SubLObject root = methods.funcall_instance_method_with_0_args(words.first(), GET_ROOT);
        final SubLObject prior = (NIL != root) ? methods.funcall_instance_method_with_2_args(root, SEARCH, $$$prior, number_utilities.f_1X(i)) : NIL;
        final SubLObject split = sentence_split(sentence, $$$prior_to, i);
        final SubLObject early = (NIL != split.first()) ? split.first() : NIL;
        final SubLObject prep = second(split);
        final SubLObject late = (NIL != third(split)) ? third(split) : NIL;
        SubLObject temprel_modifier = NIL;
        SubLObject temprel_modifier_cycls = NIL;
        if (((NIL != early) && (NIL != prior)) && (NIL != late)) {
            temprel_modifier = get_temprel_modifier(prior);
            temprel_modifier_cycls = (NIL != temprel_modifier) ? interpret_temprel_modifier(temprel_modifier) : NIL;
            final SubLObject constraints = predicate_arg_constraints($$after_CCF);
            final SubLObject arg1_isa_constraints = constraints.first().first();
            final SubLObject arg1_genls_constraints = constraints.first().rest();
            final SubLObject arg2_isa_constraints = second(constraints).first();
            final SubLObject arg2_genls_constraints = second(constraints).rest();
            SubLObject cdolist_list_var = combinations(list(extract_terms(early, literals, arg1_isa_constraints, arg1_genls_constraints, UNPROVIDED), extract_terms(late, literals, arg2_isa_constraints, arg2_genls_constraints, UNPROVIDED)), list(temprel_modifier_cycls));
            SubLObject early_late_records = NIL;
            early_late_records = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject early_late = Mapping.mapcar(TERM_RECORD_LITERAL, early_late_records);
                final SubLObject early_var = cycl_utilities.formula_arg1(early_late.first(), UNPROVIDED);
                final SubLObject late_var = cycl_utilities.formula_arg1(second(early_late), UNPROVIDED);
                early_late = rename_temprel_vars(early_late, list(bq_cons($PRO1, late_var), bq_cons($PRO2, early_var)));
                relations = cons(new_justified_interpretation(simplifier.fold_equals(bq_cons($$and, append(early_late, list(list($$after_CCF, late_var, early_var))))), list(prep), early_late_records), relations);
                cdolist_list_var = cdolist_list_var.rest();
                early_late_records = cdolist_list_var.first();
            } 
        }
        return relations;
    }

    public static SubLObject extract_after_date(final SubLObject words, final SubLObject sentence, final SubLObject literals, SubLObject i) {
        if (i == UNPROVIDED) {
            i = ZERO_INTEGER;
        }
        return extract_post_date(words, sentence, literals, $$$after, i);
    }

    public static SubLObject extract_since_date(final SubLObject words, final SubLObject sentence, final SubLObject literals, SubLObject i) {
        if (i == UNPROVIDED) {
            i = ZERO_INTEGER;
        }
        return extract_post_date(words, sentence, literals, $$$since, i);
    }

    public static SubLObject extract_post_date(final SubLObject words, final SubLObject sentence, final SubLObject literals, final SubLObject preposition, SubLObject i) {
        if (i == UNPROVIDED) {
            i = ZERO_INTEGER;
        }
        SubLObject relations = NIL;
        final SubLObject split = sentence_split(sentence, preposition, i);
        final SubLObject late = (NIL != split.first()) ? split.first() : NIL;
        final SubLObject prep = (NIL != second(split)) ? second(split) : NIL;
        final SubLObject early = ((NIL != third(split)) && (NIL == is_prepositionP(third(split).first()))) ? third(split) : NIL;
        if ((NIL != late) && (NIL != early)) {
            final SubLObject later_than_constraints = predicate_arg_constraints($$laterThan);
            final SubLObject lt_arg2_isa_constraints = second(later_than_constraints).first();
            final SubLObject lt_arg2_genls_constraints = second(later_than_constraints).rest();
            final SubLObject max_date_constraints = predicate_arg_constraints($$maxDateForEvent);
            final SubLObject md_arg1_isa_constraints = max_date_constraints.first().first();
            final SubLObject md_arg1_genls_constraints = max_date_constraints.first().rest();
            SubLObject cdolist_list_var = list_utilities.cross_products(list(extract_terms(late, literals, md_arg1_isa_constraints, md_arg1_genls_constraints, UNPROVIDED), extract_terms(early, literals, lt_arg2_isa_constraints, lt_arg2_genls_constraints, UNPROVIDED)));
            SubLObject late_early_records = NIL;
            late_early_records = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject late_early = Mapping.mapcar(TERM_RECORD_LITERAL, late_early_records);
                final SubLObject early_var = cycl_utilities.formula_arg1(second(late_early), UNPROVIDED);
                final SubLObject late_var = cycl_utilities.formula_arg1(late_early.first(), UNPROVIDED);
                relations = cons(new_justified_interpretation(simplifier.fold_equals(list($$thereExists, $sym516$_MAX, bq_cons($$and, append(late_early, list(listS($$maxDateForEvent, late_var, $list517), list($$laterThan, $sym516$_MAX, early_var)))))), list(prep), late_early_records), relations);
                cdolist_list_var = cdolist_list_var.rest();
                late_early_records = cdolist_list_var.first();
            } 
        }
        return relations;
    }

    public static SubLObject is_prepositionP(final SubLObject word) {
        SubLObject cdolist_list_var = document.word_info(word);
        SubLObject lex = NIL;
        lex = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$110 = methods.funcall_instance_method_with_1_args(lex, GET, $PENN_TAGS);
            SubLObject cat = NIL;
            cat = cdolist_list_var_$110.first();
            while (NIL != cdolist_list_var_$110) {
                if (cat == $IN) {
                    return T;
                }
                cdolist_list_var_$110 = cdolist_list_var_$110.rest();
                cat = cdolist_list_var_$110.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            lex = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject extract_before_date(final SubLObject words, final SubLObject sentence, final SubLObject literals, SubLObject i) {
        if (i == UNPROVIDED) {
            i = ZERO_INTEGER;
        }
        SubLObject relations = NIL;
        final SubLObject split = sentence_split(sentence, $$$before, i);
        final SubLObject late = ((NIL != third(split)) && (NIL == is_prepositionP(third(split).first()))) ? third(split) : NIL;
        final SubLObject prep = second(split);
        final SubLObject early = (NIL != split.first()) ? split.first() : NIL;
        if ((NIL != late) && (NIL != early)) {
            final SubLObject later_than_constraints = predicate_arg_constraints($$laterThan);
            final SubLObject lt_arg2_isa_constraints = second(later_than_constraints).first();
            final SubLObject lt_arg2_genls_constraints = second(later_than_constraints).rest();
            final SubLObject max_date_constraints = predicate_arg_constraints($$maxDateForEvent);
            final SubLObject md_arg1_isa_constraints = max_date_constraints.first().first();
            final SubLObject md_arg1_genls_constraints = max_date_constraints.first().rest();
            SubLObject cdolist_list_var = list_utilities.cross_products(list(extract_terms(early, literals, md_arg1_isa_constraints, md_arg1_genls_constraints, UNPROVIDED), extract_terms(late, literals, lt_arg2_isa_constraints, lt_arg2_genls_constraints, UNPROVIDED)));
            SubLObject early_late_records = NIL;
            early_late_records = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject early_late = Mapping.mapcar(TERM_RECORD_LITERAL, early_late_records);
                final SubLObject early_var = cycl_utilities.formula_arg1(early_late.first(), UNPROVIDED);
                final SubLObject late_var = cycl_utilities.formula_arg1(second(early_late), UNPROVIDED);
                relations = cons(new_justified_interpretation(simplifier.fold_equals(list($$thereExists, $sym516$_MAX, bq_cons($$and, append(early_late, list(listS($$maxDateForEvent, early_var, $list517), listS($$laterThan, late_var, $list517)))))), list(prep), early_late_records), relations);
                cdolist_list_var = cdolist_list_var.rest();
                early_late_records = cdolist_list_var.first();
            } 
        }
        return relations;
    }

    public static SubLObject extract_during_date(final SubLObject words, final SubLObject sentence, final SubLObject literals, SubLObject i) {
        if (i == UNPROVIDED) {
            i = ZERO_INTEGER;
        }
        return extract_while_date(words, sentence, literals, $$$during, i);
    }

    public static SubLObject extract_in_date(final SubLObject words, final SubLObject sentence, final SubLObject literals, SubLObject i) {
        if (i == UNPROVIDED) {
            i = ZERO_INTEGER;
        }
        return extract_while_date(words, sentence, literals, $$$in, i);
    }

    public static SubLObject extract_on_date(final SubLObject words, final SubLObject sentence, final SubLObject literals, SubLObject i) {
        if (i == UNPROVIDED) {
            i = ZERO_INTEGER;
        }
        return extract_while_date(words, sentence, literals, $$$on, i);
    }

    public static SubLObject extract_while_date(final SubLObject words, final SubLObject sentence, final SubLObject literals, final SubLObject preposition, SubLObject i) {
        if (i == UNPROVIDED) {
            i = ZERO_INTEGER;
        }
        SubLObject relations = NIL;
        final SubLObject split = sentence_split(sentence, preposition, i);
        final SubLObject date = (NIL != third(split)) ? third(split) : NIL;
        final SubLObject prep = second(split);
        final SubLObject proc = (NIL != split.first()) ? split.first() : NIL;
        if ((NIL != date) && (NIL != proc)) {
            final SubLObject date_constraints = predicate_arg_constraints($$dateOfEvent_CAE);
            final SubLObject date_isa_constraints = second(date_constraints).first();
            final SubLObject date_genls_constraints = second(date_constraints).rest();
            final SubLObject proc_isa_constraints = date_constraints.first().first();
            final SubLObject proc_genls_constraints = date_constraints.first().rest();
            SubLObject cdolist_list_var = list_utilities.cross_products(list(extract_terms(proc, literals, proc_isa_constraints, proc_genls_constraints, UNPROVIDED), extract_terms(date, literals, date_isa_constraints, date_genls_constraints, UNPROVIDED)));
            SubLObject proc_date_records = NIL;
            proc_date_records = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject proc_date = Mapping.mapcar(TERM_RECORD_LITERAL, proc_date_records);
                final SubLObject proc_var = cycl_utilities.formula_arg1(proc_date.first(), UNPROVIDED);
                final SubLObject date_var = cycl_utilities.formula_arg1(second(proc_date), UNPROVIDED);
                relations = cons(new_justified_interpretation(simplifier.fold_equals(bq_cons($$and, append(proc_date, list(list($$dateOfEvent_CAE, proc_var, date_var))))), list(prep), proc_date_records), relations);
                cdolist_list_var = cdolist_list_var.rest();
                proc_date_records = cdolist_list_var.first();
            } 
        }
        return relations;
    }

    public static SubLObject rename_temprel_vars(final SubLObject late_early, final SubLObject renaming) {
        final SubLObject pcase_var;
        final SubLObject length = pcase_var = length(late_early);
        if (pcase_var.eql(TWO_INTEGER)) {
            return late_early;
        }
        if (pcase_var.eql(THREE_INTEGER)) {
            return append(butlast(late_early, UNPROVIDED), cyclifier.rename_variables(last(late_early, UNPROVIDED).first(), renaming));
        }
        return NIL;
    }

    public static SubLObject map_base_literals(final SubLObject term_records, final SubLObject literals) {
        SubLObject updated_term_records = NIL;
        SubLObject base_literal = NIL;
        SubLObject cdolist_list_var = term_records;
        SubLObject term_record = NIL;
        term_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            base_literal = literal_for_term(term_record_term(term_record), term_record_ref(term_record), literals);
            if (NIL != base_literal) {
                _csetf_term_record_literal(term_record, base_literal);
                updated_term_records = cons(term_record, updated_term_records);
            }
            cdolist_list_var = cdolist_list_var.rest();
            term_record = cdolist_list_var.first();
        } 
        return updated_term_records;
    }

    public static SubLObject combinations(final SubLObject required_sets, final SubLObject optional_sets) {
        return list_utilities.cross_products(append(required_sets, delete(NIL, optional_sets, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject yield_split(final SubLObject words, final SubLObject string, SubLObject i) {
        if (i == UNPROVIDED) {
            i = ZERO_INTEGER;
        }
        assert NIL != listp(words) : "Types.listp(words) " + "CommonSymbols.NIL != Types.listp(words) " + words;
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        SubLObject before = NIL;
        SubLObject target = NIL;
        SubLObject after = NIL;
        SubLObject j = ZERO_INTEGER;
        SubLObject cdolist_list_var = words;
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (methods.funcall_instance_method_with_0_args(word, GET_STRING).equalp(string)) {
                if (i.numE(j)) {
                    target = word;
                } else
                    if (NIL != target) {
                        after = cons(word, after);
                    } else {
                        before = cons(word, before);
                    }

                j = add(j, ONE_INTEGER);
            } else
                if (NIL != target) {
                    after = cons(word, after);
                } else {
                    before = cons(word, before);
                }

            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return list(nreverse(before), target, nreverse(after));
    }

    public static SubLObject words_split(final SubLObject words, final SubLObject string, SubLObject i) {
        if (i == UNPROVIDED) {
            i = ZERO_INTEGER;
        }
        assert NIL != listp(words) : "Types.listp(words) " + "CommonSymbols.NIL != Types.listp(words) " + words;
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        SubLObject before = NIL;
        SubLObject target = NIL;
        SubLObject after = NIL;
        SubLObject j = ZERO_INTEGER;
        SubLObject cdolist_list_var = words;
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (document.word_string(word).equalp(string)) {
                if (i.numE(j)) {
                    target = word;
                } else
                    if (NIL != target) {
                        after = cons(word, after);
                    } else {
                        before = cons(word, before);
                    }

                j = add(j, ONE_INTEGER);
            } else
                if (NIL != target) {
                    after = cons(word, after);
                } else {
                    before = cons(word, before);
                }

            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return list(nreverse(before), target, nreverse(after));
    }

    public static SubLObject sentence_split(final SubLObject sentence, final SubLObject string, SubLObject i) {
        if (i == UNPROVIDED) {
            i = ZERO_INTEGER;
        }
        assert NIL != document.sentence_p(sentence) : "document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) " + sentence;
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        SubLObject before = NIL;
        SubLObject target = NIL;
        SubLObject after = NIL;
        SubLObject j = ZERO_INTEGER;
        SubLObject cdolist_list_var = document.sentence_yield_exhaustive(sentence);
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (document.word_string(word).equalp(string)) {
                if (i.numE(j)) {
                    target = word;
                } else
                    if (NIL != target) {
                        after = cons(word, after);
                    } else {
                        before = cons(word, before);
                    }

                j = add(j, ONE_INTEGER);
            } else
                if (NIL != target) {
                    after = cons(word, after);
                } else {
                    before = cons(word, before);
                }

            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return list(nreverse(before), target, nreverse(after));
    }

    public static SubLObject words_string(final SubLObject words) {
        SubLObject string = NIL;
        if (NIL != list_utilities.non_empty_list_p(words)) {
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                princ(methods.funcall_instance_method_with_0_args(words.first(), GET_STRING), stream);
                SubLObject cdolist_list_var = words.rest();
                SubLObject word = NIL;
                word = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    princ($$$_, stream);
                    princ(methods.funcall_instance_method_with_0_args(word, GET_STRING), stream);
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                } 
                string = get_output_stream_string(stream);
            } finally {
                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                try {
                    bind($is_thread_performing_cleanupP$, T);
                    final SubLObject _values = getValuesAsVector();
                    close(stream, UNPROVIDED);
                    restoreValuesFromVector(_values);
                } finally {
                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
        }
        return string;
    }

    public static SubLObject literal_for_term(final SubLObject v_term, SubLObject var, SubLObject literals) {
        if (var == UNPROVIDED) {
            var = $sym37$_X;
        }
        if (literals == UNPROVIDED) {
            literals = NIL;
        }
        if (NIL != fort_types_interface.isa_collectionP(v_term, UNPROVIDED)) {
            return list($$isa, var, v_term);
        }
        if ((NIL != kb_accessors.individualP(v_term)) && (NIL == fort_types_interface.predicateP(v_term))) {
            return list($$equals, var, v_term);
        }
        if (NIL != fort_types_interface.predicateP(v_term)) {
            return make_predicate_literal(v_term, var, literals);
        }
        return NIL;
    }

    public static SubLObject make_predicate_literal(final SubLObject predicate, final SubLObject var, final SubLObject literals) {
        SubLObject cdolist_list_var = literals;
        SubLObject lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject vars = referenced_variables(lit, UNPROVIDED);
            if (cycl_utilities.formula_operator(lit).eql(predicate) && length(vars).numE(ONE_INTEGER)) {
                return variable_subst(var, vars.first(), lit);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject extract_two_word_temp_relation(final SubLObject words, final SubLObject sentence, final SubLObject literals, final SubLObject predicate, final SubLObject word1, final SubLObject word2, final SubLObject i) {
        SubLObject formulas = NIL;
        final SubLObject argsXwordkey = extract_semantic_args(words, sentence, literals, predicate, word1, word2, i);
        final SubLObject arg_records = argsXwordkey.first();
        final SubLObject wordkey = argsXwordkey.rest();
        SubLObject cdolist_list_var = arg_records;
        SubLObject triple = NIL;
        triple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject args = Mapping.mapcar(TERM_RECORD_LITERAL, triple);
            final SubLObject arg1_var = cycl_utilities.formula_arg1(args.first(), UNPROVIDED);
            final SubLObject arg2_var = cycl_utilities.formula_arg1(second(args), UNPROVIDED);
            final SubLObject arg3_var = cycl_utilities.formula_arg1(third(args), UNPROVIDED);
            formulas = cons(new_justified_interpretation(simplifier.fold_equals(bq_cons($$and, append(args, list(list(predicate, arg1_var, arg2_var, arg3_var))))), wordkey, triple), formulas);
            cdolist_list_var = cdolist_list_var.rest();
            triple = cdolist_list_var.first();
        } 
        return formulas;
    }

    public static SubLObject extract_semantic_args(final SubLObject words, final SubLObject sentence, final SubLObject literals, final SubLObject predicate, final SubLObject word1, final SubLObject word2, final SubLObject i) {
        SubLObject current;
        final SubLObject datum = current = extract_word_args(words, sentence, word1, word2, i);
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        SubLObject arg3 = NIL;
        SubLObject wordkey = NIL;
        destructuring_bind_must_consp(current, datum, $list527);
        arg1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list527);
        arg2 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list527);
        arg3 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list527);
        wordkey = current.first();
        current = current.rest();
        if (NIL == current) {
            if (((NIL != arg1) && (NIL != arg2)) && (NIL != arg3)) {
                final SubLObject constraints = predicate_arg_constraints(predicate);
                final SubLObject arg1_isa_constraints = constraints.first().first();
                final SubLObject arg1_genls_constraints = constraints.first().rest();
                final SubLObject arg2_isa_constraints = second(constraints).first();
                final SubLObject arg2_genls_constraints = second(constraints).rest();
                final SubLObject arg3_isa_constraints = third(constraints).first();
                final SubLObject arg3_genls_constraints = third(constraints).rest();
                return cons(list_utilities.cross_products(list(extract_terms(arg1, literals, arg1_isa_constraints, arg1_genls_constraints, UNPROVIDED), extract_terms(arg2, literals, arg2_isa_constraints, arg2_genls_constraints, UNPROVIDED), extract_terms(arg3, literals, arg3_isa_constraints, arg3_genls_constraints, UNPROVIDED))), wordkey);
            }
        } else {
            cdestructuring_bind_error(datum, $list527);
        }
        return NIL;
    }

    public static SubLObject make_empty_literal(final SubLObject predicate) {
        final SubLObject v_arity = arity.arity(predicate);
        SubLObject args = NIL;
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
            args = cons(cycl_variables.make_el_var(cconcatenate($$$ARG, princ_to_string(i))), args);
        }
        return make_formula(predicate, nreverse(args), UNPROVIDED);
    }

    public static SubLObject extract_word_args(final SubLObject words, final SubLObject sentence, final SubLObject word1, final SubLObject word2, final SubLObject i) {
        final SubLObject split = yield_split(words, word1, i);
        final SubLObject before = split.first();
        final SubLObject target = second(split);
        if ((NIL == before) || (NIL == target)) {
            return list(NIL, NIL, NIL, NIL);
        }
        final SubLObject after_word1 = third(split);
        final SubLObject split2 = yield_split(after_word1, word2, ZERO_INTEGER);
        final SubLObject between = split2.first();
        final SubLObject to = second(split2);
        SubLObject sister_words = NIL;
        final SubLObject sister0 = (NIL != to) ? methods.funcall_instance_method_with_1_args(to, GET_SISTER, ONE_INTEGER) : NIL;
        SubLObject sister2 = (NIL != sister0) ? methods.funcall_instance_method_with_0_args(sister0, GET_HEAD) : NIL;
        if (NIL == sister2) {
            sister2 = first_np(third(split2));
        }
        while (NIL != sister2) {
            sister_words = cons(sister2, sister_words);
            sister2 = methods.funcall_instance_method_with_1_args(sister2, GET_SISTER, ONE_INTEGER);
        } 
        sister_words = nreverse(sister_words);
        final SubLObject arg1 = sentence_infix(before, sentence);
        final SubLObject arg2 = sentence_infix(between, sentence);
        final SubLObject arg3 = sentence_infix(sister_words, sentence);
        SubLObject w1 = NIL;
        SubLObject w2 = NIL;
        if (((NIL != arg1) && (NIL != arg2)) && (NIL != arg3)) {
            final SubLObject index1 = number_utilities.f_1_(document.word_index(arg2.first()));
            final SubLObject index2 = number_utilities.f_1_(document.word_index(arg3.first()));
            w1 = document.sentence_get(sentence, index1);
            w2 = document.sentence_get(sentence, index2);
        }
        return list(arg1, arg2, arg3, list(w1, w2));
    }

    public static SubLObject first_np(final SubLObject words) {
        SubLObject cdolist_list_var = words;
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != word_tree.nominal_word_tree_p(word)) {
                SubLObject cdolist_list_var_$111 = methods.funcall_instance_method_with_0_args(word, GET_ANCESTORS);
                SubLObject ancestor = NIL;
                ancestor = cdolist_list_var_$111.first();
                while (NIL != cdolist_list_var_$111) {
                    if (NIL != parse_tree.nominal_tree_p(ancestor)) {
                        return ancestor;
                    }
                    cdolist_list_var_$111 = cdolist_list_var_$111.rest();
                    ancestor = cdolist_list_var_$111.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject sentence_find(final SubLObject sentence, final SubLObject string, SubLObject n) {
        if (n == UNPROVIDED) {
            n = ZERO_INTEGER;
        }
        SubLObject occurrence = ZERO_INTEGER;
        SubLObject cdolist_list_var = document.sentence_yield_exhaustive(sentence);
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != string_utilities.starts_with(string, document.word_string(word))) {
                if (occurrence.numE(n)) {
                    return document.word_index(word);
                }
                occurrence = add(occurrence, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject sentence_infix(final SubLObject words, final SubLObject sentence) {
        if (NIL == words) {
            return NIL;
        }
        final SubLObject complete_string = words_string(words);
        final SubLObject sentence_length = document.sentence_length(sentence);
        SubLObject infix = NIL;
        SubLObject string = NIL;
        SubLObject position = NIL;
        SubLObject start = NIL;
        for (SubLObject j = ZERO_INTEGER, doneP = NIL; NIL == doneP; doneP = string_utilities.empty_string_p(string) , j = add(j, ONE_INTEGER)) {
            infix = NIL;
            string = complete_string;
            position = sentence_find(sentence, complete_string, j);
            if (NIL == position) {
                return NIL;
            }
            SubLObject i;
            SubLObject word;
            SubLObject prefixP;
            for (i = NIL, word = NIL, prefixP = NIL, i = ZERO_INTEGER, word = (add(position, i).numL(sentence_length)) ? document.sentence_get(sentence, add(position, i)) : NIL, prefixP = (NIL != word) ? string_utilities.starts_with(string, document.word_string(word)) : NIL; (NIL != prefixP) && (NIL == string_utilities.empty_string_p(string)); string = string_utilities.trim_whitespace(string_utilities.substring(string, start, UNPROVIDED)) , i = number_utilities.f_1X(i) , word = (add(position, i).numL(sentence_length)) ? document.sentence_get(sentence, add(position, i)) : NIL , prefixP = (NIL != word) ? string_utilities.starts_with(string, document.word_string(word)) : NIL) {
                infix = cons(word, infix);
                start = length(document.word_string(word));
            }
        }
        return nreverse(infix);
    }

    public static SubLObject add_word_references(final SubLObject sentence) {
        SubLObject cdolist_list_var = document.sentence_yield_exhaustive(sentence);
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            document.word_update(word, list($CATEGORY, word_variable(document.word_string(word), document.word_offset(word))));
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return sentence;
    }

    public static SubLObject word_variable(final SubLObject string, final SubLObject v_int) {
        return intern(cycl_variables.make_el_var_name(string_to_el_var_name(cconcatenate(string, princ_to_string(v_int)))), UNPROVIDED);
    }

    public static SubLObject extract_terms(final SubLObject words, final SubLObject literals, SubLObject isa_constraints, SubLObject genls_constraints, SubLObject include_indirect_termsP) {
        if (isa_constraints == UNPROVIDED) {
            isa_constraints = NIL;
        }
        if (genls_constraints == UNPROVIDED) {
            genls_constraints = NIL;
        }
        if (include_indirect_termsP == UNPROVIDED) {
            include_indirect_termsP = T;
        }
        SubLObject passing_terms = NIL;
        SubLObject non_passing_terms = NIL;
        SubLObject v_term = NIL;
        SubLObject cdolist_list_var = words;
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$112 = document.word_info(word);
            SubLObject lex = NIL;
            lex = cdolist_list_var_$112.first();
            while (NIL != cdolist_list_var_$112) {
                v_term = methods.funcall_instance_method_with_1_args(lex, GET, $DENOT);
                if (NIL != term_passes_constraintsP(v_term, isa_constraints, genls_constraints)) {
                    final SubLObject item_var = new_term_record(v_term, word, UNPROVIDED);
                    if (NIL == member(item_var, passing_terms, TERM_RECORD_EQUAL, symbol_function(IDENTITY))) {
                        passing_terms = cons(item_var, passing_terms);
                    }
                } else {
                    final SubLObject item_var = new_term_record(v_term, word, UNPROVIDED);
                    if (NIL == member(item_var, non_passing_terms, TERM_RECORD_EQUAL, symbol_function(IDENTITY))) {
                        non_passing_terms = cons(item_var, non_passing_terms);
                    }
                }
                cdolist_list_var_$112 = cdolist_list_var_$112.rest();
                lex = cdolist_list_var_$112.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        if ((NIL == passing_terms) && (NIL != include_indirect_termsP)) {
            passing_terms = indirect_terms(non_passing_terms);
        }
        return map_base_literals(passing_terms, literals);
    }

    public static SubLObject indirect_terms(final SubLObject term_records) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iterms = NIL;
        SubLObject cdolist_list_var = term_records;
        SubLObject tr = NIL;
        tr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject terms = list(term_record_term(tr));
            final SubLObject word = term_record_word(tr);
            if (NIL != terms) {
                SubLObject cdolist_list_var_$113 = ask_utilities.query_template($list534, listS($$and, list($$elementOf, $sym535$_TERM, bq_cons($$TheSet, append(terms, NIL))), $list537), $cae_query_translation_ontology_mt$.getDynamicValue(thread), UNPROVIDED);
                SubLObject termXset = NIL;
                termXset = cdolist_list_var_$113.first();
                while (NIL != cdolist_list_var_$113) {
                    final SubLObject v_set = second(termXset.rest());
                    final SubLObject item_var = new_term_record(v_set, word, UNPROVIDED);
                    if (NIL == member(item_var, iterms, TERM_RECORD_EQUAL, symbol_function(IDENTITY))) {
                        iterms = cons(item_var, iterms);
                    }
                    cdolist_list_var_$113 = cdolist_list_var_$113.rest();
                    termXset = cdolist_list_var_$113.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            tr = cdolist_list_var.first();
        } 
        return iterms;
    }

    public static SubLObject predicate_arg_constraints(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dummy = make_empty_literal(predicate);
        SubLObject constraints = NIL;
        SubLObject cdolist_list_var = cycl_utilities.formula_args(dummy, UNPROVIDED);
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject arg_isa_constraints = constraint_filters.formula_term_arg_constraints(var, dummy, $cae_query_translation_wff_mt$.getDynamicValue(thread));
            final SubLObject arg_genls_constraints = thread.secondMultipleValue();
            thread.resetMultipleValues();
            constraints = cons(cons(arg_isa_constraints, arg_genls_constraints), constraints);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return nreverse(constraints);
    }

    public static SubLObject term_passes_constraintsP(final SubLObject v_term, final SubLObject isa_constraints, final SubLObject genls_constraints) {
        if (NIL != isa_collectionP_cached(v_term, UNPROVIDED)) {
            return collection_passes_constraintsP(v_term, isa_constraints, genls_constraints);
        }
        if (NIL != individualP_cached(v_term, UNPROVIDED)) {
            return individual_passes_constraintsP(v_term, isa_constraints, genls_constraints);
        }
        Errors.error($str538$Can_t_check_constraints_on__a, v_term);
        return NIL;
    }

    public static SubLObject clear_individualP_cached() {
        final SubLObject cs = $individualP_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_individualP_cached(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($individualP_cached_caching_state$.getGlobalValue(), list(v_term, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject individualP_cached_internal(final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt, thread);
            result = kb_accessors.individualP(v_term);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject individualP_cached(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject caching_state = $individualP_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym539$INDIVIDUAL__CACHED, $sym540$_INDIVIDUAL__CACHED_CACHING_STATE_, $int$1024, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback($sym541$CLEAR_INDIVIDUAL__CACHED);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(individualP_cached_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_isa_collectionP_cached() {
        final SubLObject cs = $isa_collectionP_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_isa_collectionP_cached(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($isa_collectionP_cached_caching_state$.getGlobalValue(), list(v_term, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject isa_collectionP_cached_internal(final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt, thread);
            result = fort_types_interface.isa_collectionP(v_term, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject isa_collectionP_cached(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject caching_state = $isa_collectionP_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym542$ISA_COLLECTION__CACHED, $sym543$_ISA_COLLECTION__CACHED_CACHING_STATE_, $int$1024, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback($sym544$CLEAR_ISA_COLLECTION__CACHED);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(isa_collectionP_cached_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_collection_passes_constraintsP() {
        final SubLObject cs = $collection_passes_constraintsP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_collection_passes_constraintsP(final SubLObject collection, final SubLObject isa_constraints, final SubLObject genls_constraints) {
        return memoization_state.caching_state_remove_function_results_with_args($collection_passes_constraintsP_caching_state$.getGlobalValue(), list(collection, isa_constraints, genls_constraints), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject collection_passes_constraintsP_internal(final SubLObject collection, final SubLObject isa_constraints, final SubLObject genls_constraints) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject passP = T;
        SubLObject cdolist_list_var = isa_constraints;
        SubLObject ic = NIL;
        ic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            passP = makeBoolean((NIL != passP) && (NIL != genls.genlsP(collection, ic, $cae_query_translation_wff_mt$.getDynamicValue(thread), UNPROVIDED)));
            cdolist_list_var = cdolist_list_var.rest();
            ic = cdolist_list_var.first();
        } 
        return passP;
    }

    public static SubLObject collection_passes_constraintsP(final SubLObject collection, final SubLObject isa_constraints, final SubLObject genls_constraints) {
        SubLObject caching_state = $collection_passes_constraintsP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym545$COLLECTION_PASSES_CONSTRAINTS_, $sym546$_COLLECTION_PASSES_CONSTRAINTS__CACHING_STATE_, $int$1024, EQUAL, THREE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback($sym547$CLEAR_COLLECTION_PASSES_CONSTRAINTS_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(collection, isa_constraints, genls_constraints);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (collection.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (isa_constraints.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && genls_constraints.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(collection_passes_constraintsP_internal(collection, isa_constraints, genls_constraints)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(collection, isa_constraints, genls_constraints));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_individual_passes_constraintsP() {
        final SubLObject cs = $individual_passes_constraintsP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_individual_passes_constraintsP(final SubLObject individual, final SubLObject isa_constraints, final SubLObject genls_constraints) {
        return memoization_state.caching_state_remove_function_results_with_args($individual_passes_constraintsP_caching_state$.getGlobalValue(), list(individual, isa_constraints, genls_constraints), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject individual_passes_constraintsP_internal(final SubLObject individual, final SubLObject isa_constraints, final SubLObject genls_constraints) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject passP = T;
        SubLObject cdolist_list_var = genls_constraints;
        SubLObject gc = NIL;
        gc = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            passP = makeBoolean((NIL != passP) && (NIL != genls.genlsP(individual, gc, $cae_query_translation_wff_mt$.getDynamicValue(thread), UNPROVIDED)));
            cdolist_list_var = cdolist_list_var.rest();
            gc = cdolist_list_var.first();
        } 
        cdolist_list_var = isa_constraints;
        SubLObject ic = NIL;
        ic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            passP = makeBoolean((NIL != passP) && (NIL != isa.isaP(individual, ic, $cae_query_translation_wff_mt$.getDynamicValue(thread), UNPROVIDED)));
            cdolist_list_var = cdolist_list_var.rest();
            ic = cdolist_list_var.first();
        } 
        return passP;
    }

    public static SubLObject individual_passes_constraintsP(final SubLObject individual, final SubLObject isa_constraints, final SubLObject genls_constraints) {
        SubLObject caching_state = $individual_passes_constraintsP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym548$INDIVIDUAL_PASSES_CONSTRAINTS_, $sym549$_INDIVIDUAL_PASSES_CONSTRAINTS__CACHING_STATE_, $int$1024, EQUAL, THREE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback($sym550$CLEAR_INDIVIDUAL_PASSES_CONSTRAINTS_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(individual, isa_constraints, genls_constraints);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (individual.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (isa_constraints.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && genls_constraints.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(individual_passes_constraintsP_internal(individual, isa_constraints, genls_constraints)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(individual, isa_constraints, genls_constraints));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject refine_formula(final SubLObject formula, final SubLObject literals, SubLObject category, SubLObject mt, SubLObject variable_format) {
        if (category == UNPROVIDED) {
            category = $TEMPORAL;
        }
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        if (variable_format == UNPROVIDED) {
            variable_format = $MNEMONIC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dummy_gloss = list(string_utilities.$empty_string$.getGlobalValue());
        final SubLObject mnemonic_formula = (variable_format.eql($MNEMONIC)) ? optimize_el_formula_variable_names(formula, pph_vars.$pph_language_mt$.getDynamicValue(thread), mt, UNPROVIDED) : formula;
        final SubLObject query = list(maximal_scope(mnemonic_formula), dummy_gloss, category);
        SubLObject queries = NIL;
        SubLObject temp = NIL;
        queries = replace_blocked_fragment_literals(query, literals, mt);
        temp = NIL;
        SubLObject cdolist_list_var = queries;
        SubLObject q = NIL;
        q = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            temp = cons(fill_in_default_values_for_formula(q, mt), temp);
            cdolist_list_var = cdolist_list_var.rest();
            q = cdolist_list_var.first();
        } 
        queries = temp;
        temp = NIL;
        cdolist_list_var = queries;
        q = NIL;
        q = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != formula_has_all_required_args_boundP(q, mt)) {
                temp = cons(q, temp);
            }
            cdolist_list_var = cdolist_list_var.rest();
            q = cdolist_list_var.first();
        } 
        queries = temp;
        temp = NIL;
        cdolist_list_var = queries;
        q = NIL;
        q = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject formula_$114 = q.first();
            final SubLObject gloss = generate_query_search_gloss_template(formula_$114, variable_format, $INTERROGATIVE, UNPROVIDED, UNPROVIDED);
            temp = cons(list(maximal_scope(existentially_bind_types(modify_formula_by_adding_concepts(formula_$114, mt), mt)), gloss, category), temp);
            cdolist_list_var = cdolist_list_var.rest();
            q = cdolist_list_var.first();
        } 
        queries = temp;
        return remove_duplicates(queries, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject extract_literals(final SubLObject fragments, final SubLObject types) {
        SubLObject literals = NIL;
        SubLObject cdolist_list_var = fragments;
        SubLObject fragment = NIL;
        fragment = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != member(third(fragment), types, EQL, UNPROVIDED)) {
                final SubLObject stack = stacks.create_stack();
                SubLObject literal = NIL;
                stacks.stack_push(fragment.first(), stack);
                while (NIL == stacks.stack_empty_p(stack)) {
                    final SubLObject entry = stacks.stack_pop(stack);
                    if (NIL != literalP(entry)) {
                        final SubLObject item_var;
                        literal = item_var = entry;
                        if (NIL == member(item_var, literals, EQUAL, symbol_function(IDENTITY))) {
                            literals = cons(item_var, literals);
                        }
                    }
                    SubLObject cdolist_list_var_$115 = cycl_utilities.formula_args(entry, UNPROVIDED);
                    SubLObject arg = NIL;
                    arg = cdolist_list_var_$115.first();
                    while (NIL != cdolist_list_var_$115) {
                        stacks.stack_push(arg, stack);
                        cdolist_list_var_$115 = cdolist_list_var_$115.rest();
                        arg = cdolist_list_var_$115.first();
                    } 
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            fragment = cdolist_list_var.first();
        } 
        return literals;
    }

    public static SubLObject find_literals_with_term(final SubLObject literals, final SubLObject v_term) {
        SubLObject results = NIL;
        SubLObject cdolist_list_var = literals;
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject stack = stacks.create_stack();
            SubLObject arg = NIL;
            stacks.stack_push(literal, stack);
            while (NIL == stacks.stack_empty_p(stack)) {
                final SubLObject entry = arg = stacks.stack_pop(stack);
                if (arg.equal(v_term)) {
                    results = cons(literal, results);
                }
                SubLObject cdolist_list_var_$116 = cycl_utilities.formula_args(entry, UNPROVIDED);
                SubLObject arg_$117 = NIL;
                arg_$117 = cdolist_list_var_$116.first();
                while (NIL != cdolist_list_var_$116) {
                    stacks.stack_push(arg_$117, stack);
                    cdolist_list_var_$116 = cdolist_list_var_$116.rest();
                    arg_$117 = cdolist_list_var_$116.first();
                } 
            } 
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        return results;
    }

    public static SubLObject find_literals_with_term_replace_variable(final SubLObject literals, final SubLObject v_term, final SubLObject replacement_var) {
        SubLObject results = NIL;
        SubLObject cdolist_list_var = find_literals_with_term(literals, v_term);
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$118 = replace_literal_variables(literal, replacement_var);
            SubLObject replaced = NIL;
            replaced = cdolist_list_var_$118.first();
            while (NIL != cdolist_list_var_$118) {
                results = cons(replaced, results);
                cdolist_list_var_$118 = cdolist_list_var_$118.rest();
                replaced = cdolist_list_var_$118.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        return results;
    }

    public static SubLObject replace_literal_variables(final SubLObject literal, final SubLObject replacement_var) {
        SubLObject replaced = NIL;
        SubLObject cdolist_list_var = referenced_variables(literal, UNPROVIDED);
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            replaced = cons(list_utilities.tree_substitute(literal, var, replacement_var), replaced);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return replaced;
    }

    public static SubLObject replace_blocked_fragment_literals(final SubLObject fragment, final SubLObject candidate_replacements, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        SubLObject results = NIL;
        SubLObject substitutions = NIL;
        SubLObject blocked_term = NIL;
        final SubLObject formula = cae_query_search_fragment_formula(fragment);
        final SubLObject gloss = cae_query_search_fragment_gloss(fragment);
        final SubLObject category = cae_query_search_fragment_category(fragment);
        final SubLObject justification = cae_query_search_fragment_justification(fragment);
        final SubLObject offset = cae_query_search_fragment_offset(fragment);
        final SubLObject end = cae_query_search_fragment_end(fragment);
        final SubLObject stack = stacks.create_stack();
        SubLObject literal = NIL;
        stacks.stack_push(formula, stack);
        while (NIL == stacks.stack_empty_p(stack)) {
            final SubLObject entry = stacks.stack_pop(stack);
            if (NIL != literalP(entry)) {
                literal = entry;
                blocked_term = fragment_instantiated_by_blocked_termP(new_cae_query_search_fragment(literal, gloss, category, justification, offset, end, UNPROVIDED), mt);
                if (NIL != blocked_term) {
                    substitutions = cons(cons(literal, find_literals_with_term_replace_variable(candidate_replacements, blocked_term, referenced_variables(literal, UNPROVIDED).first())), substitutions);
                }
            }
            SubLObject cdolist_list_var = cycl_utilities.formula_args(entry, UNPROVIDED);
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                stacks.stack_push(arg, stack);
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            } 
        } 
        final SubLObject old_literals = Mapping.mapcar(CAR, substitutions);
        final SubLObject replacements = list_utilities.cross_products(Mapping.mapcar(CDR, substitutions));
        if (NIL != old_literals) {
            SubLObject cdolist_list_var2 = replacements;
            SubLObject rplc = NIL;
            rplc = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                final SubLObject new_formula = replace_literals(Mapping.mapcar(CONS, old_literals, new SubLObject[]{ rplc }), formula);
                results = cons(new_cae_query_search_fragment(new_formula, gloss, category, justification, offset, end, UNPROVIDED), results);
                cdolist_list_var2 = cdolist_list_var2.rest();
                rplc = cdolist_list_var2.first();
            } 
        } else {
            results = cons(fragment, results);
        }
        return results;
    }

    public static SubLObject replace_literals(final SubLObject substitutions, final SubLObject formula) {
        SubLObject new_formula = formula;
        SubLObject cdolist_list_var = substitutions;
        SubLObject oldXnew = NIL;
        oldXnew = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject old = oldXnew.first();
            final SubLObject v_new = oldXnew.rest();
            new_formula = list_utilities.tree_substitute(new_formula, old, v_new);
            cdolist_list_var = cdolist_list_var.rest();
            oldXnew = cdolist_list_var.first();
        } 
        return new_formula;
    }

    public static SubLObject formula_has_all_required_args_boundP(final SubLObject query, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        SubLObject passP = T;
        final SubLObject formula = cae_query_search_fragment_formula(query);
        final SubLObject stack = stacks.create_stack();
        SubLObject literal = NIL;
        stacks.stack_push(formula, stack);
        while (NIL == stacks.stack_empty_p(stack)) {
            final SubLObject entry = stacks.stack_pop(stack);
            if (NIL != literalP(entry)) {
                literal = entry;
                passP = makeBoolean((NIL != passP) && (NIL != sentence_has_all_required_args_boundP(literal, mt)));
            }
            SubLObject cdolist_list_var = cycl_utilities.formula_args(entry, UNPROVIDED);
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                stacks.stack_push(arg, stack);
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            } 
        } 
        return passP;
    }

    public static SubLObject substitute_formula_literals(final SubLObject fragment, final SubLObject substitute, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        SubLObject formula = cae_query_search_fragment_formula(fragment);
        final SubLObject gloss = cae_query_search_fragment_gloss(fragment);
        final SubLObject category = cae_query_search_fragment_category(fragment);
        final SubLObject justification = cae_query_search_fragment_justification(fragment);
        final SubLObject offset = cae_query_search_fragment_offset(fragment);
        final SubLObject end = cae_query_search_fragment_end(fragment);
        SubLObject substitutions = NIL;
        final SubLObject stack = stacks.create_stack();
        SubLObject literal = NIL;
        stacks.stack_push(formula, stack);
        while (NIL == stacks.stack_empty_p(stack)) {
            final SubLObject entry = stacks.stack_pop(stack);
            if (NIL != literalP(entry)) {
                literal = entry;
                final SubLObject new_query = funcall(substitute, new_cae_query_search_fragment(literal, gloss, category, justification, offset, end, UNPROVIDED), mt);
                final SubLObject substitution = new_query.first();
                substitutions = cons(cons(literal, substitution), substitutions);
            }
            SubLObject cdolist_list_var = cycl_utilities.formula_args(entry, UNPROVIDED);
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                stacks.stack_push(arg, stack);
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            } 
        } 
        SubLObject cdolist_list_var2 = substitutions;
        SubLObject origXnew = NIL;
        origXnew = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            formula = list_utilities.tree_substitute(formula, origXnew.first(), origXnew.rest());
            cdolist_list_var2 = cdolist_list_var2.rest();
            origXnew = cdolist_list_var2.first();
        } 
        return new_cae_query_search_fragment(formula, gloss, category, justification, offset, end, UNPROVIDED);
    }

    public static SubLObject fill_in_default_values_for_formula(final SubLObject query, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = cae_query_search_default_mt(UNPROVIDED);
        }
        return substitute_formula_literals(query, FILL_IN_DEFAULT_VALUES_FOR_QUERY, mt);
    }

    public static SubLObject maximal_scope(final SubLObject formula) {
        SubLObject literals = NIL;
        SubLObject existentials = NIL;
        SubLObject new_formula = NIL;
        final SubLObject stack = stacks.create_stack();
        stacks.stack_push(formula, stack);
        while (NIL == stacks.stack_empty_p(stack)) {
            final SubLObject entry = stacks.stack_pop(stack);
            if (NIL != literalP(entry)) {
                final SubLObject item_var = entry;
                if (NIL != member(item_var, literals, EQUAL, symbol_function(IDENTITY))) {
                    continue;
                }
                literals = cons(item_var, literals);
            } else
                if (NIL != el_existential_p(entry)) {
                    existentials = cons(cycl_utilities.formula_arg1(entry, UNPROVIDED), existentials);
                    SubLObject cdolist_list_var = cycl_utilities.formula_args(entry, UNPROVIDED).rest();
                    SubLObject arg = NIL;
                    arg = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        stacks.stack_push(arg, stack);
                        cdolist_list_var = cdolist_list_var.rest();
                        arg = cdolist_list_var.first();
                    } 
                } else {
                    if (NIL == el_conjunction_p(entry)) {
                        return formula;
                    }
                    SubLObject cdolist_list_var = cycl_utilities.formula_args(entry, UNPROVIDED);
                    SubLObject arg = NIL;
                    arg = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        stacks.stack_push(arg, stack);
                        cdolist_list_var = cdolist_list_var.rest();
                        arg = cdolist_list_var.first();
                    } 
                }

        } 
        new_formula = (NIL != list_utilities.lengthG(literals, ONE_INTEGER, UNPROVIDED)) ? make_conjunction(literals) : literals.first();
        SubLObject cdolist_list_var2 = existentials;
        SubLObject ex = NIL;
        ex = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            new_formula = make_existential(ex, new_formula);
            cdolist_list_var2 = cdolist_list_var2.rest();
            ex = cdolist_list_var2.first();
        } 
        return new_formula;
    }

    public static SubLObject contains_qp(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stack = stacks.create_stack();
        final SubLObject order_var = $DFR2L;
        final SubLObject possible_orders = list($DFL2R, $DFR2L);
        SubLObject sub = NIL;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.memberP(order_var, possible_orders, symbol_function(EQ), UNPROVIDED))) {
            Errors.error($str555$_S_is_not_one_of__S, order_var, possible_orders);
        }
        stacks.stack_push(phrase, stack);
        while (NIL == stacks.stack_empty_p(stack)) {
            sub = stacks.stack_pop(stack);
            if (NIL != parse_tree.qp_tree_p(sub)) {
                return sub;
            }
            if (NIL == parse_tree.phrase_tree_p(sub)) {
                continue;
            }
            final SubLObject vector_var = parse_tree.get_phrase_tree_daughters(sub);
            final SubLObject backwardP_var = eq(order_var, $DFL2R);
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject daughter;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                daughter = aref(vector_var, element_num);
                stacks.stack_push(daughter, stack);
            }
        } 
        return NIL;
    }

    public static SubLObject get_temprel_modifier(final SubLObject temprel_word) {
        assert NIL != word_tree.word_tree_p(temprel_word) : "word_tree.word_tree_p(temprel_word) " + "CommonSymbols.NIL != word_tree.word_tree_p(temprel_word) " + temprel_word;
        if (NIL != regular_expressions.is_regular_expressions_support_availableP()) {
            final SubLObject temprel_string = methods.funcall_instance_method_with_0_args(temprel_word, GET_STRING);
            final SubLObject left_sister = methods.funcall_instance_method_with_1_args(temprel_word, GET_SISTER, ONE_INTEGER);
            final SubLObject left_sister_string = (NIL != left_sister) ? methods.funcall_instance_method_with_0_args(left_sister, GET_STRING) : $str179$;
            final SubLObject patterns = get_temprel_patterns(cconcatenate(temprel_string, new SubLObject[]{ $$$_, left_sister_string }));
            SubLObject cdolist_list_var = list_utilities.first_n(TWO_INTEGER, methods.funcall_instance_method_with_0_args(temprel_word, GET_ANCESTORS));
            SubLObject ancestor = NIL;
            ancestor = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject yield = methods.funcall_instance_method_with_0_args(ancestor, YIELD);
                final SubLObject string = words_string(yield);
                SubLObject match = NIL;
                if (NIL == match) {
                    SubLObject csome_list_var;
                    SubLObject pattern;
                    for (csome_list_var = patterns, pattern = NIL, pattern = csome_list_var.first(); (NIL == match) && (NIL != csome_list_var); match = regular_expression_utilities.regexp_capturing_match(pattern, string, UNPROVIDED, UNPROVIDED) , csome_list_var = csome_list_var.rest() , pattern = csome_list_var.first()) {
                    }
                }
                if (NIL != match) {
                    return second(match);
                }
                cdolist_list_var = cdolist_list_var.rest();
                ancestor = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject get_temprel_patterns(final SubLObject temprel) {
        return list(new SubLObject[]{ cconcatenate($str557$_less_than__a_zA_Z0_9___s__days__, temprel), cconcatenate($str558$_less_than__a_zA_Z0_9___s__months, temprel), cconcatenate($str559$_less_than__a_zA_Z0_9___s__weeks_, temprel), cconcatenate($str560$_less_than__a_zA_Z0_9___s__years_, temprel), cconcatenate($str561$_more_than__a_zA_Z0_9___s__days__, temprel), cconcatenate($str562$_more_than__a_zA_Z0_9___s__months, temprel), cconcatenate($str563$_more_than__a_zA_Z0_9___s__weeks_, temprel), cconcatenate($str564$_more_than__a_zA_Z0_9___s__years_, temprel), cconcatenate($str565$_no_later_than__a_zA_Z0_9___s__da, temprel), cconcatenate($str566$_no_later_than__a_zA_Z0_9___s__mo, temprel), cconcatenate($str567$_no_later_than__a_zA_Z0_9___s__we, temprel), cconcatenate($str568$_no_later_than__a_zA_Z0_9___s__ye, temprel) });
    }

    public static SubLObject interpret_temprel_modifier(final SubLObject modifier) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject records = NIL;
        final SubLObject words = string_utilities.split_string(modifier, UNPROVIDED);
        final SubLObject first_word = (NIL != words) ? document.new_word(list($STRING, words.first())) : NIL;
        SubLObject cdolist_list_var = Mapping.mapcar(SECOND, rkf_text_processors.rkf_term_reader(modifier, $cae_query_translation_parsing_mt$.getDynamicValue(thread), $cae_query_translation_domain_mt$.getDynamicValue(thread), $$TemporalModifierTemplate));
        SubLObject cycl = NIL;
        cycl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            records = cons(new_term_record(NIL, first_word, cycl), records);
            cdolist_list_var = cdolist_list_var.rest();
            cycl = cdolist_list_var.first();
        } 
        return records;
    }

    public static SubLObject temp_relations_equal(final SubLObject tr1, final SubLObject tr2) {
        assert NIL != listp(tr1) : "Types.listp(tr1) " + "CommonSymbols.NIL != Types.listp(tr1) " + tr1;
        assert NIL != listp(tr2) : "Types.listp(tr2) " + "CommonSymbols.NIL != Types.listp(tr2) " + tr2;
        if (!length(tr1).numE(length(tr2))) {
            return NIL;
        }
        SubLObject cdolist_list_var = tr1;
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == member(result, tr2, TEMP_RELATION_EQUAL, UNPROVIDED)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject temp_relation_equal(final SubLObject tr1, final SubLObject tr2) {
        SubLObject formula1 = NIL;
        destructuring_bind_must_consp(tr1, tr1, $list572);
        formula1 = tr1.first();
        SubLObject current = tr1.rest();
        destructuring_bind_must_consp(current, tr1, $list572);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject gloss1 = NIL;
        SubLObject varmap1 = NIL;
        destructuring_bind_must_consp(current, tr1, $list572);
        gloss1 = current.first();
        current = varmap1 = current.rest();
        current = temp;
        SubLObject category1 = NIL;
        destructuring_bind_must_consp(current, tr1, $list572);
        category1 = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject formula2 = NIL;
            destructuring_bind_must_consp(tr2, tr2, $list573);
            formula2 = tr2.first();
            SubLObject current_$120 = tr2.rest();
            destructuring_bind_must_consp(current_$120, tr2, $list573);
            final SubLObject temp_$121 = current_$120.rest();
            current_$120 = current_$120.first();
            SubLObject gloss2 = NIL;
            SubLObject varmap2 = NIL;
            destructuring_bind_must_consp(current_$120, tr2, $list573);
            gloss2 = current_$120.first();
            current_$120 = varmap2 = current_$120.rest();
            current_$120 = temp_$121;
            SubLObject category2 = NIL;
            destructuring_bind_must_consp(current_$120, tr2, $list573);
            category2 = current_$120.first();
            current_$120 = current_$120.rest();
            if (NIL == current_$120) {
                return makeBoolean((NIL != czer_utilities.equals_elP(formula1, formula2, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && gloss1.equal(gloss2));
            }
            cdestructuring_bind_error(tr2, $list573);
        } else {
            cdestructuring_bind_error(tr1, $list572);
        }
        return NIL;
    }

    public static SubLObject compile_comparator_regexes() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != regular_expressions.is_regular_expressions_support_availableP()) && (NIL == $comparator_patterns$.getDynamicValue(thread))) {
            SubLObject cdolist_list_var = $comparator_regexes$.getDynamicValue(thread);
            SubLObject reXcycl = NIL;
            reXcycl = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                $comparator_patterns$.setDynamicValue(cons(cons(regular_expressions.compile_regular_expression(reXcycl.first(), UNPROVIDED), reXcycl.rest()), $comparator_patterns$.getDynamicValue(thread)), thread);
                cdolist_list_var = cdolist_list_var.rest();
                reXcycl = cdolist_list_var.first();
            } 
        }
        return $comparator_patterns$.getDynamicValue(thread);
    }

    public static SubLObject finalize_comparator_regexes() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != regular_expressions.is_regular_expressions_support_availableP()) {
            SubLObject cdolist_list_var = $comparator_patterns$.getDynamicValue(thread);
            SubLObject p = NIL;
            p = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                regular_expressions.discard_regular_expression_pattern(p.first());
                cdolist_list_var = cdolist_list_var.rest();
                p = cdolist_list_var.first();
            } 
            $comparator_patterns$.setDynamicValue(NIL, thread);
        }
        return NIL;
    }

    public static SubLObject translate_comparators(final SubLObject string, SubLObject records) {
        if (records == UNPROVIDED) {
            records = terms_from_cae_query(string, UNPROVIDED);
        }
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        return translate_comparator_records(remove_duplicates(append(get_comparators(string), records), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject get_comparators(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject token_records = NIL;
        if (NIL != regular_expressions.is_regular_expressions_support_availableP()) {
            SubLObject cdolist_list_var = $comparator_patterns$.getDynamicValue(thread);
            SubLObject patternXcycl = NIL;
            patternXcycl = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$122 = regular_expression_utilities.find_all_matches_within_string(patternXcycl.first(), string, NIL, NIL, UNPROVIDED, UNPROVIDED);
                SubLObject startXend = NIL;
                startXend = cdolist_list_var_$122.first();
                while (NIL != cdolist_list_var_$122) {
                    SubLObject current;
                    final SubLObject datum = current = startXend;
                    SubLObject start = NIL;
                    SubLObject end = NIL;
                    destructuring_bind_must_consp(current, datum, $list576);
                    start = current.first();
                    current = end = current.rest();
                    token_records = cons(new_token_record(subseq(string, start, end), list(patternXcycl.rest()), start, number_utilities.f_1_(end)), token_records);
                    cdolist_list_var_$122 = cdolist_list_var_$122.rest();
                    startXend = cdolist_list_var_$122.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                patternXcycl = cdolist_list_var.first();
            } 
        }
        return token_records;
    }

    public static SubLObject translate_comparator_records(final SubLObject records) {
        compile_comparator_regexes();
        final SubLObject trv = new_token_record_vector(records);
        SubLObject i = ZERO_INTEGER;
        SubLObject cycls = NIL;
        final SubLObject vector_var = trv;
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject tr;
        SubLObject cdolist_list_var;
        SubLObject cycl;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            tr = aref(vector_var, element_num);
            if (NIL != comparator_record_p(tr)) {
                cdolist_list_var = translate_comparator(i, trv);
                cycl = NIL;
                cycl = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    cycls = cons(cycl, cycls);
                    cdolist_list_var = cdolist_list_var.rest();
                    cycl = cdolist_list_var.first();
                } 
            }
            i = add(i, ONE_INTEGER);
        }
        return cycls;
    }

    public static SubLObject comparator_record_p(final SubLObject tr) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = token_record_denotations(tr);
        SubLObject denot = NIL;
        denot = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != member(denot, $comparator_predicates$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            denot = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject translate_comparator(final SubLObject i, final SubLObject trv) {
        SubLObject cycls = NIL;
        SubLObject cdolist_list_var = get_left_comparator_args(i, trv);
        SubLObject left_arg = NIL;
        left_arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$123 = new_comparator_cycls(token_record_denotations(left_arg), token_record_denotations(trv_get(trv, i)), $list91);
            SubLObject cycl = NIL;
            cycl = cdolist_list_var_$123.first();
            while (NIL != cdolist_list_var_$123) {
                cycls = cons(cycl, cycls);
                cdolist_list_var_$123 = cdolist_list_var_$123.rest();
                cycl = cdolist_list_var_$123.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            left_arg = cdolist_list_var.first();
        } 
        cdolist_list_var = get_right_comparator_args(i, trv);
        SubLObject right_arg = NIL;
        right_arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$124 = new_comparator_cycls($list91, token_record_denotations(trv_get(trv, i)), token_record_denotations(right_arg));
            SubLObject cycl = NIL;
            cycl = cdolist_list_var_$124.first();
            while (NIL != cdolist_list_var_$124) {
                cycls = cons(cycl, cycls);
                cdolist_list_var_$124 = cdolist_list_var_$124.rest();
                cycl = cdolist_list_var_$124.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            right_arg = cdolist_list_var.first();
        } 
        return cycls;
    }

    public static SubLObject get_left_comparator_args(final SubLObject i, final SubLObject trv) {
        SubLObject candidates = NIL;
        final SubLObject predicate = trv_get(trv, i);
        final SubLObject start = token_record_offset(predicate);
        for (SubLObject j = number_utilities.f_1_(i); j.numGE(ZERO_INTEGER); j = subtract(j, ONE_INTEGER)) {
            if (add(token_record_end(trv_get(trv, j)), THREE_INTEGER).numGE(start)) {
                candidates = cons(trv_get(trv, j), candidates);
            }
        }
        return candidates;
    }

    public static SubLObject get_right_comparator_args(final SubLObject i, final SubLObject trv) {
        SubLObject candidates = NIL;
        final SubLObject predicate = trv_get(trv, i);
        final SubLObject end = token_record_end(predicate);
        for (SubLObject size = trv_size(trv), j = number_utilities.f_1X(i); j.numL(size); j = add(j, ONE_INTEGER)) {
            if (subtract(token_record_offset(trv_get(trv, j)), THREE_INTEGER).numLE(end)) {
                candidates = cons(trv_get(trv, j), candidates);
            }
        }
        return candidates;
    }

    public static SubLObject new_comparator_cycls(final SubLObject left_args, final SubLObject predicates, final SubLObject right_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cycls = NIL;
        SubLObject cdolist_list_var = left_args;
        SubLObject la = NIL;
        la = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$125 = predicates;
            SubLObject pred = NIL;
            pred = cdolist_list_var_$125.first();
            while (NIL != cdolist_list_var_$125) {
                SubLObject cdolist_list_var_$126 = right_args;
                SubLObject ra = NIL;
                ra = cdolist_list_var_$126.first();
                while (NIL != cdolist_list_var_$126) {
                    if ((NIL != comparator_arg_p(la)) && (NIL != comparator_arg_p(ra))) {
                        final SubLObject formula = make_formula(pred, list(la, ra), UNPROVIDED);
                        if (NIL != query_search_wffP(formula, $cae_query_translation_wff_mt$.getDynamicValue(thread), UNPROVIDED)) {
                            cycls = cons(formula, cycls);
                        }
                    }
                    cdolist_list_var_$126 = cdolist_list_var_$126.rest();
                    ra = cdolist_list_var_$126.first();
                } 
                cdolist_list_var_$125 = cdolist_list_var_$125.rest();
                pred = cdolist_list_var_$125.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            la = cdolist_list_var.first();
        } 
        return cycls;
    }

    public static SubLObject comparator_arg_p(final SubLObject thing) {
        return makeBoolean(((NIL != cycl_grammar.el_variable_p(thing)) || thing.isNumber()) || (NIL != fact_sheets.scalar_interval_p(thing, UNPROVIDED)));
    }

    public static SubLObject token_record_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_token_record(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject token_record_p(final SubLObject v_object) {
        return v_object.getClass() == cae_query_search.$token_record_native.class ? T : NIL;
    }

    public static SubLObject tr_string(final SubLObject v_object) {
        assert NIL != token_record_p(v_object) : "cae_query_search.token_record_p(v_object) " + "CommonSymbols.NIL != cae_query_search.token_record_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject tr_denotations(final SubLObject v_object) {
        assert NIL != token_record_p(v_object) : "cae_query_search.token_record_p(v_object) " + "CommonSymbols.NIL != cae_query_search.token_record_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject tr_offset(final SubLObject v_object) {
        assert NIL != token_record_p(v_object) : "cae_query_search.token_record_p(v_object) " + "CommonSymbols.NIL != cae_query_search.token_record_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject tr_end(final SubLObject v_object) {
        assert NIL != token_record_p(v_object) : "cae_query_search.token_record_p(v_object) " + "CommonSymbols.NIL != cae_query_search.token_record_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_tr_string(final SubLObject v_object, final SubLObject value) {
        assert NIL != token_record_p(v_object) : "cae_query_search.token_record_p(v_object) " + "CommonSymbols.NIL != cae_query_search.token_record_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_tr_denotations(final SubLObject v_object, final SubLObject value) {
        assert NIL != token_record_p(v_object) : "cae_query_search.token_record_p(v_object) " + "CommonSymbols.NIL != cae_query_search.token_record_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_tr_offset(final SubLObject v_object, final SubLObject value) {
        assert NIL != token_record_p(v_object) : "cae_query_search.token_record_p(v_object) " + "CommonSymbols.NIL != cae_query_search.token_record_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_tr_end(final SubLObject v_object, final SubLObject value) {
        assert NIL != token_record_p(v_object) : "cae_query_search.token_record_p(v_object) " + "CommonSymbols.NIL != cae_query_search.token_record_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_token_record(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new cae_query_search.$token_record_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($STRING)) {
                _csetf_tr_string(v_new, current_value);
            } else
                if (pcase_var.eql($DENOTATIONS)) {
                    _csetf_tr_denotations(v_new, current_value);
                } else
                    if (pcase_var.eql($OFFSET)) {
                        _csetf_tr_offset(v_new, current_value);
                    } else
                        if (pcase_var.eql($END)) {
                            _csetf_tr_end(v_new, current_value);
                        } else {
                            Errors.error($str452$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_token_record(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_TOKEN_RECORD, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $STRING, tr_string(obj));
        funcall(visitor_fn, obj, $SLOT, $DENOTATIONS, tr_denotations(obj));
        funcall(visitor_fn, obj, $SLOT, $OFFSET, tr_offset(obj));
        funcall(visitor_fn, obj, $SLOT, $END, tr_end(obj));
        funcall(visitor_fn, obj, $END, MAKE_TOKEN_RECORD, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_token_record_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_token_record(obj, visitor_fn);
    }

    public static SubLObject print_token_record(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str598$_TOKEN_RECORD__S__S__S__S_, new SubLObject[]{ tr_string(v_object), tr_denotations(v_object), tr_offset(v_object), tr_end(v_object) });
        return v_object;
    }

    public static SubLObject new_token_record(final SubLObject string, final SubLObject denotations, final SubLObject offset, final SubLObject end) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        assert NIL != listp(denotations) : "Types.listp(denotations) " + "CommonSymbols.NIL != Types.listp(denotations) " + denotations;
        if (((NIL != offset) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == subl_promotions.non_negative_integer_p(offset))) {
            throw new AssertionError(offset);
        }
        if (((NIL != end) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == subl_promotions.non_negative_integer_p(end))) {
            throw new AssertionError(end);
        }
        final SubLObject record = make_token_record(UNPROVIDED);
        _csetf_tr_string(record, string);
        _csetf_tr_denotations(record, denotations);
        _csetf_tr_offset(record, offset);
        _csetf_tr_end(record, end);
        return record;
    }

    public static SubLObject token_record_string(final SubLObject record) {
        assert NIL != token_record_p(record) : "cae_query_search.token_record_p(record) " + "CommonSymbols.NIL != cae_query_search.token_record_p(record) " + record;
        return tr_string(record);
    }

    public static SubLObject token_record_denotations(final SubLObject record) {
        assert NIL != token_record_p(record) : "cae_query_search.token_record_p(record) " + "CommonSymbols.NIL != cae_query_search.token_record_p(record) " + record;
        return tr_denotations(record);
    }

    public static SubLObject token_record_offset(final SubLObject record) {
        assert NIL != token_record_p(record) : "cae_query_search.token_record_p(record) " + "CommonSymbols.NIL != cae_query_search.token_record_p(record) " + record;
        return tr_offset(record);
    }

    public static SubLObject token_record_end(final SubLObject record) {
        assert NIL != token_record_p(record) : "cae_query_search.token_record_p(record) " + "CommonSymbols.NIL != cae_query_search.token_record_p(record) " + record;
        return tr_end(record);
    }

    public static SubLObject token_record_focal_string(final SubLObject record) {
        assert NIL != token_record_p(record) : "cae_query_search.token_record_p(record) " + "CommonSymbols.NIL != cae_query_search.token_record_p(record) " + record;
        final SubLObject string = token_record_string(record);
        final SubLObject end = token_record_end(record);
        return string_utilities.substring(string, token_record_offset(record), NIL != list_utilities.lengthG(string, end, UNPROVIDED) ? number_utilities.f_1X(end) : NIL);
    }

    public static SubLObject token_record_plist(final SubLObject record) {
        assert NIL != token_record_p(record) : "cae_query_search.token_record_p(record) " + "CommonSymbols.NIL != cae_query_search.token_record_p(record) " + record;
        return list($STRING, token_record_string(record), $DENOTATIONS, token_record_denotations(record), $OFFSET, token_record_offset(record), $END, token_record_end(record));
    }

    public static SubLObject sxhash_token_record_method(final SubLObject v_object) {
        return sxhash_token_record(v_object);
    }

    public static SubLObject sxhash_token_record(final SubLObject record) {
        return Sxhash.sxhash(tr_string(record));
    }

    public static SubLObject new_token_record_vector(final SubLObject records) {
        assert NIL != listp(records) : "Types.listp(records) " + "CommonSymbols.NIL != Types.listp(records) " + records;
        return list_utilities.list2vector(Sort.sort(records, $sym366$_, TR_OFFSET));
    }

    public static SubLObject trv_size(final SubLObject trv) {
        return length(trv);
    }

    public static SubLObject trv_get(final SubLObject trv, final SubLObject i) {
        return aref(trv, i);
    }

    public static SubLObject clear_get_reified_queries_from_string() {
        final SubLObject cs = $get_reified_queries_from_string_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_reified_queries_from_string(final SubLObject string, SubLObject task, SubLObject query_type) {
        if (task == UNPROVIDED) {
            task = current_cae_task();
        }
        if (query_type == UNPROVIDED) {
            query_type = $$CycLQuerySpecification;
        }
        return memoization_state.caching_state_remove_function_results_with_args($get_reified_queries_from_string_caching_state$.getGlobalValue(), list(string, task, query_type), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_reified_queries_from_string_internal(final SubLObject string, final SubLObject task, final SubLObject query_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $current_cae_task$.currentBinding(thread);
        try {
            $current_cae_task$.bind(task, thread);
            final SubLObject terms = delete_duplicates(filtered_terms_from_cae_query(string, cae_query_search_default_mt(task), UNPROVIDED), symbol_function(EQUAL), symbol_function(TOKEN_RECORD_FOCAL_STRING), UNPROVIDED, UNPROVIDED);
            final SubLObject kbqs = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
            SubLObject ans = NIL;
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
            final SubLObject _prev_bind_0_$127 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject _prev_bind_0_$128 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        SubLObject cdolist_list_var = terms;
                        SubLObject token_record = NIL;
                        token_record = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject cdolist_list_var_$129 = possibly_augment_query_search_terms(token_record_denotations(token_record), UNPROVIDED);
                            SubLObject v_term = NIL;
                            v_term = cdolist_list_var_$129.first();
                            while (NIL != cdolist_list_var_$129) {
                                check_term_for_reified_queries(v_term, query_type, token_record, kbqs, UNPROVIDED);
                                cdolist_list_var_$129 = cdolist_list_var_$129.rest();
                                v_term = cdolist_list_var_$129.first();
                            } 
                            cdolist_list_var = cdolist_list_var.rest();
                            token_record = cdolist_list_var.first();
                        } 
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$128, thread);
                    }
                    ans = dictionary_utilities.sort_dictionary_by_values(kbqs, $sym603$REIFIED_QUERY_SEARCH_SUPPORTS_SCORE__);
                } finally {
                    final SubLObject _prev_bind_0_$129 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$129, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$127, thread);
            }
            return ans;
        } finally {
            $current_cae_task$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject get_reified_queries_from_string(final SubLObject string, SubLObject task, SubLObject query_type) {
        if (task == UNPROVIDED) {
            task = current_cae_task();
        }
        if (query_type == UNPROVIDED) {
            query_type = $$CycLQuerySpecification;
        }
        SubLObject caching_state = $get_reified_queries_from_string_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_REIFIED_QUERIES_FROM_STRING, $get_reified_queries_from_string_caching_state$, NIL, EQUAL, THREE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_GET_REIFIED_QUERIES_FROM_STRING);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(string, task, query_type);
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
                    if (task.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && query_type.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_reified_queries_from_string_internal(string, task, query_type)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(string, task, query_type));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject check_term_for_reified_queries(final SubLObject v_term, final SubLObject query_type, final SubLObject token_record, final SubLObject kbqs, SubLObject denot) {
        if (denot == UNPROVIDED) {
            denot = v_term;
        }
        if (NIL != indexed_term_p(v_term)) {
            if (NIL != kb_mapping_macros.do_other_index_key_validator(v_term, NIL)) {
                final SubLObject final_index_spec = kb_mapping_macros.other_final_index_spec(v_term);
                SubLObject final_index_iterator = NIL;
                try {
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(as));
                        if ((NIL != valid) && (NIL != kb_mapping_macros.do_other_index_assertion_match_p(as))) {
                            check_assertion_for_reified_query(as, query_type, token_record, denot, kbqs);
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                } finally {
                    final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        final SubLObject _values = getValuesAsVector();
                        if (NIL != final_index_iterator) {
                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, NIL, NIL)) {
                final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, NIL, NIL);
                SubLObject done_var2 = NIL;
                final SubLObject token_var2 = NIL;
                while (NIL == done_var2) {
                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var2);
                    final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                    if (NIL != valid2) {
                        SubLObject final_index_iterator2 = NIL;
                        try {
                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, NIL, NIL);
                            SubLObject done_var_$131 = NIL;
                            final SubLObject token_var_$132 = NIL;
                            while (NIL == done_var_$131) {
                                final SubLObject tou = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$132);
                                final SubLObject valid_$133 = makeBoolean(!token_var_$132.eql(tou));
                                if (NIL != valid_$133) {
                                    check_term_for_reified_queries(assertions_high.gaf_arg1(tou), query_type, token_record, kbqs, denot);
                                }
                                done_var_$131 = makeBoolean(NIL == valid_$133);
                            } 
                        } finally {
                            final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values2 = getValuesAsVector();
                                if (NIL != final_index_iterator2) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                }
                                restoreValuesFromVector(_values2);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_2);
                            }
                        }
                    }
                    done_var2 = makeBoolean(NIL == valid2);
                } 
            }
        } else
            if (NIL != narts_high.naut_p(v_term)) {
                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(cycl_utilities.formula_terms(v_term, UNPROVIDED), UNPROVIDED);
                SubLObject as2 = NIL;
                as2 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    check_assertion_for_reified_query(as2, query_type, token_record, v_term, kbqs);
                    cdolist_list_var = cdolist_list_var.rest();
                    as2 = cdolist_list_var.first();
                } 
            }

        return kbqs;
    }

    public static SubLObject check_assertion_for_reified_query(final SubLObject as, final SubLObject query_type, final SubLObject token_record, final SubLObject v_term, final SubLObject kbqs) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(as, $const606$sentenceParameterValueInSpecifica)) {
            final SubLObject kbq = assertions_high.gaf_arg2(as);
            if (NIL != isa.isaP(kbq, query_type, UNPROVIDED, UNPROVIDED)) {
                final SubLObject item = list(token_record, v_term);
                if (NIL == subl_promotions.memberP(item, dictionary.dictionary_lookup_without_values(kbqs, kbq, UNPROVIDED), symbol_function(EQUALP), UNPROVIDED)) {
                    dictionary_utilities.dictionary_add_to_value_sorted(kbqs, kbq, item, symbol_function($sym607$REIFIED_QUERY_SEARCH_SUPPORT_SCORE__), symbol_function(IDENTITY));
                }
            }
        }
        return kbqs;
    }

    public static SubLObject reified_query_search_supports_score_G(final SubLObject supports1, final SubLObject supports2) {
        return numG(reified_query_search_score_from_supports(supports1), reified_query_search_score_from_supports(supports2));
    }

    public static SubLObject reified_query_search_support_score_G(final SubLObject support1, final SubLObject support2) {
        return numG(reified_query_search_score_from_support(support1), reified_query_search_score_from_support(support2));
    }

    public static SubLObject reified_query_search_score_from_supports(final SubLObject supports) {
        SubLObject score = ZERO_INTEGER;
        SubLObject cdolist_list_var = supports;
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            score = add(score, reified_query_search_score_from_support(support));
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        return score;
    }

    public static SubLObject reified_query_search_score_from_support(final SubLObject support) {
        SubLObject token_record = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(support, support, $list608);
        token_record = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list608);
        v_term = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(support, $list608);
            return NIL;
        }
        final SubLObject focal_string = token_record_focal_string(token_record);
        final SubLObject raw_score = length(focal_string);
        if (NIL != member(v_term, lexicon_lookup_memoized(get_cae_query_search_lexicon(UNPROVIDED), focal_string), symbol_function(EQUAL), symbol_function(LEX_ENTRY_DENOT))) {
            return raw_score;
        }
        return floor(multiply(raw_score, $float$0_75), UNPROVIDED);
    }

    public static SubLObject lexicon_lookup_memoized_internal(final SubLObject lexicon, final SubLObject string) {
        return methods.funcall_instance_method_with_1_args(lexicon, GET, string);
    }

    public static SubLObject lexicon_lookup_memoized(final SubLObject lexicon, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return lexicon_lookup_memoized_internal(lexicon, string);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, LEXICON_LOOKUP_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), LEXICON_LOOKUP_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, LEXICON_LOOKUP_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(lexicon, string);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (lexicon.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && string.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(lexicon_lookup_memoized_internal(lexicon, string)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(lexicon, string));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject print_reified_query_search_test_case_table(final SubLObject query_type, final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject el_task = cycl_utilities.hl_to_el(task);
        final SubLObject el_query_type = cycl_utilities.hl_to_el(query_type);
        SubLObject test_cases = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject _prev_bind_0_$134 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_1_$135 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$136 = query_type;
                    final SubLObject deck_type = $STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$135 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = NIL;
                            final SubLObject _prev_bind_0_$136 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$136 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str619$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str619$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str619$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str624$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str619$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                final SubLObject _prev_bind_0_$137 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$137 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(query_type, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                        final SubLObject _prev_bind_0_$138 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$138 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$144 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$136, UNPROVIDED);
                                            while (NIL != node_var_$136) {
                                                final SubLObject tt_node_var = node_var_$136;
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$139 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$139 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$140 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$148;
                                                                                for (iteration_state_$148 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$148); iteration_state_$148 = dictionary_contents.do_dictionary_contents_next(iteration_state_$148)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$148);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$141 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject kbq;
                                                                                                SubLObject gloss;
                                                                                                SubLObject el_kbq;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    kbq = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, kbq)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(kbq, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(kbq, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        gloss = kb_mapping_utilities.fpred_value(kbq, $$queryContentString, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                        el_kbq = cycl_utilities.hl_to_el(kbq);
                                                                                                        if (((gloss.isString() && (NIL != kb_mapping_utilities.some_pred_value(kbq, $const606$sentenceParameterValueInSpecifica, TWO_INTEGER, UNPROVIDED))) && (NIL == subl_promotions.memberP(gloss, $bad_query_search_strings$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED))) && (NIL == subl_promotions.memberP(el_kbq, $bad_query_search_queries$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED))) {
                                                                                                            test_cases = cons(list(list(gloss, el_task, el_query_type), el_kbq), test_cases);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject kbq2 = NIL;
                                                                                                    kbq2 = csome_list_var.first();
                                                                                                    while (NIL != csome_list_var) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(kbq2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(kbq2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            final SubLObject gloss2 = kb_mapping_utilities.fpred_value(kbq2, $$queryContentString, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                            final SubLObject el_kbq2 = cycl_utilities.hl_to_el(kbq2);
                                                                                                            if (((gloss2.isString() && (NIL != kb_mapping_utilities.some_pred_value(kbq2, $const606$sentenceParameterValueInSpecifica, TWO_INTEGER, UNPROVIDED))) && (NIL == subl_promotions.memberP(gloss2, $bad_query_search_strings$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED))) && (NIL == subl_promotions.memberP(el_kbq2, $bad_query_search_queries$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED))) {
                                                                                                                test_cases = cons(list(list(gloss2, el_task, el_query_type), el_kbq2), test_cases);
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        kbq2 = csome_list_var.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str626$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$141, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$148);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$140, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str627$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                            if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (NIL != csome_list_var2) {
                                                                    SubLObject current;
                                                                    final SubLObject datum = current = instance_tuple;
                                                                    SubLObject link_node = NIL;
                                                                    SubLObject mt2 = NIL;
                                                                    SubLObject tv2 = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list628);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list628);
                                                                    mt2 = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list628);
                                                                    tv2 = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                            final SubLObject _prev_bind_0_$142 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$143 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = list(link_node);
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject kbq;
                                                                                            SubLObject gloss;
                                                                                            SubLObject el_kbq;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                kbq = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, kbq)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(kbq, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(kbq, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    gloss = kb_mapping_utilities.fpred_value(kbq, $$queryContentString, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                    el_kbq = cycl_utilities.hl_to_el(kbq);
                                                                                                    if (((gloss.isString() && (NIL != kb_mapping_utilities.some_pred_value(kbq, $const606$sentenceParameterValueInSpecifica, TWO_INTEGER, UNPROVIDED))) && (NIL == subl_promotions.memberP(gloss, $bad_query_search_strings$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED))) && (NIL == subl_promotions.memberP(el_kbq, $bad_query_search_queries$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED))) {
                                                                                                        test_cases = cons(list(list(gloss, el_task, el_query_type), el_kbq), test_cases);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var_$152 = sol;
                                                                                                SubLObject kbq2 = NIL;
                                                                                                kbq2 = csome_list_var_$152.first();
                                                                                                while (NIL != csome_list_var_$152) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(kbq2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(kbq2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        final SubLObject gloss2 = kb_mapping_utilities.fpred_value(kbq2, $$queryContentString, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                        final SubLObject el_kbq2 = cycl_utilities.hl_to_el(kbq2);
                                                                                                        if (((gloss2.isString() && (NIL != kb_mapping_utilities.some_pred_value(kbq2, $const606$sentenceParameterValueInSpecifica, TWO_INTEGER, UNPROVIDED))) && (NIL == subl_promotions.memberP(gloss2, $bad_query_search_strings$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED))) && (NIL == subl_promotions.memberP(el_kbq2, $bad_query_search_queries$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED))) {
                                                                                                            test_cases = cons(list(list(gloss2, el_task, el_query_type), el_kbq2), test_cases);
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var_$152 = csome_list_var_$152.rest();
                                                                                                    kbq2 = csome_list_var_$152.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str626$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$143, thread);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$142, thread);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list628);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                } 
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$153;
                                                                final SubLObject new_list = cdolist_list_var_$153 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn = NIL;
                                                                generating_fn = cdolist_list_var_$153.first();
                                                                while (NIL != cdolist_list_var_$153) {
                                                                    final SubLObject _prev_bind_0_$144 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject kbq3;
                                                                            SubLObject gloss3;
                                                                            SubLObject el_kbq3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                kbq3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, kbq3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(kbq3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(kbq3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    gloss3 = kb_mapping_utilities.fpred_value(kbq3, $$queryContentString, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                    el_kbq3 = cycl_utilities.hl_to_el(kbq3);
                                                                                    if (((gloss3.isString() && (NIL != kb_mapping_utilities.some_pred_value(kbq3, $const606$sentenceParameterValueInSpecifica, TWO_INTEGER, UNPROVIDED))) && (NIL == subl_promotions.memberP(gloss3, $bad_query_search_strings$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED))) && (NIL == subl_promotions.memberP(el_kbq3, $bad_query_search_queries$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED))) {
                                                                                        test_cases = cons(list(list(gloss3, el_task, el_query_type), el_kbq3), test_cases);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                SubLObject csome_list_var3 = sol2;
                                                                                SubLObject kbq4 = NIL;
                                                                                kbq4 = csome_list_var3.first();
                                                                                while (NIL != csome_list_var3) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(kbq4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(kbq4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        final SubLObject gloss4 = kb_mapping_utilities.fpred_value(kbq4, $$queryContentString, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                        final SubLObject el_kbq4 = cycl_utilities.hl_to_el(kbq4);
                                                                                        if (((gloss4.isString() && (NIL != kb_mapping_utilities.some_pred_value(kbq4, $const606$sentenceParameterValueInSpecifica, TWO_INTEGER, UNPROVIDED))) && (NIL == subl_promotions.memberP(gloss4, $bad_query_search_strings$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED))) && (NIL == subl_promotions.memberP(el_kbq4, $bad_query_search_queries$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED))) {
                                                                                            test_cases = cons(list(list(gloss4, el_task, el_query_type), el_kbq4), test_cases);
                                                                                        }
                                                                                    }
                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                    kbq4 = csome_list_var3.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str626$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$144, thread);
                                                                    }
                                                                    cdolist_list_var_$153 = cdolist_list_var_$153.rest();
                                                                    generating_fn = cdolist_list_var_$153.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$139, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$139, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                } 
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                SubLObject module_var2 = NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$145 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$140 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$136);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                            final SubLObject _prev_bind_0_$146 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                SubLObject iteration_state_$149;
                                                                                for (iteration_state_$149 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$149); iteration_state_$149 = dictionary_contents.do_dictionary_contents_next(iteration_state_$149)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$149);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$147 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol3 = link_nodes4;
                                                                                            if (NIL != set.set_p(sol3)) {
                                                                                                final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                SubLObject basis_object3;
                                                                                                SubLObject state3;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol3.isList()) {
                                                                                                    SubLObject csome_list_var4 = sol3;
                                                                                                    SubLObject node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                    while (NIL != csome_list_var4) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var4 = csome_list_var4.rest();
                                                                                                        node_vars_link_node2 = csome_list_var4.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str626$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$147, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$149);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$146, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str627$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$154;
                                                                final SubLObject new_list2 = cdolist_list_var_$154 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn2 = NIL;
                                                                generating_fn2 = cdolist_list_var_$154.first();
                                                                while (NIL != cdolist_list_var_$154) {
                                                                    final SubLObject _prev_bind_0_$148 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                        final SubLObject sol4;
                                                                        final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                        if (NIL != set.set_p(sol4)) {
                                                                            final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                            SubLObject basis_object4;
                                                                            SubLObject state4;
                                                                            SubLObject node_vars_link_node3;
                                                                            for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol4.isList()) {
                                                                                SubLObject csome_list_var5 = sol4;
                                                                                SubLObject node_vars_link_node4 = NIL;
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                                while (NIL != csome_list_var5) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                    }
                                                                                    csome_list_var5 = csome_list_var5.rest();
                                                                                    node_vars_link_node4 = csome_list_var5.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str626$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$148, thread);
                                                                    }
                                                                    cdolist_list_var_$154 = cdolist_list_var_$154.rest();
                                                                    generating_fn2 = cdolist_list_var_$154.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$140, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$145, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                } 
                                                node_var_$136 = deck.deck_pop(recur_deck);
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$144, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$138, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$138, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str629$Node__a_does_not_pass_sbhl_type_t, query_type, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$137, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$137, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$136, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$136, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$149 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$149, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$135, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$150 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$150, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$135, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$134, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        princ($str630$_define_test_case_table_get_reifi, UNPROVIDED);
        format_nil.print_one_per_line(nreverse(test_cases), UNPROVIDED);
        princ($str631$_, UNPROVIDED);
        return NIL;
    }

    public static SubLObject reified_query_answer_foundP(final SubLObject actual, final SubLObject target) {
        if (NIL != list_utilities.empty_list_p(actual)) {
            return NIL;
        }
        final SubLObject total = length(actual);
        final SubLObject kbq = czer_main.canonicalize_term(target, UNPROVIDED);
        final SubLObject value = reified_query_search_score_from_supports(list_utilities.alist_lookup_without_values(actual, kbq, UNPROVIDED, UNPROVIDED));
        final SubLObject all_results = Mapping.mapcar(symbol_function(CDR), actual);
        final SubLObject best_value = reified_query_search_score_from_supports(number_utilities.maximum(all_results, symbol_function(REIFIED_QUERY_SEARCH_SCORE_FROM_SUPPORTS)));
        final SubLObject median_value = number_utilities.median_sorted(all_results, total, symbol_function(REIFIED_QUERY_SEARCH_SCORE_FROM_SUPPORTS), UNPROVIDED);
        return makeBoolean((NIL != value) && (value.numGE(multiply(best_value, $float$0_5)) || value.numGE(median_value)));
    }

    public static SubLObject filtered_terms_from_medical_cae_query(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $current_cae_task$.currentBinding(thread);
        try {
            $current_cae_task$.bind($const312$GenericMedicalResearchTask_Allotm, thread);
            SubLObject cdolist_list_var = filtered_terms_from_cae_query(string, UNPROVIDED, UNPROVIDED);
            SubLObject token_record = NIL;
            token_record = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = cons(cons(token_record_string(token_record), token_record_denotations(token_record)), result);
                cdolist_list_var = cdolist_list_var.rest();
                token_record = cdolist_list_var.first();
            } 
        } finally {
            $current_cae_task$.rebind(_prev_bind_0, thread);
        }
        return nreverse(result);
    }

    public static SubLObject test_fill_in_gloss_template_string(final SubLObject gloss_template, final SubLObject variable, final SubLObject token, final SubLObject formula, final SubLObject variable_format, SubLObject offset, SubLObject end, SubLObject token_is_paraphraseP) {
        if (offset == UNPROVIDED) {
            offset = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (token_is_paraphraseP == UNPROVIDED) {
            token_is_paraphraseP = NIL;
        }
        clear_query_search_caches();
        return fill_in_gloss_template_cached_internal(gloss_template, variable, token, formula, variable_format, $DECLARATIVE, offset, end, token_is_paraphraseP).first();
    }

    public static SubLObject get_fragments_for_medical_terms(final SubLObject token_list, SubLObject must_include_all_tokensP, SubLObject variable_format, SubLObject tight_constraint_matchingP, SubLObject output_pattern) {
        if (must_include_all_tokensP == UNPROVIDED) {
            must_include_all_tokensP = NIL;
        }
        if (variable_format == UNPROVIDED) {
            variable_format = $MNEMONIC;
        }
        if (tight_constraint_matchingP == UNPROVIDED) {
            tight_constraint_matchingP = T;
        }
        if (output_pattern == UNPROVIDED) {
            output_pattern = $ANYTHING;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p($const312$GenericMedicalResearchTask_Allotm) : "forts.fort_p(cae_query_search.$const312$GenericMedicalResearchTask_Allotm) " + "CommonSymbols.NIL != forts.fort_p(cae_query_search.$const312$GenericMedicalResearchTask_Allotm) " + $const312$GenericMedicalResearchTask_Allotm;
        final SubLObject _prev_bind_0 = $current_cae_task$.currentBinding(thread);
        try {
            $current_cae_task$.bind($const312$GenericMedicalResearchTask_Allotm, thread);
            return get_fragments_for_terms(token_list, must_include_all_tokensP, $$MedicalResearchCAEGuidanceMt, variable_format, tight_constraint_matchingP, output_pattern);
        } finally {
            $current_cae_task$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject get_only_fragments_for_halo_string(final SubLObject token_list, SubLObject must_include_all_tokensP, SubLObject variable_format, SubLObject tight_constraint_matchingP, SubLObject output_pattern) {
        if (must_include_all_tokensP == UNPROVIDED) {
            must_include_all_tokensP = NIL;
        }
        if (variable_format == UNPROVIDED) {
            variable_format = $cae_default_variable_format$.getGlobalValue();
        }
        if (tight_constraint_matchingP == UNPROVIDED) {
            tight_constraint_matchingP = T;
        }
        if (output_pattern == UNPROVIDED) {
            output_pattern = $ANYTHING;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        assert NIL != forts.fort_p($const259$HaloBiologyQuestionAnsweringTask_) : "forts.fort_p(cae_query_search.$const259$HaloBiologyQuestionAnsweringTask_) " + "CommonSymbols.NIL != forts.fort_p(cae_query_search.$const259$HaloBiologyQuestionAnsweringTask_) " + $const259$HaloBiologyQuestionAnsweringTask_;
        final SubLObject _prev_bind_0 = $current_cae_task$.currentBinding(thread);
        try {
            $current_cae_task$.bind($const259$HaloBiologyQuestionAnsweringTask_, thread);
            result = Mapping.mapcar(FIRST, get_fragments_for_string(token_list, must_include_all_tokensP, $$CytologicalProcessesCAEGuidanceMt, variable_format, tight_constraint_matchingP, output_pattern));
        } finally {
            $current_cae_task$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject el_formulas_supersetP(final SubLObject big, final SubLObject small) {
        return subsetp(small, big, $sym353$EQUALS_EL_, UNPROVIDED);
    }

    public static SubLObject declare_cae_query_search_file() {
        declareMacro(me, "with_current_cae_task", "WITH-CURRENT-CAE-TASK");
        declareFunction(me, "current_cae_task", "CURRENT-CAE-TASK", 0, 0, false);
        declareFunction(me, "indexical_cae_task", "INDEXICAL-CAE-TASK", 0, 0, false);
        declareFunction(me, "cae_query_search_default_mt", "CAE-QUERY-SEARCH-DEFAULT-MT", 0, 1, false);
        declareFunction(me, "cae_default_query_mt", "CAE-DEFAULT-QUERY-MT", 0, 1, false);
        declareFunction(me, "cae_default_wff_checking_mt", "CAE-DEFAULT-WFF-CHECKING-MT", 0, 1, false);
        declareFunction(me, "clear_query_search_caches", "CLEAR-QUERY-SEARCH-CACHES", 0, 0, false);
        declareFunction(me, "genl_args_to_queries", "GENL-ARGS-TO-QUERIES", 0, 0, false);
        declareFunction(me, "isa_args_to_queries", "ISA-ARGS-TO-QUERIES", 0, 0, false);
        declareFunction(me, "genl_args_to_suppressed_queries", "GENL-ARGS-TO-SUPPRESSED-QUERIES", 0, 0, false);
        declareFunction(me, "isa_args_to_suppressed_queries", "ISA-ARGS-TO-SUPPRESSED-QUERIES", 0, 0, false);
        declareFunction(me, "ensure_cae_query_search_tables_initialization", "ENSURE-CAE-QUERY-SEARCH-TABLES-INITIALIZATION", 0, 0, false);
        declareFunction(me, "ensure_query_search_tables_initialized_for_mt", "ENSURE-QUERY-SEARCH-TABLES-INITIALIZED-FOR-MT", 1, 0, false);
        declareFunction(me, "dump_cae_query_search_tables_to_stream", "DUMP-CAE-QUERY-SEARCH-TABLES-TO-STREAM", 1, 0, false);
        declareFunction(me, "load_cae_query_search_tables_from_stream", "LOAD-CAE-QUERY-SEARCH-TABLES-FROM-STREAM", 1, 0, false);
        declareFunction(me, "clear_cae_query_search_tables", "CLEAR-CAE-QUERY-SEARCH-TABLES", 0, 0, false);
        declareFunction(me, "add_query_search_table_assertion", "ADD-QUERY-SEARCH-TABLE-ASSERTION", 2, 0, false);
        declareFunction(me, "remove_query_search_table_assertion", "REMOVE-QUERY-SEARCH-TABLE-ASSERTION", 2, 0, false);
        declareFunction(me, "add_template_to_query_search_table", "ADD-TEMPLATE-TO-QUERY-SEARCH-TABLE", 6, 2, false);
        declareFunction(me, "constraint_from_term_and_mt", "CONSTRAINT-FROM-TERM-AND-MT", 2, 0, false);
        declareFunction(me, "clear_make_formula_for_rule_rhs_cached", "CLEAR-MAKE-FORMULA-FOR-RULE-RHS-CACHED", 0, 0, false);
        declareFunction(me, "remove_make_formula_for_rule_rhs_cached", "REMOVE-MAKE-FORMULA-FOR-RULE-RHS-CACHED", 3, 0, false);
        declareFunction(me, "make_formula_for_rule_rhs_cached_internal", "MAKE-FORMULA-FOR-RULE-RHS-CACHED-INTERNAL", 3, 0, false);
        declareFunction(me, "make_formula_for_rule_rhs_cached", "MAKE-FORMULA-FOR-RULE-RHS-CACHED", 3, 0, false);
        declareFunction(me, "make_formula_for_rule_rhs", "MAKE-FORMULA-FOR-RULE-RHS", 1, 2, false);
        declareFunction(me, "clear_standard_xyz_arglist", "CLEAR-STANDARD-XYZ-ARGLIST", 0, 0, false);
        declareFunction(me, "remove_standard_xyz_arglist", "REMOVE-STANDARD-XYZ-ARGLIST", 1, 0, false);
        declareFunction(me, "standard_xyz_arglist_internal", "STANDARD-XYZ-ARGLIST-INTERNAL", 1, 0, false);
        declareFunction(me, "standard_xyz_arglist", "STANDARD-XYZ-ARGLIST", 1, 0, false);
        declareFunction(me, "category_for_term", "CATEGORY-FOR-TERM", 1, 2, false);
        declareFunction(me, "initialize_query_search_tables_from_applicable_mts", "INITIALIZE-QUERY-SEARCH-TABLES-FROM-APPLICABLE-MTS", 0, 1, false);
        declareFunction(me, "initialize_query_search_tables", "INITIALIZE-QUERY-SEARCH-TABLES", 0, 1, false);
        declareFunction(me, "clear_query_search_table_preds", "CLEAR-QUERY-SEARCH-TABLE-PREDS", 0, 0, false);
        declareFunction(me, "remove_query_search_table_preds", "REMOVE-QUERY-SEARCH-TABLE-PREDS", 0, 0, false);
        declareFunction(me, "query_search_table_preds_internal", "QUERY-SEARCH-TABLE-PREDS-INTERNAL", 0, 0, false);
        declareFunction(me, "query_search_table_preds", "QUERY-SEARCH-TABLE-PREDS", 0, 0, false);
        declareFunction(me, "add_templates_to_query_search_tables", "ADD-TEMPLATES-TO-QUERY-SEARCH-TABLES", 2, 0, false);
        declareFunction(me, "add_templates_internal", "ADD-TEMPLATES-INTERNAL", 6, 0, false);
        declareFunction(me, "add_templates_with_specified_arg_positions_to_query_search_tables", "ADD-TEMPLATES-WITH-SPECIFIED-ARG-POSITIONS-TO-QUERY-SEARCH-TABLES", 2, 0, false);
        declareFunction(me, "add_templates_internal_templates_added", "ADD-TEMPLATES-INTERNAL-TEMPLATES-ADDED", 6, 0, false);
        declareFunction(me, "indexed_queries_from_string_with_confidences", "INDEXED-QUERIES-FROM-STRING-WITH-CONFIDENCES", 1, 2, false);
        declareFunction(me, "indexed_queries_from_terms_with_confidences", "INDEXED-QUERIES-FROM-TERMS-WITH-CONFIDENCES", 1, 2, false);
        declareFunction(me, "get_gloss_for_indexed_query", "GET-GLOSS-FOR-INDEXED-QUERY", 1, 4, false);
        declareFunction(me, "get_gloss_olist_for_indexed_query", "GET-GLOSS-OLIST-FOR-INDEXED-QUERY", 1, 5, false);
        declareFunction(me, "get_params_for_indexed_query_paraphrase", "GET-PARAMS-FOR-INDEXED-QUERY-PARAPHRASE", 5, 0, false);
        declareFunction(me, "format_indexed_queries_from_with_confidences", "FORMAT-INDEXED-QUERIES-FROM-WITH-CONFIDENCES", 1, 1, false);
        declareFunction(me, "sort_cae_queries_by_folder", "SORT-CAE-QUERIES-BY-FOLDER", 1, 0, false);
        declareFunction(me, "cae_folder_title_precedesP", "CAE-FOLDER-TITLE-PRECEDES?", 2, 0, false);
        declareFunction(me, "cae_folder_category_precedesP", "CAE-FOLDER-CATEGORY-PRECEDES?", 3, 0, false);
        declareFunction(me, "new_temporary_query_id", "NEW-TEMPORARY-QUERY-ID", 1, 0, false);
        declareFunction(me, "cae_task_with_yes_no_folder_enabledP", "CAE-TASK-WITH-YES-NO-FOLDER-ENABLED?", 0, 1, false);
        declareFunction(me, "get_fragments_for_term", "GET-FRAGMENTS-FOR-TERM", 2, 5, false);
        declareFunction(me, "get_superior_fragments_for_type", "GET-SUPERIOR-FRAGMENTS-FOR-TYPE", 9, 0, false);
        declareFunction(me, "fill_out_query_with_extra_info", "FILL-OUT-QUERY-WITH-EXTRA-INFO", 12, 0, false);
        declareFunction(me, "lookup_isa_queries", "LOOKUP-ISA-QUERIES", 1, 1, false);
        declareFunction(me, "lookup_genl_queries", "LOOKUP-GENL-QUERIES", 1, 1, false);
        declareFunction(me, "lookup_suppressed_isa_queries", "LOOKUP-SUPPRESSED-ISA-QUERIES", 1, 1, false);
        declareFunction(me, "lookup_suppressed_genls_queries", "LOOKUP-SUPPRESSED-GENLS-QUERIES", 1, 1, false);
        declareFunction(me, "lookup_queries_int", "LOOKUP-QUERIES-INT", 2, 1, false);
        declareFunction(me, "get_queries_via_inference", "GET-QUERIES-VIA-INFERENCE", 1, 1, false);
        declareFunction(me, "get_templates_from_assertion", "GET-TEMPLATES-FROM-ASSERTION", 2, 1, false);
        declareFunction(me, "clear_get_cached_templates_from_assertion", "CLEAR-GET-CACHED-TEMPLATES-FROM-ASSERTION", 0, 0, false);
        declareFunction(me, "remove_get_cached_templates_from_assertion", "REMOVE-GET-CACHED-TEMPLATES-FROM-ASSERTION", 2, 1, false);
        declareFunction(me, "get_cached_templates_from_assertion_internal", "GET-CACHED-TEMPLATES-FROM-ASSERTION-INTERNAL", 3, 0, false);
        declareFunction(me, "get_cached_templates_from_assertion", "GET-CACHED-TEMPLATES-FROM-ASSERTION", 2, 1, false);
        declareFunction(me, "get_query_formulas_from_assertion", "GET-QUERY-FORMULAS-FROM-ASSERTION", 1, 2, false);
        declareFunction(me, "get_query_sentences_for_set_based_assertion", "GET-QUERY-SENTENCES-FOR-SET-BASED-ASSERTION", 1, 2, false);
        declareFunction(me, "assertion_uses_non_extensional_setP", "ASSERTION-USES-NON-EXTENSIONAL-SET?", 1, 0, false);
        declareFunction(me, "sentence_has_no_bound_argsP", "SENTENCE-HAS-NO-BOUND-ARGS?", 1, 0, false);
        declareFunction(me, "full_sentence_opaque_query_predP", "FULL-SENTENCE-OPAQUE-QUERY-PRED?", 1, 0, false);
        declareFunction(me, "full_sentence_query_predP", "FULL-SENTENCE-QUERY-PRED?", 1, 0, false);
        declareFunction(me, "set_based_query_predP", "SET-BASED-QUERY-PRED?", 1, 0, false);
        declareFunction(me, "supplemental_formula_predP", "SUPPLEMENTAL-FORMULA-PRED?", 1, 0, false);
        declareFunction(me, "el_set_elts", "EL-SET-ELTS", 2, 0, false);
        declareFunction(me, "symmetric_binary_literalP", "SYMMETRIC-BINARY-LITERAL?", 1, 1, false);
        declareFunction(me, "clear_fragment_formulas_equalP", "CLEAR-FRAGMENT-FORMULAS-EQUAL?", 0, 0, false);
        declareFunction(me, "remove_fragment_formulas_equalP", "REMOVE-FRAGMENT-FORMULAS-EQUAL?", 2, 0, false);
        declareFunction(me, "fragment_formulas_equalP_internal", "FRAGMENT-FORMULAS-EQUAL?-INTERNAL", 2, 0, false);
        declareFunction(me, "fragment_formulas_equalP", "FRAGMENT-FORMULAS-EQUAL?", 2, 0, false);
        declareFunction(me, "equal_fragments", "EQUAL-FRAGMENTS", 2, 0, false);
        declareFunction(me, "fragmentL", "FRAGMENT<", 2, 0, false);
        declareFunction(me, "fragment_includes_all_tokensP", "FRAGMENT-INCLUDES-ALL-TOKENS?", 2, 0, false);
        declareFunction(me, "remove_unless_fragment_includes_all_tokens", "REMOVE-UNLESS-FRAGMENT-INCLUDES-ALL-TOKENS", 2, 0, false);
        declareFunction(me, "fragment_instantiated_by_blocked_termP", "FRAGMENT-INSTANTIATED-BY-BLOCKED-TERM?", 2, 0, false);
        declareFunction(me, "new_cae_query_search_fragment", "NEW-CAE-QUERY-SEARCH-FRAGMENT", 4, 3, false);
        declareFunction(me, "cae_query_search_fragment_formula", "CAE-QUERY-SEARCH-FRAGMENT-FORMULA", 1, 0, false);
        declareFunction(me, "set_cae_query_search_fragment_formula", "SET-CAE-QUERY-SEARCH-FRAGMENT-FORMULA", 2, 0, false);
        declareFunction(me, "cae_query_search_fragment_gloss", "CAE-QUERY-SEARCH-FRAGMENT-GLOSS", 1, 0, false);
        declareFunction(me, "set_cae_query_search_fragment_gloss", "SET-CAE-QUERY-SEARCH-FRAGMENT-GLOSS", 2, 0, false);
        declareFunction(me, "cae_query_search_fragment_category", "CAE-QUERY-SEARCH-FRAGMENT-CATEGORY", 1, 0, false);
        declareFunction(me, "set_cae_query_search_fragment_category", "SET-CAE-QUERY-SEARCH-FRAGMENT-CATEGORY", 2, 0, false);
        declareFunction(me, "cae_query_search_fragment_justification", "CAE-QUERY-SEARCH-FRAGMENT-JUSTIFICATION", 1, 0, false);
        declareFunction(me, "set_cae_query_search_fragment_justification", "SET-CAE-QUERY-SEARCH-FRAGMENT-JUSTIFICATION", 2, 0, false);
        declareFunction(me, "cae_query_search_fragment_offset", "CAE-QUERY-SEARCH-FRAGMENT-OFFSET", 1, 0, false);
        declareFunction(me, "set_cae_query_search_fragment_offset", "SET-CAE-QUERY-SEARCH-FRAGMENT-OFFSET", 2, 0, false);
        declareFunction(me, "cae_query_search_fragment_end", "CAE-QUERY-SEARCH-FRAGMENT-END", 1, 0, false);
        declareFunction(me, "set_cae_query_search_fragment_end", "SET-CAE-QUERY-SEARCH-FRAGMENT-END", 2, 0, false);
        declareFunction(me, "cae_query_search_fragment_opaque", "CAE-QUERY-SEARCH-FRAGMENT-OPAQUE", 1, 0, false);
        declareFunction(me, "set_cae_query_search_fragment_opaque", "SET-CAE-QUERY-SEARCH-FRAGMENT-OPAQUE", 2, 0, false);
        declareFunction(me, "remove_if_instantiated_by_blocked_term", "REMOVE-IF-INSTANTIATED-BY-BLOCKED-TERM", 2, 0, false);
        declareFunction(me, "remove_suppressed_queries", "REMOVE-SUPPRESSED-QUERIES", 3, 0, false);
        declareFunction(me, "get_fragments_for_terms", "GET-FRAGMENTS-FOR-TERMS", 1, 5, false);
        declareFunction(me, "get_fragments_for_token_records", "GET-FRAGMENTS-FOR-TOKEN-RECORDS", 1, 5, false);
        declareFunction(me, "generate_bogus_disambiguation_phrases", "GENERATE-BOGUS-DISAMBIGUATION-PHRASES", 1, 0, false);
        declareFunction(me, "create_token_records", "CREATE-TOKEN-RECORDS", 1, 0, false);
        declareFunction(me, "remove_excess_query_fragments", "REMOVE-EXCESS-QUERY-FRAGMENTS", 1, 0, false);
        declareFunction(me, "query_fragment_partially_instantiates_and_shares_categoryP", "QUERY-FRAGMENT-PARTIALLY-INSTANTIATES-AND-SHARES-CATEGORY?", 2, 0, false);
        declareFunction(me, "add_unbound_fragments", "ADD-UNBOUND-FRAGMENTS", 4, 0, false);
        declareFunction(me, "query_fragment_subsumesP", "QUERY-FRAGMENT-SUBSUMES?", 2, 0, false);
        declareFunction(me, "possibly_augment_query_search_terms", "POSSIBLY-AUGMENT-QUERY-SEARCH-TERMS", 1, 1, false);
        declareFunction(me, "clear_add_elements_for_genls", "CLEAR-ADD-ELEMENTS-FOR-GENLS", 0, 0, false);
        declareFunction(me, "remove_add_elements_for_genls", "REMOVE-ADD-ELEMENTS-FOR-GENLS", 2, 0, false);
        declareFunction(me, "add_elements_for_genls_internal", "ADD-ELEMENTS-FOR-GENLS-INTERNAL", 2, 0, false);
        declareFunction(me, "add_elements_for_genls", "ADD-ELEMENTS-FOR-GENLS", 2, 0, false);
        declareFunction(me, "clear_add_elements_for_isa", "CLEAR-ADD-ELEMENTS-FOR-ISA", 0, 0, false);
        declareFunction(me, "remove_add_elements_for_isa", "REMOVE-ADD-ELEMENTS-FOR-ISA", 2, 0, false);
        declareFunction(me, "add_elements_for_isa_internal", "ADD-ELEMENTS-FOR-ISA-INTERNAL", 2, 0, false);
        declareFunction(me, "add_elements_for_isa", "ADD-ELEMENTS-FOR-ISA", 2, 0, false);
        declareFunction(me, "sanity_check_gloss", "SANITY-CHECK-GLOSS", 1, 2, false);
        declareFunction(me, "get_fragments_for_string", "GET-FRAGMENTS-FOR-STRING", 1, 5, false);
        declareFunction(me, "enable_full_sentence_cae_interpretation", "ENABLE-FULL-SENTENCE-CAE-INTERPRETATION", 0, 0, false);
        declareFunction(me, "get_fragments_from_full_sentence_interp", "GET-FRAGMENTS-FROM-FULL-SENTENCE-INTERP", 3, 0, false);
        declareFunction(me, "mark_duplicated_unbound_queries", "MARK-DUPLICATED-UNBOUND-QUERIES", 1, 0, false);
        declareFunction(me, "get_fragments_for_string_and_task", "GET-FRAGMENTS-FOR-STRING-AND-TASK", 2, 0, false);
        declareFunction(me, "fragments_contain_sentenceP", "FRAGMENTS-CONTAIN-SENTENCE?", 2, 0, false);
        declareFunction(me, "equal_fragment_listsP", "EQUAL-FRAGMENT-LISTS?", 2, 0, false);
        declareFunction(me, "clear_suggested_free_position_for_predP", "CLEAR-SUGGESTED-FREE-POSITION-FOR-PRED?", 0, 0, false);
        declareFunction(me, "remove_suggested_free_position_for_predP", "REMOVE-SUGGESTED-FREE-POSITION-FOR-PRED?", 2, 1, false);
        declareFunction(me, "suggested_free_position_for_predP_internal", "SUGGESTED-FREE-POSITION-FOR-PRED?-INTERNAL", 3, 0, false);
        declareFunction(me, "suggested_free_position_for_predP", "SUGGESTED-FREE-POSITION-FOR-PRED?", 2, 1, false);
        declareFunction(me, "substitutable_variableP", "SUBSTITUTABLE-VARIABLE?", 2, 0, false);
        declareFunction(me, "variables_that_term_can_replace", "VARIABLES-THAT-TERM-CAN-REPLACE", 2, 2, false);
        declareFunction(me, "qs_all_isaP", "QS-ALL-ISA?", 3, 0, false);
        declareFunction(me, "qs_all_genlP", "QS-ALL-GENL?", 3, 0, false);
        declareFunction(me, "clear_any_not_isa_cachedP", "CLEAR-ANY-NOT-ISA-CACHED?", 0, 0, false);
        declareFunction(me, "remove_any_not_isa_cachedP", "REMOVE-ANY-NOT-ISA-CACHED?", 3, 0, false);
        declareFunction(me, "any_not_isa_cachedP_internal", "ANY-NOT-ISA-CACHED?-INTERNAL", 3, 0, false);
        declareFunction(me, "any_not_isa_cachedP", "ANY-NOT-ISA-CACHED?", 3, 0, false);
        declareFunction(me, "clear_any_isa_cachedP", "CLEAR-ANY-ISA-CACHED?", 0, 0, false);
        declareFunction(me, "remove_any_isa_cachedP", "REMOVE-ANY-ISA-CACHED?", 3, 0, false);
        declareFunction(me, "any_isa_cachedP_internal", "ANY-ISA-CACHED?-INTERNAL", 3, 0, false);
        declareFunction(me, "any_isa_cachedP", "ANY-ISA-CACHED?", 3, 0, false);
        declareFunction(me, "clear_any_not_genl_cachedP", "CLEAR-ANY-NOT-GENL-CACHED?", 0, 0, false);
        declareFunction(me, "remove_any_not_genl_cachedP", "REMOVE-ANY-NOT-GENL-CACHED?", 3, 0, false);
        declareFunction(me, "any_not_genl_cachedP_internal", "ANY-NOT-GENL-CACHED?-INTERNAL", 3, 0, false);
        declareFunction(me, "any_not_genl_cachedP", "ANY-NOT-GENL-CACHED?", 3, 0, false);
        declareFunction(me, "try_substitution", "TRY-SUBSTITUTION", 8, 5, false);
        declareFunction(me, "try_substitution_simple", "TRY-SUBSTITUTION-SIMPLE", 2, 2, false);
        declareFunction(me, "query_search_wffP", "QUERY-SEARCH-WFF?", 2, 1, false);
        declareFunction(me, "passes_inter_arg_reln_requirements", "PASSES-INTER-ARG-RELN-REQUIREMENTS", 2, 0, false);
        declareFunction(me, "clear_query_search_irreflexiveP", "CLEAR-QUERY-SEARCH-IRREFLEXIVE?", 0, 0, false);
        declareFunction(me, "remove_query_search_irreflexiveP", "REMOVE-QUERY-SEARCH-IRREFLEXIVE?", 1, 0, false);
        declareFunction(me, "query_search_irreflexiveP_internal", "QUERY-SEARCH-IRREFLEXIVE?-INTERNAL", 1, 0, false);
        declareFunction(me, "query_search_irreflexiveP", "QUERY-SEARCH-IRREFLEXIVE?", 1, 0, false);
        declareFunction(me, "strong_query_search_acceptability_checks_allowedP_internal", "STRONG-QUERY-SEARCH-ACCEPTABILITY-CHECKS-ALLOWED?-INTERNAL", 0, 0, false);
        declareFunction(me, "strong_query_search_acceptability_checks_allowedP", "STRONG-QUERY-SEARCH-ACCEPTABILITY-CHECKS-ALLOWED?", 0, 0, false);
        declareFunction(me, "halo_test_passes_inter_arg_reln_requirements", "HALO-TEST-PASSES-INTER-ARG-RELN-REQUIREMENTS", 2, 0, false);
        declareFunction(me, "clear_required_bound_args_for_preds", "CLEAR-REQUIRED-BOUND-ARGS-FOR-PREDS", 0, 0, false);
        declareFunction(me, "remove_required_bound_args_for_preds", "REMOVE-REQUIRED-BOUND-ARGS-FOR-PREDS", 0, 1, false);
        declareFunction(me, "required_bound_args_for_preds_internal", "REQUIRED-BOUND-ARGS-FOR-PREDS-INTERNAL", 1, 0, false);
        declareFunction(me, "required_bound_args_for_preds", "REQUIRED-BOUND-ARGS-FOR-PREDS", 0, 1, false);
        declareFunction(me, "sentence_has_all_required_args_boundP", "SENTENCE-HAS-ALL-REQUIRED-ARGS-BOUND?", 1, 1, false);
        declareFunction(me, "query_has_all_required_args_boundP", "QUERY-HAS-ALL-REQUIRED-ARGS-BOUND?", 1, 1, false);
        declareFunction(me, "try_suggestions_for_query", "TRY-SUGGESTIONS-FOR-QUERY", 1, 1, false);
        declareFunction(me, "clear_default_values_for_pred", "CLEAR-DEFAULT-VALUES-FOR-PRED", 0, 0, false);
        declareFunction(me, "remove_default_values_for_pred", "REMOVE-DEFAULT-VALUES-FOR-PRED", 1, 1, false);
        declareFunction(me, "default_values_for_pred_internal", "DEFAULT-VALUES-FOR-PRED-INTERNAL", 2, 0, false);
        declareFunction(me, "default_values_for_pred", "DEFAULT-VALUES-FOR-PRED", 1, 1, false);
        declareFunction(me, "default_values_for_sentence", "DEFAULT-VALUES-FOR-SENTENCE", 1, 1, false);
        declareFunction(me, "fill_in_default_values_for_query", "FILL-IN-DEFAULT-VALUES-FOR-QUERY", 1, 1, false);
        declareFunction(me, "try_substitutions_for_query", "TRY-SUBSTITUTIONS-FOR-QUERY", 2, 5, false);
        declareFunction(me, "trigger_only_termP", "TRIGGER-ONLY-TERM?", 1, 1, false);
        declareFunction(me, "try_substitutions", "TRY-SUBSTITUTIONS", 2, 5, false);
        declareFunction(me, "combine_cae_fragments", "COMBINE-CAE-FRAGMENTS", 1, 0, false);
        declareFunction(me, "cae_recipe_combinations", "CAE-RECIPE-COMBINATIONS", 2, 0, false);
        declareFunction(me, "find_ingredients_for_cae_recipe", "FIND-INGREDIENTS-FOR-CAE-RECIPE", 2, 0, false);
        declareFunction(me, "formula_matches_cae_recipe_componentP", "FORMULA-MATCHES-CAE-RECIPE-COMPONENT?", 3, 0, false);
        declareFunction(me, "make_cae_fragment_combination", "MAKE-CAE-FRAGMENT-COMBINATION", 1, 0, false);
        declareFunction(me, "valid_query_search_termP", "VALID-QUERY-SEARCH-TERM?", 1, 2, false);
        declareFunction(me, "term_fails_classification_tree_filterP", "TERM-FAILS-CLASSIFICATION-TREE-FILTER?", 3, 0, false);
        declareFunction(me, "term_passes_classification_tree_filterP", "TERM-PASSES-CLASSIFICATION-TREE-FILTER?", 3, 0, false);
        declareFunction(me, "clear_term_classification_tree_info", "CLEAR-TERM-CLASSIFICATION-TREE-INFO", 0, 0, false);
        declareFunction(me, "remove_term_classification_tree_info", "REMOVE-TERM-CLASSIFICATION-TREE-INFO", 1, 0, false);
        declareFunction(me, "term_classification_tree_info_internal", "TERM-CLASSIFICATION-TREE-INFO-INTERNAL", 1, 0, false);
        declareFunction(me, "term_classification_tree_info", "TERM-CLASSIFICATION-TREE-INFO", 1, 0, false);
        declareFunction(me, "cae_query_superstrings", "CAE-QUERY-SUPERSTRINGS", 1, 3, false);
        declareFunction(me, "cae_query_superstrings_from_larger_string", "CAE-QUERY-SUPERSTRINGS-FROM-LARGER-STRING", 1, 1, false);
        declareFunction(me, "cae_query_superstrings_case_variants", "CAE-QUERY-SUPERSTRINGS-CASE-VARIANTS", 1, 0, false);
        declareFunction(me, "debug_cae_query_superstrings", "DEBUG-CAE-QUERY-SUPERSTRINGS", 1, 2, false);
        declareFunction(me, "filtered_terms_from_cae_query", "FILTERED-TERMS-FROM-CAE-QUERY", 1, 2, false);
        declareFunction(me, "filter_terms_from_cae_query", "FILTER-TERMS-FROM-CAE-QUERY", 1, 1, false);
        declareFunction(me, "get_terms_from_cae_query_search", "GET-TERMS-FROM-CAE-QUERY-SEARCH", 1, 1, false);
        declareFunction(me, "terms_from_cae_query", "TERMS-FROM-CAE-QUERY", 1, 1, false);
        declareFunction(me, "terms_from_cae_query_int_internal", "TERMS-FROM-CAE-QUERY-INT-INTERNAL", 2, 1, false);
        declareFunction(me, "terms_from_cae_query_int", "TERMS-FROM-CAE-QUERY-INT", 2, 1, false);
        declareFunction(me, "token_record_subsumesP", "TOKEN-RECORD-SUBSUMES?", 2, 0, false);
        declareFunction(me, "terms_from_cae_query_word", "TERMS-FROM-CAE-QUERY-WORD", 1, 0, false);
        declareFunction(me, "get_semtrans_fragments_for_string", "GET-SEMTRANS-FRAGMENTS-FOR-STRING", 5, 0, false);
        declareFunction(me, "convert_keywords_to_variables", "CONVERT-KEYWORDS-TO-VARIABLES", 1, 0, false);
        declareFunction(me, "var_from_keyword", "VAR-FROM-KEYWORD", 1, 0, false);
        declareFunction(me, "get_cae_query_search_lexicon", "GET-CAE-QUERY-SEARCH-LEXICON", 0, 1, false);
        declareFunction(me, "clear_get_cae_query_search_lexicon_int", "CLEAR-GET-CAE-QUERY-SEARCH-LEXICON-INT", 0, 0, false);
        declareFunction(me, "remove_get_cae_query_search_lexicon_int", "REMOVE-GET-CAE-QUERY-SEARCH-LEXICON-INT", 1, 0, false);
        declareFunction(me, "get_cae_query_search_lexicon_int_internal", "GET-CAE-QUERY-SEARCH-LEXICON-INT-INTERNAL", 1, 0, false);
        declareFunction(me, "get_cae_query_search_lexicon_int", "GET-CAE-QUERY-SEARCH-LEXICON-INT", 1, 0, false);
        declareFunction(me, "cae_query_search_augment_denot_list", "CAE-QUERY-SEARCH-AUGMENT-DENOT-LIST", 1, 0, false);
        declareFunction(me, "get_cae_query_term_augmentations_for_term", "GET-CAE-QUERY-TERM-AUGMENTATIONS-FOR-TERM", 1, 1, false);
        declareFunction(me, "initialize_query_term_augmentations", "INITIALIZE-QUERY-TERM-AUGMENTATIONS", 0, 1, false);
        declareFunction(me, "get_cae_query_term_augmentations", "GET-CAE-QUERY-TERM-AUGMENTATIONS", 0, 1, false);
        declareFunction(me, "get_cae_query_term_augmentations_from_semtranses", "GET-CAE-QUERY-TERM-AUGMENTATIONS-FROM-SEMTRANSES", 0, 2, false);
        declareFunction(me, "test_get_fragments_for_string_against_expected_literals_non_blocking", "TEST-GET-FRAGMENTS-FOR-STRING-AGAINST-EXPECTED-LITERALS-NON-BLOCKING", 2, 0, false);
        declareFunction(me, "fill_in_gloss_template", "FILL-IN-GLOSS-TEMPLATE", 9, 0, false);
        declareFunction(me, "clear_fill_in_gloss_template_cached", "CLEAR-FILL-IN-GLOSS-TEMPLATE-CACHED", 0, 0, false);
        declareFunction(me, "remove_fill_in_gloss_template_cached", "REMOVE-FILL-IN-GLOSS-TEMPLATE-CACHED", 9, 0, false);
        declareFunction(me, "fill_in_gloss_template_cached_internal", "FILL-IN-GLOSS-TEMPLATE-CACHED-INTERNAL", 9, 0, false);
        declareFunction(me, "fill_in_gloss_template_cached", "FILL-IN-GLOSS-TEMPLATE-CACHED", 9, 0, false);
        declareFunction(me, "position_info_from_map", "POSITION-INFO-FROM-MAP", 1, 0, false);
        declareFunction(me, "position_G", "POSITION->", 2, 0, false);
        declareFunction(me, "sort_xyz_paraphrases", "SORT-XYZ-PARAPHRASES", 3, 0, false);
        declareFunction(me, "xyz_varmap_for_formula", "XYZ-VARMAP-FOR-FORMULA", 1, 0, false);
        declareFunction(me, "mnemonic_varmap_for_formula", "MNEMONIC-VARMAP-FOR-FORMULA", 1, 2, false);
        declareFunction(me, "clear_mnemonic_varmap_for_formula_cached", "CLEAR-MNEMONIC-VARMAP-FOR-FORMULA-CACHED", 0, 0, false);
        declareFunction(me, "remove_mnemonic_varmap_for_formula_cached", "REMOVE-MNEMONIC-VARMAP-FOR-FORMULA-CACHED", 3, 0, false);
        declareFunction(me, "mnemonic_varmap_for_formula_cached_internal", "MNEMONIC-VARMAP-FOR-FORMULA-CACHED-INTERNAL", 3, 0, false);
        declareFunction(me, "mnemonic_varmap_for_formula_cached", "MNEMONIC-VARMAP-FOR-FORMULA-CACHED", 3, 0, false);
        declareFunction(me, "gloss_template_string_for_variable", "GLOSS-TEMPLATE-STRING-FOR-VARIABLE", 5, 0, false);
        declareFunction(me, "string_from_gloss_template", "STRING-FROM-GLOSS-TEMPLATE", 1, 0, false);
        declareFunction(me, "generate_query_search_gloss_template", "GENERATE-QUERY-SEARCH-GLOSS-TEMPLATE", 3, 2, false);
        declareFunction(me, "used_as_predicateP", "USED-AS-PREDICATE?", 2, 0, false);
        declareFunction(me, "clear_generate_template_for_isa_constraint_cached", "CLEAR-GENERATE-TEMPLATE-FOR-ISA-CONSTRAINT-CACHED", 0, 0, false);
        declareFunction(me, "remove_generate_template_for_isa_constraint_cached", "REMOVE-GENERATE-TEMPLATE-FOR-ISA-CONSTRAINT-CACHED", 4, 0, false);
        declareFunction(me, "generate_template_for_isa_constraint_cached_internal", "GENERATE-TEMPLATE-FOR-ISA-CONSTRAINT-CACHED-INTERNAL", 4, 0, false);
        declareFunction(me, "generate_template_for_isa_constraint_cached", "GENERATE-TEMPLATE-FOR-ISA-CONSTRAINT-CACHED", 4, 0, false);
        declareFunction(me, "generate_template_for_isa_constraint", "GENERATE-TEMPLATE-FOR-ISA-CONSTRAINT", 4, 0, false);
        declareFunction(me, "generate_template_for_genls_constraint", "GENERATE-TEMPLATE-FOR-GENLS-CONSTRAINT", 4, 0, false);
        declareFunction(me, "clear_get_variables_of_type_in_formula", "CLEAR-GET-VARIABLES-OF-TYPE-IN-FORMULA", 0, 0, false);
        declareFunction(me, "remove_get_variables_of_type_in_formula", "REMOVE-GET-VARIABLES-OF-TYPE-IN-FORMULA", 3, 0, false);
        declareFunction(me, "get_variables_of_type_in_formula_internal", "GET-VARIABLES-OF-TYPE-IN-FORMULA-INTERNAL", 3, 0, false);
        declareFunction(me, "get_variables_of_type_in_formula", "GET-VARIABLES-OF-TYPE-IN-FORMULA", 3, 0, false);
        declareFunction(me, "cae_fragment_refinements", "CAE-FRAGMENT-REFINEMENTS", 0, 0, false);
        declareFunction(me, "note_cae_fragment_refinement", "NOTE-CAE-FRAGMENT-REFINEMENT", 3, 0, false);
        declareFunction(me, "cae_canonicalize_query_sentence", "CAE-CANONICALIZE-QUERY-SENTENCE", 1, 0, false);
        declareFunction(me, "lookup_cae_fragment_derefinement_template", "LOOKUP-CAE-FRAGMENT-DEREFINEMENT-TEMPLATE", 2, 0, false);
        declareFunction(me, "cae_derefine", "CAE-DEREFINE", 1, 0, false);
        declareFunction(me, "modify_formula_by_adding_concepts", "MODIFY-FORMULA-BY-ADDING-CONCEPTS", 2, 0, false);
        declareFunction(me, "clear_concepts_to_add_for_concept", "CLEAR-CONCEPTS-TO-ADD-FOR-CONCEPT", 0, 0, false);
        declareFunction(me, "remove_concepts_to_add_for_concept", "REMOVE-CONCEPTS-TO-ADD-FOR-CONCEPT", 2, 0, false);
        declareFunction(me, "concepts_to_add_for_concept_internal", "CONCEPTS-TO-ADD-FOR-CONCEPT-INTERNAL", 2, 0, false);
        declareFunction(me, "concepts_to_add_for_concept", "CONCEPTS-TO-ADD-FOR-CONCEPT", 2, 0, false);
        declareFunction(me, "add_concept_to_formula", "ADD-CONCEPT-TO-FORMULA", 5, 0, false);
        declareFunction(me, "clear_get_types_to_existentially_bind", "CLEAR-GET-TYPES-TO-EXISTENTIALLY-BIND", 0, 0, false);
        declareFunction(me, "remove_get_types_to_existentially_bind", "REMOVE-GET-TYPES-TO-EXISTENTIALLY-BIND", 1, 0, false);
        declareFunction(me, "get_types_to_existentially_bind_internal", "GET-TYPES-TO-EXISTENTIALLY-BIND-INTERNAL", 1, 0, false);
        declareFunction(me, "get_types_to_existentially_bind", "GET-TYPES-TO-EXISTENTIALLY-BIND", 1, 0, false);
        declareFunction(me, "existentially_bind_types", "EXISTENTIALLY-BIND-TYPES", 2, 0, false);
        declareFunction(me, "refine_sentence", "REFINE-SENTENCE", 2, 0, false);
        declareFunction(me, "refine_fragment", "REFINE-FRAGMENT", 2, 0, false);
        declareFunction(me, "tooltip_terms_for_sentence", "TOOLTIP-TERMS-FOR-SENTENCE", 1, 0, false);
        declareFunction(me, "tooltip_for_sentence", "TOOLTIP-FOR-SENTENCE", 2, 0, false);
        declareFunction(me, "tooltip_for_query_search_sentence", "TOOLTIP-FOR-QUERY-SEARCH-SENTENCE", 2, 0, false);
        declareFunction(me, "write_terms_from_cae_query", "WRITE-TERMS-FROM-CAE-QUERY", 2, 0, false);
        declareFunction(me, "write_terms_from_cae_queries_to_file", "WRITE-TERMS-FROM-CAE-QUERIES-TO-FILE", 2, 0, false);
        declareFunction(me, "debug_query_search_string", "DEBUG-QUERY-SEARCH-STRING", 1, 4, false);
        declareFunction(me, "debug_query_search_strings", "DEBUG-QUERY-SEARCH-STRINGS", 0, 2, false);
        declareFunction(me, "test_replacement_parsing", "TEST-REPLACEMENT-PARSING", 0, 0, false);
        declareFunction(me, "get_scheuer_qs", "GET-SCHEUER-QS", 0, 0, false);
        declareFunction(me, "decision_tree_concept_filter_builds_successfully", "DECISION-TREE-CONCEPT-FILTER-BUILDS-SUCCESSFULLY", 1, 0, false);
        declareFunction(me, "justified_interpretation_print_function_trampoline", "JUSTIFIED-INTERPRETATION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "justified_interpretation_p", "JUSTIFIED-INTERPRETATION-P", 1, 0, false);
        new cae_query_search.$justified_interpretation_p$UnaryFunction();
        declareFunction(me, "ji_cycl", "JI-CYCL", 1, 0, false);
        declareFunction(me, "ji_words", "JI-WORDS", 1, 0, false);
        declareFunction(me, "ji_arg_records", "JI-ARG-RECORDS", 1, 0, false);
        declareFunction(me, "_csetf_ji_cycl", "_CSETF-JI-CYCL", 2, 0, false);
        declareFunction(me, "_csetf_ji_words", "_CSETF-JI-WORDS", 2, 0, false);
        declareFunction(me, "_csetf_ji_arg_records", "_CSETF-JI-ARG-RECORDS", 2, 0, false);
        declareFunction(me, "make_justified_interpretation", "MAKE-JUSTIFIED-INTERPRETATION", 0, 1, false);
        declareFunction(me, "visit_defstruct_justified_interpretation", "VISIT-DEFSTRUCT-JUSTIFIED-INTERPRETATION", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_justified_interpretation_method", "VISIT-DEFSTRUCT-OBJECT-JUSTIFIED-INTERPRETATION-METHOD", 2, 0, false);
        declareFunction(me, "new_justified_interpretation", "NEW-JUSTIFIED-INTERPRETATION", 3, 0, false);
        declareFunction(me, "ji_print", "JI-PRINT", 3, 0, false);
        declareFunction(me, "ji_index", "JI-INDEX", 1, 0, false);
        declareFunction(me, "ji_left_index", "JI-LEFT-INDEX", 1, 0, false);
        declareFunction(me, "ji_right_index", "JI-RIGHT-INDEX", 1, 0, false);
        declareFunction(me, "ji_arg1", "JI-ARG1", 1, 0, false);
        declareFunction(me, "ji_arg2", "JI-ARG2", 1, 0, false);
        declareFunction(me, "ji_arg3", "JI-ARG3", 1, 0, false);
        declareFunction(me, "ji_tokens", "JI-TOKENS", 1, 0, false);
        declareFunction(me, "term_record_print_function_trampoline", "TERM-RECORD-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "term_record_p", "TERM-RECORD-P", 1, 0, false);
        new cae_query_search.$term_record_p$UnaryFunction();
        declareFunction(me, "term_record_term", "TERM-RECORD-TERM", 1, 0, false);
        declareFunction(me, "term_record_word", "TERM-RECORD-WORD", 1, 0, false);
        declareFunction(me, "term_record_literal", "TERM-RECORD-LITERAL", 1, 0, false);
        declareFunction(me, "_csetf_term_record_term", "_CSETF-TERM-RECORD-TERM", 2, 0, false);
        declareFunction(me, "_csetf_term_record_word", "_CSETF-TERM-RECORD-WORD", 2, 0, false);
        declareFunction(me, "_csetf_term_record_literal", "_CSETF-TERM-RECORD-LITERAL", 2, 0, false);
        declareFunction(me, "make_term_record", "MAKE-TERM-RECORD", 0, 1, false);
        declareFunction(me, "visit_defstruct_term_record", "VISIT-DEFSTRUCT-TERM-RECORD", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_term_record_method", "VISIT-DEFSTRUCT-OBJECT-TERM-RECORD-METHOD", 2, 0, false);
        declareFunction(me, "new_term_record", "NEW-TERM-RECORD", 2, 1, false);
        declareFunction(me, "term_record_ref", "TERM-RECORD-REF", 1, 0, false);
        declareFunction(me, "term_record_index", "TERM-RECORD-INDEX", 1, 0, false);
        declareFunction(me, "term_record_print", "TERM-RECORD-PRINT", 3, 0, false);
        declareFunction(me, "term_record_equal", "TERM-RECORD-EQUAL", 2, 0, false);
        declareFunction(me, "initialize_cae_query_translation", "INITIALIZE-CAE-QUERY-TRANSLATION", 0, 0, false);
        declareFunction(me, "finalize_cae_query_translation", "FINALIZE-CAE-QUERY-TRANSLATION", 0, 0, false);
        declareFunction(me, "test_get_temporal_fragments_for_string", "TEST-GET-TEMPORAL-FRAGMENTS-FOR-STRING", 1, 0, false);
        declareFunction(me, "get_temporal_fragments_for_string", "GET-TEMPORAL-FRAGMENTS-FOR-STRING", 1, 1, false);
        declareFunction(me, "get_scalar_comparison_fragments_for_string", "GET-SCALAR-COMPARISON-FRAGMENTS-FOR-STRING", 1, 2, false);
        declareFunction(me, "get_scalar_comparison_literals", "GET-SCALAR-COMPARISON-LITERALS", 2, 0, false);
        declareFunction(me, "cae_query_translation", "CAE-QUERY-TRANSLATION", 2, 0, false);
        declareFunction(me, "jis_score", "JIS-SCORE", 1, 0, false);
        declareFunction(me, "retrieve_cycl", "RETRIEVE-CYCL", 1, 0, false);
        declareFunction(me, "apply_global_interpretation_constraints", "APPLY-GLOBAL-INTERPRETATION-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "local_pp_attachment_constraint", "LOCAL-PP-ATTACHMENT-CONSTRAINT", 2, 0, false);
        declareFunction(me, "record_interpretations", "RECORD-INTERPRETATIONS", 2, 0, false);
        declareFunction(me, "extract_all", "EXTRACT-ALL", 4, 0, false);
        declareFunction(me, "get_new_interpretations", "GET-NEW-INTERPRETATIONS", 2, 0, false);
        declareFunction(me, "ji_equal", "JI-EQUAL", 2, 0, false);
        declareFunction(me, "extract_between_through", "EXTRACT-BETWEEN-THROUGH", 3, 1, false);
        declareFunction(me, "extract_between_and", "EXTRACT-BETWEEN-AND", 3, 1, false);
        declareFunction(me, "extract_from_to", "EXTRACT-FROM-TO", 3, 1, false);
        declareFunction(me, "extract_from_through", "EXTRACT-FROM-THROUGH", 3, 1, false);
        declareFunction(me, "extract_after_procedure", "EXTRACT-AFTER-PROCEDURE", 3, 1, false);
        declareFunction(me, "extract_before_procedure_movement", "EXTRACT-BEFORE-PROCEDURE-MOVEMENT", 3, 2, false);
        declareFunction(me, "filter_identical_late_early", "FILTER-IDENTICAL-LATE-EARLY", 1, 0, false);
        declareFunction(me, "extract_before_procedure_standard", "EXTRACT-BEFORE-PROCEDURE-STANDARD", 3, 2, false);
        declareFunction(me, "extract_before_procedure", "EXTRACT-BEFORE-PROCEDURE", 3, 1, false);
        declareFunction(me, "extract_prior_to_procedure", "EXTRACT-PRIOR-TO-PROCEDURE", 3, 1, false);
        declareFunction(me, "extract_after_date", "EXTRACT-AFTER-DATE", 3, 1, false);
        declareFunction(me, "extract_since_date", "EXTRACT-SINCE-DATE", 3, 1, false);
        declareFunction(me, "extract_post_date", "EXTRACT-POST-DATE", 4, 1, false);
        declareFunction(me, "is_prepositionP", "IS-PREPOSITION?", 1, 0, false);
        declareFunction(me, "extract_before_date", "EXTRACT-BEFORE-DATE", 3, 1, false);
        declareFunction(me, "extract_during_date", "EXTRACT-DURING-DATE", 3, 1, false);
        declareFunction(me, "extract_in_date", "EXTRACT-IN-DATE", 3, 1, false);
        declareFunction(me, "extract_on_date", "EXTRACT-ON-DATE", 3, 1, false);
        declareFunction(me, "extract_while_date", "EXTRACT-WHILE-DATE", 4, 1, false);
        declareFunction(me, "rename_temprel_vars", "RENAME-TEMPREL-VARS", 2, 0, false);
        declareFunction(me, "map_base_literals", "MAP-BASE-LITERALS", 2, 0, false);
        declareFunction(me, "combinations", "COMBINATIONS", 2, 0, false);
        declareFunction(me, "yield_split", "YIELD-SPLIT", 2, 1, false);
        declareFunction(me, "words_split", "WORDS-SPLIT", 2, 1, false);
        declareFunction(me, "sentence_split", "SENTENCE-SPLIT", 2, 1, false);
        declareFunction(me, "words_string", "WORDS-STRING", 1, 0, false);
        declareFunction(me, "literal_for_term", "LITERAL-FOR-TERM", 1, 2, false);
        declareFunction(me, "make_predicate_literal", "MAKE-PREDICATE-LITERAL", 3, 0, false);
        declareFunction(me, "extract_two_word_temp_relation", "EXTRACT-TWO-WORD-TEMP-RELATION", 7, 0, false);
        declareFunction(me, "extract_semantic_args", "EXTRACT-SEMANTIC-ARGS", 7, 0, false);
        declareFunction(me, "make_empty_literal", "MAKE-EMPTY-LITERAL", 1, 0, false);
        declareFunction(me, "extract_word_args", "EXTRACT-WORD-ARGS", 5, 0, false);
        declareFunction(me, "first_np", "FIRST-NP", 1, 0, false);
        declareFunction(me, "sentence_find", "SENTENCE-FIND", 2, 1, false);
        declareFunction(me, "sentence_infix", "SENTENCE-INFIX", 2, 0, false);
        declareFunction(me, "add_word_references", "ADD-WORD-REFERENCES", 1, 0, false);
        declareFunction(me, "word_variable", "WORD-VARIABLE", 2, 0, false);
        declareFunction(me, "extract_terms", "EXTRACT-TERMS", 2, 3, false);
        declareFunction(me, "indirect_terms", "INDIRECT-TERMS", 1, 0, false);
        declareFunction(me, "predicate_arg_constraints", "PREDICATE-ARG-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "term_passes_constraintsP", "TERM-PASSES-CONSTRAINTS?", 3, 0, false);
        declareFunction(me, "clear_individualP_cached", "CLEAR-INDIVIDUAL?-CACHED", 0, 0, false);
        declareFunction(me, "remove_individualP_cached", "REMOVE-INDIVIDUAL?-CACHED", 1, 1, false);
        declareFunction(me, "individualP_cached_internal", "INDIVIDUAL?-CACHED-INTERNAL", 2, 0, false);
        declareFunction(me, "individualP_cached", "INDIVIDUAL?-CACHED", 1, 1, false);
        declareFunction(me, "clear_isa_collectionP_cached", "CLEAR-ISA-COLLECTION?-CACHED", 0, 0, false);
        declareFunction(me, "remove_isa_collectionP_cached", "REMOVE-ISA-COLLECTION?-CACHED", 1, 1, false);
        declareFunction(me, "isa_collectionP_cached_internal", "ISA-COLLECTION?-CACHED-INTERNAL", 2, 0, false);
        declareFunction(me, "isa_collectionP_cached", "ISA-COLLECTION?-CACHED", 1, 1, false);
        declareFunction(me, "clear_collection_passes_constraintsP", "CLEAR-COLLECTION-PASSES-CONSTRAINTS?", 0, 0, false);
        declareFunction(me, "remove_collection_passes_constraintsP", "REMOVE-COLLECTION-PASSES-CONSTRAINTS?", 3, 0, false);
        declareFunction(me, "collection_passes_constraintsP_internal", "COLLECTION-PASSES-CONSTRAINTS?-INTERNAL", 3, 0, false);
        declareFunction(me, "collection_passes_constraintsP", "COLLECTION-PASSES-CONSTRAINTS?", 3, 0, false);
        declareFunction(me, "clear_individual_passes_constraintsP", "CLEAR-INDIVIDUAL-PASSES-CONSTRAINTS?", 0, 0, false);
        declareFunction(me, "remove_individual_passes_constraintsP", "REMOVE-INDIVIDUAL-PASSES-CONSTRAINTS?", 3, 0, false);
        declareFunction(me, "individual_passes_constraintsP_internal", "INDIVIDUAL-PASSES-CONSTRAINTS?-INTERNAL", 3, 0, false);
        declareFunction(me, "individual_passes_constraintsP", "INDIVIDUAL-PASSES-CONSTRAINTS?", 3, 0, false);
        declareFunction(me, "refine_formula", "REFINE-FORMULA", 2, 3, false);
        declareFunction(me, "extract_literals", "EXTRACT-LITERALS", 2, 0, false);
        declareFunction(me, "find_literals_with_term", "FIND-LITERALS-WITH-TERM", 2, 0, false);
        declareFunction(me, "find_literals_with_term_replace_variable", "FIND-LITERALS-WITH-TERM-REPLACE-VARIABLE", 3, 0, false);
        declareFunction(me, "replace_literal_variables", "REPLACE-LITERAL-VARIABLES", 2, 0, false);
        declareFunction(me, "replace_blocked_fragment_literals", "REPLACE-BLOCKED-FRAGMENT-LITERALS", 2, 1, false);
        declareFunction(me, "replace_literals", "REPLACE-LITERALS", 2, 0, false);
        declareFunction(me, "formula_has_all_required_args_boundP", "FORMULA-HAS-ALL-REQUIRED-ARGS-BOUND?", 1, 1, false);
        declareFunction(me, "substitute_formula_literals", "SUBSTITUTE-FORMULA-LITERALS", 2, 1, false);
        declareFunction(me, "fill_in_default_values_for_formula", "FILL-IN-DEFAULT-VALUES-FOR-FORMULA", 1, 1, false);
        declareFunction(me, "maximal_scope", "MAXIMAL-SCOPE", 1, 0, false);
        declareFunction(me, "contains_qp", "CONTAINS-QP", 1, 0, false);
        declareFunction(me, "get_temprel_modifier", "GET-TEMPREL-MODIFIER", 1, 0, false);
        declareFunction(me, "get_temprel_patterns", "GET-TEMPREL-PATTERNS", 1, 0, false);
        declareFunction(me, "interpret_temprel_modifier", "INTERPRET-TEMPREL-MODIFIER", 1, 0, false);
        declareFunction(me, "temp_relations_equal", "TEMP-RELATIONS-EQUAL", 2, 0, false);
        declareFunction(me, "temp_relation_equal", "TEMP-RELATION-EQUAL", 2, 0, false);
        declareFunction(me, "compile_comparator_regexes", "COMPILE-COMPARATOR-REGEXES", 0, 0, false);
        declareFunction(me, "finalize_comparator_regexes", "FINALIZE-COMPARATOR-REGEXES", 0, 0, false);
        declareFunction(me, "translate_comparators", "TRANSLATE-COMPARATORS", 1, 1, false);
        declareFunction(me, "get_comparators", "GET-COMPARATORS", 1, 0, false);
        declareFunction(me, "translate_comparator_records", "TRANSLATE-COMPARATOR-RECORDS", 1, 0, false);
        declareFunction(me, "comparator_record_p", "COMPARATOR-RECORD-P", 1, 0, false);
        declareFunction(me, "translate_comparator", "TRANSLATE-COMPARATOR", 2, 0, false);
        declareFunction(me, "get_left_comparator_args", "GET-LEFT-COMPARATOR-ARGS", 2, 0, false);
        declareFunction(me, "get_right_comparator_args", "GET-RIGHT-COMPARATOR-ARGS", 2, 0, false);
        declareFunction(me, "new_comparator_cycls", "NEW-COMPARATOR-CYCLS", 3, 0, false);
        declareFunction(me, "comparator_arg_p", "COMPARATOR-ARG-P", 1, 0, false);
        declareFunction(me, "token_record_print_function_trampoline", "TOKEN-RECORD-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "token_record_p", "TOKEN-RECORD-P", 1, 0, false);
        new cae_query_search.$token_record_p$UnaryFunction();
        declareFunction(me, "tr_string", "TR-STRING", 1, 0, false);
        declareFunction(me, "tr_denotations", "TR-DENOTATIONS", 1, 0, false);
        declareFunction(me, "tr_offset", "TR-OFFSET", 1, 0, false);
        declareFunction(me, "tr_end", "TR-END", 1, 0, false);
        declareFunction(me, "_csetf_tr_string", "_CSETF-TR-STRING", 2, 0, false);
        declareFunction(me, "_csetf_tr_denotations", "_CSETF-TR-DENOTATIONS", 2, 0, false);
        declareFunction(me, "_csetf_tr_offset", "_CSETF-TR-OFFSET", 2, 0, false);
        declareFunction(me, "_csetf_tr_end", "_CSETF-TR-END", 2, 0, false);
        declareFunction(me, "make_token_record", "MAKE-TOKEN-RECORD", 0, 1, false);
        declareFunction(me, "visit_defstruct_token_record", "VISIT-DEFSTRUCT-TOKEN-RECORD", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_token_record_method", "VISIT-DEFSTRUCT-OBJECT-TOKEN-RECORD-METHOD", 2, 0, false);
        declareFunction(me, "print_token_record", "PRINT-TOKEN-RECORD", 3, 0, false);
        declareFunction(me, "new_token_record", "NEW-TOKEN-RECORD", 4, 0, false);
        declareFunction(me, "token_record_string", "TOKEN-RECORD-STRING", 1, 0, false);
        declareFunction(me, "token_record_denotations", "TOKEN-RECORD-DENOTATIONS", 1, 0, false);
        declareFunction(me, "token_record_offset", "TOKEN-RECORD-OFFSET", 1, 0, false);
        declareFunction(me, "token_record_end", "TOKEN-RECORD-END", 1, 0, false);
        declareFunction(me, "token_record_focal_string", "TOKEN-RECORD-FOCAL-STRING", 1, 0, false);
        declareFunction(me, "token_record_plist", "TOKEN-RECORD-PLIST", 1, 0, false);
        declareFunction(me, "sxhash_token_record_method", "SXHASH-TOKEN-RECORD-METHOD", 1, 0, false);
        declareFunction(me, "sxhash_token_record", "SXHASH-TOKEN-RECORD", 1, 0, false);
        declareFunction(me, "new_token_record_vector", "NEW-TOKEN-RECORD-VECTOR", 1, 0, false);
        declareFunction(me, "trv_size", "TRV-SIZE", 1, 0, false);
        declareFunction(me, "trv_get", "TRV-GET", 2, 0, false);
        declareFunction(me, "clear_get_reified_queries_from_string", "CLEAR-GET-REIFIED-QUERIES-FROM-STRING", 0, 0, false);
        declareFunction(me, "remove_get_reified_queries_from_string", "REMOVE-GET-REIFIED-QUERIES-FROM-STRING", 1, 2, false);
        declareFunction(me, "get_reified_queries_from_string_internal", "GET-REIFIED-QUERIES-FROM-STRING-INTERNAL", 3, 0, false);
        declareFunction(me, "get_reified_queries_from_string", "GET-REIFIED-QUERIES-FROM-STRING", 1, 2, false);
        declareFunction(me, "check_term_for_reified_queries", "CHECK-TERM-FOR-REIFIED-QUERIES", 4, 1, false);
        declareFunction(me, "check_assertion_for_reified_query", "CHECK-ASSERTION-FOR-REIFIED-QUERY", 5, 0, false);
        declareFunction(me, "reified_query_search_supports_score_G", "REIFIED-QUERY-SEARCH-SUPPORTS-SCORE->", 2, 0, false);
        declareFunction(me, "reified_query_search_support_score_G", "REIFIED-QUERY-SEARCH-SUPPORT-SCORE->", 2, 0, false);
        declareFunction(me, "reified_query_search_score_from_supports", "REIFIED-QUERY-SEARCH-SCORE-FROM-SUPPORTS", 1, 0, false);
        declareFunction(me, "reified_query_search_score_from_support", "REIFIED-QUERY-SEARCH-SCORE-FROM-SUPPORT", 1, 0, false);
        declareFunction(me, "lexicon_lookup_memoized_internal", "LEXICON-LOOKUP-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction(me, "lexicon_lookup_memoized", "LEXICON-LOOKUP-MEMOIZED", 2, 0, false);
        declareFunction(me, "print_reified_query_search_test_case_table", "PRINT-REIFIED-QUERY-SEARCH-TEST-CASE-TABLE", 2, 0, false);
        declareFunction(me, "reified_query_answer_foundP", "REIFIED-QUERY-ANSWER-FOUND?", 2, 0, false);
        declareFunction(me, "filtered_terms_from_medical_cae_query", "FILTERED-TERMS-FROM-MEDICAL-CAE-QUERY", 1, 0, false);
        declareFunction(me, "test_fill_in_gloss_template_string", "TEST-FILL-IN-GLOSS-TEMPLATE-STRING", 5, 3, false);
        declareFunction(me, "get_fragments_for_medical_terms", "GET-FRAGMENTS-FOR-MEDICAL-TERMS", 1, 4, false);
        declareFunction(me, "get_only_fragments_for_halo_string", "GET-ONLY-FRAGMENTS-FOR-HALO-STRING", 1, 4, false);
        declareFunction(me, "el_formulas_supersetP", "EL-FORMULAS-SUPERSET?", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_cae_query_search_file() {
        defparameter("*QUERY-SEARCH-FILTER-TREE*", $str0$data_query_search_filter_tree_txt);
        defparameter("*CAE-INCLUDE-SEMTRANS-FRAGMENTS?*", NIL);
        deflexical("*CAE-QUERY-SEARCH-TABLE-LOCK*", make_lock($$$CAE_Query_Search_Table_Lock));
        defparameter("*USE-NEW-QUERY-SEARCH*", T);
        defparameter("*CAE-QUERY-SEARCH-SKIP-NL-GENERATION*", NIL);
        defparameter("*CURE-USE-INFERENCE-FOR-QUESTIONS*", NIL);
        defparameter("*CAE-QUERY-SEARCH-INFERENCE-PARAMETERS*", $list2);
        defparameter("*CAE-QUERY-SEARCH-SKIP-NL-GENERATION?*", NIL);
        defparameter("*CURRENT-CAE-TASK*", $UNINITIALIZED);
        defparameter("*CAE-QUERY-SEARCH-DEFAULT-MT*", NIL);
        deflexical("*GENL-ARGS-TO-QUERIES*", SubLTrampolineFile.maybeDefault($genl_args_to_queries$, $genl_args_to_queries$, () -> misc_utilities.uninitialized()));
        deflexical("*ISA-ARGS-TO-QUERIES*", SubLTrampolineFile.maybeDefault($isa_args_to_queries$, $isa_args_to_queries$, () -> misc_utilities.uninitialized()));
        deflexical("*GENL-ARGS-TO-SUPPRESSED-QUERIES*", SubLTrampolineFile.maybeDefault($genl_args_to_suppressed_queries$, $genl_args_to_suppressed_queries$, () -> misc_utilities.uninitialized()));
        deflexical("*ISA-ARGS-TO-SUPPRESSED-QUERIES*", SubLTrampolineFile.maybeDefault($isa_args_to_suppressed_queries$, $isa_args_to_suppressed_queries$, () -> misc_utilities.uninitialized()));
        deflexical("*CAE-QUERY-SEARCH-INITIALIZED-MTS*", NIL);
        deflexical("*CAE-COMBINE-FRAGMENTS?*", SubLTrampolineFile.maybeDefault($sym21$_CAE_COMBINE_FRAGMENTS__, $cae_combine_fragmentsP$, NIL));
        deflexical("*MAKE-FORMULA-FOR-RULE-RHS-CACHED-CACHING-STATE*", NIL);
        deflexical("*STANDARD-XYZ-ARGLIST-CACHING-STATE*", NIL);
        deflexical("*QUERY-SEARCH-TABLE-PREDS-CACHING-STATE*", NIL);
        deflexical("*CAE-DEFAULT-VARIABLE-FORMAT*", $BLANKS);
        deflexical("*CAE-CATEGORIZED-QUERY-FOLDERS*", $list125);
        deflexical("*GET-CACHED-TEMPLATES-FROM-ASSERTION-CACHING-STATE*", NIL);
        deflexical("*FRAGMENT-FORMULAS-EQUAL?-CACHING-STATE*", NIL);
        deflexical("*ADD-ELEMENTS-FOR-GENLS-CACHING-STATE*", NIL);
        deflexical("*ADD-ELEMENTS-FOR-ISA-CACHING-STATE*", NIL);
        defparameter("*SANITY-CHECK-GLOSSES?*", NIL);
        defvar("*ALLOW-FULL-SENTENCE-QUERY-INTERPS*", NIL);
        deflexical("*SUGGESTED-FREE-POSITION-FOR-PRED?-CACHING-STATE*", NIL);
        deflexical("*ANY-NOT-ISA-CACHED?-CACHING-STATE*", NIL);
        deflexical("*ANY-ISA-CACHED?-CACHING-STATE*", NIL);
        deflexical("*ANY-NOT-GENL-CACHED?-CACHING-STATE*", NIL);
        deflexical("*QUERY-SEARCH-IRREFLEXIVE?-CACHING-STATE*", NIL);
        deflexical("*REQUIRED-BOUND-ARGS-FOR-PREDS-CACHING-STATE*", NIL);
        deflexical("*DEFAULT-VALUES-FOR-PRED-CACHING-STATE*", NIL);
        deflexical("*TERM-CLASSIFICATION-TREE-INFO-CACHING-STATE*", NIL);
        deflexical("*SUPERSTRING-MATCH-MAX-USEFUL-HIT-COUNT*", $int$999);
        deflexical("*CAE-QUERY-SEARCH-WORDIFIERS*", $list321);
        defparameter("*NEW-KEYWORD-VARS*", NIL);
        deflexical("*GET-CAE-QUERY-SEARCH-LEXICON-INT-CACHING-STATE*", NIL);
        defvar("*CAE-QUERY-TERM-AUGMENTATIONS*", NIL);
        deflexical("*FILL-IN-GLOSS-TEMPLATE-CACHED-CACHING-STATE*", NIL);
        deflexical("*MNEMONIC-VARMAP-FOR-FORMULA-CACHED-CACHING-STATE*", NIL);
        deflexical("*GENERATE-TEMPLATE-FOR-ISA-CONSTRAINT-CACHED-CACHING-STATE*", NIL);
        deflexical("*GET-VARIABLES-OF-TYPE-IN-FORMULA-CACHING-STATE*", NIL);
        deflexical("*CAE-FRAGMENT-REFINEMENTS*", SubLTrampolineFile.maybeDefault($cae_fragment_refinements$, $cae_fragment_refinements$, () -> misc_utilities.uninitialized()));
        deflexical("*CONCEPTS-TO-ADD-FOR-CONCEPT-CACHING-STATE*", NIL);
        deflexical("*GET-TYPES-TO-EXISTENTIALLY-BIND-CACHING-STATE*", NIL);
        defparameter("*CAE-QUERY-TRANSLATION-PARSER*", NIL);
        defparameter("*CAE-QUERY-TRANSLATION-LEXICON*", NIL);
        defparameter("*CAE-QUERY-TRANSLATORS*", $list430);
        defparameter("*CAE-QUERY-TRANSLATION-WFF-MT*", $const431$MedicalResearchRecommendedWFFChec);
        defparameter("*CAE-QUERY-TRANSLATION-ONTOLOGY-MT*", $$CCFOntologyMt);
        defparameter("*CAE-QUERY-TRANSLATION-PARSING-MT*", $$CCFTemplateMt);
        defparameter("*CAE-QUERY-TRANSLATION-DOMAIN-MT*", $$InferencePSC);
        defconstant("*DTP-JUSTIFIED-INTERPRETATION*", JUSTIFIED_INTERPRETATION);
        defconstant("*DTP-TERM-RECORD*", TERM_RECORD);
        defparameter("*QS-GLOBAL-SYNTACTIC-CONSTRAINTS*", $list495);
        deflexical("*INDIVIDUAL?-CACHED-CACHING-STATE*", NIL);
        deflexical("*ISA-COLLECTION?-CACHED-CACHING-STATE*", NIL);
        deflexical("*COLLECTION-PASSES-CONSTRAINTS?-CACHING-STATE*", NIL);
        deflexical("*INDIVIDUAL-PASSES-CONSTRAINTS?-CACHING-STATE*", NIL);
        defparameter("*COMPARATOR-PREDICATES*", $list574);
        defparameter("*COMPARATOR-REGEXES*", $list575);
        defparameter("*COMPARATOR-PATTERNS*", NIL);
        defconstant("*DTP-TOKEN-RECORD*", TOKEN_RECORD);
        deflexical("*GET-REIFIED-QUERIES-FROM-STRING-CACHING-STATE*", NIL);
        deflexical("*BAD-QUERY-SEARCH-STRINGS*", $list612);
        deflexical("*BAD-QUERY-SEARCH-QUERIES*", $list613);
        return NIL;
    }

    public static SubLObject setup_cae_query_search_file() {
        register_external_symbol($current_cae_task$);
        register_external_symbol(WITH_CURRENT_CAE_TASK);
        removal_modules_indexical_referent.register_indexical_referent_expansion($$CAETask_Indexical, INDEXICAL_CAE_TASK);
        note_funcall_helper_function(INDEXICAL_CAE_TASK);
        register_external_symbol(CAE_QUERY_SEARCH_DEFAULT_MT);
        register_external_symbol(CAE_DEFAULT_QUERY_MT);
        register_external_symbol(CAE_DEFAULT_WFF_CHECKING_MT);
        declare_defglobal($genl_args_to_queries$);
        declare_defglobal($isa_args_to_queries$);
        declare_defglobal($genl_args_to_suppressed_queries$);
        declare_defglobal($isa_args_to_suppressed_queries$);
        declare_defglobal($sym21$_CAE_COMBINE_FRAGMENTS__);
        register_kb_function(ADD_QUERY_SEARCH_TABLE_ASSERTION);
        register_kb_function(REMOVE_QUERY_SEARCH_TABLE_ASSERTION);
        memoization_state.note_globally_cached_function(MAKE_FORMULA_FOR_RULE_RHS_CACHED);
        memoization_state.note_globally_cached_function(STANDARD_XYZ_ARGLIST);
        memoization_state.note_globally_cached_function(QUERY_SEARCH_TABLE_PREDS);
        register_external_symbol(INDEXED_QUERIES_FROM_STRING_WITH_CONFIDENCES);
        register_external_symbol(INDEXED_QUERIES_FROM_TERMS_WITH_CONFIDENCES);
        register_external_symbol(GET_GLOSS_FOR_INDEXED_QUERY);
        register_external_symbol(FORMAT_INDEXED_QUERIES_FROM_WITH_CONFIDENCES);
        memoization_state.note_globally_cached_function(GET_CACHED_TEMPLATES_FROM_ASSERTION);
        memoization_state.note_globally_cached_function($sym165$FRAGMENT_FORMULAS_EQUAL_);
        define_test_case_table_int(ADD_UNBOUND_FRAGMENTS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list188, $KB, $FULL, $WORKING_, T }), $list192);
        memoization_state.note_globally_cached_function(ADD_ELEMENTS_FOR_GENLS);
        memoization_state.note_globally_cached_function(ADD_ELEMENTS_FOR_ISA);
        define_test_case_table_int(MARK_DUPLICATED_UNBOUND_QUERIES, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list188, $KB, $TINY, $WORKING_, T }), $list221);
        define_test_case_table_int(GET_FRAGMENTS_FOR_STRING_AND_TASK, list(new SubLObject[]{ $TEST, $sym223$FRAGMENTS_CONTAIN_SENTENCE_, $OWNER, NIL, $CLASSES, $list188, $KB, $FULL, $WORKING_, T }), $list224);
        define_test_case_table_int(GET_FRAGMENTS_FOR_STRING, list(new SubLObject[]{ $TEST, $sym226$EQUAL_FRAGMENT_LISTS_, $OWNER, NIL, $CLASSES, $list188, $KB, $FULL, $WORKING_, NIL }), $list227);
        memoization_state.note_globally_cached_function($sym228$SUGGESTED_FREE_POSITION_FOR_PRED_);
        memoization_state.note_globally_cached_function($sym234$ANY_NOT_ISA_CACHED_);
        memoization_state.note_globally_cached_function($sym237$ANY_ISA_CACHED_);
        memoization_state.note_globally_cached_function($sym240$ANY_NOT_GENL_CACHED_);
        define_test_case_table_int(TRY_SUBSTITUTION, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list188, $KB, $FULL, $WORKING_, T }), $list244);
        memoization_state.note_globally_cached_function($sym247$QUERY_SEARCH_IRREFLEXIVE_);
        memoization_state.note_memoized_function($sym253$STRONG_QUERY_SEARCH_ACCEPTABILITY_CHECKS_ALLOWED_);
        define_test_case_table_int(HALO_TEST_PASSES_INTER_ARG_RELN_REQUIREMENTS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list188, $KB, $FULL, $WORKING_, T }), $list262);
        memoization_state.note_globally_cached_function(REQUIRED_BOUND_ARGS_FOR_PREDS);
        define_test_case_table_int($sym270$SENTENCE_HAS_ALL_REQUIRED_ARGS_BOUND_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list188, $KB, $FULL, $WORKING_, T }), $list271);
        memoization_state.note_globally_cached_function(DEFAULT_VALUES_FOR_PRED);
        register_external_symbol(DEFAULT_VALUES_FOR_SENTENCE);
        memoization_state.note_globally_cached_function(TERM_CLASSIFICATION_TREE_INFO);
        register_external_symbol(CAE_QUERY_SUPERSTRINGS);
        register_external_symbol(GET_TERMS_FROM_CAE_QUERY_SEARCH);
        memoization_state.note_memoized_function(TERMS_FROM_CAE_QUERY_INT);
        memoization_state.note_globally_cached_function(GET_CAE_QUERY_SEARCH_LEXICON_INT);
        define_test_case_table_int($sym355$TEST_GET_FRAGMENTS_FOR_STRING_AGAINST_EXPECTED_LITERALS_NON_BLOCK, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list188, $KB, $FULL, $WORKING_, T }), $list356);
        memoization_state.note_globally_cached_function(FILL_IN_GLOSS_TEMPLATE_CACHED);
        define_test_case_table_int(POSITION_INFO_FROM_MAP, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list188, $KB, $TINY, $WORKING_, T }), $list364);
        memoization_state.note_globally_cached_function(MNEMONIC_VARMAP_FOR_FORMULA_CACHED);
        memoization_state.note_globally_cached_function(GENERATE_TEMPLATE_FOR_ISA_CONSTRAINT_CACHED);
        memoization_state.note_globally_cached_function(GET_VARIABLES_OF_TYPE_IN_FORMULA);
        declare_defglobal($cae_fragment_refinements$);
        memoization_state.note_globally_cached_function(CONCEPTS_TO_ADD_FOR_CONCEPT);
        define_test_case_table_int(ADD_CONCEPT_TO_FORMULA, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list188, $KB, $FULL, $WORKING_, T }), $list388);
        memoization_state.note_globally_cached_function(GET_TYPES_TO_EXISTENTIALLY_BIND);
        register_external_symbol(TOOLTIP_FOR_QUERY_SEARCH_SENTENCE);
        define_test_case_table_int(DECISION_TREE_CONCEPT_FILTER_BUILDS_SUCCESSFULLY, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list188, $KB, $FULL, $WORKING_, T }), $list429);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_justified_interpretation$.getGlobalValue(), symbol_function(JUSTIFIED_INTERPRETATION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list442);
        def_csetf(JI_CYCL, _CSETF_JI_CYCL);
        def_csetf(JI_WORDS, _CSETF_JI_WORDS);
        def_csetf(JI_ARG_RECORDS, _CSETF_JI_ARG_RECORDS);
        identity(JUSTIFIED_INTERPRETATION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_justified_interpretation$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_JUSTIFIED_INTERPRETATION_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_term_record$.getGlobalValue(), symbol_function(TERM_RECORD_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list476);
        def_csetf(TERM_RECORD_TERM, _CSETF_TERM_RECORD_TERM);
        def_csetf(TERM_RECORD_WORD, _CSETF_TERM_RECORD_WORD);
        def_csetf(TERM_RECORD_LITERAL, _CSETF_TERM_RECORD_LITERAL);
        identity(TERM_RECORD);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_term_record$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TERM_RECORD_METHOD));
        memoization_state.note_globally_cached_function($sym539$INDIVIDUAL__CACHED);
        memoization_state.note_globally_cached_function($sym542$ISA_COLLECTION__CACHED);
        memoization_state.note_globally_cached_function($sym545$COLLECTION_PASSES_CONSTRAINTS_);
        memoization_state.note_globally_cached_function($sym548$INDIVIDUAL_PASSES_CONSTRAINTS_);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_token_record$.getGlobalValue(), symbol_function(TOKEN_RECORD_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list585);
        def_csetf(TR_STRING, _CSETF_TR_STRING);
        def_csetf(TR_DENOTATIONS, _CSETF_TR_DENOTATIONS);
        def_csetf(TR_OFFSET, _CSETF_TR_OFFSET);
        def_csetf(TR_END, _CSETF_TR_END);
        identity(TOKEN_RECORD);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_token_record$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TOKEN_RECORD_METHOD));
        note_funcall_helper_function(PRINT_TOKEN_RECORD);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_token_record$.getGlobalValue(), symbol_function(SXHASH_TOKEN_RECORD_METHOD));
        memoization_state.note_globally_cached_function(GET_REIFIED_QUERIES_FROM_STRING);
        memoization_state.note_memoized_function(LEXICON_LOOKUP_MEMOIZED);
        define_test_case_table_int(GET_REIFIED_QUERIES_FROM_STRING, list(new SubLObject[]{ $TEST, $sym633$REIFIED_QUERY_ANSWER_FOUND_, $OWNER, NIL, $CLASSES, $list188, $KB, $FULL, $WORKING_, T }), $list634);
        define_test_case_table_int(FILTERED_TERMS_FROM_MEDICAL_CAE_QUERY, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list188, $KB, $FULL, $WORKING_, T }), $list636);
        define_test_case_table_int(GET_FRAGMENTS_FOR_MEDICAL_TERMS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list188, $KB, $FULL, $WORKING_, T }), $list639);
        define_test_case_table_int(TEST_FILL_IN_GLOSS_TEMPLATE_STRING, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list188, $KB, $FULL, $WORKING_, T }), $list641);
        define_test_case_table_int(TEST_GET_TEMPORAL_FRAGMENTS_FOR_STRING, list(new SubLObject[]{ $TEST, TEMP_RELATIONS_EQUAL, $OWNER, NIL, $CLASSES, $list188, $KB, $FULL, $WORKING_, T }), $list644);
        define_test_case_table_int(GET_ONLY_FRAGMENTS_FOR_HALO_STRING, list(new SubLObject[]{ $TEST, $sym647$EL_FORMULAS_SUPERSET_, $OWNER, NIL, $CLASSES, $list188, $KB, $FULL, $WORKING_, T }), $list648);
        return NIL;
    }

    private static SubLObject _constant_192_initializer() {
        return list(list(list(list(list(list(reader_make_constant_shell(makeString("cCFLeftVentricleEjectionFraction")), makeSymbol("?X"), makeSymbol("?Y")), list(makeString("During X, the left ventricle ejection fraction was measured as Y."), list(makeSymbol("?X"), cons(SEVEN_INTEGER, ONE_INTEGER)), list(makeSymbol("?Y"), cons(makeInteger(63), ONE_INTEGER))), makeKeyword("SIMPLE")), list(list(reader_make_constant_shell(makeString("lessThan")), makeSymbol("?QUANTITY"), makeSymbol("?QUANTITY-2")), list(makeString("QUANTITY is less than QUANTITY-2."), list(makeSymbol("?QUANTITY"), cons(ZERO_INTEGER, EIGHT_INTEGER)), list(makeSymbol("?QUANTITY-2"), cons(makeInteger(22), TEN_INTEGER))), makeKeyword("SUPPLEMENTAL"))), list(list(list(reader_make_constant_shell(makeString("lessThan")), makeSymbol("?QUANTITY"), makeSymbol("?QUANTITY-2")), list(makeString("QUANTITY is less than QUANTITY-2."), list(makeSymbol("?QUANTITY"), cons(ZERO_INTEGER, EIGHT_INTEGER)), list(makeSymbol("?QUANTITY-2"), cons(makeInteger(22), TEN_INTEGER))), makeKeyword("UNBOUND")), list(list(reader_make_constant_shell(makeString("cCFLeftVentricleEjectionFraction")), makeSymbol("?X"), makeSymbol("?Y")), list(makeString("During X, the left ventricle ejection fraction was measured as Y."), list(makeSymbol("?X"), cons(SEVEN_INTEGER, ONE_INTEGER)), list(makeSymbol("?Y"), cons(makeInteger(63), ONE_INTEGER))), makeKeyword("UNBOUND"))), NIL, list(list(makeString("ejection fraction"), reader_make_constant_shell(makeString("cCFLeftVentricleEjectionFraction"))))), list(list(list(reader_make_constant_shell(makeString("cCFLeftVentricleEjectionFraction")), makeSymbol("?X"), makeSymbol("?Y")), list(makeString("During X, the left ventricle ejection fraction was measured as Y."), list(makeSymbol("?X"), cons(SEVEN_INTEGER, ONE_INTEGER)), list(makeSymbol("?Y"), cons(makeInteger(63), ONE_INTEGER))), makeKeyword("SIMPLE")), list(list(reader_make_constant_shell(makeString("lessThan")), makeSymbol("?QUANTITY"), makeSymbol("?QUANTITY-2")), list(makeString("QUANTITY is less than QUANTITY-2."), list(makeSymbol("?QUANTITY"), cons(ZERO_INTEGER, EIGHT_INTEGER)), list(makeSymbol("?QUANTITY-2"), cons(makeInteger(22), TEN_INTEGER))), makeKeyword("SUPPLEMENTAL")))), list(list(list(list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(makeString("THING is an aortic valve replacement."), list(makeSymbol("?THING"), cons(ZERO_INTEGER, FIVE_INTEGER)), list(makeSymbol("?X"), cons(TWELVE_INTEGER, makeInteger(24)))), makeKeyword("SIMPLE")), list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("Echocardiogram"))), list(makeString("THING is an echocardiogram."), list(makeSymbol("?THING"), cons(ZERO_INTEGER, FIVE_INTEGER)), list(makeSymbol("?X"), cons(TWELVE_INTEGER, FOURTEEN_INTEGER))), makeKeyword("SIMPLE")), list(list(reader_make_constant_shell(makeString("cCFSource")), makeSymbol("?CCF-DATA-SOURCE"), reader_make_constant_shell(makeString("Echocardiogram"))), list(makeString("The source CCF-DATA-SOURCE is Echo before AVR."), list(makeSymbol("?CCF-DATA-SOURCE"), cons(ELEVEN_INTEGER, FIFTEEN_INTEGER)), list(makeSymbol("?SOURCE-OF-DATA"), cons(makeInteger(30), FIFTEEN_INTEGER))), makeKeyword("SUPPLEMENTAL")), list(list(reader_make_constant_shell(makeString("medicalEventHasAssociatedData")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?CONTAINER-UNDERSPECIFIED")), list(makeString("CONTAINER-UNDERSPECIFIED contains information pertaining to MEDICALLY-RELATED-EVENT."), list(makeSymbol("?CONTAINER-UNDERSPECIFIED"), cons(ZERO_INTEGER, makeInteger(24))), list(makeSymbol("?MEDICALLY-RELATED-EVENT"), cons(makeInteger(60), makeInteger(23)))), makeKeyword("SUPPLEMENTAL")), list(list(reader_make_constant_shell(makeString("cCFEchoEventTiming")), makeSymbol("?CCF-EVENT"), makeSymbol("?ECHO-EVENT-TIMING")), list(makeString("ECHO-EVENT-TIMING is the timing of the echocardiography of CCF-EVENT in relation to other events or parts of the procedure."), list(makeSymbol("?ECHO-EVENT-TIMING"), cons(ZERO_INTEGER, SEVENTEEN_INTEGER)), list(makeSymbol("?CCF-EVENT"), cons(makeInteger(59), NINE_INTEGER))), makeKeyword("SUPPLEMENTAL")), list(list(reader_make_constant_shell(makeString("medicalEventHasProcedure")), makeSymbol("?MANAGEMENT-ENCOUNTER"), makeSymbol("?SURGICAL-PROCEDURE")), list(makeString("SURGICAL-PROCEDURE is a surgical procedure performed during MANAGEMENT-ENCOUNTER."), list(makeSymbol("?SURGICAL-PROCEDURE"), cons(ZERO_INTEGER, EIGHTEEN_INTEGER)), list(makeSymbol("?MANAGEMENT-ENCOUNTER"), cons(makeInteger(60), TWENTY_INTEGER))), makeKeyword("SUPPLEMENTAL")), list(list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?X"), makeSymbol("?Y")), list(makeString("Y is before X."), list(makeSymbol("?Y"), cons(ZERO_INTEGER, ONE_INTEGER)), list(makeSymbol("?X"), cons(TWELVE_INTEGER, ONE_INTEGER))), makeKeyword("SIMPLE"))), list(list(list(reader_make_constant_shell(makeString("medicalEventHasProcedure")), makeSymbol("?MANAGEMENT-ENCOUNTER"), makeSymbol("?SURGICAL-PROCEDURE")), list(makeString("SURGICAL-PROCEDURE is a surgical procedure performed during MANAGEMENT-ENCOUNTER."), list(makeSymbol("?SURGICAL-PROCEDURE"), cons(ZERO_INTEGER, EIGHTEEN_INTEGER)), list(makeSymbol("?MANAGEMENT-ENCOUNTER"), cons(makeInteger(60), TWENTY_INTEGER))), makeKeyword("UNBOUND")), list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(makeString("THING is an aortic valve replacement."), list(makeSymbol("?THING"), cons(ZERO_INTEGER, FIVE_INTEGER)), list(makeSymbol("?X"), cons(TWELVE_INTEGER, makeInteger(24)))), makeKeyword("UNBOUND")), list(list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?X"), makeSymbol("?Y")), list(makeString("Y is before X."), list(makeSymbol("?Y"), cons(ZERO_INTEGER, ONE_INTEGER)), list(makeSymbol("?X"), cons(TWELVE_INTEGER, ONE_INTEGER))), makeKeyword("UNBOUND")), list(list(reader_make_constant_shell(makeString("medicalEventHasAssociatedData")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?CONTAINER-UNDERSPECIFIED")), list(makeString("CONTAINER-UNDERSPECIFIED contains information pertaining to MEDICALLY-RELATED-EVENT."), list(makeSymbol("?CONTAINER-UNDERSPECIFIED"), cons(ZERO_INTEGER, makeInteger(24))), list(makeSymbol("?MEDICALLY-RELATED-EVENT"), cons(makeInteger(60), makeInteger(23)))), makeKeyword("UNBOUND")), list(list(reader_make_constant_shell(makeString("cCFEchoEventTiming")), makeSymbol("?CCF-EVENT"), makeSymbol("?ECHO-EVENT-TIMING")), list(makeString("ECHO-EVENT-TIMING is the timing of the echocardiography of CCF-EVENT in relation to other events or parts of the procedure."), list(makeSymbol("?ECHO-EVENT-TIMING"), cons(ZERO_INTEGER, SEVENTEEN_INTEGER)), list(makeSymbol("?CCF-EVENT"), cons(makeInteger(59), NINE_INTEGER))), makeKeyword("UNBOUND")), list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("Echocardiogram"))), list(makeString("THING is an echocardiogram."), list(makeSymbol("?THING"), cons(ZERO_INTEGER, FIVE_INTEGER)), list(makeSymbol("?X"), cons(TWELVE_INTEGER, FOURTEEN_INTEGER))), makeKeyword("UNBOUND")), list(list(reader_make_constant_shell(makeString("cCFSource")), makeSymbol("?CCF-DATA-SOURCE"), makeSymbol("?SOURCE-OF-DATA")), list(makeString("The source CCF-DATA-SOURCE is SOURCE-OF-DATA."), list(makeSymbol("?CCF-DATA-SOURCE"), cons(ELEVEN_INTEGER, FIFTEEN_INTEGER)), list(makeSymbol("?SOURCE-OF-DATA"), cons(makeInteger(30), FOURTEEN_INTEGER))), makeKeyword("UNBOUND"))), NIL, list(list(makeString("Echo before AVR"), reader_make_constant_shell(makeString("Echocardiogram"))), list(makeString("Echo before AVR"), reader_make_constant_shell(makeString("after-CCF"))), list(makeString("Echo before AVR"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))))), list(list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(makeString("THING is an aortic valve replacement."), list(makeSymbol("?THING"), cons(ZERO_INTEGER, FIVE_INTEGER)), list(makeSymbol("?X"), cons(TWELVE_INTEGER, makeInteger(24)))), makeKeyword("SIMPLE")), list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("Echocardiogram"))), list(makeString("THING is an echocardiogram."), list(makeSymbol("?THING"), cons(ZERO_INTEGER, FIVE_INTEGER)), list(makeSymbol("?X"), cons(TWELVE_INTEGER, FOURTEEN_INTEGER))), makeKeyword("SIMPLE")), list(list(reader_make_constant_shell(makeString("cCFSource")), makeSymbol("?CCF-DATA-SOURCE"), reader_make_constant_shell(makeString("Echocardiogram"))), list(makeString("The source CCF-DATA-SOURCE is Echo before AVR."), list(makeSymbol("?CCF-DATA-SOURCE"), cons(ELEVEN_INTEGER, FIFTEEN_INTEGER)), list(makeSymbol("?SOURCE-OF-DATA"), cons(makeInteger(30), FIFTEEN_INTEGER))), makeKeyword("SUPPLEMENTAL")), list(list(reader_make_constant_shell(makeString("medicalEventHasAssociatedData")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?CONTAINER-UNDERSPECIFIED")), list(makeString("CONTAINER-UNDERSPECIFIED contains information pertaining to MEDICALLY-RELATED-EVENT."), list(makeSymbol("?CONTAINER-UNDERSPECIFIED"), cons(ZERO_INTEGER, makeInteger(24))), list(makeSymbol("?MEDICALLY-RELATED-EVENT"), cons(makeInteger(60), makeInteger(23)))), makeKeyword("SUPPLEMENTAL")), list(list(reader_make_constant_shell(makeString("cCFEchoEventTiming")), makeSymbol("?CCF-EVENT"), makeSymbol("?ECHO-EVENT-TIMING")), list(makeString("ECHO-EVENT-TIMING is the timing of the echocardiography of CCF-EVENT in relation to other events or parts of the procedure."), list(makeSymbol("?ECHO-EVENT-TIMING"), cons(ZERO_INTEGER, SEVENTEEN_INTEGER)), list(makeSymbol("?CCF-EVENT"), cons(makeInteger(59), NINE_INTEGER))), makeKeyword("SUPPLEMENTAL")), list(list(reader_make_constant_shell(makeString("medicalEventHasProcedure")), makeSymbol("?MANAGEMENT-ENCOUNTER"), makeSymbol("?SURGICAL-PROCEDURE")), list(makeString("SURGICAL-PROCEDURE is a surgical procedure performed during MANAGEMENT-ENCOUNTER."), list(makeSymbol("?SURGICAL-PROCEDURE"), cons(ZERO_INTEGER, EIGHTEEN_INTEGER)), list(makeSymbol("?MANAGEMENT-ENCOUNTER"), cons(makeInteger(60), TWENTY_INTEGER))), makeKeyword("SUPPLEMENTAL")), list(list(reader_make_constant_shell(makeString("cCFSource")), makeSymbol("?CCF-DATA-SOURCE"), makeSymbol("?SOURCE-OF-DATA")), list(makeString("The source CCF-DATA-SOURCE is SOURCE-OF-DATA."), list(makeSymbol("?CCF-DATA-SOURCE"), cons(ELEVEN_INTEGER, FIFTEEN_INTEGER)), list(makeSymbol("?SOURCE-OF-DATA"), cons(makeInteger(30), FOURTEEN_INTEGER))), makeKeyword("UNBOUND")), list(list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?X"), makeSymbol("?Y")), list(makeString("Y is before X."), list(makeSymbol("?Y"), cons(ZERO_INTEGER, ONE_INTEGER)), list(makeSymbol("?X"), cons(TWELVE_INTEGER, ONE_INTEGER))), makeKeyword("SIMPLE")))));
    }

    private static SubLObject _constant_227_initializer() {
        return list(list(list(makeString("ejection fraction less than 50"), NIL, reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt")), makeKeyword("BLANKS"), reader_make_constant_shell(makeString("GenericMedicalResearchTask-Allotment"))), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?W"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("cCFLeftVentricleEjectionFraction")), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?X"), makeSymbol("?W")))), list(makeString("During X, the left ventricle ejection fraction was measured as Y."), list(makeSymbol("?X"), cons(SEVEN_INTEGER, ONE_INTEGER)), list(makeSymbol("?Y"), cons(makeInteger(63), ONE_INTEGER))), makeKeyword("SIMPLE")), list(list(reader_make_constant_shell(makeString("lessThan")), makeSymbol("?X"), makeSymbol("?Y")), list(makeString("X is less than Y."), list(makeSymbol("?X"), cons(ZERO_INTEGER, ONE_INTEGER)), list(makeSymbol("?Y"), cons(FIFTEEN_INTEGER, ONE_INTEGER))), makeKeyword("UNBOUND")), list(list(reader_make_constant_shell(makeString("lessThan")), makeSymbol("?X"), makeInteger(50)), list(makeString("______ is less than 50."), list(makeSymbol("?X"), cons(ZERO_INTEGER, SIX_INTEGER))), makeKeyword("SIMPLE")))), list(list(makeString("pericardial window"), NIL, reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt")), makeKeyword("BLANKS"), reader_make_constant_shell(makeString("GenericMedicalResearchTask-Allotment"))), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("PericardialWindow-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?THING"), makeSymbol("?Y")))), list(makeString("THING is an pericardial window."), list(makeSymbol("?THING"), cons(ZERO_INTEGER, FIVE_INTEGER)), list(makeSymbol("?X"), cons(TWELVE_INTEGER, EIGHTEEN_INTEGER))), makeKeyword("SIMPLE"), list(makeKeyword("ISA"), reader_make_constant_shell(makeString("PericardialWindow-SurgicalProcedure")), reader_make_constant_shell(makeString("Collection")))), list(list(reader_make_constant_shell(makeString("medicalEventHasProcedure")), makeSymbol("?MANAGEMENT-ENCOUNTER"), makeSymbol("?SURGICAL-PROCEDURE")), list(makeString("SURGICAL-PROCEDURE is a surgical procedure performed during MANAGEMENT-ENCOUNTER."), list(makeSymbol("?SURGICAL-PROCEDURE"), cons(ZERO_INTEGER, EIGHTEEN_INTEGER)), list(makeSymbol("?MANAGEMENT-ENCOUNTER"), cons(makeInteger(60), TWENTY_INTEGER))), makeKeyword("SUPPLEMENTAL"), list(makeKeyword("GENL"), reader_make_constant_shell(makeString("PericardialWindow-SurgicalProcedure")), reader_make_constant_shell(makeString("SurgicalProcedure")))), list(list(reader_make_constant_shell(makeString("durationOfMedicalEvent")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?TIME")), list(makeString("The time elapsed from the start of to the end of MEDICALLY-RELATED-EVENT is TIME."), list(makeSymbol("?MEDICALLY-RELATED-EVENT"), cons(makeInteger(49), makeInteger(23))), list(makeSymbol("?TIME"), cons(makeInteger(76), FOUR_INTEGER))), makeKeyword("SUPPLEMENTAL"), list(makeKeyword("GENL"), reader_make_constant_shell(makeString("PericardialWindow-SurgicalProcedure")), reader_make_constant_shell(makeString("CCFMedicalEvent")))), list(list(reader_make_constant_shell(makeString("medicalEventHasAssociatedData")), makeSymbol("?X"), makeSymbol("?Y")), list(makeString("Y contains information pertaining to X."), list(makeSymbol("?Y"), cons(ZERO_INTEGER, ONE_INTEGER)), list(makeSymbol("?X"), cons(makeInteger(37), ONE_INTEGER))), makeKeyword("SUPPLEMENTAL"), list(makeKeyword("GENL"), reader_make_constant_shell(makeString("PericardialWindow-SurgicalProcedure")), reader_make_constant_shell(makeString("SurgicalProcedure")))))), list(list(makeString("ejection fraction less than 50"), NIL, reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt")), makeKeyword("XYZ"), reader_make_constant_shell(makeString("GenericMedicalResearchTask-Allotment"))), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?W"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("cCFLeftVentricleEjectionFraction")), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?X"), makeSymbol("?W")))), list(makeString("During X, the left ventricle ejection fraction was measured as Y."), list(makeSymbol("?X"), cons(SEVEN_INTEGER, ONE_INTEGER)), list(makeSymbol("?Y"), cons(makeInteger(63), ONE_INTEGER))), makeKeyword("SIMPLE")), list(list(reader_make_constant_shell(makeString("lessThan")), makeSymbol("?X"), makeSymbol("?Y")), list(makeString("X is less than Y."), list(makeSymbol("?X"), cons(ZERO_INTEGER, ONE_INTEGER)), list(makeSymbol("?Y"), cons(FIFTEEN_INTEGER, ONE_INTEGER))), makeKeyword("UNBOUND")), list(list(reader_make_constant_shell(makeString("lessThan")), makeSymbol("?X"), makeInteger(50)), list(makeString("What quantities are less than 50?"), list(makeSymbol("?X"), cons(ZERO_INTEGER, FOUR_INTEGER), cons(FOUR_INTEGER, ONE_INTEGER), cons(FIVE_INTEGER, TEN_INTEGER))), makeKeyword("SIMPLE")))), list(list(makeString("pericardial window"), NIL, reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt")), makeKeyword("XYZ"), reader_make_constant_shell(makeString("GenericMedicalResearchTask-Allotment"))), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("PericardialWindow-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?THING"), makeSymbol("?Y")))), list(makeString("X is an pericardial window."), list(makeSymbol("?THING"), cons(ZERO_INTEGER, ONE_INTEGER)), list(makeSymbol("?X"), cons(EIGHT_INTEGER, EIGHTEEN_INTEGER))), makeKeyword("SIMPLE"), list(makeKeyword("ISA"), reader_make_constant_shell(makeString("PericardialWindow-SurgicalProcedure")), reader_make_constant_shell(makeString("Collection")))), list(list(reader_make_constant_shell(makeString("durationOfMedicalEvent")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?TIME")), list(makeString("The time elapsed from the start of to the end of X is Y."), list(makeSymbol("?MEDICALLY-RELATED-EVENT"), cons(makeInteger(49), ONE_INTEGER)), list(makeSymbol("?TIME"), cons(makeInteger(54), ONE_INTEGER))), makeKeyword("SUPPLEMENTAL"), list(makeKeyword("GENL"), reader_make_constant_shell(makeString("PericardialWindow-SurgicalProcedure")), reader_make_constant_shell(makeString("CCFMedicalEvent")))), list(list(reader_make_constant_shell(makeString("medicalEventHasAssociatedData")), makeSymbol("?X"), makeSymbol("?Y")), list(makeString("X contains information pertaining to Y."), list(makeSymbol("?Y"), cons(ZERO_INTEGER, ONE_INTEGER)), list(makeSymbol("?X"), cons(makeInteger(37), ONE_INTEGER))), makeKeyword("SUPPLEMENTAL"), list(makeKeyword("GENL"), reader_make_constant_shell(makeString("PericardialWindow-SurgicalProcedure")), reader_make_constant_shell(makeString("SurgicalProcedure")))), list(list(reader_make_constant_shell(makeString("medicalEventHasProcedure")), makeSymbol("?MANAGEMENT-ENCOUNTER"), makeSymbol("?SURGICAL-PROCEDURE")), list(makeString("X is a surgical procedure performed during Y."), list(makeSymbol("?SURGICAL-PROCEDURE"), cons(ZERO_INTEGER, ONE_INTEGER)), list(makeSymbol("?MANAGEMENT-ENCOUNTER"), cons(makeInteger(43), ONE_INTEGER))), makeKeyword("SUPPLEMENTAL"), list(makeKeyword("GENL"), reader_make_constant_shell(makeString("PericardialWindow-SurgicalProcedure")), reader_make_constant_shell(makeString("SurgicalProcedure")))))), list(list(makeString(" receptors for vasopressin"), NIL, reader_make_constant_shell(makeString("GenomeResearchCAEGuidanceMt")), makeKeyword("BLANKS"), list(makeKeyword("NOT"), list(makeKeyword("TEST"), makeSymbol("GROUND?"))), reader_make_constant_shell(makeString("BioMedicalGenomicResearch-Allotment"))), list(new SubLObject[]{ list(list(reader_make_constant_shell(makeString("target-DrugBank")), reader_make_constant_shell(makeString("Vasopressin")), makeSymbol("?TYPE-OF-PROTEIN")), list(makeString("In pharmaceutical conditions, molecules of the drug vasopressin bind to TYPE-OF-PROTEIN molecules."), list(makeSymbol("?TYPE-OF-MEDICINE"), cons(makeInteger(52), ELEVEN_INTEGER)), list(makeSymbol("?TYPE-OF-PROTEIN"), cons(makeInteger(72), FIFTEEN_INTEGER))), makeKeyword("SIMPLE"), list(makeKeyword("ISA"), reader_make_constant_shell(makeString("Vasopressin")), reader_make_constant_shell(makeString("PharmaceuticalType"))), FIFTEEN_INTEGER, makeInteger(25)), list(list(reader_make_constant_shell(makeString("ligandForReceptorType")), makeSymbol("?TYPE-OF-CHEMICAL-OBJECT"), reader_make_constant_shell(makeString("ReceptorMolecule"))), list(makeString("Ligand For Receptor Type TYPE-OF-CHEMICAL-OBJECT receptors."), list(makeSymbol("?TYPE-OF-CHEMICAL-OBJECT"), cons(makeInteger(25), makeInteger(23))), list(makeSymbol("?TYPE-OF-PROTEIN-MOLECULE"), cons(makeInteger(49), NINE_INTEGER))), makeKeyword("SIMPLE"), list(makeKeyword("GENL"), reader_make_constant_shell(makeString("ReceptorMolecule")), reader_make_constant_shell(makeString("ReceptorMolecule"))), ONE_INTEGER, NINE_INTEGER), list(list(reader_make_constant_shell(makeString("agonistForReceptorType")), makeSymbol("?TYPE-OF-MOLECULE"), reader_make_constant_shell(makeString("ReceptorMolecule"))), list(makeString("The instance of TYPE-OF-MOLECULE is an agonist for the instance of receptors."), list(makeSymbol("?TYPE-OF-MOLECULE"), cons(SIXTEEN_INTEGER, SIXTEEN_INTEGER)), list(makeSymbol("?TYPE-OF-PROTEIN-MOLECULE"), cons(makeInteger(67), NINE_INTEGER))), makeKeyword("SIMPLE"), list(makeKeyword("GENL"), reader_make_constant_shell(makeString("ReceptorMolecule")), reader_make_constant_shell(makeString("ReceptorMolecule"))), ONE_INTEGER, NINE_INTEGER), list(list(reader_make_constant_shell(makeString("antagonistForReceptorType")), makeSymbol("?TYPE-OF-MOLECULE"), reader_make_constant_shell(makeString("ReceptorMolecule"))), list(makeString("The instance of TYPE-OF-MOLECULE is an antagonist for the instance of receptors."), list(makeSymbol("?TYPE-OF-MOLECULE"), cons(SIXTEEN_INTEGER, SIXTEEN_INTEGER)), list(makeSymbol("?TYPE-OF-PROTEIN-MOLECULE"), cons(makeInteger(70), NINE_INTEGER))), makeKeyword("SIMPLE"), list(makeKeyword("GENL"), reader_make_constant_shell(makeString("ReceptorMolecule")), reader_make_constant_shell(makeString("ReceptorMolecule"))), ONE_INTEGER, NINE_INTEGER), list(list(reader_make_constant_shell(makeString("agonistForReceptorType")), reader_make_constant_shell(makeString("ReceptorMolecule")), makeSymbol("?TYPE-OF-PROTEIN-MOLECULE")), list(makeString("The instance of receptors is an agonist for the instance of TYPE-OF-PROTEIN-MOLECULE."), list(makeSymbol("?TYPE-OF-MOLECULE"), cons(SIXTEEN_INTEGER, NINE_INTEGER)), list(makeSymbol("?TYPE-OF-PROTEIN-MOLECULE"), cons(makeInteger(60), makeInteger(24)))), makeKeyword("SIMPLE"), list(makeKeyword("GENL"), reader_make_constant_shell(makeString("ReceptorMolecule")), reader_make_constant_shell(makeString("ReceptorMolecule"))), ONE_INTEGER, NINE_INTEGER), list(list(reader_make_constant_shell(makeString("antagonistForReceptorType")), reader_make_constant_shell(makeString("ReceptorMolecule")), makeSymbol("?TYPE-OF-PROTEIN-MOLECULE")), list(makeString("The instance of receptors is an antagonist for the instance of TYPE-OF-PROTEIN-MOLECULE."), list(makeSymbol("?TYPE-OF-MOLECULE"), cons(SIXTEEN_INTEGER, NINE_INTEGER)), list(makeSymbol("?TYPE-OF-PROTEIN-MOLECULE"), cons(makeInteger(63), makeInteger(24)))), makeKeyword("SIMPLE"), list(makeKeyword("GENL"), reader_make_constant_shell(makeString("ReceptorMolecule")), reader_make_constant_shell(makeString("ReceptorMolecule"))), ONE_INTEGER, NINE_INTEGER), list(list(reader_make_constant_shell(makeString("drugTypeMolecularInstancesBindToMoleculeTypeInstances")), makeSymbol("?X"), reader_make_constant_shell(makeString("ReceptorMolecule"))), list(makeString("X molecules bind to receptors molecules."), list(makeSymbol("?X"), cons(ZERO_INTEGER, ONE_INTEGER)), list(makeSymbol("?Y"), cons(TWENTY_INTEGER, NINE_INTEGER))), makeKeyword("SIMPLE"), list(makeKeyword("ISA"), reader_make_constant_shell(makeString("drugTypeMolecularInstancesBindToMoleculeTypeInstances")), reader_make_constant_shell(makeString("BinaryPredicate"))), ONE_INTEGER, NINE_INTEGER), list(list(reader_make_constant_shell(makeString("indicatedDrug")), makeSymbol("?TYPE-OF-ILLNESS"), reader_make_constant_shell(makeString("Vasopressin"))), list(makeString("vasopressin is commonly used to treat TYPE-OF-ILLNESS."), list(makeSymbol("?TYPE-OF-MEDICINE"), cons(ZERO_INTEGER, ELEVEN_INTEGER)), list(makeSymbol("?TYPE-OF-ILLNESS"), cons(makeInteger(38), FIFTEEN_INTEGER))), makeKeyword("SIMPLE"), list(makeKeyword("ISA"), reader_make_constant_shell(makeString("Vasopressin")), reader_make_constant_shell(makeString("PharmaceuticalType"))), FIFTEEN_INTEGER, makeInteger(25)), list(list(reader_make_constant_shell(makeString("drugTypeMolecularInstancesBindToMoleculeTypeInstances")), reader_make_constant_shell(makeString("Vasopressin")), makeSymbol("?Y")), list(makeString("vasopressin molecules bind to Y molecules."), list(makeSymbol("?X"), cons(ZERO_INTEGER, ELEVEN_INTEGER)), list(makeSymbol("?Y"), cons(makeInteger(30), ONE_INTEGER))), makeKeyword("SIMPLE"), list(makeKeyword("ISA"), reader_make_constant_shell(makeString("drugTypeMolecularInstancesBindToMoleculeTypeInstances")), reader_make_constant_shell(makeString("BinaryPredicate"))), FIFTEEN_INTEGER, makeInteger(25)), list(list(reader_make_constant_shell(makeString("target-DrugBank")), makeSymbol("?TYPE-OF-MEDICINE"), makeSymbol("?TYPE-OF-PROTEIN")), list(makeString("In pharmaceutical conditions, molecules of the drug TYPE-OF-MEDICINE bind to TYPE-OF-PROTEIN molecules."), list(makeSymbol("?TYPE-OF-MEDICINE"), cons(makeInteger(52), SIXTEEN_INTEGER)), list(makeSymbol("?TYPE-OF-PROTEIN"), cons(makeInteger(77), FIFTEEN_INTEGER))), makeKeyword("UNBOUND"), list(makeKeyword("ISA"), reader_make_constant_shell(makeString("Vasopressin")), reader_make_constant_shell(makeString("PharmaceuticalType"))), FIFTEEN_INTEGER, makeInteger(25)), list(list(reader_make_constant_shell(makeString("ligandForReceptorType")), makeSymbol("?TYPE-OF-CHEMICAL-OBJECT"), makeSymbol("?TYPE-OF-PROTEIN-MOLECULE")), list(makeString("Ligand For Receptor Type TYPE-OF-CHEMICAL-OBJECT TYPE-OF-PROTEIN-MOLECULE."), list(makeSymbol("?TYPE-OF-CHEMICAL-OBJECT"), cons(makeInteger(25), makeInteger(23))), list(makeSymbol("?TYPE-OF-PROTEIN-MOLECULE"), cons(makeInteger(49), makeInteger(24)))), makeKeyword("UNBOUND"), list(makeKeyword("GENL"), reader_make_constant_shell(makeString("ReceptorMolecule")), reader_make_constant_shell(makeString("ReceptorMolecule"))), ONE_INTEGER, NINE_INTEGER), list(list(reader_make_constant_shell(makeString("indicatedDrug")), makeSymbol("?TYPE-OF-ILLNESS"), makeSymbol("?TYPE-OF-MEDICINE")), list(makeString("TYPE-OF-MEDICINE is commonly used to treat TYPE-OF-ILLNESS."), list(makeSymbol("?TYPE-OF-MEDICINE"), cons(ZERO_INTEGER, SIXTEEN_INTEGER)), list(makeSymbol("?TYPE-OF-ILLNESS"), cons(makeInteger(43), FIFTEEN_INTEGER))), makeKeyword("UNBOUND"), list(makeKeyword("ISA"), reader_make_constant_shell(makeString("Vasopressin")), reader_make_constant_shell(makeString("PharmaceuticalType"))), FIFTEEN_INTEGER, makeInteger(25)), list(list(reader_make_constant_shell(makeString("agonistForReceptorType")), makeSymbol("?TYPE-OF-MOLECULE"), makeSymbol("?TYPE-OF-PROTEIN-MOLECULE")), list(makeString("The instance of TYPE-OF-MOLECULE is an agonist for the instance of TYPE-OF-PROTEIN-MOLECULE."), list(makeSymbol("?TYPE-OF-MOLECULE"), cons(SIXTEEN_INTEGER, SIXTEEN_INTEGER)), list(makeSymbol("?TYPE-OF-PROTEIN-MOLECULE"), cons(makeInteger(67), makeInteger(24)))), makeKeyword("UNBOUND"), list(makeKeyword("GENL"), reader_make_constant_shell(makeString("ReceptorMolecule")), reader_make_constant_shell(makeString("ReceptorMolecule"))), ONE_INTEGER, NINE_INTEGER), list(list(reader_make_constant_shell(makeString("antagonistForReceptorType")), makeSymbol("?TYPE-OF-MOLECULE"), makeSymbol("?TYPE-OF-PROTEIN-MOLECULE")), list(makeString("The instance of TYPE-OF-MOLECULE is an antagonist for the instance of TYPE-OF-PROTEIN-MOLECULE."), list(makeSymbol("?TYPE-OF-MOLECULE"), cons(SIXTEEN_INTEGER, SIXTEEN_INTEGER)), list(makeSymbol("?TYPE-OF-PROTEIN-MOLECULE"), cons(makeInteger(70), makeInteger(24)))), makeKeyword("UNBOUND"), list(makeKeyword("GENL"), reader_make_constant_shell(makeString("ReceptorMolecule")), reader_make_constant_shell(makeString("ReceptorMolecule"))), ONE_INTEGER, NINE_INTEGER), list(list(reader_make_constant_shell(makeString("drugTypeMolecularInstancesBindToMoleculeTypeInstances")), makeSymbol("?X"), makeSymbol("?Y")), list(makeString("X molecules bind to Y molecules."), list(makeSymbol("?X"), cons(ZERO_INTEGER, ONE_INTEGER)), list(makeSymbol("?Y"), cons(TWENTY_INTEGER, ONE_INTEGER))), makeKeyword("UNBOUND"), list(makeKeyword("ISA"), reader_make_constant_shell(makeString("drugTypeMolecularInstancesBindToMoleculeTypeInstances")), reader_make_constant_shell(makeString("BinaryPredicate"))), ONE_INTEGER, NINE_INTEGER), list(list(reader_make_constant_shell(makeString("conditionTypeAssociatedWithIn")), makeSymbol("?TYPE-OF-MEDICAL-CONDITION"), reader_make_constant_shell(makeString("Vasopressin")), makeSymbol("?DEGREE"), makeSymbol("?TYPE-OF-HOMOGENEOUS-STRUCTURE")), list(makeString("TYPE-OF-MEDICAL-CONDITION is associated with a DEGREE level of vasopressin in TYPE-OF-HOMOGENEOUS-STRUCTURE."), list(makeSymbol("?TYPE-OF-MEDICAL-CONDITION"), cons(ZERO_INTEGER, makeInteger(25))), list(makeSymbol("?DEGREE"), cons(makeInteger(47), SIX_INTEGER)), list(makeSymbol("?CHEMICAL-SUBSTANCE"), cons(makeInteger(63), ELEVEN_INTEGER)), list(makeSymbol("?TYPE-OF-HOMOGENEOUS-STRUCTURE"), cons(makeInteger(78), makeInteger(29)))), makeKeyword("SIMPLE"), list(makeKeyword("ISA"), reader_make_constant_shell(makeString("Vasopressin")), reader_make_constant_shell(makeString("PharmaceuticalType"))), FIFTEEN_INTEGER, makeInteger(25)), list(list(reader_make_constant_shell(makeString("conditionTypeAssociatedWithIn")), makeSymbol("?TYPE-OF-MEDICAL-CONDITION"), makeSymbol("?CHEMICAL-SUBSTANCE"), makeSymbol("?DEGREE"), makeSymbol("?TYPE-OF-HOMOGENEOUS-STRUCTURE")), list(makeString("TYPE-OF-MEDICAL-CONDITION is associated with a DEGREE level of CHEMICAL-SUBSTANCE in TYPE-OF-HOMOGENEOUS-STRUCTURE."), list(makeSymbol("?TYPE-OF-MEDICAL-CONDITION"), cons(ZERO_INTEGER, makeInteger(25))), list(makeSymbol("?DEGREE"), cons(makeInteger(47), SIX_INTEGER)), list(makeSymbol("?CHEMICAL-SUBSTANCE"), cons(makeInteger(63), EIGHTEEN_INTEGER)), list(makeSymbol("?TYPE-OF-HOMOGENEOUS-STRUCTURE"), cons(makeInteger(85), makeInteger(29)))), makeKeyword("UNBOUND"), list(makeKeyword("ISA"), reader_make_constant_shell(makeString("Vasopressin")), reader_make_constant_shell(makeString("PharmaceuticalType"))), FIFTEEN_INTEGER, makeInteger(25)) })));
    }

    private static SubLObject _constant_388_initializer() {
        return list(new SubLObject[]{ list(list(reader_make_constant_shell(makeString("cCF-contains")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("PericardialWindow-SurgicalProcedure"))), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("PericardialWindow-SurgicalProcedure"))), NIL), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("PericardialWindow-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("cCF-contains")), makeSymbol("?X"), makeSymbol("?Y")))), list(list(reader_make_constant_shell(makeString("patientTreated")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("SurgicalProcedure_eps"))), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("SurgicalProcedure_eps"))), NIL), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("SurgicalProcedure_eps"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?THING"), makeSymbol("?Y")))), list(list(reader_make_constant_shell(makeString("patientTreated")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("ElectrophysiologyStudy-CCFManagement"))), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("ElectrophysiologyStudy-CCFManagement"))), NIL), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("ElectrophysiologyStudy-CCFManagement"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?THING"), makeSymbol("?Y")))), list(list(reader_make_constant_shell(makeString("patientTreated")), list(reader_make_constant_shell(makeString("cCFHematocritTestValue")), makeSymbol("?BLOOD-TEST"), makeSymbol("?SCALAR-VALUE")), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt")), list(reader_make_constant_shell(makeString("cCFHematocritTestValue")), makeSymbol("?BLOOD-TEST"), makeSymbol("?SCALAR-VALUE")), NIL), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("cCFHematocritTestValue")), makeSymbol("?BLOOD-TEST"), makeSymbol("?SCALAR-VALUE")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?BLOOD-TEST"), makeSymbol("?Y")))), list(list(reader_make_constant_shell(makeString("patientTreated")), list(reader_make_constant_shell(makeString("cCFAnginaRestPain")), makeSymbol("?X"), makeSymbol("?Y")), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt")), list(reader_make_constant_shell(makeString("cCFAnginaRestPain")), makeSymbol("?X"), makeSymbol("?Y")), NIL), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("cCFAnginaRestPain")), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?Z"), makeSymbol("?W")))), list(list(reader_make_constant_shell(makeString("patientTreated")), list(reader_make_constant_shell(makeString("cCFSymptomType")), makeSymbol("?SYMPTOM"), makeSymbol("?CCF-SYMPTOM-TYPE-TYPE")), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt")), list(reader_make_constant_shell(makeString("cCFSymptomType")), makeSymbol("?SYMPTOM"), makeSymbol("?CCF-SYMPTOM-TYPE-TYPE")), NIL), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("cCFSymptomType")), makeSymbol("?SYMPTOM"), makeSymbol("?CCF-SYMPTOM-TYPE-TYPE")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?X"), makeSymbol("?Y")))), list(list(reader_make_constant_shell(makeString("patientTreated")), list(reader_make_constant_shell(makeString("cCFSymptomType")), makeSymbol("?SYMPTOM"), reader_make_constant_shell(makeString("Angina"))), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt")), list(reader_make_constant_shell(makeString("cCFSymptomType")), makeSymbol("?SYMPTOM"), reader_make_constant_shell(makeString("Angina"))), NIL), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("cCFSymptomType")), makeSymbol("?SYMPTOM"), reader_make_constant_shell(makeString("Angina"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?X"), makeSymbol("?Y")))), list(list(reader_make_constant_shell(makeString("patientTreated")), list(reader_make_constant_shell(makeString("cCFLeftVentricleEjectionFraction")), makeSymbol("?X"), makeSymbol("?Y")), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt")), list(reader_make_constant_shell(makeString("cCFLeftVentricleEjectionFraction")), makeSymbol("?X"), makeSymbol("?Y")), NIL), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("cCFLeftVentricleEjectionFraction")), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?X"), makeSymbol("?W")))), list(list(reader_make_constant_shell(makeString("patientTreated")), list(reader_make_constant_shell(makeString("hasDiagnosis")), makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING"), makeSymbol("?TYPE-OF-AILMENT")), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt")), list(reader_make_constant_shell(makeString("hasDiagnosis")), makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING"), makeSymbol("?TYPE-OF-AILMENT")), NIL), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("hasDiagnosis")), makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING"), makeSymbol("?TYPE-OF-AILMENT")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?X"), makeSymbol("?Y")))), list(list(reader_make_constant_shell(makeString("patientTreated")), list(reader_make_constant_shell(makeString("causeOfDeathEvent")), makeSymbol("?DEATH"), reader_make_constant_shell(makeString("HeartCondition"))), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt")), list(reader_make_constant_shell(makeString("causeOfDeathEvent")), makeSymbol("?DEATH"), reader_make_constant_shell(makeString("HeartCondition"))), NIL), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("causeOfDeathEvent")), makeSymbol("?DEATH"), reader_make_constant_shell(makeString("HeartCondition"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?DEATH"), makeSymbol("?Y")))), list(list(reader_make_constant_shell(makeString("patientTreated")), list(reader_make_constant_shell(makeString("hasDiagnosis")), makeSymbol("?MEDICALLY-RELATED-EVENT"), reader_make_constant_shell(makeString("HeartCondition"))), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt")), list(reader_make_constant_shell(makeString("hasDiagnosis")), makeSymbol("?MEDICALLY-RELATED-EVENT"), reader_make_constant_shell(makeString("HeartCondition"))), NIL), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("hasDiagnosis")), makeSymbol("?MEDICALLY-RELATED-EVENT"), reader_make_constant_shell(makeString("HeartCondition"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?X"), makeSymbol("?Y")))), list(list(reader_make_constant_shell(makeString("patientTreated")), list(reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeSymbol("?CCF-EVENT"), makeSymbol("?CARDIAC-CATH-COMPLICATION")), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt")), list(reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeSymbol("?CCF-EVENT"), makeSymbol("?CARDIAC-CATH-COMPLICATION")), NIL), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeSymbol("?CCF-EVENT"), makeSymbol("?CARDIAC-CATH-COMPLICATION")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?CCF-EVENT"), makeSymbol("?Y")))), list(list(reader_make_constant_shell(makeString("patientTreated")), list(reader_make_constant_shell(makeString("causeOfDeathEvent")), makeSymbol("?DEATH"), makeSymbol("?TYPE-OF-SITUATION")), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt")), list(reader_make_constant_shell(makeString("causeOfDeathEvent")), makeSymbol("?DEATH"), makeSymbol("?TYPE-OF-SITUATION")), NIL), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("causeOfDeathEvent")), makeSymbol("?DEATH"), makeSymbol("?TYPE-OF-SITUATION")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?DEATH"), makeSymbol("?Y")))), list(list(reader_make_constant_shell(makeString("patientTreated")), list(reader_make_constant_shell(makeString("causeOfDeathEvent")), makeSymbol("?DEATH"), reader_make_constant_shell(makeString("HeartAttack"))), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt")), list(reader_make_constant_shell(makeString("causeOfDeathEvent")), makeSymbol("?DEATH"), reader_make_constant_shell(makeString("HeartAttack"))), NIL), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("causeOfDeathEvent")), makeSymbol("?DEATH"), reader_make_constant_shell(makeString("HeartAttack"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?DEATH"), makeSymbol("?Y")))), list(list(reader_make_constant_shell(makeString("patientTreated")), list(reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeSymbol("?CCF-EVENT"), reader_make_constant_shell(makeString("HeartAttack"))), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt")), list(reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeSymbol("?CCF-EVENT"), reader_make_constant_shell(makeString("HeartAttack"))), NIL), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeSymbol("?CCF-EVENT"), reader_make_constant_shell(makeString("HeartAttack"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?CCF-EVENT"), makeSymbol("?Y")))), list(list(reader_make_constant_shell(makeString("patientTreated")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("HeartAttack"))), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("HeartAttack"))), NIL), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("HeartAttack"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?THING"), makeSymbol("?Y")))) });
    }

    private static SubLObject _constant_634_initializer() {
        return list(new SubLObject[]{ list(list(makeString("All of the following overlap with cytokinesis except:"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatDoesNotOverlapWithCytokinesis-Version2")))), list(list(makeString("During which phase do chromosomes replicate:"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-DuringWhatDoChromosomesReplicate")))), list(list(makeString("If a somatic human cell is just about to divide, it has _____ chromosomes?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-SomaticHumanCellDuringCytokinesisHasHowManyChromosomes")))), list(list(makeString("A human cell containing 22 autosomes and a Y chromosome is -"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-AHumanCellWith22AutosomesAnd1YChromosome")))), list(list(makeString("Changes in MPF activity in a cell are correlated with everything BUT what?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-ChangesInMPFActivityCorrelateWithWhat")))), list(list(makeString("During which of the following does DNA replicate?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-DuringWhichOfTheFollowingDoesDNAReplicate")))), list(list(makeString("Which of the following does not occur in meiosis II? "), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatDoesNotOverlapWithMeiosisII")))), list(list(makeString("The levels of cyclin in a somatic cell rise steadily for some period of time, when the cyclin level suddenly drops. What does this indicate about that cell?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatDoChangesInCyclinLevelIndicate")))), list(list(makeString("When we say that an organism is haploid, we mean that _____."), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-HaploidMeansWhat")))), list(list(makeString("The diploid number of rat kangaroos is 12. During anaphase, how many kinetochores would be expected in a normal rat kangaroo lymphocyte?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-HowManyKinetochoresInARatKangarooAnaphaseLymphocyte")))), list(list(makeString("Protein phosphorylation is commonly involved in all of the following except:"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-ProteinPhosphorylationIsInvolvedInAllExcept")))), list(list(makeString("If the diploid number for an organism is 24, then what is its haploid number?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-DeriveHaploidNumberFromDiploidNumber")))), list(list(makeString("The diploid number of humans is 46.  That number of chromosomes will be found in which of the following types of human cells?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhichHumanCellsHave46Chromosomes")))), list(list(makeString("What is the characteristic cellular response in a cellular signal-response process whose transduction pathway ends in the binding of a transcription factor to DNA?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatIsTheCellularResponseOfASignalPathwayTerminatingInATranscriptionFactor")))), list(list(makeString("In humans, the haploid number of chromosomes is 23. Independent assortment has the possibility of producing how many different types of gametes?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-IndependentAssortmentInHumansYeildsHowLargeOfASpaceOfPossibleGametes")))), list(list(makeString("The Eukaryotic Cell Cycle alternates between which phases?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatPhasesAlternateInTheEukaryoticCellCycle")))), list(list(makeString("Which one of the following processes does NOT occur in dividing bacteria?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatDoesNotOccurInDividingBacteria")))), list(list(makeString("A condition that would prevent a cell that had reached metaphase from proceeding from into anaphase would be"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTEvaluationTest-WhatWouldPreventAnaphase")))), list(list(makeString("In the telophase of mitosis, the mitotic spindle breaks down and the chromatin uncoils. This is essentially the opposite of what happens in:"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-DuringWhatOccursTheOppositeOfThatWhichHappensInTelophase")))), list(list(makeString("In some organisms, MPhase completes without cytokinesis.  How many cells are created in the course of such a phase?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-NumberOfCellsCreatedDuringMPhaseWithoutCytokinesis")))), list(list(makeString("Assume that you are dealing with a species in which the number of chromosomes in each somatic cell is 18. How many sister chromatids are present during cytokinesis of the cell cycle?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-CellHasNoChromatidsDuringCytokinesisOfCellCycle")))), list(list(makeString("In mammalian cells, what is the first sign of prophase?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-FirstSignOfProphase-2")))), list(list(makeString("In some organisms, MPhase completes without cytokinesis.  How many cell nuclei are formed in the course of such a phase?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-NumberOfCellNucleiFormedDuringMPhaseWithoutCytokinesis")))), list(list(makeString("What's the role of protein kinases in phosphorylation cascades?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatIsTheRoleOfProteinKinasesInPhosphorylationCascades")))), list(list(makeString("Lipid-soluble molecules, such as testosterone, cross the membranes of all cells but affect only target cells.  Why?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-LipidSolubleMoleculesAffectOnlyTargetCellsBecauseIntracellularReceptorsAreOnlyPresentInTargetCells")))), list(list(makeString("Assume that you are dealing with a species in which the number of chromosomes in each somatic cell is 72. How many sister chromatids are present in the G1 phase?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-CellHasHowManySisterChromatidsDuringG1")))), list(list(makeString("A sustained decrease in circulating Ca2+ levels might be caused by decreased levels of which of the following substances?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-CirculatingCalciumReductionIsCausedByDecreaseInWhat")))), list(list(makeString("When a signal transduction pathway involves a phosphorylation cascade, which of the following have a role in turning off the cell's response?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatHelpsTurnOfCellResponseTriggeredByPhosphorylationCascade")))), list(list(makeString("Assume that you are dealing with a species in which the number of chromosomes in each somatic cell is 14. How many sister chromatids are present in the early telophase of mitosis?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-CellHasHowManySisterChromatidsDuringTelophase")))), list(list(makeString("In humans, the haploid number of chromosomes is 23. Independent assortment has the possibility of producing how many different chromsomal combinations?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-IndependentAssortmentInHumans")))), list(list(makeString("In a cell with 4 centromeres, how many chromosomes are there?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-InACellWithFourCentromeresHowManyChromosomesAreThere")))), list(list(makeString("A cell with 24 chromosomes undergoes meiosis. How many chromosomes will each of the four daughter cells have at the end of meiosis II?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-CellWith24ChromosomesInMitosisHasHowManyAfterMeiosisII")))), list(list(makeString("When would a chromosome consist of two identical chromatids?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-DuringWhatDoesADuplicatedChromosomePlayARole")))), list(list(makeString("A scientist discovers Chemical Signal A triggers off a phosphorylation cascade that causes the break down of a polysaccharide.  If Chemical Signal B activates a protein phosphatase for the first enzyme in the cascade, what kind of interaction would Chemical Signal B have on the polysaccharide's digestion?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTEvaluationTest-HowChemicalBRelatesToPolysaccharideBreakdown")))), list(list(makeString("What is the result when a diploid cell undergoes meiosis?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatIsResultOfDiploidCellUndergoingMeiosis")))), list(list(makeString("Cancer cells differ from healthy cells in that cancer cells _____."), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-HowDoCancerCellsDifferFromHealthyCells")))), list(list(makeString("Which of the following is evidence for the involvement of a second messenger in the signal pathway that involves epinephrine and glycogen breakdown?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhichIsEvidenceForInvolvementOfSecondMessenger")))), list(list(makeString("Meiosis II is similar to mitosis in that -"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-MeiosisIIIsSimilarToMitosis")))), list(list(makeString("The cell cycle produces daughter cells that ______."), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatIsTrueOfDaughterCellsInCellCycle")))), list(list(makeString("In a male mammal, every cell that undergoes meiosis gives rise to _____ sperm."), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-MaleMammalCellsDoingGametogenesisProduceHowManySperm-01")))), list(list(makeString("In a cell with 4 duplicated chromosomes, how many chromatids are there?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-NumberOfChromatidsInCellWith4DuplicatedChromosomes")))), list(list(makeString("A diploid organism whose somatic (nonsex) cells each contain 32 chromosomes produces gametes containing _____ chromosomes."), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-DiploidOrgWhoseSomaticCellsHave32ChromosomesHasGameteWithHowMany")))), list(list(makeString("What chemical must be in large supply in the cytosol for a typical phosphorylation cascade to occur?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTEvaluationTest-CytosolChemicalPresenceRequiredForTypicalPhosphorylationCascade")))), list(list(makeString("Chromosomes migrate toward opposite poles in _____?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-ChromosomesMigrateToOppositePolesInWhat")))), list(list(makeString("What is the region of a chromosome that holds the two double-strands of replicated DNA together?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatIsTheRegionThatConnectsReplicatedDNAMolecules")))), list(list(makeString("Which of the following cellular activities would one expect to find a cell in the S phase to be engaged in?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatActivityWouldOneExpectACellInSPhaseToBeUpTo")))), list(list(makeString("Binding of a signal molecule to which type of receptor leads to a change in membrane potential?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatTypeReceptorCausesCellMembranePotentialChangeOnBinding")))), list(list(makeString("What kinds of molecule are candidate ligands for cytoplasmic receptors?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatKindsOfMoleculeAreCandidateLigandsForCytoplasmicReceptors")))), list(list(makeString("Cholera develops when a bacterial toxin does what?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-CholeraDevelopsWhenABacterialToxinDoesWhat")))), list(list(makeString("Which of the following phases of mitosis is essentially the opposite of prometaphase in terms of the nuclear envelope?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatPhaseOfMitosisIsTheOppositeOfPrometaphaseWRTNuclearEnvelope")))), list(list(makeString("Which of the following is a structure that holds chromatids together?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhichOfTheFollowingHoldsChromatidsTogether")))), list(list(makeString("A particular cell has half as much DNA as some of the other cells in a mitotically active tissue.  The cell in question is in which of the following?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-CellWithHalfDNAIsInWhat")))), list(list(makeString("In some organisms, mitosis occurs without cytokinesis occurring. Which of the following will be the result?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-MitosisWithoutCytokinesisResultsInWhat")))), list(list(makeString("In a germ cell from an organism with a diploid number of 46, how many kinetochore-microtubule attachments occur during prophase I of meiosis?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-HowManyKinetochoreMicrotubuleAttachmentsDuringProphaseI")))), list(list(makeString("The egg (ovum) of a rabbit contains 22 chromosomes. How many chromosomes are in the somatic (body) cells of a rabbit?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-NumberOfChromsomesInSomaticRabbitCell")))), list(list(makeString("A duplicated chromosome consists of which of the following?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-DuplicatedChromosomeConsistsOf2Chromatids")))), list(list(makeString("Chromatids are _____."), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatIsTrueOfChromatids")))), list(list(makeString("During the cell cycle, active MPF decreases at the end of mitosis.  This can be best explained by which of the following?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatExplainsTheDeclineInMPFActivityInMPhase")))), list(list(makeString("In a cell cycle where there is no duplication of chromosomes, _____ will occur but ____ will not."), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-IfChromosomesAreNotDuplicatedWhichPhaseOccursAndWhichDoesNot")))), list(list(makeString("During what phase in the cell cycle would you find the most DNA per cell?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-DuringWhichPhaseOfCellCycleIsThereTheMostDNAPerCell-TypeLevel")))), list(list(makeString("If an intestinal cell in a grasshopper contains 24 chromosomes, a grasshopper sperm cell would contain how many chromosomes?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-IfAnIntestinalCellOfAGrasshopperHas24ChromosomesHowManyChromosomesDoesOneOfItsSpermCellsHave")))), list(list(makeString("A dog's sperm cells have 39 chromosomes.  What's the diploid number for dogs?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-DiploidNumberForDogs")))), list(list(makeString("Mitosis occurs in all of the following types of cells EXCEPT:"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatKindOfCellsAreIncapableOfMitosis")))), list(list(makeString("Mitosis and cytokinesis result in the formation of ______; meiosis and cytokinesis result in the formation of ________."), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-MeiosisResultsAndMitosisResults")))), list(list(makeString("In a male mammal, every cell that undergoes meiosis gives rise to _____ sperm."), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-MaleMammalCellsDoingGametogenesisProduceHowManySperm-03")))), list(list(makeString("Synapsis occurs during:"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-SynapsisOccursDuringWhat")))), list(list(makeString("If MPF activates a series of enzymes, one of which inactivates MPF, it is likely that one of the enzymes that one of the enzymes does what?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-MPFDeactivatingEnzymeMostLikelyDoesWhat")))), list(list(makeString("A particular cell has less DNA than some of the other cells in a mitotically active tissue.  Which cellular process is the cell in question NOT in?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-CellInMitoticTissueWithLessDNAIsNotInWhatPhase")))), list(list(makeString("The quantity of DNA in somatic cells doubles between which stages of the cell cycle?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-TheQuantityOfDNADoublesBetweenWhichStagesOfTheCellCycle")))), list(list(makeString("Which of the following does not occur during mitosis?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatDoesNotOccurDuringMitosis")))), list(list(makeString("In some organisms such as certain fungi and algae, cells undergo mitosis repeatedly without subsequently undergoing cytokinesis. What would result from this?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-MitosisWithoutCytokinesisResultsInWhat-Size")))), list(list(makeString("Which sequence correctly depicts the order of events in the cell cycle?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-CellCycleSequence-WithLoop")))), list(list(makeString("The DNA content of a diploid cell in the G1 phase of the cell cycle is measured: if this DNA content is x, then what would be the DNA content of a germ cell in the same organism at meiosis II?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-DNAAtG1IsSameAsDNAAtMeiosisII")))), list(list(makeString("Meiosis and fertilization alternate in all of the following cycles EXCEPT?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-MeiosisAndFertilizationDONTAlternateInWhichCycle")))), list(list(makeString("Suppose the number of chromosomes in a human liver cell were 12.  How many chromosomes would there be in a human sperm cell?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-AssumeWrongChromosomeNumber")))), list(list(makeString("Which cellular process does NOT overlap with cytokinesis?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatDoesNotOverlapWithCytokinesis-Version3")))), list(list(makeString("If a cell contains 60 chromosomes at the start of meiosis, how many chromosomes will be found in each daughter cell at the completion of meiosis?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-IfInputToMeiosisHas60ChromosomesHowManyDoOutputsHave")))), list(list(makeString("Which of the following would you expect to have its receptor site in the cytoplasm rather than in the cell membrane?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhichLigandTypeHasAReceptorInTheCytoplasm")))), list(list(makeString("What's true of sister chromatids?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatIsTrueOfSisterChromatids")))), list(list(makeString("All of the following represent events that occur within a cell during meiosis I EXCEPT:"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-AllOfTheFollowingOccurDuringMeiosisIExcept")))), list(list(makeString("Steroid hormones can enter a cell by simple diffusion.  What from this can we conclude about steroids?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-SteroidHormonesCanEnterACellBySimpleDiffusionSoWhatFollows")))), list(list(makeString("During _____ a spindle forms in a haploid cell."), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-DuringWhatDoesASpindleFormInAHaploidCell")))), list(list(makeString("If a cell contains 60 chromatids at the start of mitosis, how many chromosomes will be found in each daughter cell at the completion of the cell cycle?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-IfInputToMitosisHas60ChromatidsHowManyDoOutputsHave")))), list(list(makeString("In an organism with a diploid number of 46, how many kinetochore-microtubule attachments occur in one daughter cell during prophase II of meiosis?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-HowManyKinetochoreMicrotubuleAttachmentsDuringProphaseII")))), list(list(makeString("How do phosphorylation cascades involving a series of protein kinases facilitate cellular response?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-HowDoPhosphorylationCascadesFacilitateCellLevelResponse")))), list(list(makeString("What do G1, S and G2 have in common?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatDoTheThreeStepsOfInterphaseHaveInCommon")))), list(list(makeString("\"Cytokinesis\" refers to which of the following?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-CytokinesisIsTheSeparationOfTheCytoplasm")))), list(list(makeString("Increases in the enzymatic activity of some protein kinases important for the regulation of the cell cycle are due to which of the following?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatCausesIncreasesInActivityOfCellCycleRegulatoryProteinKinases")))), list(list(makeString("What chemical must be in large supply in the cytosol for a typical phosphorylation cascade to occur?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTEvaluationTest-CytosolChemicalPresenceRequiredForTypicalPhosphorylationCascade-Old")))), list(list(makeString("Suppose that a particular type of G-Protein typically targets instances of another class of enzyme for activation in the context of some cellular process, and suppose further that an instance of this type of G-Protein is bound to an instance of GTP (Guanosine Triphosphate). Which of the following statements is true of this particular G-Protein?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatCanGProteinsBoundToGTPDo")))), list(list(makeString("Which of the following would result in the amplification of a chemical signal?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhichOfTheFollowingWouldResultInTheAmplificationOfAChemicalSignal")))), list(list(makeString("Which of the following is contained within microtubule organizing centers?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhichOfTheFollowingIsInCentrosome")))), list(list(makeString("A grasshopper cell during the G2 phase of the cell cycle contained 200 units of DNA. What would be the amount of DNA at G1 of the cell cycle in one of the grasshopper cell's daughter cells?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-GrasshopperCellWith100UnitsOfDNAAtG2HasHowManyUnitsAtG1")))), list(list(makeString("Which one of the following occurs in meiosis, but not mitosis? "), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhichOfTheFollowingOccursDuringMeiosisButNotMitosis")))), list(list(makeString("Interference with the production of microtubules will inhibit:"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-MicrotubuleDevelopmentInterferenceEffects")))), list(list(makeString("Receptors for signal molecules _____."), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhichOfTheFollowingIsTrueOfReceptorMolecules")))), list(list(makeString("The DNA content of a diploid cell in the G1 phase of the cell cycle is measured: if this DNA content is x, then what would be the DNA content of a germ cell in the same organism at metaphase of meiosis I?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-DNAAtG1IsHalfThatOfDNAAtMetaphaseI")))), list(list(makeString("Which of the following is NOT a characteristic of the cell cycle?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatsNotTrueOfTheCellCycle")))), list(list(makeString("The connection of kinetochores to spindle microtubules causes what molecular-level change in a cell?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-TheConnectionOfKinetochoresToSpindleMicrotubulesCausesWhatMolecularChange")))), list(list(makeString("Which of the following is a DNA-Protein complex found in chromosomes?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-ChromosomesAreChromatin")))), list(list(makeString("The decline of MPF activity at the end of mitosis is caused by which of the following?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatCausesTheDeclineInMPFActivityInMPhase")))), list(list(makeString("A cell enters the cell cycle, and the result is a larger cell with multiple nuclei. What can we surmise about the cell?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-ExplainPolynuclearCellEmergingFromCellCycle")))), list(list(makeString("What is Cytokinesis?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-CytokinesisIsTheDivisionOfOneCellIntoTwo")))), list(list(makeString("A cell with 24 chromosomes undergoes meiosis. How many chromosomes will be in each of the two remaining cells at the end of meiosis I?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-IfMeiosisParentCellHas24ChromosomesHowManyAfterFirstDivision")))), list(list(makeString("A sustained decrease in circulating Ca2+ levels might be caused by increased levels of which of the following substances?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-CirculatingCalciumReductionIsCausedByIncreaseInWhat")))), list(list(makeString("In a male mammal, every cell that undergoes meiosis gives rise to _____ sperm."), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-MaleMammalCellsDoingGametogenesisProduceHowManySperm-02")))), list(list(makeString("Some cells in a sample of tissue are removed from that tissue.  The cells that immediately surrounded them divide and \"fill in the gap.\" However, the other cells, farther from the removal site, do not divide, indicating that those cells have what property?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatIsTrueOfCellsUnaffectedByTissueDamage")))), list(list(makeString("A cell with 24 chromosomes undergoes mitosis. How many chromosomes will each of the resultant daughter cells have?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-IfInputToMitosisHas24ChromosomesHowManyDoDaughterCellsHave")))), list(list(makeString("A cell with 24 chromosomes undergoes meiosis. How many chromosomes will be in each of the two remaining cells at the end of meiosis I?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-HowManyChromosomesInMeiosisIOutputCell")))), list(list(makeString("In a somatic cell from an organism with a diploid number of 46, how many kinetochore-microtubule attachments occur during the prometaphase stage of cellular mitosis?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-HowManyKinetochoreMicrotubuleAttachmentsDuringPrometaphase")))), list(list(makeString("How many cells are created in the course of the MPhase of the cell cycle?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-HowManyCellsAreCreatedDuringMPhase")))), list(list(makeString("At the end of first meiotic cell division, there are ________."), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatIsTheResultOfFirstMeioticCellDivision")))), list(list(makeString("In mammalian cells, what is the first sign of prophase?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-FirstSignOfProphase-1")))), list(list(makeString("How many cell nuclei are formed in the course of the MPhase of the cell cycle?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-HowManyCellNucleiAreFormedDuringMPhase")))), list(list(makeString("An event which prevents DNA synthesis would mean a cell is arrested in which part of the cell cycle?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-SitPreventingDNAReplicationArrestsCellInG1")))), list(list(makeString("A duplicated chromosome consists of which of the following?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-DuplicatedChromosomeConsistsOf2Chromatids-Hyp")))), list(list(makeString("What sort of thing is a haploid cell?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatKindOfThingIsAHaploidCell")))), list(list(makeString("Which of the following cell cycle phases will occur in a cell cycle where there is no duplication of chromosomes in S-Phase?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhichPhaseWillOccurInACellCycleWhereChromosomesAreNotDuplicated")))), list(list(makeString("How many chromatids are in a duplicated chromosome?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-HowManyChromatidsInADuplicatedChromosome")))), list(list(makeString("A cell entering the cell cycle with 32 chromosomes will produce two daughter cells, each with _____."), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-IfCellCycleInputHas32ChromosomesWhatDoDaughterCellsHave")))), list(list(makeString("Where in a eukaryotic cell are the chromosomes located?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhereInAEukaryoticCellAreTheChromosomesLocated")))), list(list(makeString("When a signal-transduction pathway involves a phosphorylation cascade, how does the cell's response get turned off?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTEvaluationTest-HowToEndCellResponseToSignalWithPhosphorylationCascade-Descriptive")))), list(list(makeString("Instances of what kind of molecule serve as second messengers in the cellular signaling process that begins with release of epinephrine into the bloodstream and ends with dispersal of glucose 1 phosphate molecules into the cytosol?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatIsTheSecondMessengerInEpinephrineToGlucoseReleaseSignaling")))), list(list(makeString("Which of the following is NOT a characteristic of the cell cycle?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhichIsNotACharacteristicOfTheCellCycle")))), list(list(makeString("During anaphase I _____."), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-DuringAnaphaseIWhatHappens")))), list(list(makeString("Which of the following results in cells that contain half the parental chromosome number?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhichReducesChromosomeNumberByHalf-Alt")))), list(list(makeString("The event that occurs when homologous chromosomes come into close contact during meiosis I is called:"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-DuringWhatSubEventOfMeiosisIDoHomologousChromosomesAttach")))), list(list(makeString("Mitotic spindles are composed primarily of:"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-MitoticSpindlesAreTubulin")))), list(list(makeString("Crossing over occurs during:"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-CrossingOverOccursDuringWhat")))), list(list(makeString("Suppose that a particular type of G-Protein typically targets instances of another class of enzyme for activation in the context of some cellular process, and suppose further that an instance of this type of G-Protein is bound to an instance of Guanosine Diphosphate. Which of the following statements is true of this particular G-Protein?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatCantGProteinsBoundToGDPDo-OpenSentence")))), list(list(makeString("Through a microscope, you can see a cell plate beginning to develop accross the middle of the cell and nuclei re-forming on either side of the cell plate. The cell is most likely - "), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-CellWithCellPlateIsWhat")))), list(list(makeString("A dog's sperm cells have 39 chromosomes.  What's the haploid number for dogs?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-HaploidNumberForDogs")))), list(list(makeString("During anaphase II _____."), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-DuringAnaphaseIIWhatHappens")))), list(list(makeString("During what phase in the cell cycle would you find the most DNA per cell?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-DuringWhichPhaseOfCellCycleIsThereTheMostDNAPerCell-TypeLevel-02")))), list(list(makeString("During which phase do chromosomes replicate?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-DuringWhichPhaseDoChromosomesReplicate")))), list(list(makeString("None of the following overlap with cytokinesis except:"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatOverlapsWithCytokinesis")))), list(list(makeString("Which of the following serve as second messengers in signaling pathways?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhichTwoCanServeAsSecondMessengers")))), list(list(makeString("During _____ a spindle forms in a diploid cell."), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-DuringWhatDoesASpindleFormInADiploidCell")))), list(list(makeString("How many maternal chromosomes are present in a somatic human cell in G1?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-HowManyMaternalChromosomesArePresentInASomaticHumanCellInG1")))), list(list(makeString("Homologous chromosomes move toward opposite poles of a dividing cell during -"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-HomologousChromosomesMoveTowardOppositePolesDuringWhat")))), list(list(makeString("Vinblastine is a standard chemotherapeutic drug used to treat cancer. Since it interferes with the assembly of microtubules, its effectiveness must be related to"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTEvaluationTest-VinblastineMechanism")))), list(list(makeString("When a signal-transduction pathway involves a phosphorylation cascade, how does the cell's response get turned off?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTEvaluationTest-HowToEndCellResponseToSignalWithPhosphorylationCascade")))), list(list(makeString("The quantity of DNA in somatic cells doubles when?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-TheQuantityOfDNADoublesWhen")))), list(list(makeString("Which of the following cellular activities would one expect to find a cell in the S phase to be engaged in?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-SubEventsOfSPhase")))), list(list(makeString("The centromere is a region in which _____."), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-CentromereIsARegionInWhich")))), list(list(makeString("Gametes are produced by _____."), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-GametesAreProducedByWhat")))), list(list(makeString("Which of the following is true of meiosis II?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhichOfTheFollowingIsTrueOfMeiosisII")))), list(list(makeString("What kind of cell is a gamete?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatKindOfCellIsAGamete")))), list(list(makeString("What is a locus?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatIsALocus")))), list(list(makeString("Suppose a chemical were introduced into a mitotic cell preventing any APC protein complexes in the cell from ever becoming active. This would prevent _______ from taking place."), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-PreventingAPCActivationPreventsWhat")))), list(list(makeString("Which sequence correctly depicts the order of events in the cell cycle?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-CellCycleSequence-NoLoop")))), list(list(makeString("Which of the following would result in a response at the cellular level?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhichOfTheFollowingWouldResultInAResponseAtTheCellularLevel")))), list(list(makeString("Which one of the following represents an incorrect characterization of a phase of Mitosis?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhichIsNotTrueOfPhaseOfMitosis")))), list(list(makeString("All of the following occur during both mitosis and meiosis I EXCEPT which?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhatDoMeiosisIAndMitoticPhaseNotHaveInCommon")))), list(list(makeString("Which of the following results in cells that contain half the parental chromosome number?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-WhichReducesChromosomeNumberByHalf")))), list(list(makeString("The buildup of cyclin at the G2 checkpoint correlates with what causal sequence?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTEvaluationTest-CyclinBuildupCorrelatesWithWhatCausalChain")))), list(list(makeString("Which of the following is not generally true of female gamete formation?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-FourOutputGametesIsNotTrueOfOogenesis")))), list(list(makeString("The diploid number for rat kangaroos is 12. At the end of anaphase, how many chromosomes would be expected in a normal rat kangaroo lymphocyte?"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTTest-RatKangarooCellRightAfterAnaphase")))), list(list(makeString("The decline of MPF at the end of mitosis is caused by"), reader_make_constant_shell(makeString("HaloBiologyQuestionAnsweringTask-Allotment")), reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"))), list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CPTEvaluationTest-WhatCausesTheDeclineInMPFActivityInMPhase")))) });
    }

    private static SubLObject _constant_639_initializer() {
        return list(list(list(list(list(makeString("model 3000"), reader_make_constant_shell(makeString("CardiacValveProsthesisModel3000")), makeInteger(3000))), NIL, makeKeyword("MNEMONIC")), list(list(list(reader_make_constant_shell(makeString("cCFCardiacValveProsthesisModelNumber")), makeSymbol("?VALVE-PROSTHESIS"), reader_make_constant_shell(makeString("CardiacValveProsthesisModel3000"))), list(makeString("The cardiac valve prosthesis VALVE-PROSTHESIS is an instance of model 3000."), list(makeSymbol("?VALVE-PROSTHESIS"), cons(makeInteger(29), SIXTEEN_INTEGER)), list(makeSymbol("?VALVE-PROSTHESIS-MODEL-NUMBER"), cons(makeInteger(64), TEN_INTEGER))), makeKeyword("SIMPLE"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt")), list(reader_make_constant_shell(makeString("generateFormulasForElements-TermIsa")), reader_make_constant_shell(makeString("CCFCardiacValveProsthesisModelNumberType")), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("cCFCardiacValveProsthesisModelNumber"))))), list(makeKeyword("ISA"), reader_make_constant_shell(makeString("CardiacValveProsthesisModel3000")), reader_make_constant_shell(makeString("CCFCardiacValveProsthesisModelNumberType")))), ZERO_INTEGER, NIL), list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("valveProsthesisTypeExplanted")), makeSymbol("?HEART-VALVE-REPLACEMENT"), reader_make_constant_shell(makeString("CardiacValveProsthesisModel3000")), makeSymbol("?VALVE-PROSTHESIS")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?HEART-VALVE-REPLACEMENT"), makeSymbol("?Y")))), list(makeString("In the heart valve replacement HEART-VALVE-REPLACEMENT, VALVE-PROSTHESIS is explanted and is a model 3000."), list(makeSymbol("?HEART-VALVE-REPLACEMENT"), cons(makeInteger(31), makeInteger(23))), list(makeSymbol("?VALVE-PROSTHESIS"), cons(makeInteger(56), SIXTEEN_INTEGER)), list(makeSymbol("?TYPE-OF-VALVE-PROSTHESIS"), cons(makeInteger(95), TEN_INTEGER))), makeKeyword("SIMPLE"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt")), list(reader_make_constant_shell(makeString("generateFormulasForElements-TermGenls")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("valveProsthesisTypeImplanted")), reader_make_constant_shell(makeString("valveProsthesisTypeExplanted"))))), list(makeKeyword("GENL"), reader_make_constant_shell(makeString("CardiacValveProsthesisModel3000")), reader_make_constant_shell(makeString("CardiacValveProsthesis")))), ZERO_INTEGER, NIL), list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("valveProsthesisTypeImplanted")), makeSymbol("?HEART-VALVE-REPLACEMENT"), reader_make_constant_shell(makeString("CardiacValveProsthesisModel3000")), makeSymbol("?VALVE-PROSTHESIS")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?HEART-VALVE-REPLACEMENT"), makeSymbol("?Y")))), list(makeString("In the heart valve replacement HEART-VALVE-REPLACEMENT, VALVE-PROSTHESIS is implanted and is a model 3000."), list(makeSymbol("?HEART-VALVE-REPLACEMENT"), cons(makeInteger(31), makeInteger(23))), list(makeSymbol("?VALVE-PROSTHESIS"), cons(makeInteger(56), SIXTEEN_INTEGER)), list(makeSymbol("?TYPE-OF-VALVE-PROSTHESIS"), cons(makeInteger(95), TEN_INTEGER))), makeKeyword("SIMPLE"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt")), list(reader_make_constant_shell(makeString("generateFormulasForElements-TermGenls")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("valveProsthesisTypeImplanted")), reader_make_constant_shell(makeString("valveProsthesisTypeExplanted"))))), list(makeKeyword("GENL"), reader_make_constant_shell(makeString("CardiacValveProsthesisModel3000")), reader_make_constant_shell(makeString("CardiacValveProsthesis")))), ZERO_INTEGER, NIL), list(list(reader_make_constant_shell(makeString("cCFMadeBy")), makeSymbol("?MEDICAL-DEVICE"), makeSymbol("?ORGANIZATION")), list(makeString("MEDICAL-DEVICE is manufactured by ORGANIZATION."), list(makeSymbol("?MEDICAL-DEVICE"), cons(ZERO_INTEGER, FOURTEEN_INTEGER)), list(makeSymbol("?ORGANIZATION"), cons(makeInteger(34), TWELVE_INTEGER))), makeKeyword("SUPPLEMENTAL"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt")), list(reader_make_constant_shell(makeString("generateSupplementalFormulasForElements-TermGenls")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("cCFMadeBy"))))), list(makeKeyword("GENL"), reader_make_constant_shell(makeString("CardiacValveProsthesisModel3000")), reader_make_constant_shell(makeString("CardiacValveProsthesis")))), ZERO_INTEGER, NIL), list(list(reader_make_constant_shell(makeString("cCFCardiacValveProsthesisModelNumber")), makeSymbol("?VALVE-PROSTHESIS"), makeSymbol("?VALVE-PROSTHESIS-MODEL-NUMBER")), list(makeString("The cardiac valve prosthesis VALVE-PROSTHESIS is an instance of VALVE-PROSTHESIS-MODEL-NUMBER."), list(makeSymbol("?VALVE-PROSTHESIS"), cons(makeInteger(29), SIXTEEN_INTEGER)), list(makeSymbol("?VALVE-PROSTHESIS-MODEL-NUMBER"), cons(makeInteger(64), makeInteger(29)))), makeKeyword("UNBOUND"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt")), list(reader_make_constant_shell(makeString("generateFormulasForElements-TermIsa")), reader_make_constant_shell(makeString("CCFCardiacValveProsthesisModelNumberType")), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("cCFCardiacValveProsthesisModelNumber"))))), list(makeKeyword("ISA"), reader_make_constant_shell(makeString("CardiacValveProsthesisModel3000")), reader_make_constant_shell(makeString("CCFCardiacValveProsthesisModelNumberType")))), ZERO_INTEGER, NIL), list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("valveProsthesisTypeExplanted")), makeSymbol("?HEART-VALVE-REPLACEMENT"), makeSymbol("?TYPE-OF-VALVE-PROSTHESIS"), makeSymbol("?VALVE-PROSTHESIS")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?HEART-VALVE-REPLACEMENT"), makeSymbol("?Y")))), list(makeString("In the heart valve replacement HEART-VALVE-REPLACEMENT, VALVE-PROSTHESIS is explanted and is a TYPE-OF-VALVE-PROSTHESIS."), list(makeSymbol("?HEART-VALVE-REPLACEMENT"), cons(makeInteger(31), makeInteger(23))), list(makeSymbol("?VALVE-PROSTHESIS"), cons(makeInteger(56), SIXTEEN_INTEGER)), list(makeSymbol("?TYPE-OF-VALVE-PROSTHESIS"), cons(makeInteger(95), makeInteger(24)))), makeKeyword("UNBOUND"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt")), list(reader_make_constant_shell(makeString("generateFormulasForElements-TermGenls")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("valveProsthesisTypeImplanted")), reader_make_constant_shell(makeString("valveProsthesisTypeExplanted"))))), list(makeKeyword("GENL"), reader_make_constant_shell(makeString("CardiacValveProsthesisModel3000")), reader_make_constant_shell(makeString("CardiacValveProsthesis")))), ZERO_INTEGER, NIL), list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("valveProsthesisTypeImplanted")), makeSymbol("?HEART-VALVE-REPLACEMENT"), makeSymbol("?TYPE-OF-VALVE-PROSTHESIS"), makeSymbol("?VALVE-PROSTHESIS")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?HEART-VALVE-REPLACEMENT"), makeSymbol("?Y")))), list(makeString("In the heart valve replacement HEART-VALVE-REPLACEMENT, VALVE-PROSTHESIS is implanted and is a TYPE-OF-VALVE-PROSTHESIS."), list(makeSymbol("?HEART-VALVE-REPLACEMENT"), cons(makeInteger(31), makeInteger(23))), list(makeSymbol("?VALVE-PROSTHESIS"), cons(makeInteger(56), SIXTEEN_INTEGER)), list(makeSymbol("?TYPE-OF-VALVE-PROSTHESIS"), cons(makeInteger(95), makeInteger(24)))), makeKeyword("UNBOUND"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt")), list(reader_make_constant_shell(makeString("generateFormulasForElements-TermGenls")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("valveProsthesisTypeImplanted")), reader_make_constant_shell(makeString("valveProsthesisTypeExplanted"))))), list(makeKeyword("GENL"), reader_make_constant_shell(makeString("CardiacValveProsthesisModel3000")), reader_make_constant_shell(makeString("CardiacValveProsthesis")))), ZERO_INTEGER, NIL))), list(list(list(list(makeString("aortic valve stenosis"), reader_make_constant_shell(makeString("Stenosis-AorticValve")))), NIL, makeKeyword("MNEMONIC")), list(new SubLObject[]{ list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("hasDiagnosis")), makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING"), reader_make_constant_shell(makeString("Stenosis-AorticValve"))), list(reader_make_constant_shell(makeString("eventHasDiagnosisOrFinding")), makeSymbol("?X"), makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?X"), makeSymbol("?Y")))), list(makeString("MEDICAL-DIAGNOSIS-OR-FINDING is a diagnosis of aortic valve stenosis."), list(makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING"), cons(ZERO_INTEGER, makeInteger(28))), list(makeSymbol("?DIAGNOSIS-OR-DISORDER"), cons(makeInteger(47), makeInteger(21)))), makeKeyword("SIMPLE"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt")), list(reader_make_constant_shell(makeString("generateFormulasForElements-TermIsa")), reader_make_constant_shell(makeString("CCFDiagnosisOrDisorderType")), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("hasDiagnosis"))))), list(makeKeyword("ISA"), reader_make_constant_shell(makeString("Stenosis-AorticValve")), reader_make_constant_shell(makeString("CCFDiagnosisOrDisorderType")))), ZERO_INTEGER, NIL), list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?SEMILUNAR-VALVE"), reader_make_constant_shell(makeString("AorticValve"))), list(makeString("SEMILUNAR-VALVE is an aortic valve."), list(makeSymbol("?SEMILUNAR-VALVE"), cons(ZERO_INTEGER, FIFTEEN_INTEGER))), makeKeyword("SIMPLE"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt")), list(reader_make_constant_shell(makeString("generateFormulasForElements-TermGenls")), reader_make_constant_shell(makeString("Stenosis-AorticValve")), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("valveStenosisSeverityWithValve")), reader_make_constant_shell(makeString("AorticValve"))))), list(makeKeyword("GENL"), reader_make_constant_shell(makeString("Stenosis-AorticValve")), reader_make_constant_shell(makeString("Stenosis-AorticValve")))), ZERO_INTEGER, NIL), list(list(reader_make_constant_shell(makeString("eventHasDiagnosisOrFinding")), makeSymbol("?CCF-EVENT"), makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING")), list(makeString("An evaluation in CCF-EVENT includes the diagnosis or finding MEDICAL-DIAGNOSIS-OR-FINDING."), list(makeSymbol("?CCF-EVENT"), cons(SEVENTEEN_INTEGER, NINE_INTEGER)), list(makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING"), cons(makeInteger(61), makeInteger(28)))), makeKeyword("SUPPLEMENTAL"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt")), list(reader_make_constant_shell(makeString("generateSupplementalFormulasForElements-TermIsa")), reader_make_constant_shell(makeString("CCFDiagnosisOrDisorderType")), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("eventHasDiagnosisOrFinding"))))), list(makeKeyword("ISA"), reader_make_constant_shell(makeString("Stenosis-AorticValve")), reader_make_constant_shell(makeString("CCFDiagnosisOrDisorderType")))), ZERO_INTEGER, NIL), list(list(reader_make_constant_shell(makeString("medicalEventHasAssociatedData")), makeSymbol("?THING"), makeSymbol("?CONTAINER-UNDERSPECIFIED")), list(makeString("CONTAINER-UNDERSPECIFIED contains information pertaining to THING."), list(makeSymbol("?CONTAINER-UNDERSPECIFIED"), cons(ZERO_INTEGER, makeInteger(24))), list(makeSymbol("?THING"), cons(makeInteger(60), FIVE_INTEGER))), makeKeyword("SUPPLEMENTAL"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt")), list(reader_make_constant_shell(makeString("generateSupplementalFormulasForElements-TermGenls")), reader_make_constant_shell(makeString("CCFEvent")), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("medicalEventHasAssociatedData"))))), list(makeKeyword("GENL"), reader_make_constant_shell(makeString("Stenosis-AorticValve")), reader_make_constant_shell(makeString("CCFEvent")))), ZERO_INTEGER, NIL), list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("hasDiagnosis")), makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING"), makeSymbol("?DIAGNOSIS-OR-DISORDER")), list(reader_make_constant_shell(makeString("eventHasDiagnosisOrFinding")), makeSymbol("?X"), makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?X"), makeSymbol("?Y")))), list(makeString("MEDICAL-DIAGNOSIS-OR-FINDING is a diagnosis of DIAGNOSIS."), list(makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING"), cons(ZERO_INTEGER, makeInteger(28))), list(makeSymbol("?DIAGNOSIS-OR-DISORDER"), cons(makeInteger(47), NINE_INTEGER))), makeKeyword("UNBOUND"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt")), list(reader_make_constant_shell(makeString("generateFormulasForElements-TermIsa")), reader_make_constant_shell(makeString("CCFDiagnosisOrDisorderType")), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("hasDiagnosis"))))), list(makeKeyword("ISA"), reader_make_constant_shell(makeString("Stenosis-AorticValve")), reader_make_constant_shell(makeString("CCFDiagnosisOrDisorderType")))), ZERO_INTEGER, NIL), list(list(reader_make_constant_shell(makeString("diagnosisSiteType")), makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING"), makeSymbol("?TYPE-OF-ORGANISM-PART")), list(makeString("MEDICAL-DIAGNOSIS-OR-FINDING occurs at the patient's TYPE-OF-ORGANISM-PART."), list(makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING"), cons(ZERO_INTEGER, makeInteger(28))), list(makeSymbol("?TYPE-OF-ORGANISM-PART"), cons(makeInteger(53), makeInteger(21)))), makeKeyword("SIMPLE"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt")), list(reader_make_constant_shell(makeString("generateFormulasForElements-TermIsa")), reader_make_constant_shell(makeString("CCFDiagnosisOrDisorderType")), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("diagnosisSiteType"))))), list(makeKeyword("ISA"), reader_make_constant_shell(makeString("Stenosis-AorticValve")), reader_make_constant_shell(makeString("CCFDiagnosisOrDisorderType")))), ZERO_INTEGER, NIL), list(list(reader_make_constant_shell(makeString("lessThan")), makeSymbol("?QUANTITY"), makeSymbol("?QUANTITY-2")), list(makeString("QUANTITY is less than QUANTITY-2."), list(makeSymbol("?QUANTITY"), cons(ZERO_INTEGER, EIGHT_INTEGER)), list(makeSymbol("?QUANTITY-2"), cons(makeInteger(22), TEN_INTEGER))), makeKeyword("SIMPLE"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt")), list(reader_make_constant_shell(makeString("generateFormulasForElements-TermGenls")), reader_make_constant_shell(makeString("Stenosis-Condition")), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("lessThan"))))), list(makeKeyword("GENL"), reader_make_constant_shell(makeString("Stenosis-AorticValve")), reader_make_constant_shell(makeString("Stenosis-Condition")))), ZERO_INTEGER, NIL), list(list(reader_make_constant_shell(makeString("cCFCoronaryArtery")), makeSymbol("?THING"), makeSymbol("?CORONARY-ARTERY")), list(makeString("THING involves the patient's CORONARY-ARTERY."), list(makeSymbol("?THING"), cons(ZERO_INTEGER, FIVE_INTEGER)), list(makeSymbol("?CORONARY-ARTERY"), cons(makeInteger(29), FIFTEEN_INTEGER))), makeKeyword("SUPPLEMENTAL"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt")), list(reader_make_constant_shell(makeString("generateSupplementalFormulasForElements-TermGenls")), reader_make_constant_shell(makeString("Stenosis-Condition")), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("cCFCoronaryArtery")), reader_make_constant_shell(makeString("cCFVesselStenosisDegree"))))), list(makeKeyword("GENL"), reader_make_constant_shell(makeString("Stenosis-AorticValve")), reader_make_constant_shell(makeString("Stenosis-Condition")))), ZERO_INTEGER, NIL), list(list(reader_make_constant_shell(makeString("cCFDiseaseActiveWithinTwoWeeksBeforeOperation")), makeSymbol("?MEDICAL-DIAGNOSIS"), makeSymbol("?TRUTH-VALUE")), list(makeString("TRUTH-VALUE indicates whether medical diagnosis MEDICAL-DIAGNOSIS indicated an active disease in patient within two weeks prior to an operation event."), list(makeSymbol("?TRUTH-VALUE"), cons(ZERO_INTEGER, ELEVEN_INTEGER)), list(makeSymbol("?MEDICAL-DIAGNOSIS"), cons(makeInteger(48), SEVENTEEN_INTEGER))), makeKeyword("SUPPLEMENTAL"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt")), list(reader_make_constant_shell(makeString("generateSupplementalFormulasForElements-TermIsa")), reader_make_constant_shell(makeString("CCFDiagnosisOrDisorderType")), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("cCFDiseaseActiveWithinTwoWeeksBeforeOperation"))))), list(makeKeyword("ISA"), reader_make_constant_shell(makeString("Stenosis-AorticValve")), reader_make_constant_shell(makeString("CCFDiagnosisOrDisorderType")))), ZERO_INTEGER, NIL), list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("cCFVesselStenosisDegree")), makeSymbol("?MEDICAL-FINDING"), makeSymbol("?NUMBER")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?X"), makeSymbol("?Y")))), list(makeString("The degree of coronary artery stenosis MEDICAL-FINDING is NUMBER."), list(makeSymbol("?MEDICAL-FINDING"), cons(makeInteger(39), FIFTEEN_INTEGER)), list(makeSymbol("?NUMBER"), cons(makeInteger(58), SIX_INTEGER))), makeKeyword("SUPPLEMENTAL"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt")), list(reader_make_constant_shell(makeString("generateSupplementalFormulasForElements-TermGenls")), reader_make_constant_shell(makeString("Stenosis-Condition")), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("cCFCoronaryArtery")), reader_make_constant_shell(makeString("cCFVesselStenosisDegree"))))), list(makeKeyword("GENL"), reader_make_constant_shell(makeString("Stenosis-AorticValve")), reader_make_constant_shell(makeString("Stenosis-Condition")))), ZERO_INTEGER, NIL), list(list(reader_make_constant_shell(makeString("durationOfMedicalEvent")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?DURATION")), list(makeString("The time elapsed from the start of to the end of MEDICALLY-RELATED-EVENT is DURATION."), list(makeSymbol("?MEDICALLY-RELATED-EVENT"), cons(makeInteger(49), makeInteger(23))), list(makeSymbol("?DURATION"), cons(makeInteger(76), EIGHT_INTEGER))), makeKeyword("SUPPLEMENTAL"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt")), list(reader_make_constant_shell(makeString("generateSupplementalFormulasForElements-TermGenls")), reader_make_constant_shell(makeString("CCFMedicalEvent")), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("durationOfMedicalEvent"))))), list(makeKeyword("GENL"), reader_make_constant_shell(makeString("Stenosis-AorticValve")), reader_make_constant_shell(makeString("CCFMedicalEvent")))), ZERO_INTEGER, NIL), list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("valveStenosisSeverityWithValve")), makeSymbol("?MEDICAL-CARE-EVENT"), makeSymbol("?CARDIAC-VALVE-OR-PROCEDURE"), reader_make_constant_shell(makeString("AorticValve")), makeSymbol("?CARDIAC-VALVE-STENOSIS")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-CARE-EVENT"), makeSymbol("?Y")))), list(makeString("The CARDIAC-VALVE-OR-PROCEDURE associated with MEDICAL-CARE-EVENT indicates that the patient's aortic valves have the stenosis severity CARDIAC-VALVE-STENOSIS."), list(makeSymbol("?CARDIAC-VALVE-OR-PROCEDURE"), cons(FOUR_INTEGER, makeInteger(26))), list(makeSymbol("?MEDICAL-CARE-EVENT"), cons(makeInteger(47), EIGHTEEN_INTEGER)), list(makeSymbol("?CARDIAC-VALVE-STENOSIS"), cons(makeInteger(136), makeInteger(22)))), makeKeyword("SIMPLE"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt")), list(reader_make_constant_shell(makeString("generateFormulasForElements-TermGenls")), reader_make_constant_shell(makeString("Stenosis-AorticValve")), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("valveStenosisSeverityWithValve")), reader_make_constant_shell(makeString("AorticValve"))))), list(makeKeyword("GENL"), reader_make_constant_shell(makeString("Stenosis-AorticValve")), reader_make_constant_shell(makeString("Stenosis-AorticValve")))), ZERO_INTEGER, NIL), list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("valveStenosisSeverityWithValve")), makeSymbol("?MEDICAL-CARE-EVENT"), makeSymbol("?CARDIAC-VALVE-OR-PROCEDURE"), makeSymbol("?TYPE-OF-CARDIAC-VALVE"), makeSymbol("?CARDIAC-VALVE-STENOSIS")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-CARE-EVENT"), makeSymbol("?Y")))), list(makeString("The CARDIAC-VALVE-OR-PROCEDURE associated with MEDICAL-CARE-EVENT indicates that the patient's TYPE-OF-CARDIAC-VALVE has the stenosis severity CARDIAC-VALVE-STENOSIS."), list(makeSymbol("?CARDIAC-VALVE-OR-PROCEDURE"), cons(FOUR_INTEGER, makeInteger(26))), list(makeSymbol("?MEDICAL-CARE-EVENT"), cons(makeInteger(47), EIGHTEEN_INTEGER)), list(makeSymbol("?TYPE-OF-CARDIAC-VALVE"), cons(makeInteger(95), makeInteger(21))), list(makeSymbol("?CARDIAC-VALVE-STENOSIS"), cons(makeInteger(143), makeInteger(22)))), makeKeyword("UNBOUND"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt")), list(reader_make_constant_shell(makeString("generateFormulasForElements-TermGenls")), reader_make_constant_shell(makeString("Stenosis-AorticValve")), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("valveStenosisSeverityWithValve")), reader_make_constant_shell(makeString("AorticValve"))))), list(makeKeyword("GENL"), reader_make_constant_shell(makeString("Stenosis-AorticValve")), reader_make_constant_shell(makeString("Stenosis-AorticValve")))), ZERO_INTEGER, NIL), list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("vesselStenosisDegree")), makeSymbol("?CCF-EVENT"), makeSymbol("?MEDICAL-FINDING"), makeSymbol("?CORONARY-ARTERY"), makeSymbol("?NUMBER")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?CCF-EVENT"), makeSymbol("?Y")))), list(makeString("The MEDICAL-FINDING associated with CCF-EVENT indicates the patient's CORONARY-ARTERY have the vessel stenosis degree NUMBER."), list(makeSymbol("?MEDICAL-FINDING"), cons(FOUR_INTEGER, FIFTEEN_INTEGER)), list(makeSymbol("?CCF-EVENT"), cons(makeInteger(36), NINE_INTEGER)), list(makeSymbol("?CORONARY-ARTERY"), cons(makeInteger(70), FIFTEEN_INTEGER)), list(makeSymbol("?NUMBER"), cons(makeInteger(118), SIX_INTEGER))), makeKeyword("SIMPLE"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt")), list(reader_make_constant_shell(makeString("generateFormulasForElements-TermGenls")), reader_make_constant_shell(makeString("Stenosis-Condition")), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("vesselStenosisDegree"))))), list(makeKeyword("GENL"), reader_make_constant_shell(makeString("Stenosis-AorticValve")), reader_make_constant_shell(makeString("Stenosis-Condition")))), ZERO_INTEGER, NIL) })));
    }

    private static SubLObject _constant_641_initializer() {
        return list(new SubLObject[]{ list(list(list(makeString("The patient ID for ______ is ______."), list(makeSymbol("?ID"), cons(makeInteger(29), SIX_INTEGER)), list(makeSymbol("?PATIENT"), cons(NINETEEN_INTEGER, SIX_INTEGER))), makeSymbol("?NONE"), makeString("patient"), list(reader_make_constant_shell(makeString("cCFCCFID")), makeSymbol("?PATIENT"), makeSymbol("?ID")), makeKeyword("XYZ")), makeString("The patient ID for X is Y.")), list(list(list(makeString("THING is an X."), list(makeSymbol("?THING"), cons(ZERO_INTEGER, FIVE_INTEGER)), list(makeSymbol("?X"), cons(TWELVE_INTEGER, ONE_INTEGER))), makeSymbol("?X"), makeString("pericardial window"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("PericardialWindow-SurgicalProcedure"))), makeKeyword("XYZ")), makeString("X is an pericardial window.")), list(list(list(makeString("______ is ______."), list(makeSymbol("?X"), cons(TEN_INTEGER, SIX_INTEGER)), list(makeSymbol("?THING"), cons(ZERO_INTEGER, SIX_INTEGER))), makeSymbol("?X"), makeString("patient"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("MedicalPatient"))), makeKeyword("BLANKS")), makeString("______ is patient.")), list(list(list(makeString("The reason for admission HOSPITAL-CARE was CCF-HOSPITAL-ADMIT-REASON-TYPE."), list(makeSymbol("?CCF-HOSPITAL-ADMIT-REASON-TYPE"), cons(makeInteger(43), makeInteger(30))), list(makeSymbol("?HOSPITAL-CARE"), cons(makeInteger(25), THIRTEEN_INTEGER))), makeSymbol("?CCF-HOSPITAL-ADMIT-REASON-TYPE"), makeString("heart attacks"), list(reader_make_constant_shell(makeString("cCFHospitalAdmitReason")), makeSymbol("?HOSPITAL-CARE"), reader_make_constant_shell(makeString("HeartAttack"))), makeKeyword("MNEMONIC")), makeString("The reason for admission HOSPITAL-CARE was heart attacks.")), list(list(list(makeString("The reason for admission ______ was ______."), list(makeSymbol("?CCF-HOSPITAL-ADMIT-REASON-TYPE"), cons(makeInteger(36), SIX_INTEGER)), list(makeSymbol("?HOSPITAL-CARE"), cons(makeInteger(25), SIX_INTEGER))), makeSymbol("?NONE"), makeString("heart attack"), list(reader_make_constant_shell(makeString("cCFHospitalAdmitReason")), makeSymbol("?HOSPITAL-CARE"), makeSymbol("?CCF-HOSPITAL-ADMIT-REASON-TYPE")), makeKeyword("BLANKS")), makeString("The reason for admission ______ was ______.")), list(list(list(makeString("______ contains information pertaining to ______."), list(makeSymbol("?X"), cons(makeInteger(42), SIX_INTEGER)), list(makeSymbol("?Y"), cons(ZERO_INTEGER, SIX_INTEGER))), makeSymbol("?NONE"), makeString("heart attack"), list(reader_make_constant_shell(makeString("medicalEventHasAssociatedData")), makeSymbol("?X"), makeSymbol("?Y")), makeKeyword("BLANKS")), makeString("______ contains information pertaining to ______.")), list(list(list(makeString("The patient ID for ______ is ______."), list(makeSymbol("?ID"), cons(makeInteger(29), SIX_INTEGER)), list(makeSymbol("?PATIENT"), cons(NINETEEN_INTEGER, SIX_INTEGER))), makeSymbol("?NONE"), makeString("patient"), list(reader_make_constant_shell(makeString("cCFCCFID")), makeSymbol("?PATIENT"), makeSymbol("?ID")), makeKeyword("BLANKS")), makeString("The patient ID for ______ is ______.")), list(list(list(makeString("______ is ______."), list(makeSymbol("?X"), cons(TEN_INTEGER, SIX_INTEGER)), list(makeSymbol("?THING"), cons(ZERO_INTEGER, SIX_INTEGER))), makeSymbol("?X"), makeString("heart attack"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("HeartAttack"))), makeKeyword("BLANKS")), makeString("______ is heart attack.")), list(list(list(makeString("______ is ______."), list(makeSymbol("?X"), cons(TEN_INTEGER, SIX_INTEGER)), list(makeSymbol("?THING"), cons(ZERO_INTEGER, SIX_INTEGER))), makeSymbol("?X"), makeString("heart attack"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("HeartAttack"))), makeKeyword("XYZ")), makeString("X is heart attack.")), list(list(list(makeString("The patient ID for ______ is ID."), list(makeSymbol("?ID"), cons(makeInteger(29), TWO_INTEGER)), list(makeSymbol("?PATIENT"), cons(NINETEEN_INTEGER, SIX_INTEGER))), makeSymbol("?NONE"), makeString("patient"), list(reader_make_constant_shell(makeString("cCFCCFID")), makeSymbol("?PATIENT"), makeSymbol("?ID")), makeKeyword("MNEMONIC")), makeString("The patient ID for PATIENT is ID.")), list(list(list(makeString("The cardiac cath complication Y occurred during or within 24 hours of the cardiac catheterization procedure X."), list(makeSymbol("?CCF-EVENT"), cons(makeInteger(108), ONE_INTEGER)), list(makeSymbol("?TYPE-OF-THING"), cons(makeInteger(30), ONE_INTEGER))), makeSymbol("?TYPE-OF-THING"), makeString("heart attack"), list(reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeSymbol("?CCF-EVENT"), reader_make_constant_shell(makeString("HeartAttack"))), makeKeyword("XYZ")), makeString("The cardiac cath complication heart attack occurred during or within 24 hours of the cardiac catheterization procedure X.")), list(list(list(makeString("______ is ______."), list(makeSymbol("?X"), cons(TEN_INTEGER, SIX_INTEGER)), list(makeSymbol("?THING"), cons(ZERO_INTEGER, SIX_INTEGER))), makeSymbol("?X"), makeString("heart attack"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("HeartAttack"))), makeKeyword("MNEMONIC")), makeString("INFARCTION is heart attack.")), list(list(list(makeString("The cardiac cath complication ______ occurred during or within 24 hours of the cardiac catheterization procedure ______."), list(makeSymbol("?CCF-EVENT"), cons(makeInteger(113), SIX_INTEGER)), list(makeSymbol("?TYPE-OF-THING"), cons(makeInteger(30), SIX_INTEGER))), makeSymbol("?NONE"), makeString("heart attack"), list(reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeSymbol("?CCF-EVENT"), makeSymbol("?TYPE-OF-THING")), makeKeyword("XYZ")), makeString("The cardiac cath complication X occurred during or within 24 hours of the cardiac catheterization procedure Y.")), list(list(list(makeString("______ is ______."), list(makeSymbol("?X"), cons(TEN_INTEGER, SIX_INTEGER)), list(makeSymbol("?THING"), cons(ZERO_INTEGER, SIX_INTEGER))), makeSymbol("?X"), makeString("patient"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("MedicalPatient"))), makeKeyword("MNEMONIC")), makeString("MEDICAL-PATIENT-OR-DONOR-DATA is patient.")), list(list(list(makeString("______ contains information pertaining to ______."), list(makeSymbol("?MEDICALLY-RELATED-EVENT"), cons(makeInteger(42), SIX_INTEGER)), list(makeSymbol("?CONTAINER-UNDERSPECIFIED"), cons(ZERO_INTEGER, SIX_INTEGER))), makeSymbol("?NONE"), makeString("heart attack"), list(reader_make_constant_shell(makeString("medicalEventHasAssociatedData")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?CONTAINER-UNDERSPECIFIED")), makeKeyword("XYZ")), makeString("X contains information pertaining to Y.")), list(list(list(makeString("The cardiac cath complication TYPE-OF-THING occurred during or within 24 hours of the cardiac catheterization procedure CCF-EVENT."), list(makeSymbol("?CCF-EVENT"), cons(makeInteger(120), NINE_INTEGER)), list(makeSymbol("?TYPE-OF-THING"), cons(makeInteger(30), THIRTEEN_INTEGER))), makeSymbol("?TYPE-OF-THING"), makeString("heart attacks"), list(reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeSymbol("?CCF-EVENT"), reader_make_constant_shell(makeString("HeartAttack"))), makeKeyword("MNEMONIC")), makeString("The cardiac cath complication heart attacks occurred during or within 24 hours of the cardiac catheterization procedure CCF-EVENT.")), list(list(list(makeString("The reason for admission X was Y."), list(makeSymbol("?HOSPITAL-ADMIT-REASON"), cons(makeInteger(31), ONE_INTEGER)), list(makeSymbol("?HOSPITAL-CARE"), cons(makeInteger(25), ONE_INTEGER))), makeSymbol("?HOSPITAL-ADMIT-REASON"), makeString("heart attack"), list(reader_make_constant_shell(makeString("cCFHospitalAdmitReason")), makeSymbol("?HOSPITAL-CARE"), reader_make_constant_shell(makeString("HeartAttack"))), makeKeyword("XYZ")), makeString("The reason for admission X was heart attack.")), list(list(list(makeString("The cardiac cath complication ______ occurred during or within 24 hours of the cardiac catheterization procedure ______."), list(makeSymbol("?CCF-EVENT"), cons(makeInteger(113), SIX_INTEGER)), list(makeSymbol("?TYPE-OF-THING"), cons(makeInteger(30), SIX_INTEGER))), makeSymbol("?TYPE-OF-THING"), makeString("heart attack"), list(reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeSymbol("?CCF-EVENT"), reader_make_constant_shell(makeString("HeartAttack"))), makeKeyword("BLANKS")), makeString("The cardiac cath complication heart attack occurred during or within 24 hours of the cardiac catheterization procedure ______.")), list(list(list(makeString("The patient ID for ______ is ID."), list(makeSymbol("?ID"), cons(makeInteger(29), TWO_INTEGER)), list(makeSymbol("?PATIENT"), cons(NINETEEN_INTEGER, SIX_INTEGER))), makeSymbol("?NONE"), makeString("patient"), list(reader_make_constant_shell(makeString("cCFCCFID")), makeSymbol("?PATIENT"), makeSymbol("?ID")), makeKeyword("BLANKS")), makeString("The patient ID for ______ is ID.")), list(list(list(makeString("The reason for admission ______ was ______."), list(makeSymbol("?CCF-HOSPITAL-ADMIT-REASON-TYPE"), cons(makeInteger(36), SIX_INTEGER)), list(makeSymbol("?HOSPITAL-CARE"), cons(makeInteger(25), SIX_INTEGER))), makeSymbol("?NONE"), makeString("heart attack"), list(reader_make_constant_shell(makeString("cCFHospitalAdmitReason")), makeSymbol("?HOSPITAL-CARE"), makeSymbol("?CCF-HOSPITAL-ADMIT-REASON-TYPE")), makeKeyword("XYZ")), makeString("The reason for admission X was Y.")), list(list(list(makeString("The reason for admission HOSPITAL-CARE was HOSPITAL-ADMIT-REASON."), list(makeSymbol("?CCF-HOSPITAL-ADMIT-REASON-TYPE"), cons(makeInteger(43), makeInteger(21))), list(makeSymbol("?HOSPITAL-CARE"), cons(makeInteger(25), THIRTEEN_INTEGER))), makeSymbol("?CCF-HOSPITAL-ADMIT-REASON-TYPE"), makeString("heart attack"), list(reader_make_constant_shell(makeString("cCFHospitalAdmitReason")), makeSymbol("?HOSPITAL-CARE"), reader_make_constant_shell(makeString("HeartAttack"))), makeKeyword("MNEMONIC")), makeString("The reason for admission HOSPITAL-CARE was heart attack.")), list(list(list(makeString("The cardiac cath complication ______ occurred during or within 24 hours of the cardiac catheterization procedure ______."), list(makeSymbol("?CCF-EVENT"), cons(makeInteger(113), SIX_INTEGER)), list(makeSymbol("?TYPE-OF-THING"), cons(makeInteger(30), SIX_INTEGER))), makeSymbol("?NONE"), makeString("heart attack"), list(reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeSymbol("?CCF-EVENT"), makeSymbol("?TYPE-OF-THING")), makeKeyword("MNEMONIC")), makeString("The cardiac cath complication CARDIAC-CATH-COMPLICATION occurred during or within 24 hours of the cardiac catheterization procedure CCF-EVENT.")), list(list(list(makeString("The patient ID for ______ is ID."), list(makeSymbol("?ID"), cons(makeInteger(29), TWO_INTEGER)), list(makeSymbol("?PATIENT"), cons(NINETEEN_INTEGER, SIX_INTEGER))), makeSymbol("?NONE"), makeString("patient"), list(reader_make_constant_shell(makeString("cCFCCFID")), makeSymbol("?PATIENT"), makeSymbol("?ID")), makeKeyword("XYZ")), makeString("The patient ID for X is Y.")), list(list(list(makeString("______ contains information pertaining to ______."), list(makeSymbol("?X"), cons(makeInteger(42), SIX_INTEGER)), list(makeSymbol("?Y"), cons(ZERO_INTEGER, SIX_INTEGER))), makeSymbol("?NONE"), makeString("heart attack"), list(reader_make_constant_shell(makeString("medicalEventHasAssociatedData")), makeSymbol("?X"), makeSymbol("?Y")), makeKeyword("XYZ")), makeString("X contains information pertaining to Y.")), list(list(list(makeString("______ contains information pertaining to ______."), list(makeSymbol("?MEDICALLY-RELATED-EVENT"), cons(makeInteger(42), SIX_INTEGER)), list(makeSymbol("?CONTAINER-UNDERSPECIFIED"), cons(ZERO_INTEGER, SIX_INTEGER))), makeSymbol("?NONE"), makeString("heart attack"), list(reader_make_constant_shell(makeString("medicalEventHasAssociatedData")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?CONTAINER-UNDERSPECIFIED")), makeKeyword("BLANKS")), makeString("______ contains information pertaining to ______.")), list(list(list(makeString("The patient ID for ______ is ______."), list(makeSymbol("?ID"), cons(makeInteger(29), SIX_INTEGER)), list(makeSymbol("?PATIENT"), cons(NINETEEN_INTEGER, SIX_INTEGER))), makeSymbol("?NONE"), makeString("patient"), list(reader_make_constant_shell(makeString("cCFCCFID")), makeSymbol("?PATIENT"), makeSymbol("?ID")), makeKeyword("MNEMONIC")), makeString("The patient ID for PATIENT is ID.")), list(list(list(makeString("The reason for admission X was Y."), list(makeSymbol("?HOSPITAL-ADMIT-REASON"), cons(makeInteger(31), ONE_INTEGER)), list(makeSymbol("?HOSPITAL-CARE"), cons(makeInteger(25), ONE_INTEGER))), makeSymbol("?HOSPITAL-ADMIT-REASON"), makeString("heart attacks"), list(reader_make_constant_shell(makeString("cCFHospitalAdmitReason")), makeSymbol("?HOSPITAL-CARE"), reader_make_constant_shell(makeString("HeartAttack"))), makeKeyword("XYZ")), makeString("The reason for admission X was heart attacks.")), list(list(list(makeString("The cardiac cath complication ______ occurred during or within 24 hours of the cardiac catheterization procedure ______."), list(makeSymbol("?CCF-EVENT"), cons(makeInteger(113), SIX_INTEGER)), list(makeSymbol("?TYPE-OF-THING"), cons(makeInteger(30), SIX_INTEGER))), makeSymbol("?NONE"), makeString("heart attack"), list(reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeSymbol("?CCF-EVENT"), makeSymbol("?TYPE-OF-THING")), makeKeyword("BLANKS")), makeString("The cardiac cath complication ______ occurred during or within 24 hours of the cardiac catheterization procedure ______.")), list(list(list(makeString("The cardiac cath complication Y occurred during or within 24 hours of the cardiac catheterization procedure X."), list(makeSymbol("?CCF-EVENT"), cons(makeInteger(108), ONE_INTEGER)), list(makeSymbol("?TYPE-OF-THING"), cons(makeInteger(30), ONE_INTEGER))), makeSymbol("?TYPE-OF-THING"), makeString("heart attacks"), list(reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeSymbol("?CCF-EVENT"), reader_make_constant_shell(makeString("HeartAttack"))), makeKeyword("XYZ")), makeString("The cardiac cath complication heart attacks occurred during or within 24 hours of the cardiac catheterization procedure X.")), list(list(list(makeString("The cardiac cath complication CARDIAC-CATH-COMPLICATION occurred during or within 24 hours of the cardiac catheterization procedure CCF-EVENT."), list(makeSymbol("?CCF-EVENT"), cons(makeInteger(132), NINE_INTEGER)), list(makeSymbol("?TYPE-OF-THING"), cons(makeInteger(30), makeInteger(25)))), makeSymbol("?TYPE-OF-THING"), makeString("heart attack"), list(reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeSymbol("?CCF-EVENT"), reader_make_constant_shell(makeString("HeartAttack"))), makeKeyword("MNEMONIC")), makeString("The cardiac cath complication heart attack occurred during or within 24 hours of the cardiac catheterization procedure CCF-EVENT.")), list(list(list(makeString("The reason for admission ______ was ______."), list(makeSymbol("?CCF-HOSPITAL-ADMIT-REASON-TYPE"), cons(makeInteger(36), SIX_INTEGER)), list(makeSymbol("?HOSPITAL-CARE"), cons(makeInteger(25), SIX_INTEGER))), makeSymbol("?NONE"), makeString("heart attack"), list(reader_make_constant_shell(makeString("cCFHospitalAdmitReason")), makeSymbol("?HOSPITAL-CARE"), makeSymbol("?CCF-HOSPITAL-ADMIT-REASON-TYPE")), makeKeyword("MNEMONIC")), makeString("The reason for admission HOSPITAL-CARE was HOSPITAL-ADMIT-REASON.")), list(list(list(makeString("The reason for admission ______ was ______."), list(makeSymbol("?CCF-HOSPITAL-ADMIT-REASON-TYPE"), cons(makeInteger(36), SIX_INTEGER)), list(makeSymbol("?HOSPITAL-CARE"), cons(makeInteger(25), SIX_INTEGER))), makeSymbol("?CCF-HOSPITAL-ADMIT-REASON-TYPE"), makeString("heart attack"), list(reader_make_constant_shell(makeString("cCFHospitalAdmitReason")), makeSymbol("?HOSPITAL-CARE"), reader_make_constant_shell(makeString("HeartAttack"))), makeKeyword("BLANKS")), makeString("The reason for admission ______ was heart attack.")), list(list(list(makeString("______ is ______."), list(makeSymbol("?X"), cons(TEN_INTEGER, SIX_INTEGER)), list(makeSymbol("?THING"), cons(ZERO_INTEGER, SIX_INTEGER))), makeSymbol("?X"), makeString("patient"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("MedicalPatient"))), makeKeyword("XYZ")), makeString("X is patient.")) });
    }

    private static SubLObject _constant_644_initializer() {
        return list(new SubLObject[]{ list(list(makeString("Echo during 1999")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("dateOfEvent-CAE")), makeSymbol("?MEDICAL-TEST"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))))), list(makeString("What echocardiograms occurred in 1999?"), list(makeSymbol("?MEDICAL-TEST"), cons(ZERO_INTEGER, FOUR_INTEGER))), makeKeyword("TEMPORAL")))), list(list(makeString("Echo in 1999")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("dateOfEvent-CAE")), makeSymbol("?MEDICAL-TEST"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))))), list(makeString("What echocardiograms occurred in 1999?"), list(makeSymbol("?MEDICAL-TEST"), cons(ZERO_INTEGER, FOUR_INTEGER))), makeKeyword("TEMPORAL")))), list(list(makeString("Echo on January 5, 1999")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-EVALUATION"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-EVALUATION"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("dateOfEvent-CAE")), makeSymbol("?MEDICAL-EVALUATION"), list(reader_make_constant_shell(makeString("DayFn")), FIVE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))))))), list(makeString("What echocardiograms occurred on January 5, 1999?"), list(makeSymbol("?MEDICAL-EVALUATION"), cons(ZERO_INTEGER, FOUR_INTEGER))), makeKeyword("TEMPORAL")))), list(list(makeString("Echo before 1999")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?SECOND"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("maxDateForEvent")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?SECOND")), list(reader_make_constant_shell(makeString("laterThan")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)), makeSymbol("?SECOND"))))), list(makeString("What echocardiograms occurred before 1999?")), makeKeyword("TEMPORAL")))), list(list(makeString("Echo after 1999")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?SECOND"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("maxDateForEvent")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?SECOND")), list(reader_make_constant_shell(makeString("laterThan")), makeSymbol("?SECOND"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)))))), list(makeString("What echocardiograms occurred after 1999?")), makeKeyword("TEMPORAL")))), list(list(makeString("Echo since 1999")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?SECOND"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("maxDateForEvent")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?SECOND")), list(reader_make_constant_shell(makeString("laterThan")), makeSymbol("?SECOND"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)))))), list(makeString("What echocardiograms occurred after 1999?")), makeKeyword("TEMPORAL")))), list(list(makeString("Echo between 1999 and 2005")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("temporallyBetween-Inclusive")), makeSymbol("?MEDICAL-TEST"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2005))))), list(makeString("What echocardiograms happened between 1999 and 2005?"), list(makeSymbol("?MEDICAL-TEST"), cons(ZERO_INTEGER, FOUR_INTEGER))), makeKeyword("TEMPORAL")))), list(list(makeString("Echo between January 1, 1999 and February 15, 1999")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-EVALUATION"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-EVALUATION"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("temporallyBetween-Inclusive")), makeSymbol("?MEDICAL-EVALUATION"), list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)))), list(reader_make_constant_shell(makeString("DayFn")), FIFTEEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("February")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))))))), list(makeString("What echocardiograms happened between January 1, 1999 and February 15, 1999?"), list(makeSymbol("?MEDICAL-EVALUATION"), cons(ZERO_INTEGER, FOUR_INTEGER))), makeKeyword("TEMPORAL")))), list(list(makeString("Echo between 1999 through 2005")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("temporallyBetween-Inclusive")), makeSymbol("?MEDICAL-TEST"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2005))))), list(makeString("What echocardiograms happened between 1999 and 2005?"), list(makeSymbol("?MEDICAL-TEST"), cons(ZERO_INTEGER, FOUR_INTEGER))), makeKeyword("TEMPORAL")))), list(list(makeString("Echo from 1999 to 2005")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("temporallyBetween-Inclusive")), makeSymbol("?MEDICAL-TEST"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2005))))), list(makeString("What echocardiograms happened between 1999 and 2005?"), list(makeSymbol("?MEDICAL-TEST"), cons(ZERO_INTEGER, FOUR_INTEGER))), makeKeyword("TEMPORAL")))), list(list(makeString("Echo from 1999 through 2005")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("temporallyBetween-Inclusive")), makeSymbol("?MEDICAL-TEST"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2005))))), list(makeString("What echocardiograms happened between 1999 and 2005?"), list(makeSymbol("?MEDICAL-TEST"), cons(ZERO_INTEGER, FOUR_INTEGER))), makeKeyword("TEMPORAL")))), list(list(makeString("Echo before AVR")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST")))), list(makeString("What aortic valve replacements occurred after what echocardiograms?")), makeKeyword("TEMPORAL")))), list(list(makeString("Echo prior to AVR")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST")))), list(makeString("What aortic valve replacements occurred after what echocardiograms?")), makeKeyword("TEMPORAL")))), list(list(makeString("Echo after AVR")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?MEDICALLY-RELATED-EVENT")))), list(makeString("What echocardiograms occurred after what aortic valve replacements?")), makeKeyword("TEMPORAL")))), list(list(makeString("AVR with echo before in 1999")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("dateOfEvent-CAE")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST")))), list(makeString("What aortic valve replacements in 1999 occurred after what echocardiograms?")), makeKeyword("TEMPORAL")), list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("dateOfEvent-CAE")), makeSymbol("?MEDICAL-TEST"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST")))), list(makeString("What echocardiograms in 1999 occurred before what aortic valve replacements?")), makeKeyword("TEMPORAL")))), list(list(makeString("Echo before AVR during 1999")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("dateOfEvent-CAE")), makeSymbol("?MEDICAL-TEST"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST")))), list(makeString("What echocardiograms in 1999 occurred before what aortic valve replacements?")), makeKeyword("TEMPORAL")), list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("dateOfEvent-CAE")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST")))), list(makeString("What aortic valve replacements in 1999 occurred after what echocardiograms?")), makeKeyword("TEMPORAL")))), list(list(makeString("Echo before AVR in 1999")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("dateOfEvent-CAE")), makeSymbol("?MEDICAL-TEST"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST")))), list(makeString("What echocardiograms in 1999 occurred before what aortic valve replacements?")), makeKeyword("TEMPORAL")), list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("dateOfEvent-CAE")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST")))), list(makeString("What aortic valve replacements in 1999 occurred after what echocardiograms?")), makeKeyword("TEMPORAL")))), list(list(makeString("Echo before AVR before 1999")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?SECOND"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("maxDateForEvent")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?SECOND")), list(reader_make_constant_shell(makeString("laterThan")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)), makeSymbol("?SECOND")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST"))))), list(makeString("What echocardiograms before 1999 occurred before what aortic valve replacements?")), makeKeyword("TEMPORAL")), list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?SECOND"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("maxDateForEvent")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?SECOND")), list(reader_make_constant_shell(makeString("laterThan")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)), makeSymbol("?SECOND")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST"))))), list(makeString("What aortic valve replacements before 1999 occurred after what echocardiograms?")), makeKeyword("TEMPORAL")))), list(list(makeString("Echo before AVR after 1999")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?SECOND"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("maxDateForEvent")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?SECOND")), list(reader_make_constant_shell(makeString("laterThan")), makeSymbol("?SECOND"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)))))), list(makeString("What echocardiograms after 1999 occurred before what aortic valve replacements?")), makeKeyword("TEMPORAL")), list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?SECOND"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("maxDateForEvent")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?SECOND")), list(reader_make_constant_shell(makeString("laterThan")), makeSymbol("?SECOND"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)))))), list(makeString("What aortic valve replacements after 1999 occurred after what echocardiograms?")), makeKeyword("TEMPORAL")))), list(list(makeString("Echo before AVR between 1999 and 2005")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("temporallyBetween-Inclusive")), makeSymbol("?MEDICAL-TEST"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2005))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST")))), list(makeString("What echocardiograms between 1999 and 2005 occurred before what aortic valve replacements?")), makeKeyword("TEMPORAL")), list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("temporallyBetween-Inclusive")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2005))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST")))), list(makeString("What aortic valve replacements between 1999 and 2005 occurred after what echocardiograms?")), makeKeyword("TEMPORAL")))), list(list(makeString("Echo before AVR between 1999 and 2005")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("temporallyBetween-Inclusive")), makeSymbol("?MEDICAL-TEST"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2005))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST")))), list(makeString("What echocardiograms between 1999 and 2005 occurred before what aortic valve replacements?")), makeKeyword("TEMPORAL")), list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("temporallyBetween-Inclusive")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2005))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST")))), list(makeString("What aortic valve replacements between 1999 and 2005 occurred after what echocardiograms?")), makeKeyword("TEMPORAL")))), list(list(makeString("Echo after AVR during 1999")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("dateOfEvent-CAE")), makeSymbol("?MEDICAL-TEST"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?MEDICALLY-RELATED-EVENT")))), list(makeString("What echocardiograms in 1999 occurred after what aortic valve replacements?")), makeKeyword("TEMPORAL")), list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("dateOfEvent-CAE")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?MEDICALLY-RELATED-EVENT")))), list(makeString("What aortic valve replacements in 1999 occurred before what echocardiograms?")), makeKeyword("TEMPORAL")))), list(list(makeString("Echo after AVR before 1999")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?SECOND"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?MEDICALLY-RELATED-EVENT")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("maxDateForEvent")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?SECOND")), list(reader_make_constant_shell(makeString("laterThan")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)), makeSymbol("?SECOND"))))), list(makeString("What echocardiograms before 1999 occurred after what aortic valve replacements?")), makeKeyword("TEMPORAL")), list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?SECOND"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?MEDICALLY-RELATED-EVENT")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("maxDateForEvent")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?SECOND")), list(reader_make_constant_shell(makeString("laterThan")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)), makeSymbol("?SECOND"))))), list(makeString("What aortic valve replacements before 1999 occurred before what echocardiograms?")), makeKeyword("TEMPORAL")))), list(list(makeString("Echo after AVR after 1999")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?SECOND"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?MEDICALLY-RELATED-EVENT")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("maxDateForEvent")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?SECOND")), list(reader_make_constant_shell(makeString("laterThan")), makeSymbol("?SECOND"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)))))), list(makeString("What echocardiograms after 1999 occurred after what aortic valve replacements?")), makeKeyword("TEMPORAL")), list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?SECOND"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?MEDICALLY-RELATED-EVENT")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("maxDateForEvent")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?SECOND")), list(reader_make_constant_shell(makeString("laterThan")), makeSymbol("?SECOND"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)))))), list(makeString("What aortic valve replacements after 1999 occurred before what echocardiograms?")), makeKeyword("TEMPORAL")))), list(list(makeString("Echo after AVR between 1999 and 2005")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("temporallyBetween-Inclusive")), makeSymbol("?MEDICAL-TEST"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2005))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?MEDICALLY-RELATED-EVENT")))), list(makeString("What echocardiograms between 1999 and 2005 occurred after what aortic valve replacements?")), makeKeyword("TEMPORAL")), list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("temporallyBetween-Inclusive")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2005))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?MEDICALLY-RELATED-EVENT")))), list(makeString("What aortic valve replacements between 1999 and 2005 occurred before what echocardiograms?")), makeKeyword("TEMPORAL")))), list(list(makeString("Echo less than 30 days before AVR")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?TIME"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("greaterThan")), list(reader_make_constant_shell(makeString("DaysDuration")), makeInteger(30)), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("timeElapsedBetween-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST"), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST"))))), list(makeString("What aortic valve replacements occurred less than 30 days after what echocardiograms?")), makeKeyword("TEMPORAL")))), list(list(makeString("Echo less than 30 days after AVR")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?TIME"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("greaterThan")), list(reader_make_constant_shell(makeString("DaysDuration")), makeInteger(30)), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("timeElapsedBetween-CCF")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?MEDICALLY-RELATED-EVENT"))))), list(makeString("What echocardiograms occurred less than 30 days after what aortic valve replacements?")), makeKeyword("TEMPORAL")))), list(list(makeString("Echo more than 30 days before AVR")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?TIME"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("greaterThan")), makeSymbol("?TIME"), list(reader_make_constant_shell(makeString("DaysDuration")), makeInteger(30))), list(reader_make_constant_shell(makeString("timeElapsedBetween-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST"), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST"))))), list(makeString("What aortic valve replacements occurred more than 30 days after what echocardiograms?")), makeKeyword("TEMPORAL")))), list(list(makeString("Echo more than 30 days after AVR")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?TIME"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("greaterThan")), makeSymbol("?TIME"), list(reader_make_constant_shell(makeString("DaysDuration")), makeInteger(30))), list(reader_make_constant_shell(makeString("timeElapsedBetween-CCF")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?MEDICALLY-RELATED-EVENT"))))), list(makeString("What echocardiograms occurred more than 30 days after what aortic valve replacements?")), makeKeyword("TEMPORAL")))), list(list(makeString("Echo less than 30 days before AVR during 1999")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?TIME"), list(new SubLObject[]{ reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("dateOfEvent-CAE")), makeSymbol("?MEDICAL-TEST"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("greaterThan")), list(reader_make_constant_shell(makeString("DaysDuration")), makeInteger(30)), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("timeElapsedBetween-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST"), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST")) }))), list(makeString("What echocardiograms in 1999 occurred less than 30 days before what aortic valve replacements?")), makeKeyword("TEMPORAL")), list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?TIME"), list(new SubLObject[]{ reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("dateOfEvent-CAE")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("greaterThan")), list(reader_make_constant_shell(makeString("DaysDuration")), makeInteger(30)), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("timeElapsedBetween-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST"), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST")) }))), list(makeString("What aortic valve replacements in 1999 occurred less than 30 days after what echocardiograms?")), makeKeyword("TEMPORAL")))), list(list(makeString("Echo less than 30 days before AVR before 1999")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?SECOND"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?TIME"), list(new SubLObject[]{ reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("greaterThan")), list(reader_make_constant_shell(makeString("DaysDuration")), makeInteger(30)), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("timeElapsedBetween-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST"), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("maxDateForEvent")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?SECOND")), list(reader_make_constant_shell(makeString("laterThan")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)), makeSymbol("?SECOND")) })))), list(makeString("What echocardiograms before 1999 occurred less than 30 days before what aortic valve replacements?")), makeKeyword("TEMPORAL")), list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?SECOND"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?TIME"), list(new SubLObject[]{ reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("greaterThan")), list(reader_make_constant_shell(makeString("DaysDuration")), makeInteger(30)), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("timeElapsedBetween-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST"), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("maxDateForEvent")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?SECOND")), list(reader_make_constant_shell(makeString("laterThan")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)), makeSymbol("?SECOND")) })))), list(makeString("What aortic valve replacements before 1999 occurred less than 30 days after what echocardiograms?")), makeKeyword("TEMPORAL")))), list(list(makeString("Echo less than 30 days before AVR after 1999")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?SECOND"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?TIME"), list(new SubLObject[]{ reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("greaterThan")), list(reader_make_constant_shell(makeString("DaysDuration")), makeInteger(30)), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("timeElapsedBetween-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST"), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("maxDateForEvent")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?SECOND")), list(reader_make_constant_shell(makeString("laterThan")), makeSymbol("?SECOND"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))) })))), list(makeString("What echocardiograms after 1999 occurred less than 30 days before what aortic valve replacements?")), makeKeyword("TEMPORAL")), list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?SECOND"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?TIME"), list(new SubLObject[]{ reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("greaterThan")), list(reader_make_constant_shell(makeString("DaysDuration")), makeInteger(30)), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("timeElapsedBetween-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST"), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("maxDateForEvent")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?SECOND")), list(reader_make_constant_shell(makeString("laterThan")), makeSymbol("?SECOND"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))) })))), list(makeString("What aortic valve replacements after 1999 occurred less than 30 days after what echocardiograms?")), makeKeyword("TEMPORAL")))), list(list(makeString("Echo less than 30 days before AVR between 1999 and 2005")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?TIME"), list(new SubLObject[]{ reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("temporallyBetween-Inclusive")), makeSymbol("?MEDICAL-TEST"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2005))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("greaterThan")), list(reader_make_constant_shell(makeString("DaysDuration")), makeInteger(30)), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("timeElapsedBetween-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST"), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST")) }))), list(makeString("What echocardiograms between 1999 and 2005 occurred less than 30 days before what aortic valve replacements?")), makeKeyword("TEMPORAL")), list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?TIME"), list(new SubLObject[]{ reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("temporallyBetween-Inclusive")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2005))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("greaterThan")), list(reader_make_constant_shell(makeString("DaysDuration")), makeInteger(30)), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("timeElapsedBetween-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST"), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?MEDICAL-TEST")) }))), list(makeString("What aortic valve replacements between 1999 and 2005 occurred less than 30 days after what echocardiograms?")), makeKeyword("TEMPORAL")))), list(list(makeString("Echo less than 30 days after AVR in 1999")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?TIME"), list(new SubLObject[]{ reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("dateOfEvent-CAE")), makeSymbol("?MEDICAL-TEST"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("greaterThan")), list(reader_make_constant_shell(makeString("DaysDuration")), makeInteger(30)), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("timeElapsedBetween-CCF")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?MEDICALLY-RELATED-EVENT")) }))), list(makeString("What echocardiograms in 1999 occurred less than 30 days after what aortic valve replacements?")), makeKeyword("TEMPORAL")), list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?TIME"), list(new SubLObject[]{ reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("dateOfEvent-CAE")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("greaterThan")), list(reader_make_constant_shell(makeString("DaysDuration")), makeInteger(30)), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("timeElapsedBetween-CCF")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?MEDICALLY-RELATED-EVENT")) }))), list(makeString("What aortic valve replacements in 1999 occurred less than 30 days before what echocardiograms?")), makeKeyword("TEMPORAL")))), list(list(makeString("Echo less than 30 days after AVR before 1999")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?SECOND"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?TIME"), list(new SubLObject[]{ reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("greaterThan")), list(reader_make_constant_shell(makeString("DaysDuration")), makeInteger(30)), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("timeElapsedBetween-CCF")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?MEDICALLY-RELATED-EVENT")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("maxDateForEvent")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?SECOND")), list(reader_make_constant_shell(makeString("laterThan")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)), makeSymbol("?SECOND")) })))), list(makeString("What echocardiograms before 1999 occurred less than 30 days after what aortic valve replacements?")), makeKeyword("TEMPORAL")), list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?SECOND"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?TIME"), list(new SubLObject[]{ reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("greaterThan")), list(reader_make_constant_shell(makeString("DaysDuration")), makeInteger(30)), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("timeElapsedBetween-CCF")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?MEDICALLY-RELATED-EVENT")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("maxDateForEvent")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?SECOND")), list(reader_make_constant_shell(makeString("laterThan")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)), makeSymbol("?SECOND")) })))), list(makeString("What aortic valve replacements before 1999 occurred less than 30 days before what echocardiograms?")), makeKeyword("TEMPORAL")))), list(list(makeString("Echo less than 30 days after AVR after 1999")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?SECOND"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?TIME"), list(new SubLObject[]{ reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("greaterThan")), list(reader_make_constant_shell(makeString("DaysDuration")), makeInteger(30)), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("timeElapsedBetween-CCF")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?MEDICALLY-RELATED-EVENT")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("maxDateForEvent")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?SECOND")), list(reader_make_constant_shell(makeString("laterThan")), makeSymbol("?SECOND"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))) })))), list(makeString("What echocardiograms after 1999 occurred less than 30 days after what aortic valve replacements?")), makeKeyword("TEMPORAL")), list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?SECOND"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?TIME"), list(new SubLObject[]{ reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("greaterThan")), list(reader_make_constant_shell(makeString("DaysDuration")), makeInteger(30)), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("timeElapsedBetween-CCF")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?MEDICALLY-RELATED-EVENT")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("maxDateForEvent")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?SECOND")), list(reader_make_constant_shell(makeString("laterThan")), makeSymbol("?SECOND"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))) })))), list(makeString("What aortic valve replacements after 1999 occurred less than 30 days before what echocardiograms?")), makeKeyword("TEMPORAL")))), list(list(makeString("Echo less than 30 days after AVR between 1999 and 2005")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?TIME"), list(new SubLObject[]{ reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("temporallyBetween-Inclusive")), makeSymbol("?MEDICAL-TEST"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2005))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("greaterThan")), list(reader_make_constant_shell(makeString("DaysDuration")), makeInteger(30)), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("timeElapsedBetween-CCF")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?MEDICALLY-RELATED-EVENT")) }))), list(makeString("What echocardiograms between 1999 and 2005 occurred less than 30 days after what aortic valve replacements?")), makeKeyword("TEMPORAL")), list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?TIME"), list(new SubLObject[]{ reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("temporallyBetween-Inclusive")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2005))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-TEST"), reader_make_constant_shell(makeString("Echocardiogram"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("greaterThan")), list(reader_make_constant_shell(makeString("DaysDuration")), makeInteger(30)), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("timeElapsedBetween-CCF")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?TIME")), list(reader_make_constant_shell(makeString("after-CCF")), makeSymbol("?MEDICAL-TEST"), makeSymbol("?MEDICALLY-RELATED-EVENT")) }))), list(makeString("What aortic valve replacements between 1999 and 2005 occurred less than 30 days before what echocardiograms?")), makeKeyword("TEMPORAL")))), list(list(makeString("Who are the patients that underwent ligation of atrial appendage using staples between January 2000 and June 2004?")), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?ATRIAL-APPENDAGE-EXCLUSION"), reader_make_constant_shell(makeString("LeftAtrialAppendageExclusionUsingStaples-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?ATRIAL-APPENDAGE-EXCLUSION"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("temporallyBetween-Inclusive")), makeSymbol("?ATRIAL-APPENDAGE-EXCLUSION"), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000))), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("June")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))), list(makeString("What left atrial appendage exclusions using staples happened between January 2000 and June 2004?"), list(makeSymbol("?ATRIAL-APPENDAGE-EXCLUSION"), cons(ZERO_INTEGER, FOUR_INTEGER))), makeKeyword("TEMPORAL")))) });
    }

    @Override
    public void declareFunctions() {
        declare_cae_query_search_file();
    }

    @Override
    public void initializeVariables() {
        init_cae_query_search_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cae_query_search_file();
    }

    static {














































































































































































































































































































































































































































































































































































































































































































































    }

    public static final class $justified_interpretation_native extends SubLStructNative {
        public SubLObject $cycl;

        public SubLObject $words;

        public SubLObject $arg_records;

        private static final SubLStructDeclNative structDecl;

        public $justified_interpretation_native() {
            this.$cycl = Lisp.NIL;
            this.$words = Lisp.NIL;
            this.$arg_records = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$cycl;
        }

        @Override
        public SubLObject getField3() {
            return this.$words;
        }

        @Override
        public SubLObject getField4() {
            return this.$arg_records;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$cycl = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$words = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$arg_records = value;
        }

        static {
            structDecl = makeStructDeclNative(cae_query_search.$justified_interpretation_native.class, JUSTIFIED_INTERPRETATION, JUSTIFIED_INTERPRETATION_P, $list436, $list437, new String[]{ "$cycl", "$words", "$arg_records" }, $list438, $list439, JI_PRINT);
        }
    }

    public static final class $justified_interpretation_p$UnaryFunction extends UnaryFunction {
        public $justified_interpretation_p$UnaryFunction() {
            super(extractFunctionNamed("JUSTIFIED-INTERPRETATION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return justified_interpretation_p(arg1);
        }
    }

    public static final class $term_record_native extends SubLStructNative {
        public SubLObject $term;

        public SubLObject $word;

        public SubLObject $literal;

        private static final SubLStructDeclNative structDecl;

        public $term_record_native() {
            this.$term = Lisp.NIL;
            this.$word = Lisp.NIL;
            this.$literal = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$term;
        }

        @Override
        public SubLObject getField3() {
            return this.$word;
        }

        @Override
        public SubLObject getField4() {
            return this.$literal;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$term = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$word = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$literal = value;
        }

        static {
            structDecl = makeStructDeclNative(cae_query_search.$term_record_native.class, TERM_RECORD, TERM_RECORD_P, $list470, $list471, new String[]{ "$term", "$word", "$literal" }, $list472, $list473, TERM_RECORD_PRINT);
        }
    }

    public static final class $term_record_p$UnaryFunction extends UnaryFunction {
        public $term_record_p$UnaryFunction() {
            super(extractFunctionNamed("TERM-RECORD-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return term_record_p(arg1);
        }
    }

    public static final class $token_record_native extends SubLStructNative {
        public SubLObject $string;

        public SubLObject $denotations;

        public SubLObject $offset;

        public SubLObject $end;

        private static final SubLStructDeclNative structDecl;

        public $token_record_native() {
            this.$string = Lisp.NIL;
            this.$denotations = Lisp.NIL;
            this.$offset = Lisp.NIL;
            this.$end = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$string;
        }

        @Override
        public SubLObject getField3() {
            return this.$denotations;
        }

        @Override
        public SubLObject getField4() {
            return this.$offset;
        }

        @Override
        public SubLObject getField5() {
            return this.$end;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$string = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$denotations = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$offset = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$end = value;
        }

        static {
            structDecl = makeStructDeclNative(cae_query_search.$token_record_native.class, TOKEN_RECORD, TOKEN_RECORD_P, $list579, $list580, new String[]{ "$string", "$denotations", "$offset", "$end" }, $list581, $list582, PRINT_TOKEN_RECORD);
        }
    }

    public static final class $token_record_p$UnaryFunction extends UnaryFunction {
        public $token_record_p$UnaryFunction() {
            super(extractFunctionNamed("TOKEN-RECORD-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return token_record_p(arg1);
        }
    }
}

/**
 * Total time: 8795 ms synthetic
 */
