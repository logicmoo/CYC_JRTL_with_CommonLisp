package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_utilities.cb_fort_display_string;
import static com.cyc.cycjava.cycl.cfasl.$cfasl_common_symbols$;
import static com.cyc.cycjava.cycl.cfasl.$cfasl_input_guid_string_resource$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output_externalized;
import static com.cyc.cycjava.cycl.cfasl.cfasl_set_common_symbols;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.cyc_const_bounded_existential_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.designated_sentence;
import static com.cyc.cycjava.cycl.el_utilities.el_disjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.el_implication_p;
import static com.cyc.cycjava.cycl.el_utilities.explicitify_implicit_existential_quantifiers;
import static com.cyc.cycjava.cycl.el_utilities.explicitify_implicit_universal_quantifiers;
import static com.cyc.cycjava.cycl.el_utilities.groundP;
import static com.cyc.cycjava.cycl.el_utilities.implicitify_explicit_universal_quantifiers;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_implication;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.no_free_variablesP;
import static com.cyc.cycjava.cycl.el_utilities.possibly_cycl_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.cycjava.cycl.el_utilities.sequence_term;
import static com.cyc.cycjava.cycl.el_utilities.subl_escape_p;
import static com.cyc.cycjava.cycl.el_utilities.user_defined_sentential_relation_p;
import static com.cyc.cycjava.cycl.id_index.id_index_count;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_backslash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_underbar;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.alpha_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.alphanumericp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_code;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.booleanp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.numberp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.remf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_pretty$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_default_float_format$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.butler.alchemy_export;
import com.cyc.cycjava.cycl.inference.arete;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.kbq_query_run;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class folification extends SubLTranslatedFile {
    public static final SubLFile me = new folification();

    public static final String myName = "com.cyc.cycjava.cycl.folification";

    public static final String myFingerPrint = "13d07cc01e90991d17e52dbf8e5800515c329149b4219fa4d0d75436f3fa9c5c";

    // deflexical
    public static final SubLSymbol $folification_version$ = makeSymbol("*FOLIFICATION-VERSION*");

    // defparameter
    private static final SubLSymbol $fol_translation_type$ = makeSymbol("*FOL-TRANSLATION-TYPE*");

    // defparameter
    private static final SubLSymbol $fol_mt_handling$ = makeSymbol("*FOL-MT-HANDLING*");

    // defparameter
    // One of :unary-predicate, :isa
    private static final SubLSymbol $fol_isa_handling$ = makeSymbol("*FOL-ISA-HANDLING*");

    // defparameter
    /**
     * How to handle rule macro predicates: One of :gaf, :expansion,
     * :gaf-and-expansion
     */
    private static final SubLSymbol $fol_rmp_handling$ = makeSymbol("*FOL-RMP-HANDLING*");

    // defparameter
    /**
     * One of :allowed, :dwim-to-single-constant, :dwim-to-distinct-constants, :skip
     */
    private static final SubLSymbol $fol_string_handling$ = makeSymbol("*FOL-STRING-HANDLING*");

    // defparameter
    /**
     * One of :allowed, :dwim-floats-to-distinct-constants,
     * :dwim-all-to-distinct-constants
     */
    private static final SubLSymbol $fol_number_handling$ = makeSymbol("*FOL-NUMBER-HANDLING*");

    // deflexical
    // Terms that are explicitly forbidden to be converted to FOL.
    private static final SubLSymbol $unfolifiable_terms$ = makeSymbol("*UNFOLIFIABLE-TERMS*");

    // deflexical
    // COUNT assertion(s) could not be converted to FOL because it/they...
    private static final SubLSymbol $folification_unhandled_explanation_table$ = makeSymbol("*FOLIFICATION-UNHANDLED-EXPLANATION-TABLE*");

    // deflexical
    // The list of possible FOL output formats
    private static final SubLSymbol $fol_output_formats$ = makeSymbol("*FOL-OUTPUT-FORMATS*");

    // defparameter
    // If non-nil, will use this name for the conjecture instead of a number.
    public static final SubLSymbol $tptp_query_name$ = makeSymbol("*TPTP-QUERY-NAME*");

    // defparameter
    // If non-nil, will prefix all axiom ids with this string.
    public static final SubLSymbol $tptp_axiom_prefix$ = makeSymbol("*TPTP-AXIOM-PREFIX*");

    // defparameter
    private static final SubLSymbol $tptp_axiom_count$ = makeSymbol("*TPTP-AXIOM-COUNT*");

    // defparameter
    private static final SubLSymbol $candidate_sentence_count$ = makeSymbol("*CANDIDATE-SENTENCE-COUNT*");

    // defparameter
    private static final SubLSymbol $handled_sentence_count$ = makeSymbol("*HANDLED-SENTENCE-COUNT*");

    // defparameter
    private static final SubLSymbol $term_count$ = makeSymbol("*TERM-COUNT*");

    // defparameter
    private static final SubLSymbol $handled_term_count$ = makeSymbol("*HANDLED-TERM-COUNT*");

    // defparameter
    private static final SubLSymbol $partially_handled_term_count$ = makeSymbol("*PARTIALLY-HANDLED-TERM-COUNT*");

    // defparameter
    private static final SubLSymbol $unhandled_term_count$ = makeSymbol("*UNHANDLED-TERM-COUNT*");

    // defparameter
    // This is only used to handle HL variables in assertion objects.
    private static final SubLSymbol $fol_current_assertion$ = makeSymbol("*FOL-CURRENT-ASSERTION*");







    // defparameter
    // The minimum length that a symbol must be to be considered too long
    private static final SubLSymbol $tptp_long_symbol_min_length$ = makeSymbol("*TPTP-LONG-SYMBOL-MIN-LENGTH*");

    // defparameter
    private static final SubLSymbol $include_alchemy_commentsP$ = makeSymbol("*INCLUDE-ALCHEMY-COMMENTS?*");

    // defparameter
    /**
     * indicates that the Alchemy export process will output a period for monotonic
     * rules, preventing weight-learning.
     */
    public static final SubLSymbol $alchemy_output_monotonic_rule_indicator$ = makeSymbol("*ALCHEMY-OUTPUT-MONOTONIC-RULE-INDICATOR*");

    // defparameter
    private static final SubLSymbol $categorize_fol_predicates$ = makeSymbol("*CATEGORIZE-FOL-PREDICATES*");

    // defparameter
    private static final SubLSymbol $categorize_fol_functions$ = makeSymbol("*CATEGORIZE-FOL-FUNCTIONS*");

    // defparameter
    private static final SubLSymbol $categorize_fol_terms$ = makeSymbol("*CATEGORIZE-FOL-TERMS*");



    // deflexical
    public static final SubLSymbol $deepak_folification_properties$ = makeSymbol("*DEEPAK-FOLIFICATION-PROPERTIES*");

    // deflexical
    /**
     * Queries used in the first FOLification paper: First-Orderized ResearchCyc :
     * Expressivity and Efficiency in a Common-Sense Ontology
     */
    private static final SubLSymbol $deepak_queries$ = makeSymbol("*DEEPAK-QUERIES*");

    // deflexical
    // Queries used in the second FOLification paper
    private static final SubLSymbol $deepak_queries_2$ = makeSymbol("*DEEPAK-QUERIES-2*");

    // Internal Constants
    public static final SubLString $str0$0_7_2 = makeString("0.7.2");



    public static final SubLList $list2 = list(makeKeyword("REGULAR-FOL"), makeKeyword("SET-THEORY"));

    private static final SubLSymbol $MT_VISIBLE_EXCEPT_CORE_MTS = makeKeyword("MT-VISIBLE-EXCEPT-CORE-MTS");

    public static final SubLList $list4 = list(makeKeyword("MT-VISIBLE"), makeKeyword("MT-VISIBLE-EXCEPT-CORE-MTS"), makeKeyword("MT-ARGUMENT"), makeKeyword("FLAT"));





    public static final SubLList $list7 = list(makeKeyword("UNARY-PREDICATE"), makeKeyword("ISA"));



    public static final SubLList $list9 = list(makeKeyword("GAF"), makeKeyword("EXPANSION"), makeKeyword("GAF-AND-EXPANSION"));



    public static final SubLList $list11 = list(makeKeyword("ALLOWED"), makeKeyword("DWIM-TO-SINGLE-CONSTANT"), makeKeyword("DWIM-TO-DISTINCT-CONSTANTS"), makeKeyword("SKIP"));

    private static final SubLSymbol $DWIM_FLOATS_TO_DISTINCT_CONSTANTS = makeKeyword("DWIM-FLOATS-TO-DISTINCT-CONSTANTS");

    public static final SubLList $list13 = list(makeKeyword("ALLOWED"), makeKeyword("DWIM-FLOATS-TO-DISTINCT-CONSTANTS"), makeKeyword("DWIM-ALL-TO-DISTINCT-CONSTANTS"));

    public static final SubLList $list14 = list(new SubLObject[]{ reader_make_constant_shell(makeString("Quote")), reader_make_constant_shell(makeString("EscapeQuote")), reader_make_constant_shell(makeString("QuasiQuote")), reader_make_constant_shell(makeString("SubLQuoteFn")), reader_make_constant_shell(makeString("ExpandSubLFn")), reader_make_constant_shell(makeString("completeExtentEnumerable")), reader_make_constant_shell(makeString("completelyEnumerableCollection")), reader_make_constant_shell(makeString("unknownSentence")), reader_make_constant_shell(makeString("evaluate")), reader_make_constant_shell(makeString("Nothing")), reader_make_constant_shell(makeString("CollectionDifferenceFn")), reader_make_constant_shell(makeString("reformulatorEquiv")) });

    public static final SubLList $list15 = list(new SubLObject[]{ makeKeyword("VARIABLE-ARITY-PREDICATE"), makeString("contained a variable-arity predicate with a maximum arity."), makeKeyword("VARIABLE-ARITY-FUNCTION"), makeString("contained a variable-arity function with a maximum arity."), makeKeyword("UNBOUNDED-ARITY-PREDICATE"), makeString("contained a variable-arity predicate with an unbounded arity."), makeKeyword("UNBOUNDED-ARITY-FUNCTION"), makeString("contained a variable-arity function with an unbounded arity."), makeKeyword("META-SENTENCE"), makeString("contained an embedded sentence used as a term."), makeKeyword("META-ASSERTION"), makeString("contained an embedded assertion used as a term."), makeKeyword("META-VARIABLE"), makeString("contained a meta-variable."), makeKeyword("SUBL-ESCAPE"), makeString("contained an escape to SubL (a hook into the underlying implentation language)"), makeKeyword("FUNCTION-ARG-CONSTRAINT"), makeString("expressed an argument constraint on a function, for which there is currently no FOL translation."), makeKeyword("FUNCTION-QUANTIFICATION"), makeString("quantified over functions."), makeKeyword("PREDICATE-QUANTIFICATION"), makeString("quantified over predicates."), makeKeyword("COLLECTION-QUANTIFICATION"), makeString("quantified into a collection, which is like quantifying over predicates."), makeKeyword("SEQUENCE-VAR"), makeString("contained a sequence variable"), makeKeyword("IST"), makeString("used the predicate #$ist, which is used to do quantification across contexts or contextual lifting."), makeKeyword("ILL-FORMED"), makeString("were ill-formed.  This illustrates a problem with the Cyc KB itself, not with the Cyc -> FOL conversion."), makeKeyword("NONSTANDARD-SENTENTIAL-RELATION"), makeString("contained a bounded existential, or a user-defined logical operator or quantifier"), makeKeyword("EXPANSION"), makeString("had an expansion that could not be translated"), makeKeyword("KAPPA"), makeString("contained Kappa, a predicate-denoting function"), makeKeyword("LAMBDA"), makeString("contained Lambda, a function-denoting function"), makeKeyword("EXPLICITLY-FORBIDDEN-TERM"), makeString("contained an explicitly forbidden term, function, or predicate") });

    public static final SubLList $list16 = list(makeKeyword("TPTP"), makeKeyword("CYCL"), makeKeyword("ALCHEMY"));



    private static final SubLSymbol $CANDIDATE_FOL_SENTENCE_COUNT = makeKeyword("CANDIDATE-FOL-SENTENCE-COUNT");

    private static final SubLSymbol $FOL_SENTENCE_COUNT = makeKeyword("FOL-SENTENCE-COUNT");



    private static final SubLSymbol $HANDLED_TERM_COUNT = makeKeyword("HANDLED-TERM-COUNT");

    private static final SubLSymbol $PARTIALLY_HANDLED_TERM_COUNT = makeKeyword("PARTIALLY-HANDLED-TERM-COUNT");

    private static final SubLSymbol $UNHANDLED_TERM_COUNT = makeKeyword("UNHANDLED-TERM-COUNT");

    private static final SubLSymbol $FOL_SENTENCES_DATA = makeKeyword("FOL-SENTENCES-DATA");









    private static final SubLString $$$cyc = makeString("cyc");







    private static final SubLList $list33 = list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("TRANSLATION-TYPE"), makeSymbol("MT-HANDLING"), makeSymbol("MT-CEILING"), makeSymbol("ISA-HANDLING"), makeSymbol("RULE-MACRO-PREDICATE-HANDLING"), makeSymbol("STRING-HANDLING"), makeSymbol("NUMBER-HANDLING"), makeSymbol("ALLOW-EQUIV-RELATION?"), list(makeSymbol("SAMPLE-RATE"), ONE_INTEGER), makeSymbol("OUTPUT-FILENAME"), makeSymbol("OUTPUT-FORMAT"), makeSymbol("HEADER"), makeSymbol("ANALYSIS-FILENAME"), makeSymbol("ANALYSIS-FILE-INTERNAL?"), makeSymbol("INCLUDE-COMMENTS?"), makeSymbol("RETURN-DATA?"), list(makeSymbol("NEGATE-QUERIES?"), T), list(makeSymbol("VERBOSE?"), T) });

    private static final SubLList $list34 = list(new SubLObject[]{ makeKeyword("TRANSLATION-TYPE"), makeKeyword("MT-HANDLING"), makeKeyword("MT-CEILING"), makeKeyword("ISA-HANDLING"), makeKeyword("RULE-MACRO-PREDICATE-HANDLING"), makeKeyword("STRING-HANDLING"), makeKeyword("NUMBER-HANDLING"), makeKeyword("ALLOW-EQUIV-RELATION?"), makeKeyword("SAMPLE-RATE"), makeKeyword("OUTPUT-FILENAME"), makeKeyword("OUTPUT-FORMAT"), makeKeyword("HEADER"), makeKeyword("ANALYSIS-FILENAME"), makeKeyword("ANALYSIS-FILE-INTERNAL?"), makeKeyword("INCLUDE-COMMENTS?"), makeKeyword("RETURN-DATA?"), makeKeyword("NEGATE-QUERIES?"), makeKeyword("VERBOSE?") });

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");









    private static final SubLSymbol $RULE_MACRO_PREDICATE_HANDLING = makeKeyword("RULE-MACRO-PREDICATE-HANDLING");





    private static final SubLSymbol $kw43$ALLOW_EQUIV_RELATION_ = makeKeyword("ALLOW-EQUIV-RELATION?");







    private static final SubLSymbol $kw47$ANALYSIS_FILE_INTERNAL_ = makeKeyword("ANALYSIS-FILE-INTERNAL?");

    private static final SubLSymbol $kw48$INCLUDE_COMMENTS_ = makeKeyword("INCLUDE-COMMENTS?");

    private static final SubLSymbol $kw49$RETURN_DATA_ = makeKeyword("RETURN-DATA?");

    private static final SubLSymbol $kw50$NEGATE_QUERIES_ = makeKeyword("NEGATE-QUERIES?");





    private static final SubLString $str53$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $$$Converting_assertions_to_FOL = makeString("Converting assertions to FOL");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $str58$failed_to_translate__s__ = makeString("failed to translate ~s~%");

    private static final SubLString $$$Converting_sentences_to_FOL = makeString("Converting sentences to FOL");

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    private static final SubLString $str61$failed_to_translate__s = makeString("failed to translate ~s");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLString $$$Converting_forts_to_FOL = makeString("Converting forts to FOL");







    private static final SubLString $str68$Expected_a_fol_sentences_analysis = makeString("Expected a fol-sentences-analysis as the first loaded item");





    private static final SubLString $str71$expected_to_input_a_cons__got__s = makeString("expected to input a cons, got ~s");





    private static final SubLString $str74$Unrecognized_output_format___s = makeString("Unrecognized output format: ~s");

    private static final SubLString $$$Gathering_FOL_symbols = makeString("Gathering FOL symbols");

    public static final SubLList $list76 = list(makeSymbol("TERM"), makeSymbol("FOL-SENTENCES"), makeSymbol("&OPTIONAL"), makeSymbol("UNHANDLED-FOL-SENTENCES"));

    private static final SubLSymbol FOL_REPRESENTED_TERM_P = makeSymbol("FOL-REPRESENTED-TERM-P");

    public static final SubLList $list78 = list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("TRANSLATION-TYPE"), makeSymbol("MT-HANDLING"), makeSymbol("MT-CEILING"), makeSymbol("ISA-HANDLING"), makeSymbol("RULE-MACRO-PREDICATE-HANDLING"), makeSymbol("STRING-HANDLING"), makeSymbol("NUMBER-HANDLING"), makeSymbol("ALLOW-EQUIV-RELATION?"), list(makeSymbol("SAMPLE-RATE"), ONE_INTEGER), makeSymbol("OUTPUT-FILENAME"), makeSymbol("OUTPUT-FORMAT"), makeSymbol("HEADER"), makeSymbol("INCLUDE-COMMENTS?"), list(makeSymbol("NEGATE-QUERIES?"), T), list(makeSymbol("VERBOSE?"), T) });

    private static final SubLList $list79 = list(new SubLObject[]{ makeKeyword("TRANSLATION-TYPE"), makeKeyword("MT-HANDLING"), makeKeyword("MT-CEILING"), makeKeyword("ISA-HANDLING"), makeKeyword("RULE-MACRO-PREDICATE-HANDLING"), makeKeyword("STRING-HANDLING"), makeKeyword("NUMBER-HANDLING"), makeKeyword("ALLOW-EQUIV-RELATION?"), makeKeyword("SAMPLE-RATE"), makeKeyword("OUTPUT-FILENAME"), makeKeyword("OUTPUT-FORMAT"), makeKeyword("HEADER"), makeKeyword("INCLUDE-COMMENTS?"), makeKeyword("NEGATE-QUERIES?"), makeKeyword("VERBOSE?") });

    private static final SubLList $list80 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));



    private static final SubLObject $$genlMt = reader_make_constant_shell(makeString("genlMt"));

    private static final SubLSymbol $sym83$_MT = makeSymbol("?MT");



    private static final SubLObject $$mtVisible = reader_make_constant_shell(makeString("mtVisible"));



    private static final SubLString $str87$Queries_not_supported_for_Alchemy = makeString("Queries not supported for Alchemy format.");

    private static final SubLSymbol $kw88$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");

    private static final SubLString $str89$can_t_handle_conditional_sentence = makeString("can't handle conditional sentences~%");



    private static final SubLSymbol FOL_TRANSLATION_TYPE_PROPERTY_P = makeSymbol("FOL-TRANSLATION-TYPE-PROPERTY-P");

    private static final SubLSymbol FOL_MT_HANDLING_PROPERTY_P = makeSymbol("FOL-MT-HANDLING-PROPERTY-P");



    private static final SubLSymbol FOL_ISA_HANDLING_PROPERTY_P = makeSymbol("FOL-ISA-HANDLING-PROPERTY-P");

    private static final SubLSymbol FOL_RMP_HANDLING_PROPERTY_P = makeSymbol("FOL-RMP-HANDLING-PROPERTY-P");

    private static final SubLSymbol FOL_STRING_HANDLING_PROPERTY_P = makeSymbol("FOL-STRING-HANDLING-PROPERTY-P");

    private static final SubLSymbol FOL_NUMBER_HANDLING_PROPERTY_P = makeSymbol("FOL-NUMBER-HANDLING-PROPERTY-P");





    private static final SubLSymbol FILE_VALID_FOR_WRITING_P = makeSymbol("FILE-VALID-FOR-WRITING-P");

    private static final SubLSymbol FOL_OUTPUT_FORMAT_P = makeSymbol("FOL-OUTPUT-FORMAT-P");



    private static final SubLSymbol $GAF_AND_EXPANSION = makeKeyword("GAF-AND-EXPANSION");

    private static final SubLObject $$resultIsaArg = reader_make_constant_shell(makeString("resultIsaArg"));

    private static final SubLObject $$RelationAllExistsFn = reader_make_constant_shell(makeString("RelationAllExistsFn"));

    public static final SubLList $list106 = list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?TERM"), makeSymbol("?INDEP-COL")), list(reader_make_constant_shell(makeString("relationAllExists")), makeSymbol("?PRED"), makeSymbol("?INDEP-COL"), makeSymbol("?DEP-COL"))), list(reader_make_constant_shell(makeString("isa")), list(reader_make_constant_shell(makeString("RelationAllExistsFn")), makeSymbol("?TERM"), makeSymbol("?PRED"), makeSymbol("?INDEP-COL"), makeSymbol("?DEP-COL")), makeSymbol("?DEP-COL")));

    private static final SubLObject $$RelationExistsAllFn = reader_make_constant_shell(makeString("RelationExistsAllFn"));

    private static final SubLList $list108 = list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?TERM"), makeSymbol("?INDEP-COL")), list(reader_make_constant_shell(makeString("relationExistsAll")), makeSymbol("?PRED"), makeSymbol("?DEP-COL"), makeSymbol("?INDEP-COL"))), list(reader_make_constant_shell(makeString("isa")), list(reader_make_constant_shell(makeString("RelationExistsAllFn")), makeSymbol("?TERM"), makeSymbol("?PRED"), makeSymbol("?DEP-COL"), makeSymbol("?INDEP-COL")), makeSymbol("?DEP-COL")));

    private static final SubLSymbol $EXPLICITLY_FORBIDDEN_TERM = makeKeyword("EXPLICITLY-FORBIDDEN-TERM");

    private static final SubLSymbol $sym110$FOL_EXPANDIBLE_EXPRESSION_ = makeSymbol("FOL-EXPANDIBLE-EXPRESSION?");

    private static final SubLSymbol FOL_EXPAND_ONE_STEP = makeSymbol("FOL-EXPAND-ONE-STEP");

    private static final SubLObject $$expansion = reader_make_constant_shell(makeString("expansion"));

    private static final SubLList $list113 = list(makeSymbol("COLLAPSE"), makeSymbol("THEORY-MT"));

    private static final SubLSymbol $NOT_IN_THEORY = makeKeyword("NOT-IN-THEORY");

    private static final SubLSymbol FOL_UNHANDLED_EXPRESSION_P = makeSymbol("FOL-UNHANDLED-EXPRESSION-P");

    private static final SubLList $list116 = list(makeSymbol("FOL-UNHANDLED-FN"), makeSymbol("REASON"), makeSymbol("CULPRIT"));

    private static final SubLString $str117$___a__ = makeString("~%~a~%");

    private static final SubLString $$$FOLification_statistics = makeString("FOLification statistics");

    private static final SubLString $str119$_a__ = makeString("~a~%");

    private static final SubLString $str120$_______________________ = makeString("-----------------------");

    private static final SubLString $str121$Rejection_statistics__raw__ = makeString("Rejection statistics (raw):");

    private static final SubLString $str122$Rejection_statistics__pretty__ = makeString("Rejection statistics (pretty):");

    private static final SubLString $str123$Conversion_statistics_ = makeString("Conversion statistics:");

    private static final SubLSymbol $sym124$_ = makeSymbol(">");

    private static final SubLList $list125 = cons(makeSymbol("REASON"), makeSymbol("COUNT"));

    private static final SubLString $str126$_s_assertion_p_could_not_be_conve = makeString("~s assertion~p could not be converted to FOL because ~a ~a~%");

    private static final SubLString $$$it = makeString("it");

    private static final SubLString $$$they = makeString("they");

    private static final SubLString $$$yielded_the_rejection_condition_ = makeString("yielded the rejection condition ");

    private static final SubLObject $$FOL_UnhandledFn = reader_make_constant_shell(makeString("FOL-UnhandledFn"));

    public static final SubLList $list131 = cons(makeSymbol("PREDICATE"), makeSymbol("ARGS"));

    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));

    public static final SubLList $list133 = list(makeSymbol("ARG1"), makeSymbol("ARG2"));

    private static final SubLObject $$negationPreds = reader_make_constant_shell(makeString("negationPreds"));

    private static final SubLList $list135 = list(NIL);

    private static final SubLObject $$arg1Isa = reader_make_constant_shell(makeString("arg1Isa"));

    private static final SubLObject $$arg2Isa = reader_make_constant_shell(makeString("arg2Isa"));

    private static final SubLObject $$arg3Isa = reader_make_constant_shell(makeString("arg3Isa"));

    private static final SubLObject $$arg4Isa = reader_make_constant_shell(makeString("arg4Isa"));

    private static final SubLObject $$arg5Isa = reader_make_constant_shell(makeString("arg5Isa"));

    private static final SubLObject $$arg6Isa = reader_make_constant_shell(makeString("arg6Isa"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$arg1Genl = reader_make_constant_shell(makeString("arg1Genl"));

    private static final SubLObject $$arg2Genl = reader_make_constant_shell(makeString("arg2Genl"));

    private static final SubLObject $$arg3Genl = reader_make_constant_shell(makeString("arg3Genl"));

    private static final SubLObject $$arg4Genl = reader_make_constant_shell(makeString("arg4Genl"));

    private static final SubLObject $$arg5Genl = reader_make_constant_shell(makeString("arg5Genl"));

    private static final SubLObject $$arg6Genl = reader_make_constant_shell(makeString("arg6Genl"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLObject $$resultIsa = reader_make_constant_shell(makeString("resultIsa"));

    private static final SubLObject $$resultGenl = reader_make_constant_shell(makeString("resultGenl"));

    private static final SubLObject $$disjointWith = reader_make_constant_shell(makeString("disjointWith"));

    private static final SubLObject $$genlInverse = reader_make_constant_shell(makeString("genlInverse"));

    private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));

    private static final SubLList $list155 = list(makeSymbol("PRED"), makeSymbol("COL"));

    private static final SubLSymbol $FUNCTION_ARG_CONSTRAINT = makeKeyword("FUNCTION-ARG-CONSTRAINT");



    private static final SubLSymbol $NONSTANDARD_SENTENTIAL_RELATION = makeKeyword("NONSTANDARD-SENTENTIAL-RELATION");



    private static final SubLList $list160 = list(makeSymbol("FUNC"), makeSymbol("COL"));

    private static final SubLSymbol FOL_SEQUENCE_VARIABLE_ARGS_FOR_ARITY = makeSymbol("FOL-SEQUENCE-VARIABLE-ARGS-FOR-ARITY");

    private static final SubLString $$$ARG = makeString("ARG");

    private static final SubLSymbol $fol_sequence_variable_args_for_arity_caching_state$ = makeSymbol("*FOL-SEQUENCE-VARIABLE-ARGS-FOR-ARITY-CACHING-STATE*");

    private static final SubLObject $$equiv = reader_make_constant_shell(makeString("equiv"));

    private static final SubLList $list165 = list(reader_make_constant_shell(makeString("FOL-PredicateFn")), reader_make_constant_shell(makeString("isa")), TWO_INTEGER);

    private static final SubLSymbol $sym166$_X = makeSymbol("?X");

    private static final SubLObject $$FOL_PredicateFn = reader_make_constant_shell(makeString("FOL-PredicateFn"));

    public static final SubLList $list168 = list(ONE_INTEGER);

    private static final SubLList $list169 = list(makeSymbol("?X"));

    private static final SubLObject $$implies = reader_make_constant_shell(makeString("implies"));

    public static final SubLList $list171 = list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(list(reader_make_constant_shell(makeString("FOL-PredicateFn")), reader_make_constant_shell(makeString("mtVisible")), ONE_INTEGER), makeSymbol("?SPEC-MT")), list(list(reader_make_constant_shell(makeString("FOL-PredicateFn")), reader_make_constant_shell(makeString("genlMt")), TWO_INTEGER), makeSymbol("?SPEC-MT"), makeSymbol("?GENL-MT"))), list(list(reader_make_constant_shell(makeString("FOL-PredicateFn")), reader_make_constant_shell(makeString("mtVisible")), ONE_INTEGER), makeSymbol("?GENL-MT")));

    public static final SubLList $list172 = list(makeKeyword("MT-VISIBLE"), makeKeyword("MT-VISIBLE-EXCEPT-CORE-MTS"));

    public static final SubLList $list173 = list(reader_make_constant_shell(makeString("FOL-PredicateFn")), reader_make_constant_shell(makeString("mtVisible")), ONE_INTEGER);

    private static final SubLList $list174 = list(list(makeSymbol("GAF-VAR"), makeSymbol("ARGNUM-VAR"), makeSymbol("PRED")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym175$ARGNUM_1 = makeUninternedSymbol("ARGNUM-1");

    private static final SubLSymbol $sym176$ARG_ISA_PRED = makeUninternedSymbol("ARG-ISA-PRED");

    private static final SubLSymbol $sym177$ARITY = makeUninternedSymbol("ARITY");



    private static final SubLSymbol FIXED_ARITY_PREDICATE_P = makeSymbol("FIXED-ARITY-PREDICATE-P");







    private static final SubLSymbol $sym183$1_ = makeSymbol("1+");

    private static final SubLSymbol ARG_ISA_PRED = makeSymbol("ARG-ISA-PRED");





    private static final SubLList $list187 = list(makeKeyword("INDEX"), ONE_INTEGER, makeKeyword("TRUTH"), makeKeyword("TRUE"));



    private static final SubLSymbol $sym189$_INS = makeSymbol("?INS");

    public static final SubLList $list190 = list(makeSymbol("?X"), makeSymbol("?Y"));

    public static final SubLList $list191 = list(makeSymbol("?Y"), makeSymbol("?Z"));

    public static final SubLList $list192 = list(makeSymbol("?X"), makeSymbol("?Z"));

    public static final SubLList $list193 = list(makeSymbol("?Y"), makeSymbol("?X"));

    private static final SubLList $list194 = list(makeSymbol("?X"), makeSymbol("?X"));

    private static final SubLObject $$transitiveViaArg = reader_make_constant_shell(makeString("transitiveViaArg"));

    private static final SubLObject $$transitiveViaArgInverse = reader_make_constant_shell(makeString("transitiveViaArgInverse"));

    public static final SubLList $list197 = list(makeSymbol("?OLD"), makeSymbol("?NEW"));

    private static final SubLList $list198 = list(makeSymbol("?NEW"), makeSymbol("?OLD"));

    private static final SubLSymbol $sym199$_OLD = makeSymbol("?OLD");

    private static final SubLSymbol $sym200$_NEW = makeSymbol("?NEW");

    private static final SubLObject $$natFunction = reader_make_constant_shell(makeString("natFunction"));

    private static final SubLObject $$natArgument = reader_make_constant_shell(makeString("natArgument"));





    private static final SubLObject $$different = reader_make_constant_shell(makeString("different"));

    private static final SubLSymbol FOL_TRANSFORM_ARG = makeSymbol("FOL-TRANSFORM-ARG");

    private static final SubLObject $$equals = reader_make_constant_shell(makeString("equals"));

    private static final SubLList $list208 = list(makeSymbol("NEW-ARG1"), makeSymbol("NEW-ARG2"));



    private static final SubLList $list210 = list(makeSymbol("TERM"), makeSymbol("COL"));









    private static final SubLObject $$memberOfSet = reader_make_constant_shell(makeString("memberOfSet"));

    private static final SubLObject $$SetifyArgumentFn = reader_make_constant_shell(makeString("SetifyArgumentFn"));

    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));



    private static final SubLList $list219 = list(reader_make_constant_shell(makeString("equals")), reader_make_constant_shell(makeString("equalSymbols")));



    private static final SubLSymbol $VARIABLE_ARITY_PREDICATE = makeKeyword("VARIABLE-ARITY-PREDICATE");

    private static final SubLSymbol $UNBOUNDED_ARITY_PREDICATE = makeKeyword("UNBOUNDED-ARITY-PREDICATE");



    private static final SubLObject $$Kappa = reader_make_constant_shell(makeString("Kappa"));











    private static final SubLSymbol $VARIABLE_ARITY_FUNCTION = makeKeyword("VARIABLE-ARITY-FUNCTION");

    private static final SubLSymbol $UNBOUNDED_ARITY_FUNCTION = makeKeyword("UNBOUNDED-ARITY-FUNCTION");



    private static final SubLObject $$Lambda = reader_make_constant_shell(makeString("Lambda"));



    private static final SubLObject $$FOL_AtomicTermFn = reader_make_constant_shell(makeString("FOL-AtomicTermFn"));



    private static final SubLObject $$FOL_FunctionFn = reader_make_constant_shell(makeString("FOL-FunctionFn"));

    private static final SubLObject $$FOL_StringFn = reader_make_constant_shell(makeString("FOL-StringFn"));

    private static final SubLSymbol $DWIM_TO_DISTINCT_CONSTANTS = makeKeyword("DWIM-TO-DISTINCT-CONSTANTS");

    private static final SubLObject $$FOL_StringConstantFn = reader_make_constant_shell(makeString("FOL-StringConstantFn"));

    private static final SubLSymbol $DWIM_TO_SINGLE_CONSTANT = makeKeyword("DWIM-TO-SINGLE-CONSTANT");

    private static final SubLObject $const242$Canonical_String = reader_make_constant_shell(makeString("Canonical_String"));

    private static final SubLString $str243$unexpected_string_handling_direct = makeString("unexpected string handling directive ~s");



    private static final SubLObject $$FOL_NumberFn = reader_make_constant_shell(makeString("FOL-NumberFn"));

    private static final SubLObject $$FOL_NumberConstantFn = reader_make_constant_shell(makeString("FOL-NumberConstantFn"));

    private static final SubLSymbol $DWIM_ALL_TO_DISTINCT_CONSTANTS = makeKeyword("DWIM-ALL-TO-DISTINCT-CONSTANTS");

    private static final SubLString $str248$unexpected_number_handling_direct = makeString("unexpected number handling directive ~s");

    private static final SubLSymbol $sym249$EL_VAR_ = makeSymbol("EL-VAR?");

    public static final SubLList $list250 = list(makeSymbol("PREDICATES"), makeSymbol("ARGUMENTS"));

    private static final SubLList $list251 = cons(makeSymbol("FOL-PREDICATE"), makeSymbol("FOL-ARGS"));

    private static final SubLSymbol $sym252$FOL_ATOMIC_SENTENCE_ = makeSymbol("FOL-ATOMIC-SENTENCE?");

    private static final SubLString $str253$______S = makeString("~%;; ~S");

    private static final SubLString $str254$_____QUERY_ = makeString("~%;; QUERY:");

    private static final SubLString $str255$__Cyc_Assertion___a___ = makeString("% Cyc Assertion #~a:~%");

    private static final SubLString $str256$__Cyc_NART___a___ = makeString("% Cyc NART #~a:~%");

    private static final SubLString $str257$__Cyc_Constant___a___ = makeString("% Cyc Constant #~a:~%");

    private static final SubLString $str258$__CycL_Sentence___a___ = makeString("% CycL Sentence: ~a:~%");

    private static final SubLString $str259$Unexpected_object__s = makeString("Unexpected object ~s");

    private static final SubLString $str260$_________________________________ = makeString("%--------------------------------------------------------------------------\n");

    private static final SubLString $$$File = makeString("File");

    private static final SubLString $str262$CYC_10___TPTP_v2_2_0__Released_2_ = makeString("CYC-10 : TPTP v2.2.0. Released 2.2.0. ");

    private static final SubLString $$$Domain = makeString("Domain");

    private static final SubLString $str264$Knowledge_Representation_Common_S = makeString("Knowledge Representation(Common-Sense Reasoning)");

    private static final SubLString $$$Problem = makeString("Problem");

    private static final SubLString $str266$Reasoning_with_the_Cyc_Common_Sen = makeString("Reasoning with the Cyc Common Sense KB");

    private static final SubLString $$$Version = makeString("Version");

    public static final SubLString $$$English = makeString("English");

    public static final SubLString $str269$The_Cyc_KB_contains_assertions_fo = makeString("The Cyc KB contains assertions for reasoning with Common Sense mainly in FOL but with some extensions.");

    public static final SubLString $$$Refs = makeString("Refs");

    public static final SubLString $str271$ = makeString("");

    public static final SubLString $$$Source = makeString("Source");

    public static final SubLString $$$Names = makeString("Names");

    public static final SubLString $$$Status = makeString("Status");

    public static final SubLString $$$unknown = makeString("unknown");

    public static final SubLString $$$Rating = makeString("Rating");

    public static final SubLString $str277$1_0 = makeString("1.0");

    public static final SubLString $$$Syntax = makeString("Syntax");

    public static final SubLString $str279$_blank_ = makeString("<blank>");

    public static final SubLString $$$Comments = makeString("Comments");

    public static final SubLString $str281$To_obtain_a_First_Orderification_ = makeString("To obtain a First Orderification of the ResearchCyc KB a number of non-trivial transformations were performed.\n% See First-Orderized ResearchCyc: Expressivity and Efficiency in a Common-Sense Ontology (2005) [Ramachandran, Reagan, Goolsbey] for details.\n% \n% Copyright (c)2003-2011 by Cycorp, Inc.\n% All rights reserved.\n% Use outside of Cycorp subject to separate license terms.\n%");

    public static final SubLString $$$Bugfixes = makeString("Bugfixes");

    public static final SubLString $str283$_________________________________ = makeString("%-----------------------------------------\n");

    private static final SubLSymbol $sym284$_EXIT = makeSymbol("%EXIT");

    private static final SubLString $str285$__ = makeString("% ");

    private static final SubLString $str286$___ = makeString(" : ");

    private static final SubLString $str287$_ = makeString("\n");

    private static final SubLString $str288$__ = makeString("%\n");

    private static final SubLString $str289$__ = makeString(": ");

    private static final SubLSymbol $sym290$TPTP_PROPERTY_APPROPRIATE_FOR_PRINTING_ = makeSymbol("TPTP-PROPERTY-APPROPRIATE-FOR-PRINTING?");

    private static final SubLSymbol COMPUTE_TPTP_QUERY_INDEX_NUMBER = makeSymbol("COMPUTE-TPTP-QUERY-INDEX-NUMBER");

    private static final SubLSymbol $compute_tptp_query_index_number_caching_state$ = makeSymbol("*COMPUTE-TPTP-QUERY-INDEX-NUMBER-CACHING-STATE*");

    private static final SubLString $str293$fof__a_axiom_ = makeString("fof(~a,axiom,");

    private static final SubLString $str294$____ = makeString(").~%");

    private static final SubLString $str295$fof__a_conjecture_ = makeString("fof(~a,conjecture,");

    private static final SubLList $list296 = cons(makeSymbol("OPERATOR"), makeSymbol("ARGS"));

    private static final SubLList $list297 = list(makeSymbol("ANTECEDENT"), makeSymbol("CONSEQUENT"));

    private static final SubLString $str298$_ = makeString("(");

    private static final SubLString $str299$____ = makeString(" => ");

    private static final SubLString $str300$_ = makeString(")");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLString $str302$___ = makeString(" & ");

    private static final SubLObject $$or = reader_make_constant_shell(makeString("or"));

    private static final SubLString $str304$___ = makeString(" | ");

    private static final SubLObject $$not = reader_make_constant_shell(makeString("not"));

    private static final SubLString $str306$__ = makeString("(~");

    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));

    private static final SubLList $list308 = list(makeSymbol("EL-VAR"), makeSymbol("FOL-SUBSENTENCE"));

    private static final SubLString $str309$_____a____ = makeString("(? [~a] : ");

    private static final SubLObject $$forAll = reader_make_constant_shell(makeString("forAll"));

    private static final SubLString $str311$_____a____ = makeString("(! [~a] : ");

    private static final SubLObject $$equalSymbols = reader_make_constant_shell(makeString("equalSymbols"));

    private static final SubLString $str313$___ = makeString(" = ");

    private static final SubLString $str314$_ = makeString(",");

    private static final SubLString $str315$__ = makeString("))");

    private static final SubLString $str316$unexpected_FOL_term__s = makeString("unexpected FOL term ~s");

    public static final SubLList $list317 = cons(makeSymbol("FOL-FUNCTION"), makeSymbol("FOL-ARGS"));

    private static final SubLList $list318 = list(makeSymbol("FOL-PREDICATE-FN"), makeSymbol("CYCL-PREDICATE"), makeSymbol("ARITY"));

    private static final SubLString $str319$p_ = makeString("p_");

    public static final SubLList $list320 = list(makeSymbol("FOL-FUNCTION-FN"), makeSymbol("CYCL-FUNCTION"), makeSymbol("ARITY"));

    private static final SubLString $str321$f_ = makeString("f_");

    private static final SubLString $str322$c_zero_arity_function_application = makeString("c_zero_arity_function_application_");

    private static final SubLList $list323 = list(makeSymbol("FOL-ATOMIC-TERM-FN"), makeSymbol("CYCL-ATOMIC-TERM"));

    private static final SubLString $str324$c_ = makeString("c_");

    private static final SubLList $list325 = list(makeSymbol("FOL-STRING-CONSTANT-FN"), makeSymbol("SUBL-STRING"));

    private static final SubLString $str326$s_ = makeString("s_");

    private static final SubLList $list327 = list(makeSymbol("FOL-STRING-FN"), makeSymbol("SUBL-STRING"));

    private static final SubLString $str328$_ = makeString("\"");

    public static final SubLList $list329 = list(makeSymbol("FOL-NUMBER-CONSTANT-FN"), makeSymbol("SUBL-NUMBER"));



    private static final SubLString $str331$n_ = makeString("n_");

    private static final SubLList $list332 = list(makeSymbol("FOL-NUMBER-FN"), makeSymbol("SUBL-NUMBER"));

    private static final SubLSymbol TPTP_STRING_CHAR_P = makeSymbol("TPTP-STRING-CHAR-P");

    private static final SubLSymbol $tptp_long_symbol_name_cache$ = makeSymbol("*TPTP-LONG-SYMBOL-NAME-CACHE*");



    private static final SubLString $str336$ls_ = makeString("ls_");

    private static final SubLSymbol TPTP_NON_NUMERIC_ATOM_CHAR_P = makeSymbol("TPTP-NON-NUMERIC-ATOM-CHAR-P");

    private static final SubLString $str338$tptp_ = makeString("tptp_");

    private static final SubLSymbol TPTP_NUMERIC_ATOM_CHAR_P = makeSymbol("TPTP-NUMERIC-ATOM-CHAR-P");



    private static final SubLInteger $int$126 = makeInteger(126);



    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str344$_A = makeString("~A");

    private static final SubLString $str345$___Cyc_Assertion__a = makeString("// Cyc Assertion ~a");

    private static final SubLString $str346$___Cyc_NART__a = makeString("// Cyc NART ~a");

    private static final SubLString $str347$___Cyc_Constant___a_ = makeString("// Cyc Constant #~a:");

    private static final SubLString $str348$___CycL_Sentence___a_ = makeString("// CycL Sentence: ~a:");

    private static final SubLSymbol FOCYCL_TO_CYCL = makeSymbol("FOCYCL-TO-CYCL");









    private static final SubLString $str354$_S_ = makeString("~S ");





    private static final SubLSymbol CATEGORIZE_FOL_TERMS_INT = makeSymbol("CATEGORIZE-FOL-TERMS-INT");

    private static final SubLString $str358$time_to_handle_non_forts = makeString("time to handle non-forts");

    private static final SubLString $str359$_P = makeString("_P");

    private static final SubLString $str360$_F = makeString("_F");

    private static final SubLString $str361$_T = makeString("_T");

    private static final SubLString $str362$time_to_handle__S = makeString("time to handle ~S");

    private static final SubLSymbol FOL_NART_STRING = makeSymbol("FOL-NART-STRING");



    private static final SubLSymbol $fol_nart_string_caching_state$ = makeSymbol("*FOL-NART-STRING-CACHING-STATE*");

    public static final SubLList $list366 = list(makeKeyword("TRANSLATION-TYPE"), makeKeyword("SET-THEORY"), makeKeyword("MT-HANDLING"), makeKeyword("MT-VISIBLE-EXCEPT-CORE-MTS"), makeKeyword("ISA-HANDLING"), makeKeyword("UNARY-PREDICATE"), makeKeyword("STRING-HANDLING"), makeKeyword("DWIM-TO-SINGLE-CONSTANT"));

    private static final SubLString $str367$opencyc_all_20050422_non_conditio = makeString("opencyc-all-20050422-non-conditional");

    private static final SubLList $list368 = list(list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Individual")))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("subOrganizations")), makeSymbol("?Z"), makeSymbol("?X")), list(reader_make_constant_shell(makeString("hasMembers")), makeSymbol("?X"), makeSymbol("?Y"))), list(reader_make_constant_shell(makeString("hasMembers")), makeSymbol("?Z"), makeSymbol("?Y")))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(reader_make_constant_shell(makeString("typePrimaryFunction")), reader_make_constant_shell(makeString("Bathtub")), reader_make_constant_shell(makeString("TakingABath")), reader_make_constant_shell(makeString("deviceUsed")))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(reader_make_constant_shell(makeString("typeBehaviorIncapable")), reader_make_constant_shell(makeString("Doughnut")), reader_make_constant_shell(makeString("Talking")), reader_make_constant_shell(makeString("doneBy")))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("parts")), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("parts")), makeSymbol("?Y"), makeSymbol("?Z"))), list(reader_make_constant_shell(makeString("parts")), makeSymbol("?X"), makeSymbol("?Z")))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(reader_make_constant_shell(makeString("disjointWith")), reader_make_constant_shell(makeString("Baseball-Ball")), reader_make_constant_shell(makeString("Cube")))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(reader_make_constant_shell(makeString("disjointWith")), reader_make_constant_shell(makeString("HumanInfant")), reader_make_constant_shell(makeString("Doctor-Medical")))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("TerrestrialFrameOfReferenceMt")), list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?CUP"), reader_make_constant_shell(makeString("CoffeeCup"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?COFFEE"), reader_make_constant_shell(makeString("Coffee-Hot"))), list(reader_make_constant_shell(makeString("in-ContOpen")), makeSymbol("?COFFEE"), makeSymbol("?CUP"))), list(reader_make_constant_shell(makeString("orientation")), makeSymbol("?CUP"), reader_make_constant_shell(makeString("RightSideUp"))))));

    public static final SubLObject $list369 = _constant_369_initializer();

    private static final SubLInteger $int$60 = makeInteger(60);



    private static final SubLList $list372 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), NIL, makeKeyword("MAX-NUMBER"), ONE_INTEGER);



    private static final SubLString $str374$_S___s___s____ = makeString("~S~%~s~%~s~%~%");

    static final boolean assertionsDisabledSynth = true;

    public static SubLObject fol_translation_type_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $list2);
    }

    public static SubLObject fol_mt_handling_property_p(final SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.member_eqP(v_object, $list4)) || ((v_object.isCons() && ($COLLAPSE == v_object.first())) && (NIL != hlmt.hlmt_p(second(v_object)))));
    }

    public static SubLObject fol_isa_handling_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $list7);
    }

    public static SubLObject fol_rmp_handling_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $list9);
    }

    public static SubLObject fol_string_handling_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $list11);
    }

    public static SubLObject fol_number_handling_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $list13);
    }

    public static SubLObject fol_output_format_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $fol_output_formats$.getGlobalValue());
    }

    public static SubLObject new_fol_sentences_analysis(final SubLObject generation_properties, final SubLObject candidate_sentence_count, final SubLObject handled_sentence_count, final SubLObject term_count, final SubLObject handled_term_count, final SubLObject partially_handled_term_count, final SubLObject unhandled_term_count, final SubLObject fol_sentences_data, final SubLObject rejection_statistics) {
        return list(new SubLObject[]{ $GENERATION_PROPERTIES, generation_properties, $CANDIDATE_FOL_SENTENCE_COUNT, candidate_sentence_count, $FOL_SENTENCE_COUNT, handled_sentence_count, $TERM_COUNT, term_count, $HANDLED_TERM_COUNT, handled_term_count, $PARTIALLY_HANDLED_TERM_COUNT, partially_handled_term_count, $UNHANDLED_TERM_COUNT, unhandled_term_count, $FOL_SENTENCES_DATA, fol_sentences_data, $REJECTION_STATISTICS, rejection_statistics });
    }

    public static SubLObject fol_sentences_analysis_data(final SubLObject analysis) {
        return getf(analysis, $FOL_SENTENCES_DATA, UNPROVIDED);
    }

    public static SubLObject fol_sentences_analysis_generation_properties(final SubLObject analysis) {
        return getf(analysis, $GENERATION_PROPERTIES, UNPROVIDED);
    }

    public static SubLObject fol_sentences_analysis_rejection_statistics(final SubLObject analysis) {
        return getf(analysis, $REJECTION_STATISTICS, UNPROVIDED);
    }

    public static SubLObject folify_kb(final SubLObject output_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tptp_export_properties = append(list($OUTPUT_FILENAME, output_filename, $OUTPUT_FORMAT, $TPTP), funcall(makeSymbol("TPTP-FOLIFICATION-PROPERTIES")));
        final SubLObject _prev_bind_0 = $tptp_axiom_prefix$.currentBinding(thread);
        try {
            $tptp_axiom_prefix$.bind($$$cyc, thread);
            fol_sentences(kb_utilities.all_assertions(), NIL, kb_utilities.all_forts(), tptp_export_properties);
        } finally {
            $tptp_axiom_prefix$.rebind(_prev_bind_0, thread);
        }
        return output_filename;
    }

    public static SubLObject kb_fol_sentences(SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        return fol_sentences(kb_utilities.all_assertions(), NIL, kb_utilities.all_forts(), v_properties);
    }

    public static SubLObject cycl_assertions_to_fol(final SubLObject assertions, SubLObject v_properties, SubLObject define_nart_constantsP) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        if (define_nart_constantsP == UNPROVIDED) {
            define_nart_constantsP = T;
        }
        SubLObject v_forts = NIL;
        final SubLObject include_mtsP = T;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject assertion_forts = assertions_high.assertion_forts(assertion, define_nart_constantsP, T, include_mtsP, UNPROVIDED);
            v_forts = append(assertion_forts, v_forts);
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        v_forts = list_utilities.fast_delete_duplicates(v_forts, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return fol_sentences(assertions, NIL, v_forts, v_properties);
    }

    public static SubLObject cycl_sentences_to_fol(final SubLObject sentences, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject v_forts = list_utilities.fast_delete_duplicates(list_utilities.tree_gather(sentences, symbol_function(FORT_P), UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return fol_sentences(NIL, sentences, v_forts, v_properties);
    }

    public static SubLObject fol_sentences(final SubLObject assertions, final SubLObject sentences, final SubLObject v_forts, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != list_utilities.non_dotted_list_p(assertions) : "list_utilities.non_dotted_list_p(assertions) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(assertions) " + assertions;
        SubLObject cdolist_list_var = assertions;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != assertion_handles.assertion_p(elem) : "assertion_handles.assertion_p(elem) " + "CommonSymbols.NIL != assertion_handles.assertion_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject current;
        final SubLObject datum = current = v_properties;
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list33);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list33);
            if (NIL == member(current_$1, $list34, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list33);
        }
        final SubLObject translation_type_tail = property_list_member($TRANSLATION_TYPE, current);
        final SubLObject translation_type = (NIL != translation_type_tail) ? cadr(translation_type_tail) : NIL;
        final SubLObject mt_handling_tail = property_list_member($MT_HANDLING, current);
        final SubLObject mt_handling = (NIL != mt_handling_tail) ? cadr(mt_handling_tail) : NIL;
        final SubLObject mt_ceiling_tail = property_list_member($MT_CEILING, current);
        final SubLObject mt_ceiling = (NIL != mt_ceiling_tail) ? cadr(mt_ceiling_tail) : NIL;
        final SubLObject isa_handling_tail = property_list_member($ISA_HANDLING, current);
        final SubLObject isa_handling = (NIL != isa_handling_tail) ? cadr(isa_handling_tail) : NIL;
        final SubLObject rule_macro_predicate_handling_tail = property_list_member($RULE_MACRO_PREDICATE_HANDLING, current);
        final SubLObject rule_macro_predicate_handling = (NIL != rule_macro_predicate_handling_tail) ? cadr(rule_macro_predicate_handling_tail) : NIL;
        final SubLObject string_handling_tail = property_list_member($STRING_HANDLING, current);
        final SubLObject string_handling = (NIL != string_handling_tail) ? cadr(string_handling_tail) : NIL;
        final SubLObject number_handling_tail = property_list_member($NUMBER_HANDLING, current);
        final SubLObject number_handling = (NIL != number_handling_tail) ? cadr(number_handling_tail) : NIL;
        final SubLObject allow_equiv_relationP_tail = property_list_member($kw43$ALLOW_EQUIV_RELATION_, current);
        final SubLObject allow_equiv_relationP = (NIL != allow_equiv_relationP_tail) ? cadr(allow_equiv_relationP_tail) : NIL;
        final SubLObject sample_rate_tail = property_list_member($SAMPLE_RATE, current);
        final SubLObject sample_rate = (NIL != sample_rate_tail) ? cadr(sample_rate_tail) : ONE_INTEGER;
        final SubLObject output_filename_tail = property_list_member($OUTPUT_FILENAME, current);
        final SubLObject output_filename = (NIL != output_filename_tail) ? cadr(output_filename_tail) : NIL;
        final SubLObject output_format_tail = property_list_member($OUTPUT_FORMAT, current);
        final SubLObject output_format = (NIL != output_format_tail) ? cadr(output_format_tail) : NIL;
        final SubLObject header_tail = property_list_member($HEADER, current);
        final SubLObject header = (NIL != header_tail) ? cadr(header_tail) : NIL;
        final SubLObject analysis_filename_tail = property_list_member($ANALYSIS_FILENAME, current);
        final SubLObject analysis_filename = (NIL != analysis_filename_tail) ? cadr(analysis_filename_tail) : NIL;
        final SubLObject analysis_file_internalP_tail = property_list_member($kw47$ANALYSIS_FILE_INTERNAL_, current);
        final SubLObject analysis_file_internalP = (NIL != analysis_file_internalP_tail) ? cadr(analysis_file_internalP_tail) : NIL;
        final SubLObject include_commentsP_tail = property_list_member($kw48$INCLUDE_COMMENTS_, current);
        final SubLObject include_commentsP = (NIL != include_commentsP_tail) ? cadr(include_commentsP_tail) : NIL;
        final SubLObject return_dataP_tail = property_list_member($kw49$RETURN_DATA_, current);
        final SubLObject return_dataP = (NIL != return_dataP_tail) ? cadr(return_dataP_tail) : NIL;
        final SubLObject negate_queriesP_tail = property_list_member($kw50$NEGATE_QUERIES_, current);
        final SubLObject negate_queriesP = (NIL != negate_queriesP_tail) ? cadr(negate_queriesP_tail) : T;
        final SubLObject verboseP_tail = property_list_member($VERBOSE_, current);
        final SubLObject verboseP = (NIL != verboseP_tail) ? cadr(verboseP_tail) : T;
        check_folification_properties(translation_type, mt_handling, mt_ceiling, isa_handling, rule_macro_predicate_handling, string_handling, number_handling, allow_equiv_relationP, sample_rate, output_filename, output_format, header, analysis_filename, analysis_file_internalP, include_commentsP, return_dataP, negate_queriesP, verboseP);
        SubLObject analysis = NIL;
        final SubLObject filename_var = output_filename;
        if (NIL != filename_var) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(filename_var, $OUTPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str53$Unable_to_open__S, filename_var);
                }
                final SubLObject output_stream = stream;
                final SubLObject filename_var_$2 = analysis_filename;
                if (NIL != filename_var_$2) {
                    SubLObject stream_$3 = NIL;
                    try {
                        final SubLObject _prev_bind_2 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream_$3 = compatibility.open_binary(filename_var_$2, $OUTPUT);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_2, thread);
                        }
                        if (!stream_$3.isStream()) {
                            Errors.error($str53$Unable_to_open__S, filename_var_$2);
                        }
                        final SubLObject analysis_stream = stream_$3;
                        final SubLObject stub_analysis = new_fol_sentences_analysis(v_properties, ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, NIL, NIL);
                        if (NIL != output_stream) {
                            fol_header_to_stream(stub_analysis, output_format, output_stream);
                        }
                        possibly_save_fol_sentences_analysis(stub_analysis, analysis_stream);
                        final SubLObject _prev_bind_3 = $tptp_axiom_count$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = $candidate_sentence_count$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = $handled_sentence_count$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = $term_count$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = $handled_term_count$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = $partially_handled_term_count$.currentBinding(thread);
                        final SubLObject _prev_bind_9 = $unhandled_term_count$.currentBinding(thread);
                        final SubLObject _prev_bind_10 = $fol_translation_type$.currentBinding(thread);
                        final SubLObject _prev_bind_11 = $fol_mt_handling$.currentBinding(thread);
                        final SubLObject _prev_bind_12 = $fol_isa_handling$.currentBinding(thread);
                        final SubLObject _prev_bind_13 = $fol_rmp_handling$.currentBinding(thread);
                        final SubLObject _prev_bind_14 = $fol_string_handling$.currentBinding(thread);
                        final SubLObject _prev_bind_15 = $fol_number_handling$.currentBinding(thread);
                        try {
                            $tptp_axiom_count$.bind(ZERO_INTEGER, thread);
                            $candidate_sentence_count$.bind(ZERO_INTEGER, thread);
                            $handled_sentence_count$.bind(ZERO_INTEGER, thread);
                            $term_count$.bind(ZERO_INTEGER, thread);
                            $handled_term_count$.bind(ZERO_INTEGER, thread);
                            $partially_handled_term_count$.bind(ZERO_INTEGER, thread);
                            $unhandled_term_count$.bind(ZERO_INTEGER, thread);
                            $fol_translation_type$.bind(NIL != translation_type ? translation_type : $fol_translation_type$.getDynamicValue(thread), thread);
                            $fol_mt_handling$.bind(NIL != mt_handling ? mt_handling : $fol_mt_handling$.getDynamicValue(thread), thread);
                            $fol_isa_handling$.bind(NIL != isa_handling ? isa_handling : $fol_isa_handling$.getDynamicValue(thread), thread);
                            $fol_rmp_handling$.bind(NIL != rule_macro_predicate_handling ? rule_macro_predicate_handling : $fol_rmp_handling$.getDynamicValue(thread), thread);
                            $fol_string_handling$.bind(NIL != string_handling ? string_handling : $fol_string_handling$.getDynamicValue(thread), thread);
                            $fol_number_handling$.bind(NIL != number_handling ? number_handling : $fol_number_handling$.getDynamicValue(thread), thread);
                            final SubLObject rejection_statistics = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
                            final SubLObject assertions_fol_sentences_data = assertions_fol_sentences_data(assertions, sample_rate, mt_ceiling, return_dataP, v_properties, output_stream, analysis_stream, rejection_statistics, verboseP);
                            final SubLObject sentences_fol_sentences_data = sentences_fol_sentences_data(sentences, sample_rate, mt_ceiling, return_dataP, v_properties, output_stream, analysis_stream, rejection_statistics, verboseP);
                            final SubLObject forts_fol_sentences_data = forts_fol_sentences_data(v_forts, sample_rate, mt_ceiling, return_dataP, v_properties, output_stream, analysis_stream, rejection_statistics, verboseP);
                            final SubLObject fol_sentences_data = nreverse(nconc(forts_fol_sentences_data, sentences_fol_sentences_data, assertions_fol_sentences_data));
                            analysis = new_fol_sentences_analysis(v_properties, $candidate_sentence_count$.getDynamicValue(thread), $handled_sentence_count$.getDynamicValue(thread), $term_count$.getDynamicValue(thread), $handled_term_count$.getDynamicValue(thread), $partially_handled_term_count$.getDynamicValue(thread), $unhandled_term_count$.getDynamicValue(thread), fol_sentences_data, rejection_statistics);
                        } finally {
                            $fol_number_handling$.rebind(_prev_bind_15, thread);
                            $fol_string_handling$.rebind(_prev_bind_14, thread);
                            $fol_rmp_handling$.rebind(_prev_bind_13, thread);
                            $fol_isa_handling$.rebind(_prev_bind_12, thread);
                            $fol_mt_handling$.rebind(_prev_bind_11, thread);
                            $fol_translation_type$.rebind(_prev_bind_10, thread);
                            $unhandled_term_count$.rebind(_prev_bind_9, thread);
                            $partially_handled_term_count$.rebind(_prev_bind_8, thread);
                            $handled_term_count$.rebind(_prev_bind_7, thread);
                            $term_count$.rebind(_prev_bind_6, thread);
                            $handled_sentence_count$.rebind(_prev_bind_5, thread);
                            $candidate_sentence_count$.rebind(_prev_bind_4, thread);
                            $tptp_axiom_count$.rebind(_prev_bind_3, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (stream_$3.isStream()) {
                                close(stream_$3, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_16, thread);
                        }
                    }
                } else {
                    final SubLObject analysis_stream2 = NIL;
                    final SubLObject stub_analysis2 = new_fol_sentences_analysis(v_properties, ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, NIL, NIL);
                    if (NIL != output_stream) {
                        fol_header_to_stream(stub_analysis2, output_format, output_stream);
                    }
                    possibly_save_fol_sentences_analysis(stub_analysis2, analysis_stream2);
                    final SubLObject _prev_bind_17 = $tptp_axiom_count$.currentBinding(thread);
                    final SubLObject _prev_bind_18 = $candidate_sentence_count$.currentBinding(thread);
                    final SubLObject _prev_bind_19 = $handled_sentence_count$.currentBinding(thread);
                    final SubLObject _prev_bind_20 = $term_count$.currentBinding(thread);
                    final SubLObject _prev_bind_21 = $handled_term_count$.currentBinding(thread);
                    final SubLObject _prev_bind_22 = $partially_handled_term_count$.currentBinding(thread);
                    final SubLObject _prev_bind_23 = $unhandled_term_count$.currentBinding(thread);
                    final SubLObject _prev_bind_24 = $fol_translation_type$.currentBinding(thread);
                    final SubLObject _prev_bind_25 = $fol_mt_handling$.currentBinding(thread);
                    final SubLObject _prev_bind_26 = $fol_isa_handling$.currentBinding(thread);
                    final SubLObject _prev_bind_27 = $fol_rmp_handling$.currentBinding(thread);
                    final SubLObject _prev_bind_28 = $fol_string_handling$.currentBinding(thread);
                    final SubLObject _prev_bind_29 = $fol_number_handling$.currentBinding(thread);
                    try {
                        $tptp_axiom_count$.bind(ZERO_INTEGER, thread);
                        $candidate_sentence_count$.bind(ZERO_INTEGER, thread);
                        $handled_sentence_count$.bind(ZERO_INTEGER, thread);
                        $term_count$.bind(ZERO_INTEGER, thread);
                        $handled_term_count$.bind(ZERO_INTEGER, thread);
                        $partially_handled_term_count$.bind(ZERO_INTEGER, thread);
                        $unhandled_term_count$.bind(ZERO_INTEGER, thread);
                        $fol_translation_type$.bind(NIL != translation_type ? translation_type : $fol_translation_type$.getDynamicValue(thread), thread);
                        $fol_mt_handling$.bind(NIL != mt_handling ? mt_handling : $fol_mt_handling$.getDynamicValue(thread), thread);
                        $fol_isa_handling$.bind(NIL != isa_handling ? isa_handling : $fol_isa_handling$.getDynamicValue(thread), thread);
                        $fol_rmp_handling$.bind(NIL != rule_macro_predicate_handling ? rule_macro_predicate_handling : $fol_rmp_handling$.getDynamicValue(thread), thread);
                        $fol_string_handling$.bind(NIL != string_handling ? string_handling : $fol_string_handling$.getDynamicValue(thread), thread);
                        $fol_number_handling$.bind(NIL != number_handling ? number_handling : $fol_number_handling$.getDynamicValue(thread), thread);
                        final SubLObject rejection_statistics2 = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
                        final SubLObject assertions_fol_sentences_data2 = assertions_fol_sentences_data(assertions, sample_rate, mt_ceiling, return_dataP, v_properties, output_stream, analysis_stream2, rejection_statistics2, verboseP);
                        final SubLObject sentences_fol_sentences_data2 = sentences_fol_sentences_data(sentences, sample_rate, mt_ceiling, return_dataP, v_properties, output_stream, analysis_stream2, rejection_statistics2, verboseP);
                        final SubLObject forts_fol_sentences_data2 = forts_fol_sentences_data(v_forts, sample_rate, mt_ceiling, return_dataP, v_properties, output_stream, analysis_stream2, rejection_statistics2, verboseP);
                        final SubLObject fol_sentences_data2 = nreverse(nconc(forts_fol_sentences_data2, sentences_fol_sentences_data2, assertions_fol_sentences_data2));
                        analysis = new_fol_sentences_analysis(v_properties, $candidate_sentence_count$.getDynamicValue(thread), $handled_sentence_count$.getDynamicValue(thread), $term_count$.getDynamicValue(thread), $handled_term_count$.getDynamicValue(thread), $partially_handled_term_count$.getDynamicValue(thread), $unhandled_term_count$.getDynamicValue(thread), fol_sentences_data2, rejection_statistics2);
                    } finally {
                        $fol_number_handling$.rebind(_prev_bind_29, thread);
                        $fol_string_handling$.rebind(_prev_bind_28, thread);
                        $fol_rmp_handling$.rebind(_prev_bind_27, thread);
                        $fol_isa_handling$.rebind(_prev_bind_26, thread);
                        $fol_mt_handling$.rebind(_prev_bind_25, thread);
                        $fol_translation_type$.rebind(_prev_bind_24, thread);
                        $unhandled_term_count$.rebind(_prev_bind_23, thread);
                        $partially_handled_term_count$.rebind(_prev_bind_22, thread);
                        $handled_term_count$.rebind(_prev_bind_21, thread);
                        $term_count$.rebind(_prev_bind_20, thread);
                        $handled_sentence_count$.rebind(_prev_bind_19, thread);
                        $candidate_sentence_count$.rebind(_prev_bind_18, thread);
                        $tptp_axiom_count$.rebind(_prev_bind_17, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_30, thread);
                }
            }
        } else {
            final SubLObject output_stream2 = NIL;
            final SubLObject filename_var_$3 = analysis_filename;
            if (NIL != filename_var_$3) {
                SubLObject stream2 = NIL;
                try {
                    final SubLObject _prev_bind_31 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                        stream2 = compatibility.open_binary(filename_var_$3, $OUTPUT);
                    } finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_31, thread);
                    }
                    if (!stream2.isStream()) {
                        Errors.error($str53$Unable_to_open__S, filename_var_$3);
                    }
                    final SubLObject analysis_stream2 = stream2;
                    final SubLObject stub_analysis2 = new_fol_sentences_analysis(v_properties, ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, NIL, NIL);
                    if (NIL != output_stream2) {
                        fol_header_to_stream(stub_analysis2, output_format, output_stream2);
                    }
                    possibly_save_fol_sentences_analysis(stub_analysis2, analysis_stream2);
                    final SubLObject _prev_bind_17 = $tptp_axiom_count$.currentBinding(thread);
                    final SubLObject _prev_bind_18 = $candidate_sentence_count$.currentBinding(thread);
                    final SubLObject _prev_bind_19 = $handled_sentence_count$.currentBinding(thread);
                    final SubLObject _prev_bind_20 = $term_count$.currentBinding(thread);
                    final SubLObject _prev_bind_21 = $handled_term_count$.currentBinding(thread);
                    final SubLObject _prev_bind_22 = $partially_handled_term_count$.currentBinding(thread);
                    final SubLObject _prev_bind_23 = $unhandled_term_count$.currentBinding(thread);
                    final SubLObject _prev_bind_24 = $fol_translation_type$.currentBinding(thread);
                    final SubLObject _prev_bind_25 = $fol_mt_handling$.currentBinding(thread);
                    final SubLObject _prev_bind_26 = $fol_isa_handling$.currentBinding(thread);
                    final SubLObject _prev_bind_27 = $fol_rmp_handling$.currentBinding(thread);
                    final SubLObject _prev_bind_28 = $fol_string_handling$.currentBinding(thread);
                    final SubLObject _prev_bind_29 = $fol_number_handling$.currentBinding(thread);
                    try {
                        $tptp_axiom_count$.bind(ZERO_INTEGER, thread);
                        $candidate_sentence_count$.bind(ZERO_INTEGER, thread);
                        $handled_sentence_count$.bind(ZERO_INTEGER, thread);
                        $term_count$.bind(ZERO_INTEGER, thread);
                        $handled_term_count$.bind(ZERO_INTEGER, thread);
                        $partially_handled_term_count$.bind(ZERO_INTEGER, thread);
                        $unhandled_term_count$.bind(ZERO_INTEGER, thread);
                        $fol_translation_type$.bind(NIL != translation_type ? translation_type : $fol_translation_type$.getDynamicValue(thread), thread);
                        $fol_mt_handling$.bind(NIL != mt_handling ? mt_handling : $fol_mt_handling$.getDynamicValue(thread), thread);
                        $fol_isa_handling$.bind(NIL != isa_handling ? isa_handling : $fol_isa_handling$.getDynamicValue(thread), thread);
                        $fol_rmp_handling$.bind(NIL != rule_macro_predicate_handling ? rule_macro_predicate_handling : $fol_rmp_handling$.getDynamicValue(thread), thread);
                        $fol_string_handling$.bind(NIL != string_handling ? string_handling : $fol_string_handling$.getDynamicValue(thread), thread);
                        $fol_number_handling$.bind(NIL != number_handling ? number_handling : $fol_number_handling$.getDynamicValue(thread), thread);
                        final SubLObject rejection_statistics2 = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
                        final SubLObject assertions_fol_sentences_data2 = assertions_fol_sentences_data(assertions, sample_rate, mt_ceiling, return_dataP, v_properties, output_stream2, analysis_stream2, rejection_statistics2, verboseP);
                        final SubLObject sentences_fol_sentences_data2 = sentences_fol_sentences_data(sentences, sample_rate, mt_ceiling, return_dataP, v_properties, output_stream2, analysis_stream2, rejection_statistics2, verboseP);
                        final SubLObject forts_fol_sentences_data2 = forts_fol_sentences_data(v_forts, sample_rate, mt_ceiling, return_dataP, v_properties, output_stream2, analysis_stream2, rejection_statistics2, verboseP);
                        final SubLObject fol_sentences_data2 = nreverse(nconc(forts_fol_sentences_data2, sentences_fol_sentences_data2, assertions_fol_sentences_data2));
                        analysis = new_fol_sentences_analysis(v_properties, $candidate_sentence_count$.getDynamicValue(thread), $handled_sentence_count$.getDynamicValue(thread), $term_count$.getDynamicValue(thread), $handled_term_count$.getDynamicValue(thread), $partially_handled_term_count$.getDynamicValue(thread), $unhandled_term_count$.getDynamicValue(thread), fol_sentences_data2, rejection_statistics2);
                    } finally {
                        $fol_number_handling$.rebind(_prev_bind_29, thread);
                        $fol_string_handling$.rebind(_prev_bind_28, thread);
                        $fol_rmp_handling$.rebind(_prev_bind_27, thread);
                        $fol_isa_handling$.rebind(_prev_bind_26, thread);
                        $fol_mt_handling$.rebind(_prev_bind_25, thread);
                        $fol_translation_type$.rebind(_prev_bind_24, thread);
                        $unhandled_term_count$.rebind(_prev_bind_23, thread);
                        $partially_handled_term_count$.rebind(_prev_bind_22, thread);
                        $handled_term_count$.rebind(_prev_bind_21, thread);
                        $term_count$.rebind(_prev_bind_20, thread);
                        $handled_sentence_count$.rebind(_prev_bind_19, thread);
                        $candidate_sentence_count$.rebind(_prev_bind_18, thread);
                        $tptp_axiom_count$.rebind(_prev_bind_17, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        if (stream2.isStream()) {
                            close(stream2, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_32, thread);
                    }
                }
            } else {
                final SubLObject analysis_stream3 = NIL;
                final SubLObject stub_analysis3 = new_fol_sentences_analysis(v_properties, ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, NIL, NIL);
                if (NIL != output_stream2) {
                    fol_header_to_stream(stub_analysis3, output_format, output_stream2);
                }
                possibly_save_fol_sentences_analysis(stub_analysis3, analysis_stream3);
                final SubLObject _prev_bind_2 = $tptp_axiom_count$.currentBinding(thread);
                final SubLObject _prev_bind_33 = $candidate_sentence_count$.currentBinding(thread);
                final SubLObject _prev_bind_34 = $handled_sentence_count$.currentBinding(thread);
                final SubLObject _prev_bind_35 = $term_count$.currentBinding(thread);
                final SubLObject _prev_bind_36 = $handled_term_count$.currentBinding(thread);
                final SubLObject _prev_bind_37 = $partially_handled_term_count$.currentBinding(thread);
                final SubLObject _prev_bind_38 = $unhandled_term_count$.currentBinding(thread);
                final SubLObject _prev_bind_39 = $fol_translation_type$.currentBinding(thread);
                final SubLObject _prev_bind_40 = $fol_mt_handling$.currentBinding(thread);
                final SubLObject _prev_bind_41 = $fol_isa_handling$.currentBinding(thread);
                final SubLObject _prev_bind_42 = $fol_rmp_handling$.currentBinding(thread);
                final SubLObject _prev_bind_43 = $fol_string_handling$.currentBinding(thread);
                final SubLObject _prev_bind_44 = $fol_number_handling$.currentBinding(thread);
                try {
                    $tptp_axiom_count$.bind(ZERO_INTEGER, thread);
                    $candidate_sentence_count$.bind(ZERO_INTEGER, thread);
                    $handled_sentence_count$.bind(ZERO_INTEGER, thread);
                    $term_count$.bind(ZERO_INTEGER, thread);
                    $handled_term_count$.bind(ZERO_INTEGER, thread);
                    $partially_handled_term_count$.bind(ZERO_INTEGER, thread);
                    $unhandled_term_count$.bind(ZERO_INTEGER, thread);
                    $fol_translation_type$.bind(NIL != translation_type ? translation_type : $fol_translation_type$.getDynamicValue(thread), thread);
                    $fol_mt_handling$.bind(NIL != mt_handling ? mt_handling : $fol_mt_handling$.getDynamicValue(thread), thread);
                    $fol_isa_handling$.bind(NIL != isa_handling ? isa_handling : $fol_isa_handling$.getDynamicValue(thread), thread);
                    $fol_rmp_handling$.bind(NIL != rule_macro_predicate_handling ? rule_macro_predicate_handling : $fol_rmp_handling$.getDynamicValue(thread), thread);
                    $fol_string_handling$.bind(NIL != string_handling ? string_handling : $fol_string_handling$.getDynamicValue(thread), thread);
                    $fol_number_handling$.bind(NIL != number_handling ? number_handling : $fol_number_handling$.getDynamicValue(thread), thread);
                    final SubLObject rejection_statistics3 = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
                    final SubLObject assertions_fol_sentences_data3 = assertions_fol_sentences_data(assertions, sample_rate, mt_ceiling, return_dataP, v_properties, output_stream2, analysis_stream3, rejection_statistics3, verboseP);
                    final SubLObject sentences_fol_sentences_data3 = sentences_fol_sentences_data(sentences, sample_rate, mt_ceiling, return_dataP, v_properties, output_stream2, analysis_stream3, rejection_statistics3, verboseP);
                    final SubLObject forts_fol_sentences_data3 = forts_fol_sentences_data(v_forts, sample_rate, mt_ceiling, return_dataP, v_properties, output_stream2, analysis_stream3, rejection_statistics3, verboseP);
                    final SubLObject fol_sentences_data3 = nreverse(nconc(forts_fol_sentences_data3, sentences_fol_sentences_data3, assertions_fol_sentences_data3));
                    analysis = new_fol_sentences_analysis(v_properties, $candidate_sentence_count$.getDynamicValue(thread), $handled_sentence_count$.getDynamicValue(thread), $term_count$.getDynamicValue(thread), $handled_term_count$.getDynamicValue(thread), $partially_handled_term_count$.getDynamicValue(thread), $unhandled_term_count$.getDynamicValue(thread), fol_sentences_data3, rejection_statistics3);
                } finally {
                    $fol_number_handling$.rebind(_prev_bind_44, thread);
                    $fol_string_handling$.rebind(_prev_bind_43, thread);
                    $fol_rmp_handling$.rebind(_prev_bind_42, thread);
                    $fol_isa_handling$.rebind(_prev_bind_41, thread);
                    $fol_mt_handling$.rebind(_prev_bind_40, thread);
                    $fol_translation_type$.rebind(_prev_bind_39, thread);
                    $unhandled_term_count$.rebind(_prev_bind_38, thread);
                    $partially_handled_term_count$.rebind(_prev_bind_37, thread);
                    $handled_term_count$.rebind(_prev_bind_36, thread);
                    $term_count$.rebind(_prev_bind_35, thread);
                    $handled_sentence_count$.rebind(_prev_bind_34, thread);
                    $candidate_sentence_count$.rebind(_prev_bind_33, thread);
                    $tptp_axiom_count$.rebind(_prev_bind_2, thread);
                }
            }
        }
        return analysis;
    }

    public static SubLObject assertions_fol_sentences_data(final SubLObject assertions, final SubLObject sample_rate, final SubLObject mt_ceiling, final SubLObject return_dataP, final SubLObject v_properties, final SubLObject output_stream, final SubLObject analysis_stream, final SubLObject rejection_statistics, final SubLObject verboseP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != list_utilities.non_dotted_list_p(assertions) : "list_utilities.non_dotted_list_p(assertions) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(assertions) " + assertions;
        SubLObject cdolist_list_var = assertions;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != assertion_handles.assertion_p(elem) : "assertion_handles.assertion_p(elem) " + "CommonSymbols.NIL != assertion_handles.assertion_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject fol_sentences_data = NIL;
        SubLObject sample_count = ZERO_INTEGER;
        final SubLObject message_var = (NIL != verboseP) ? $$$Converting_assertions_to_FOL : NIL;
        if (NIL != message_var) {
            final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != (NIL != verboseP ? $$$Converting_assertions_to_FOL : NIL) ? NIL != verboseP ? $$$Converting_assertions_to_FOL : NIL : $$$cdolist, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(assertions), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = assertions;
                    SubLObject ass = NIL;
                    ass = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        sample_count = add(sample_count, ONE_INTEGER);
                        if (sample_count.numE(sample_rate)) {
                            sample_count = ZERO_INTEGER;
                            if (NIL != kb_fol_assertion_under_mt_ceilingP(ass, mt_ceiling)) {
                                SubLObject fol_sentences = NIL;
                                SubLObject ignore_errors_tag = NIL;
                                try {
                                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                    final SubLObject _prev_bind_0_$5 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                        try {
                                            fol_sentences = assertion_fol_sentences(ass);
                                        } catch (final Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$5, thread);
                                    }
                                } catch (final Throwable ccatch_env_var) {
                                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                } finally {
                                    thread.throwStack.pop();
                                }
                                if (NIL != fol_sentences) {
                                    final SubLObject datum = make_and_postprocess_fol_sentences_datum(ass, fol_sentences, v_properties, output_stream, analysis_stream, rejection_statistics);
                                    if (NIL != return_dataP) {
                                        fol_sentences_data = cons(datum, fol_sentences_data);
                                    }
                                } else {
                                    format(T, $str58$failed_to_translate__s__, ass);
                                }
                            }
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        ass = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
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
        } else {
            SubLObject cdolist_list_var2 = assertions;
            SubLObject ass2 = NIL;
            ass2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                sample_count = add(sample_count, ONE_INTEGER);
                if (sample_count.numE(sample_rate)) {
                    sample_count = ZERO_INTEGER;
                    if (NIL != kb_fol_assertion_under_mt_ceilingP(ass2, mt_ceiling)) {
                        SubLObject fol_sentences2 = NIL;
                        SubLObject ignore_errors_tag2 = NIL;
                        try {
                            thread.throwStack.push($IGNORE_ERRORS_TARGET);
                            final SubLObject _prev_bind_9 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                try {
                                    fol_sentences2 = assertion_fol_sentences(ass2);
                                } catch (final Throwable catch_var2) {
                                    Errors.handleThrowable(catch_var2, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_9, thread);
                            }
                        } catch (final Throwable ccatch_env_var2) {
                            ignore_errors_tag2 = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
                        } finally {
                            thread.throwStack.pop();
                        }
                        if (NIL != fol_sentences2) {
                            final SubLObject datum2 = make_and_postprocess_fol_sentences_datum(ass2, fol_sentences2, v_properties, output_stream, analysis_stream, rejection_statistics);
                            if (NIL != return_dataP) {
                                fol_sentences_data = cons(datum2, fol_sentences_data);
                            }
                        } else {
                            format(T, $str58$failed_to_translate__s__, ass2);
                        }
                    }
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                ass2 = cdolist_list_var2.first();
            } 
        }
        return fol_sentences_data;
    }

    public static SubLObject sentences_fol_sentences_data(final SubLObject sentences, final SubLObject sample_rate, final SubLObject mt_ceiling, final SubLObject return_dataP, final SubLObject v_properties, final SubLObject output_stream, final SubLObject analysis_stream, final SubLObject rejection_statistics, final SubLObject verboseP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fol_sentences_data = NIL;
        SubLObject sample_count = ZERO_INTEGER;
        final SubLObject message_var = (NIL != verboseP) ? $$$Converting_sentences_to_FOL : NIL;
        if (NIL != message_var) {
            final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != (NIL != verboseP ? $$$Converting_sentences_to_FOL : NIL) ? NIL != verboseP ? $$$Converting_sentences_to_FOL : NIL : $$$cdolist, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(sentences), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = sentences;
                    SubLObject original_sentence = NIL;
                    original_sentence = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        sample_count = add(sample_count, ONE_INTEGER);
                        if (sample_count.numE(sample_rate)) {
                            sample_count = ZERO_INTEGER;
                            SubLObject sentence = original_sentence;
                            SubLObject mt = $$UniversalVocabularyMt;
                            thread.resetMultipleValues();
                            final SubLObject sentence_$7 = czer_utilities.unwrap_if_ist_permissive(sentence, mt);
                            final SubLObject mt_$8 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            sentence = sentence_$7;
                            mt = mt_$8;
                            if (NIL != kb_fol_under_mt_ceilingP(mt, mt_ceiling)) {
                                final SubLObject fol_sentences = sentence_fol_sentences(sentence, mt);
                                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == fol_sentences)) {
                                    Errors.error($str61$failed_to_translate__s, fol_sentences);
                                }
                                final SubLObject datum = make_and_postprocess_fol_sentences_datum(original_sentence, fol_sentences, v_properties, output_stream, analysis_stream, rejection_statistics);
                                if (NIL != return_dataP) {
                                    fol_sentences_data = cons(datum, fol_sentences_data);
                                }
                            }
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        original_sentence = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
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
        } else {
            SubLObject cdolist_list_var = sentences;
            SubLObject original_sentence2 = NIL;
            original_sentence2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                sample_count = add(sample_count, ONE_INTEGER);
                if (sample_count.numE(sample_rate)) {
                    sample_count = ZERO_INTEGER;
                    SubLObject sentence2 = original_sentence2;
                    SubLObject mt2 = $$UniversalVocabularyMt;
                    thread.resetMultipleValues();
                    final SubLObject sentence_$8 = czer_utilities.unwrap_if_ist_permissive(sentence2, mt2);
                    final SubLObject mt_$9 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    sentence2 = sentence_$8;
                    mt2 = mt_$9;
                    if (NIL != kb_fol_under_mt_ceilingP(mt2, mt_ceiling)) {
                        final SubLObject fol_sentences2 = sentence_fol_sentences(sentence2, mt2);
                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == fol_sentences2)) {
                            Errors.error($str61$failed_to_translate__s, fol_sentences2);
                        }
                        final SubLObject datum2 = make_and_postprocess_fol_sentences_datum(original_sentence2, fol_sentences2, v_properties, output_stream, analysis_stream, rejection_statistics);
                        if (NIL != return_dataP) {
                            fol_sentences_data = cons(datum2, fol_sentences_data);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                original_sentence2 = cdolist_list_var.first();
            } 
        }
        return fol_sentences_data;
    }

    public static SubLObject forts_fol_sentences_data(final SubLObject v_forts, final SubLObject sample_rate, final SubLObject mt_ceiling, final SubLObject return_dataP, final SubLObject v_properties, final SubLObject output_stream, final SubLObject analysis_stream, final SubLObject rejection_statistics, final SubLObject verboseP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fol_sentences_data = NIL;
        SubLObject sample_count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject message_var = (NIL != verboseP) ? $$$Converting_forts_to_FOL : NIL;
            if (NIL != message_var) {
                final SubLObject _prev_bind_0_$12 = $progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_1_$13 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $progress_note$.bind(NIL != (NIL != verboseP ? $$$Converting_forts_to_FOL : NIL) ? NIL != verboseP ? $$$Converting_forts_to_FOL : NIL : $$$cdolist, thread);
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_total$.bind(length(v_forts), thread);
                    $progress_sofar$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = v_forts;
                        SubLObject fort = NIL;
                        fort = csome_list_var.first();
                        while (NIL != csome_list_var) {
                            sample_count = add(sample_count, ONE_INTEGER);
                            if (sample_count.numE(sample_rate)) {
                                sample_count = ZERO_INTEGER;
                                final SubLObject allow_equiv_relationP = getf(v_properties, $kw43$ALLOW_EQUIV_RELATION_, NIL);
                                final SubLObject fol_sentences = kb_fol_additional_sentences_for_term(fort, mt_ceiling, allow_equiv_relationP);
                                if (NIL != fol_sentences) {
                                    final SubLObject datum = make_and_postprocess_fol_sentences_datum(fort, fol_sentences, v_properties, output_stream, analysis_stream, rejection_statistics);
                                    if (NIL != return_dataP) {
                                        fol_sentences_data = cons(datum, fol_sentences_data);
                                    }
                                }
                            }
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            fort = csome_list_var.first();
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    $progress_sofar$.rebind(_prev_bind_4, thread);
                    $progress_total$.rebind(_prev_bind_3, thread);
                    $progress_start_time$.rebind(_prev_bind_1_$13, thread);
                    $progress_note$.rebind(_prev_bind_0_$12, thread);
                }
            } else {
                SubLObject cdolist_list_var = v_forts;
                SubLObject fort2 = NIL;
                fort2 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    sample_count = add(sample_count, ONE_INTEGER);
                    if (sample_count.numE(sample_rate)) {
                        sample_count = ZERO_INTEGER;
                        final SubLObject allow_equiv_relationP2 = getf(v_properties, $kw43$ALLOW_EQUIV_RELATION_, NIL);
                        final SubLObject fol_sentences2 = kb_fol_additional_sentences_for_term(fort2, mt_ceiling, allow_equiv_relationP2);
                        if (NIL != fol_sentences2) {
                            final SubLObject datum2 = make_and_postprocess_fol_sentences_datum(fort2, fol_sentences2, v_properties, output_stream, analysis_stream, rejection_statistics);
                            if (NIL != return_dataP) {
                                fol_sentences_data = cons(datum2, fol_sentences_data);
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    fort2 = cdolist_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return fol_sentences_data;
    }

    public static SubLObject load_fol_sentences_analysis(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(filename) : "Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) " + filename;
        SubLObject fol_sentences_analysis = NIL;
        SubLObject additional_fol_sentences_data = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str53$Unable_to_open__S, filename);
            }
            final SubLObject stream_$15 = stream;
            final SubLObject _prev_bind_2 = $cfasl_common_symbols$.currentBinding(thread);
            try {
                $cfasl_common_symbols$.bind(NIL, thread);
                cfasl_set_common_symbols(dumper.kb_dump_common_symbols());
                final SubLObject _prev_bind_0_$16 = $cfasl_input_guid_string_resource$.currentBinding(thread);
                try {
                    $cfasl_input_guid_string_resource$.bind(Guids.guid_to_string(Guids.new_guid()), thread);
                    fol_sentences_analysis = cfasl_input(stream_$15, T, UNPROVIDED);
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($ANALYSIS != fol_sentences_input_item_type(fol_sentences_analysis))) {
                        Errors.error($str68$Expected_a_fol_sentences_analysis);
                    }
                    SubLObject doneP = NIL;
                    while (NIL == doneP) {
                        final SubLObject input_item = cfasl_input(stream_$15, NIL, $EOF);
                        doneP = eq(input_item, $EOF);
                        if (NIL == doneP) {
                            if ($DATUM == fol_sentences_input_item_type(input_item)) {
                                additional_fol_sentences_data = cons(input_item, additional_fol_sentences_data);
                            } else {
                                fol_sentences_analysis = input_item;
                            }
                        }
                    } 
                } finally {
                    $cfasl_input_guid_string_resource$.rebind(_prev_bind_0_$16, thread);
                }
            } finally {
                $cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        additional_fol_sentences_data = nreverse(additional_fol_sentences_data);
        fol_sentences_analysis = fol_sentences_analysis_nmerge_fol_sentences_data(fol_sentences_analysis, additional_fol_sentences_data);
        return fol_sentences_analysis;
    }

    public static SubLObject fol_sentences_input_item_type(final SubLObject list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!list.isCons())) {
            Errors.error($str71$expected_to_input_a_cons__got__s, list);
        }
        final SubLObject first_item = list.first();
        if (first_item.isKeyword()) {
            return $ANALYSIS;
        }
        return $DATUM;
    }

    public static SubLObject fol_sentences_analysis_nmerge_fol_sentences_data(SubLObject analysis, final SubLObject additional_fol_sentences_data) {
        if (NIL != additional_fol_sentences_data) {
            SubLObject fol_sentences_data = fol_sentences_analysis_data(analysis);
            fol_sentences_data = nconc(fol_sentences_data, additional_fol_sentences_data);
            analysis = putf(analysis, $FOL_SENTENCES_DATA, fol_sentences_data);
        }
        return analysis;
    }

    public static SubLObject fol_sentences_to_file(final SubLObject fol_sentences_analysis, final SubLObject output_format, final SubLObject filename) {
        SubLObject result = NIL;
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(filename, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str53$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
            result = fol_sentences_to_stream(fol_sentences_analysis, output_format, s);
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
        return result;
    }

    public static SubLObject fol_sentences_to_stream(final SubLObject fol_sentences_analysis, final SubLObject output_format, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (output_format.eql($CYCL)) {
            return fol_sentences_to_cycl_stream(fol_sentences_analysis, stream);
        }
        if (output_format.eql($TPTP)) {
            return fol_sentences_to_tptp_stream(fol_sentences_analysis, stream);
        }
        if (output_format == $ALCHEMY) {
            return fol_sentences_to_alchemy_stream(fol_sentences_analysis, stream);
        }
        return Errors.error($str74$Unrecognized_output_format___s, output_format);
    }

    public static SubLObject fol_sentences_symbol_count(final SubLObject fol_sentences_analysis) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject list_var;
        final SubLObject fol_sentences_data = list_var = fol_sentences_analysis_data(fol_sentences_analysis);
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$Gathering_FOL_symbols, thread);
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
                SubLObject datum = NIL;
                datum = csome_list_var.first();
                while (NIL != csome_list_var) {
                    SubLObject current;
                    final SubLObject datum_$17 = current = datum;
                    SubLObject v_term = NIL;
                    SubLObject fol_sentences = NIL;
                    destructuring_bind_must_consp(current, datum_$17, $list76);
                    v_term = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum_$17, $list76);
                    fol_sentences = current.first();
                    current = current.rest();
                    final SubLObject unhandled_fol_sentences = (current.isCons()) ? current.first() : NIL;
                    destructuring_bind_must_listp(current, datum_$17, $list76);
                    current = current.rest();
                    if (NIL == current) {
                        SubLObject cdolist_list_var = list_utilities.tree_gather(fol_sentences, FOL_REPRESENTED_TERM_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject fol_term = NIL;
                        fol_term = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            set.set_add(fol_term, v_set);
                            cdolist_list_var = cdolist_list_var.rest();
                            fol_term = cdolist_list_var.first();
                        } 
                    } else {
                        cdestructuring_bind_error(datum_$17, $list76);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    datum = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
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
        return set.set_size(v_set);
    }

    public static SubLObject query_fol_sentence(final SubLObject query, final SubLObject mt, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject current;
        final SubLObject datum = current = v_properties;
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$19 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list78);
            current_$19 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list78);
            if (NIL == member(current_$19, $list79, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$19 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list78);
        }
        final SubLObject translation_type_tail = property_list_member($TRANSLATION_TYPE, current);
        final SubLObject translation_type = (NIL != translation_type_tail) ? cadr(translation_type_tail) : NIL;
        final SubLObject mt_handling_tail = property_list_member($MT_HANDLING, current);
        final SubLObject mt_handling = (NIL != mt_handling_tail) ? cadr(mt_handling_tail) : NIL;
        final SubLObject mt_ceiling_tail = property_list_member($MT_CEILING, current);
        final SubLObject mt_ceiling = (NIL != mt_ceiling_tail) ? cadr(mt_ceiling_tail) : NIL;
        final SubLObject isa_handling_tail = property_list_member($ISA_HANDLING, current);
        final SubLObject isa_handling = (NIL != isa_handling_tail) ? cadr(isa_handling_tail) : NIL;
        final SubLObject rule_macro_predicate_handling_tail = property_list_member($RULE_MACRO_PREDICATE_HANDLING, current);
        final SubLObject rule_macro_predicate_handling = (NIL != rule_macro_predicate_handling_tail) ? cadr(rule_macro_predicate_handling_tail) : NIL;
        final SubLObject string_handling_tail = property_list_member($STRING_HANDLING, current);
        final SubLObject string_handling = (NIL != string_handling_tail) ? cadr(string_handling_tail) : NIL;
        final SubLObject number_handling_tail = property_list_member($NUMBER_HANDLING, current);
        final SubLObject number_handling = (NIL != number_handling_tail) ? cadr(number_handling_tail) : NIL;
        final SubLObject allow_equiv_relationP_tail = property_list_member($kw43$ALLOW_EQUIV_RELATION_, current);
        final SubLObject allow_equiv_relationP = (NIL != allow_equiv_relationP_tail) ? cadr(allow_equiv_relationP_tail) : NIL;
        final SubLObject sample_rate_tail = property_list_member($SAMPLE_RATE, current);
        final SubLObject sample_rate = (NIL != sample_rate_tail) ? cadr(sample_rate_tail) : ONE_INTEGER;
        final SubLObject output_filename_tail = property_list_member($OUTPUT_FILENAME, current);
        final SubLObject output_filename = (NIL != output_filename_tail) ? cadr(output_filename_tail) : NIL;
        final SubLObject output_format_tail = property_list_member($OUTPUT_FORMAT, current);
        final SubLObject output_format = (NIL != output_format_tail) ? cadr(output_format_tail) : NIL;
        final SubLObject header_tail = property_list_member($HEADER, current);
        final SubLObject header = (NIL != header_tail) ? cadr(header_tail) : NIL;
        final SubLObject include_commentsP_tail = property_list_member($kw48$INCLUDE_COMMENTS_, current);
        final SubLObject include_commentsP = (NIL != include_commentsP_tail) ? cadr(include_commentsP_tail) : NIL;
        final SubLObject negate_queriesP_tail = property_list_member($kw50$NEGATE_QUERIES_, current);
        final SubLObject negate_queriesP = (NIL != negate_queriesP_tail) ? cadr(negate_queriesP_tail) : T;
        final SubLObject verboseP_tail = property_list_member($VERBOSE_, current);
        final SubLObject verboseP = (NIL != verboseP_tail) ? cadr(verboseP_tail) : T;
        check_folification_properties(translation_type, mt_handling, NIL, isa_handling, rule_macro_predicate_handling, string_handling, number_handling, allow_equiv_relationP, sample_rate, output_filename, output_format, header, NIL, NIL, include_commentsP, T, negate_queriesP, verboseP);
        SubLObject disjuncts = NIL;
        final SubLObject _prev_bind_0 = $fol_translation_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $fol_mt_handling$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $fol_isa_handling$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $fol_rmp_handling$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $fol_string_handling$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $fol_number_handling$.currentBinding(thread);
        try {
            $fol_translation_type$.bind(NIL != translation_type ? translation_type : $fol_translation_type$.getDynamicValue(thread), thread);
            $fol_mt_handling$.bind(NIL != mt_handling ? mt_handling : $fol_mt_handling$.getDynamicValue(thread), thread);
            $fol_isa_handling$.bind(NIL != isa_handling ? isa_handling : $fol_isa_handling$.getDynamicValue(thread), thread);
            $fol_rmp_handling$.bind(NIL != rule_macro_predicate_handling ? rule_macro_predicate_handling : $fol_rmp_handling$.getDynamicValue(thread), thread);
            $fol_string_handling$.bind(NIL != string_handling ? string_handling : $fol_string_handling$.getDynamicValue(thread), thread);
            $fol_number_handling$.bind(NIL != number_handling ? number_handling : $fol_number_handling$.getDynamicValue(thread), thread);
            final SubLObject dnfs = clausifier.dnf_clausal_form(query, mt);
            if (NIL == cycl_grammar.cycl_truth_value_p(dnfs)) {
                SubLObject cdolist_list_var = dnfs;
                SubLObject dnf = NIL;
                dnf = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current_$20;
                    final SubLObject datum_$20 = current_$20 = dnf;
                    SubLObject neg_lits = NIL;
                    SubLObject pos_lits = NIL;
                    destructuring_bind_must_consp(current_$20, datum_$20, $list80);
                    neg_lits = current_$20.first();
                    current_$20 = current_$20.rest();
                    destructuring_bind_must_consp(current_$20, datum_$20, $list80);
                    pos_lits = current_$20.first();
                    current_$20 = current_$20.rest();
                    if (NIL == current_$20) {
                        SubLObject fol_neg_lits = NIL;
                        SubLObject fol_pos_lits = NIL;
                        SubLObject cdolist_list_var_$22 = neg_lits;
                        SubLObject neg_lit = NIL;
                        neg_lit = cdolist_list_var_$22.first();
                        while (NIL != cdolist_list_var_$22) {
                            final SubLObject fol_sentence = asent_sentence(neg_lit, mt, mt_handling);
                            fol_neg_lits = cons(fol_sentence, fol_neg_lits);
                            cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                            neg_lit = cdolist_list_var_$22.first();
                        } 
                        SubLObject cdolist_list_var_$23 = pos_lits;
                        SubLObject pos_lit = NIL;
                        pos_lit = cdolist_list_var_$23.first();
                        while (NIL != cdolist_list_var_$23) {
                            final SubLObject fol_sentence = asent_sentence(pos_lit, mt, mt_handling);
                            fol_pos_lits = cons(fol_sentence, fol_pos_lits);
                            cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                            pos_lit = cdolist_list_var_$23.first();
                        } 
                        fol_neg_lits = nreverse(fol_neg_lits);
                        fol_pos_lits = nreverse(fol_pos_lits);
                        final SubLObject fol_dnf = clauses.make_dnf(fol_neg_lits, fol_pos_lits);
                        final SubLObject fol_sentence2 = clauses.dnf_formula(fol_dnf);
                        disjuncts = cons(fol_sentence2, disjuncts);
                    } else {
                        cdestructuring_bind_error(datum_$20, $list80);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    dnf = cdolist_list_var.first();
                } 
            }
            if (NIL == disjuncts) {
                result = NIL;
            } else {
                result = simplifier.simplify_cycl_sentence_syntax(simplifier.disjoin(disjuncts, UNPROVIDED), UNPROVIDED);
                final SubLObject pcase_var = $fol_mt_handling$.getDynamicValue(thread);
                if (pcase_var.eql($MT_ARGUMENT)) {
                    final SubLObject mt_visible_asent = make_binary_formula($$genlMt, $$UniversalVocabularyMt, $sym83$_MT);
                    final SubLObject genlmt_fol_asent = asent_sentence(mt_visible_asent, mt, $fol_mt_handling$.getDynamicValue(thread));
                    result = make_implication(genlmt_fol_asent, result);
                } else
                    if (pcase_var.eql($MT_VISIBLE)) {
                        final SubLObject mt_visible_asent = make_unary_formula($$mtVisible, mt);
                        final SubLObject mt_visible_fol_asent = asent_sentence(mt_visible_asent, mt, $fol_mt_handling$.getDynamicValue(thread));
                        result = make_implication(mt_visible_fol_asent, result);
                    } else
                        if (pcase_var.eql($MT_VISIBLE_EXCEPT_CORE_MTS)) {
                            if (NIL == mt_vars.core_microtheory_p(mt)) {
                                final SubLObject mt_visible_asent = make_unary_formula($$mtVisible, mt);
                                final SubLObject mt_visible_fol_asent = asent_sentence(mt_visible_asent, mt, $fol_mt_handling$.getDynamicValue(thread));
                                result = make_implication(mt_visible_fol_asent, result);
                            }
                        } else
                            if (pcase_var.eql($FLAT)) {
                            }



                if (NIL != negate_queriesP) {
                    result = cycl_utilities.negate(result);
                }
            }
        } finally {
            $fol_number_handling$.rebind(_prev_bind_6, thread);
            $fol_string_handling$.rebind(_prev_bind_5, thread);
            $fol_rmp_handling$.rebind(_prev_bind_4, thread);
            $fol_isa_handling$.rebind(_prev_bind_3, thread);
            $fol_mt_handling$.rebind(_prev_bind_2, thread);
            $fol_translation_type$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject fol_query_to_stream(final SubLObject fol_query, final SubLObject fol_sentences_analysis, final SubLObject output_format, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (output_format.eql($CYCL)) {
            return fol_query_to_cycl_stream(fol_query, fol_sentences_analysis, stream);
        }
        if (output_format.eql($TPTP)) {
            return fol_query_to_tptp_stream(fol_query, fol_sentences_analysis, stream);
        }
        if (output_format == $ALCHEMY) {
            return Errors.error($str87$Queries_not_supported_for_Alchemy);
        }
        return Errors.error($str74$Unrecognized_output_format___s, output_format);
    }

    public static SubLObject kbq_fol_sentence(final SubLObject query_spec, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject sentence = kb_query.kbq_query_arguments(query_spec, UNPROVIDED);
        final SubLObject mt = thread.secondMultipleValue();
        final SubLObject query_properties = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != getf(query_properties, $kw88$CONDITIONAL_SENTENCE_, UNPROVIDED)) {
            Errors.warn($str89$can_t_handle_conditional_sentence);
            return NIL;
        }
        return query_fol_sentence(sentence, mt, v_properties);
    }

    public static SubLObject kbq_fol_sentence_to_stream(final SubLObject query_spec, final SubLObject fol_sentences_analysis, final SubLObject output_format, SubLObject v_properties, SubLObject stream) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject fol_query = kbq_fol_sentence(query_spec, v_properties);
        if (NIL != fol_query) {
            fol_query_to_stream(fol_query, fol_sentences_analysis, output_format, stream);
        }
        return NIL;
    }

    public static SubLObject assertion_fol_sentences_to_stream(final SubLObject assertion, final SubLObject output_format, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fol_sentences = NIL;
        final SubLObject _prev_bind_0 = $tptp_axiom_count$.currentBinding(thread);
        try {
            $tptp_axiom_count$.bind(ZERO_INTEGER, thread);
            final SubLObject rejection_statistics = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
            final SubLObject _prev_bind_0_$24 = $candidate_sentence_count$.currentBinding(thread);
            try {
                $candidate_sentence_count$.bind($TESTING, thread);
                fol_sentences = assertion_fol_sentences(assertion);
                final SubLObject v_properties = list($OUTPUT_FORMAT, output_format);
                make_and_postprocess_fol_sentences_datum(assertion, fol_sentences, v_properties, stream, NIL, rejection_statistics);
            } finally {
                $candidate_sentence_count$.rebind(_prev_bind_0_$24, thread);
            }
        } finally {
            $tptp_axiom_count$.rebind(_prev_bind_0, thread);
        }
        return fol_sentences;
    }

    public static SubLObject make_and_postprocess_fol_sentences_datum(final SubLObject v_term, final SubLObject fol_sentences, final SubLObject v_properties, final SubLObject output_stream, final SubLObject analysis_stream, final SubLObject rejection_statistics) {
        final SubLObject datum = make_fol_sentences_datum(v_term, fol_sentences);
        postprocess_fol_sentences_datum(datum, v_properties, output_stream, analysis_stream, rejection_statistics);
        return datum;
    }

    public static SubLObject make_fol_sentences_datum(final SubLObject v_term, final SubLObject fol_sentences) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject handled_fol_sentences = partition_fol_unhandled_sentences(fol_sentences);
        final SubLObject unhandled_fol_sentences = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != unhandled_fol_sentences) {
            return list(v_term, handled_fol_sentences, unhandled_fol_sentences);
        }
        return list(v_term, handled_fol_sentences);
    }

    public static SubLObject postprocess_fol_sentences_datum(final SubLObject datum, final SubLObject v_properties, final SubLObject output_stream, final SubLObject analysis_stream, final SubLObject rejection_statistics) {
        update_fol_analysis_counts(datum);
        if (NIL != output_stream) {
            postprocess_fol_sentences_datum_output(datum, v_properties, output_stream);
        }
        if (NIL != analysis_stream) {
            postprocess_fol_sentences_datum_analysis(datum, v_properties, analysis_stream);
        }
        fol_sentences_datum_update_rejection_statistics(datum, rejection_statistics);
        return NIL;
    }

    public static SubLObject postprocess_fol_sentences_datum_output(final SubLObject datum, final SubLObject v_properties, final SubLObject output_stream) {
        final SubLObject output_format = getf(v_properties, $OUTPUT_FORMAT, UNPROVIDED);
        fol_datum_to_stream(datum, output_format, output_stream);
        return NIL;
    }

    public static SubLObject postprocess_fol_sentences_datum_analysis(final SubLObject datum, final SubLObject v_properties, final SubLObject analysis_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject internalP = getf(v_properties, $kw47$ANALYSIS_FILE_INTERNAL_, UNPROVIDED);
        final SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
        try {
            $cfasl_common_symbols$.bind(NIL, thread);
            cfasl_set_common_symbols(dumper.kb_dump_common_symbols());
            if (NIL != internalP) {
                cfasl_output(datum, analysis_stream);
            } else {
                cfasl_output_externalized(datum, analysis_stream);
            }
        } finally {
            $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject possibly_save_fol_sentences_analysis(final SubLObject analysis, final SubLObject analysis_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_properties = fol_sentences_analysis_generation_properties(analysis);
        if (NIL != analysis_stream) {
            final SubLObject internalP = getf(v_properties, $kw47$ANALYSIS_FILE_INTERNAL_, UNPROVIDED);
            final SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
            try {
                $cfasl_common_symbols$.bind(NIL, thread);
                cfasl_set_common_symbols(dumper.kb_dump_common_symbols());
                if (NIL != internalP) {
                    cfasl_output(analysis, analysis_stream);
                } else {
                    cfasl_output_externalized(analysis, analysis_stream);
                }
            } finally {
                $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject update_fol_analysis_counts(final SubLObject datum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($candidate_sentence_count$.getDynamicValue(thread) == $TESTING) {
            return datum;
        }
        SubLObject v_term = NIL;
        SubLObject fol_sentences = NIL;
        destructuring_bind_must_consp(datum, datum, $list76);
        v_term = datum.first();
        SubLObject current = datum.rest();
        destructuring_bind_must_consp(current, datum, $list76);
        fol_sentences = current.first();
        current = current.rest();
        final SubLObject unhandled_fol_sentences = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list76);
        current = current.rest();
        if (NIL == current) {
            $candidate_sentence_count$.setDynamicValue(add($candidate_sentence_count$.getDynamicValue(thread), length(fol_sentences)), thread);
            $candidate_sentence_count$.setDynamicValue(add($candidate_sentence_count$.getDynamicValue(thread), length(unhandled_fol_sentences)), thread);
            $handled_sentence_count$.setDynamicValue(add($handled_sentence_count$.getDynamicValue(thread), length(fol_sentences)), thread);
            $term_count$.setDynamicValue(add($term_count$.getDynamicValue(thread), ONE_INTEGER), thread);
            if ((NIL != fol_sentences) && (NIL == unhandled_fol_sentences)) {
                $handled_term_count$.setDynamicValue(add($handled_term_count$.getDynamicValue(thread), ONE_INTEGER), thread);
            } else
                if ((NIL != fol_sentences) && (NIL != unhandled_fol_sentences)) {
                    $partially_handled_term_count$.setDynamicValue(add($partially_handled_term_count$.getDynamicValue(thread), ONE_INTEGER), thread);
                } else {
                    $unhandled_term_count$.setDynamicValue(add($unhandled_term_count$.getDynamicValue(thread), ONE_INTEGER), thread);
                }

        } else {
            cdestructuring_bind_error(datum, $list76);
        }
        return datum;
    }

    public static SubLObject check_folification_properties(final SubLObject translation_type, final SubLObject mt_handling, final SubLObject mt_ceiling, final SubLObject isa_handling, final SubLObject rule_macro_predicate_handling, final SubLObject string_handling, final SubLObject number_handling, final SubLObject allow_equiv_relationP, final SubLObject sample_rate, final SubLObject output_filename, final SubLObject output_format, final SubLObject header, final SubLObject analysis_filename, final SubLObject analysis_file_internalP, final SubLObject include_commentsP, final SubLObject return_dataP, final SubLObject negate_queriesP, final SubLObject verboseP) {
        if (((NIL != translation_type) && (!assertionsDisabledSynth)) && (NIL == fol_translation_type_property_p(translation_type))) {
            throw new AssertionError(translation_type);
        }
        if (((NIL != mt_handling) && (!assertionsDisabledSynth)) && (NIL == fol_mt_handling_property_p(mt_handling))) {
            throw new AssertionError(mt_handling);
        }
        if (((NIL != mt_ceiling) && (!assertionsDisabledSynth)) && (NIL == hlmt.hlmt_p(mt_ceiling))) {
            throw new AssertionError(mt_ceiling);
        }
        if (((NIL != isa_handling) && (!assertionsDisabledSynth)) && (NIL == fol_isa_handling_property_p(isa_handling))) {
            throw new AssertionError(isa_handling);
        }
        if (((NIL != rule_macro_predicate_handling) && (!assertionsDisabledSynth)) && (NIL == fol_rmp_handling_property_p(rule_macro_predicate_handling))) {
            throw new AssertionError(rule_macro_predicate_handling);
        }
        if (((NIL != string_handling) && (!assertionsDisabledSynth)) && (NIL == fol_string_handling_property_p(string_handling))) {
            throw new AssertionError(string_handling);
        }
        if (((NIL != number_handling) && (!assertionsDisabledSynth)) && (NIL == fol_number_handling_property_p(number_handling))) {
            throw new AssertionError(number_handling);
        }
        assert NIL != booleanp(allow_equiv_relationP) : "Types.booleanp(allow_equiv_relationP) " + "CommonSymbols.NIL != Types.booleanp(allow_equiv_relationP) " + allow_equiv_relationP;
        assert NIL != subl_promotions.positive_integer_p(sample_rate) : "subl_promotions.positive_integer_p(sample_rate) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(sample_rate) " + sample_rate;
        if (((NIL != output_filename) && (!assertionsDisabledSynth)) && (NIL == file_utilities.file_valid_for_writing_p(output_filename))) {
            throw new AssertionError(output_filename);
        }
        if (((NIL != output_format) && (!assertionsDisabledSynth)) && (NIL == fol_output_format_p(output_format))) {
            throw new AssertionError(output_format);
        }
        if (((NIL != header) && (!assertionsDisabledSynth)) && (NIL == stringp(header))) {
            throw new AssertionError(header);
        }
        if (((NIL != analysis_filename) && (!assertionsDisabledSynth)) && (NIL == file_utilities.file_valid_for_writing_p(analysis_filename))) {
            throw new AssertionError(analysis_filename);
        }
        assert NIL != booleanp(analysis_file_internalP) : "Types.booleanp(analysis_file_internalP) " + "CommonSymbols.NIL != Types.booleanp(analysis_file_internalP) " + analysis_file_internalP;
        assert NIL != booleanp(include_commentsP) : "Types.booleanp(include_commentsP) " + "CommonSymbols.NIL != Types.booleanp(include_commentsP) " + include_commentsP;
        assert NIL != booleanp(return_dataP) : "Types.booleanp(return_dataP) " + "CommonSymbols.NIL != Types.booleanp(return_dataP) " + return_dataP;
        assert NIL != booleanp(negate_queriesP) : "Types.booleanp(negate_queriesP) " + "CommonSymbols.NIL != Types.booleanp(negate_queriesP) " + negate_queriesP;
        assert NIL != booleanp(verboseP) : "Types.booleanp(verboseP) " + "CommonSymbols.NIL != Types.booleanp(verboseP) " + verboseP;
        return NIL;
    }

    public static SubLObject kb_fol_assertion_under_mt_ceilingP(final SubLObject assertion, final SubLObject mt_ceiling_spec) {
        return kb_fol_under_mt_ceilingP(assertions_high.assertion_mt(assertion), mt_ceiling_spec);
    }

    public static SubLObject kb_fol_under_mt_ceilingP(final SubLObject mt, final SubLObject mt_ceiling_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject above_ceilingP = NIL;
        if (NIL != mt_ceiling_spec) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_ceiling_spec);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                above_ceilingP = mt_relevance_macros.relevant_mtP(mt);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return makeBoolean(NIL == above_ceilingP);
    }

    public static SubLObject assertion_fol_sentences(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        SubLObject fol_sentences = NIL;
        final SubLObject pcase_var = $fol_rmp_handling$.getDynamicValue(thread);
        if (pcase_var.eql($GAF)) {
            fol_sentences = assertion_fol_sentences_int(assertion, mt);
        } else
            if (pcase_var.eql($EXPANSION) || pcase_var.eql($GAF_AND_EXPANSION)) {
                final SubLObject formula = uncanonicalizer.assertion_el_formula(assertion);
                final SubLObject _prev_bind_0 = $fol_rmp_handling$.currentBinding(thread);
                try {
                    $fol_rmp_handling$.bind($EXPANSION, thread);
                    fol_sentences = sentence_fol_sentences(formula, mt);
                } finally {
                    $fol_rmp_handling$.rebind(_prev_bind_0, thread);
                }
            }

        if ($fol_rmp_handling$.getDynamicValue(thread) == $GAF_AND_EXPANSION) {
            fol_sentences = nconc(fol_sentences, assertion_fol_sentences_int(assertion, mt));
        }
        if ((NIL != assertions_high.gaf_assertionP(assertion)) && (NIL != assertion_utilities.true_assertionP(assertion))) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject additional_sentences = additional_gaf_fol_sentences(gaf, mt);
            if (NIL != fol_sentences) {
                fol_sentences = nconc(fol_sentences, additional_sentences);
            }
        }
        return list_utilities.fast_delete_duplicates(fol_sentences, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject assertion_fol_sentences_int(final SubLObject assertion, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cnf = assertions_high.intuitive_assertion_cnf(assertion);
        SubLObject sentences = NIL;
        final SubLObject _prev_bind_0 = $fol_current_assertion$.currentBinding(thread);
        try {
            $fol_current_assertion$.bind(assertion, thread);
            sentences = cnf_fol_sentences(cnf, mt);
        } finally {
            $fol_current_assertion$.rebind(_prev_bind_0, thread);
        }
        return sentences;
    }

    public static SubLObject sentence_fol_sentences(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cycl_sentences = NIL;
        SubLObject fol_sentences = NIL;
        final SubLObject pcase_var = $fol_rmp_handling$.getDynamicValue(thread);
        if (pcase_var.eql($GAF)) {
            cycl_sentences = cons(sentence, cycl_sentences);
        } else
            if (pcase_var.eql($EXPANSION)) {
                cycl_sentences = cons(fol_expand_sentence(sentence, mt), cycl_sentences);
            } else
                if (pcase_var.eql($GAF_AND_EXPANSION)) {
                    cycl_sentences = cons(sentence, cycl_sentences);
                    final SubLObject expanded_sentence = fol_expand_sentence(sentence, mt);
                    if (!sentence.equal(expanded_sentence)) {
                        cycl_sentences = cons(expanded_sentence, cycl_sentences);
                    }
                }


        SubLObject cdolist_list_var = cycl_sentences;
        SubLObject sentence_$26 = NIL;
        sentence_$26 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject cnfs = cnf_clausal_form_for_fol(sentence_$26, mt);
            if (NIL == cycl_grammar.cycl_truth_value_p(cnfs)) {
                SubLObject cdolist_list_var_$27 = cnfs;
                SubLObject cnf = NIL;
                cnf = cdolist_list_var_$27.first();
                while (NIL != cdolist_list_var_$27) {
                    fol_sentences = nconc(fol_sentences, cnf_fol_sentences(cnf, mt));
                    if (NIL != clauses.gaf_cnfP(cnf)) {
                        final SubLObject gaf = clause_utilities.atomic_cnf_asent(cnf);
                        final SubLObject additional_sentences = additional_gaf_fol_sentences(gaf, mt);
                        fol_sentences = nconc(fol_sentences, additional_sentences);
                    }
                    cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                    cnf = cdolist_list_var_$27.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence_$26 = cdolist_list_var.first();
        } 
        return fol_sentences;
    }

    public static SubLObject fol_expand_sentence(final SubLObject sentence, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == el_formula_with_operator_p(sentence, $$resultIsaArg)) {
            SubLObject result = NIL;
            if (NIL != mt_vars.core_microtheory_p(mt)) {
                mt = mt_vars.$core_mt_floor$.getGlobalValue();
            }
            if (NIL != list_utilities.tree_find_if($sym110$FOL_EXPANDIBLE_EXPRESSION_, sentence, UNPROVIDED)) {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    result = implicitify_explicit_universal_quantifiers(transform_list_utilities.quiescent_transform(sentence, $sym110$FOL_EXPANDIBLE_EXPRESSION_, FOL_EXPAND_ONE_STEP, UNPROVIDED, UNPROVIDED));
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
            return result;
        }
        final SubLObject pcase_var = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
        if (pcase_var.eql($$RelationAllExistsFn)) {
            return $list106;
        }
        if (pcase_var.eql($$RelationExistsAllFn)) {
            return $list108;
        }
        return fol_unhandled($EXPLICITLY_FORBIDDEN_TERM, $$resultIsaArg);
    }

    public static SubLObject fol_expandible_expressionP(final SubLObject formula) {
        return fol_expandible_rmpP(formula);
    }

    public static SubLObject fol_expandible_rmpP(final SubLObject formula) {
        return makeBoolean((NIL != fort_types_interface.rule_macro_predicate_p(cycl_utilities.formula_operator(formula))) && (NIL != kb_mapping_utilities.some_pred_value(cycl_utilities.formula_operator(formula), $$expansion, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject fol_expand_one_step(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return explicitify_implicit_universal_quantifiers(verbosifier.el_expansion_one_step(formula, mt));
    }

    public static SubLObject cnf_clausal_form_for_fol(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cnfs = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$turn_existentials_into_skolemsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = clausifier.$use_cnf_cacheP$.currentBinding(thread);
        try {
            czer_vars.$turn_existentials_into_skolemsP$.bind(NIL, thread);
            clausifier.$use_cnf_cacheP$.bind(NIL, thread);
            cnfs = clausifier.cnf_clausal_form(sentence, mt);
        } finally {
            clausifier.$use_cnf_cacheP$.rebind(_prev_bind_2, thread);
            czer_vars.$turn_existentials_into_skolemsP$.rebind(_prev_bind_0, thread);
        }
        return cnfs;
    }

    public static SubLObject cnf_fol_sentences(final SubLObject cnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentences = NIL;
        SubLObject neg_lits = NIL;
        SubLObject pos_lits = NIL;
        destructuring_bind_must_consp(cnf, cnf, $list80);
        neg_lits = cnf.first();
        SubLObject current = cnf.rest();
        destructuring_bind_must_consp(current, cnf, $list80);
        pos_lits = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject fol_neg_lits = NIL;
            SubLObject fol_pos_lits = NIL;
            SubLObject not_in_theoryP = NIL;
            final SubLObject pcase_var = $fol_mt_handling$.getDynamicValue(thread);
            if (pcase_var.eql($MT_ARGUMENT)) {
                if (((NIL != neg_lits) || (!length(pos_lits).equal(ONE_INTEGER))) || (!pos_lits.first().first().equal($$genlMt))) {
                    final SubLObject genlmt_asent = make_binary_formula($$genlMt, mt, $sym83$_MT);
                    fol_neg_lits = cons(asent_sentence(genlmt_asent, $$UniversalVocabularyMt, $fol_mt_handling$.getDynamicValue(thread)), fol_neg_lits);
                }
            } else
                if (pcase_var.eql($MT_VISIBLE)) {
                    final SubLObject mt_visible_asent = make_unary_formula($$mtVisible, mt);
                    fol_neg_lits = cons(asent_sentence(mt_visible_asent, mt, $fol_mt_handling$.getDynamicValue(thread)), fol_neg_lits);
                } else
                    if (pcase_var.eql($MT_VISIBLE_EXCEPT_CORE_MTS)) {
                        if (NIL == mt_vars.core_microtheory_p(mt)) {
                            final SubLObject mt_visible_asent = make_unary_formula($$mtVisible, mt);
                            fol_neg_lits = cons(asent_sentence(mt_visible_asent, mt, $fol_mt_handling$.getDynamicValue(thread)), fol_neg_lits);
                        }
                    } else
                        if (!pcase_var.eql($FLAT)) {
                            SubLObject current_$29;
                            final SubLObject datum_$28 = current_$29 = $fol_mt_handling$.getDynamicValue(thread);
                            SubLObject collapse = NIL;
                            SubLObject theory_mt = NIL;
                            destructuring_bind_must_consp(current_$29, datum_$28, $list113);
                            collapse = current_$29.first();
                            current_$29 = current_$29.rest();
                            destructuring_bind_must_consp(current_$29, datum_$28, $list113);
                            theory_mt = current_$29.first();
                            current_$29 = current_$29.rest();
                            if (NIL == current_$29) {
                                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(theory_mt);
                                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    if (NIL == mt_relevance_macros.relevant_mtP(mt)) {
                                        not_in_theoryP = T;
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                }
                            } else {
                                cdestructuring_bind_error(datum_$28, $list113);
                            }
                        }



            if (NIL != not_in_theoryP) {
                sentences = cons(fol_unhandled($NOT_IN_THEORY, mt), sentences);
            } else {
                SubLObject cdolist_list_var = neg_lits;
                SubLObject neg_lit = NIL;
                neg_lit = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject fol_sentence = asent_sentence(neg_lit, mt, $fol_mt_handling$.getDynamicValue(thread));
                    fol_neg_lits = cons(fol_sentence, fol_neg_lits);
                    cdolist_list_var = cdolist_list_var.rest();
                    neg_lit = cdolist_list_var.first();
                } 
                cdolist_list_var = pos_lits;
                SubLObject pos_lit = NIL;
                pos_lit = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject fol_sentence = asent_sentence(pos_lit, mt, $fol_mt_handling$.getDynamicValue(thread));
                    fol_pos_lits = cons(fol_sentence, fol_pos_lits);
                    cdolist_list_var = cdolist_list_var.rest();
                    pos_lit = cdolist_list_var.first();
                } 
                fol_neg_lits = nreverse(fol_neg_lits);
                fol_pos_lits = nreverse(fol_pos_lits);
                final SubLObject fol_cnf = clauses.make_cnf(fol_neg_lits, fol_pos_lits);
                final SubLObject fol_sentence2 = clauses.cnf_formula(fol_cnf, UNPROVIDED);
                sentences = cons(fol_sentence2, sentences);
            }
        } else {
            cdestructuring_bind_error(cnf, $list80);
        }
        return nreverse(sentences);
    }

    public static SubLObject partition_fol_unhandled_sentences(final SubLObject fol_sentences) {
        if (NIL == contains_fol_unhandled_expression_p(fol_sentences)) {
            return values(fol_sentences, NIL);
        }
        SubLObject handled_fol_sentences = NIL;
        SubLObject unhandled_fol_sentences = NIL;
        SubLObject cdolist_list_var = fol_sentences;
        SubLObject fol_sentence = NIL;
        fol_sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != contains_fol_unhandled_expression_p(fol_sentence)) {
                unhandled_fol_sentences = cons(fol_sentence, unhandled_fol_sentences);
            } else {
                handled_fol_sentences = cons(fol_sentence, handled_fol_sentences);
            }
            cdolist_list_var = cdolist_list_var.rest();
            fol_sentence = cdolist_list_var.first();
        } 
        return values(nreverse(handled_fol_sentences), nreverse(unhandled_fol_sentences));
    }

    public static SubLObject fol_sentences_datum_update_rejection_statistics(final SubLObject datum, final SubLObject rejection_statistics) {
        SubLObject v_term = NIL;
        SubLObject fol_sentences = NIL;
        destructuring_bind_must_consp(datum, datum, $list76);
        v_term = datum.first();
        SubLObject current = datum.rest();
        destructuring_bind_must_consp(current, datum, $list76);
        fol_sentences = current.first();
        current = current.rest();
        final SubLObject unhandled_fol_sentences = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list76);
        current = current.rest();
        if (NIL == current) {
            if (NIL != unhandled_fol_sentences) {
                update_fol_rejection_statistics_for_expression(unhandled_fol_sentences, rejection_statistics);
            }
        } else {
            cdestructuring_bind_error(datum, $list76);
        }
        return NIL;
    }

    public static SubLObject update_fol_rejection_statistics_for_expression(final SubLObject fol_expression, final SubLObject rejection_statistics) {
        final SubLObject reason_set = set.new_set(symbol_function(EQ), UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject rejections = cdolist_list_var = list_utilities.tree_gather(fol_expression, FOL_UNHANDLED_EXPRESSION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject rejection = NIL;
        rejection = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = rejection;
            SubLObject fol_unhandled_fn = NIL;
            SubLObject reason = NIL;
            SubLObject culprit = NIL;
            destructuring_bind_must_consp(current, datum, $list116);
            fol_unhandled_fn = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list116);
            reason = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list116);
            culprit = current.first();
            current = current.rest();
            if (NIL == current) {
                set.set_add(reason, reason_set);
            } else {
                cdestructuring_bind_error(datum, $list116);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rejection = cdolist_list_var.first();
        } 
        final SubLObject set_contents_var = set.do_set_internal(reason_set);
        SubLObject reason;
        SubLObject basis_object;
        SubLObject state;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            reason = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, reason)) {
                dictionary_utilities.dictionary_increment(rejection_statistics, reason, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject print_folification_summary(final SubLObject fol_sentences_analysis, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        format(stream, $str117$___a__, $$$FOLification_statistics);
        format(stream, $str119$_a__, $str120$_______________________);
        kb_utilities.kb_statistics(stream, UNPROVIDED);
        final SubLObject rejection_statistics = fol_sentences_analysis_rejection_statistics(fol_sentences_analysis);
        if (NIL != rejection_statistics) {
            format(stream, $str117$___a__, $str121$Rejection_statistics__raw__);
            print_fol_rejection_statistics(fol_sentences_analysis_rejection_statistics(fol_sentences_analysis), stream);
            terpri(stream);
            format(stream, $str117$___a__, $str122$Rejection_statistics__pretty__);
            pretty_print_fol_rejection_statistics(fol_sentences_analysis_rejection_statistics(fol_sentences_analysis), stream);
        }
        format(stream, $str117$___a__, $str123$Conversion_statistics_);
        SubLObject print_plist = copy_list(fol_sentences_analysis);
        print_plist = remf(print_plist, $FOL_SENTENCES_DATA);
        print_plist = remf(print_plist, $REJECTION_STATISTICS);
        list_utilities.pretty_print_plist(print_plist, stream);
        return NIL;
    }

    public static SubLObject print_fol_rejection_statistics(final SubLObject rejection_statistics, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return format_nil.print_one_per_line(dictionary_utilities.sort_dictionary_by_values(rejection_statistics, symbol_function($sym124$_)), stream);
    }

    public static SubLObject pretty_print_fol_rejection_statistics(final SubLObject rejection_statistics, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_values(rejection_statistics, symbol_function($sym124$_));
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = entry;
            SubLObject reason = NIL;
            SubLObject count = NIL;
            destructuring_bind_must_consp(current, datum, $list125);
            reason = current.first();
            current = count = current.rest();
            final SubLObject explanation = fol_unhandled_explanation(reason);
            format(stream, $str126$_s_assertion_p_could_not_be_conve, new SubLObject[]{ count, count, NIL != number_utilities.onep(count) ? $$$it : $$$they, explanation });
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject fol_unhandled_explanation(final SubLObject reason) {
        SubLObject explanation = getf($folification_unhandled_explanation_table$.getGlobalValue(), reason, UNPROVIDED);
        if (NIL == explanation) {
            explanation = cconcatenate($$$yielded_the_rejection_condition_, string_utilities.str(reason));
        }
        return explanation;
    }

    public static SubLObject fol_unhandled_expression_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_formula_p(v_object)) && $$FOL_UnhandledFn.eql(cycl_utilities.formula_operator(v_object)));
    }

    public static SubLObject contains_fol_unhandled_expression_p(final SubLObject v_object) {
        return list_utilities.tree_find_if(FOL_UNHANDLED_EXPRESSION_P, v_object, UNPROVIDED);
    }

    public static SubLObject fol_unhandled(final SubLObject reason, final SubLObject culprit) {
        return make_binary_formula($$FOL_UnhandledFn, reason, culprit);
    }

    public static SubLObject additional_gaf_fol_sentences(final SubLObject gaf, final SubLObject mt) {
        SubLObject predicate = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(gaf, gaf, $list131);
        predicate = gaf.first();
        final SubLObject current = args = gaf.rest();
        if (NIL != forts.fort_p(predicate)) {
            final SubLObject pcase_var = predicate;
            if (pcase_var.eql($$genlPreds)) {
                SubLObject current_$32;
                final SubLObject datum_$31 = current_$32 = args;
                SubLObject arg1 = NIL;
                SubLObject arg2 = NIL;
                destructuring_bind_must_consp(current_$32, datum_$31, $list133);
                arg1 = current_$32.first();
                current_$32 = current_$32.rest();
                destructuring_bind_must_consp(current_$32, datum_$31, $list133);
                arg2 = current_$32.first();
                current_$32 = current_$32.rest();
                if (NIL == current_$32) {
                    final SubLObject v_arity = arity.arity(arg1);
                    if (v_arity.isInteger()) {
                        final SubLObject v_variables = fol_sequence_variable_args_for_arity(v_arity);
                        final SubLObject expansion_cnf = list(list(bq_cons(arg1, append(v_variables, NIL))), list(bq_cons(arg2, append(v_variables, NIL))));
                        return cnf_fol_sentences(expansion_cnf, mt);
                    }
                } else {
                    cdestructuring_bind_error(datum_$31, $list133);
                }
            } else
                if (pcase_var.eql($$negationPreds)) {
                    SubLObject current_$33;
                    final SubLObject datum_$32 = current_$33 = args;
                    SubLObject arg1 = NIL;
                    SubLObject arg2 = NIL;
                    destructuring_bind_must_consp(current_$33, datum_$32, $list133);
                    arg1 = current_$33.first();
                    current_$33 = current_$33.rest();
                    destructuring_bind_must_consp(current_$33, datum_$32, $list133);
                    arg2 = current_$33.first();
                    current_$33 = current_$33.rest();
                    if (NIL == current_$33) {
                        final SubLObject v_arity = arity.arity(arg1);
                        if (v_arity.isInteger()) {
                            final SubLObject v_variables = fol_sequence_variable_args_for_arity(v_arity);
                            final SubLObject expansion_cnf = bq_cons(list(bq_cons(arg1, append(v_variables, NIL)), bq_cons(arg2, append(v_variables, NIL))), $list135);
                            return cnf_fol_sentences(expansion_cnf, mt);
                        }
                    } else {
                        cdestructuring_bind_error(datum_$32, $list133);
                    }
                } else {
                    if (((((pcase_var.eql($$arg1Isa) || pcase_var.eql($$arg2Isa)) || pcase_var.eql($$arg3Isa)) || pcase_var.eql($$arg4Isa)) || pcase_var.eql($$arg5Isa)) || pcase_var.eql($$arg6Isa)) {
                        return additional_arg_isa_or_arg_genl_sentences(gaf, mt, $$isa);
                    }
                    if (((((pcase_var.eql($$arg1Genl) || pcase_var.eql($$arg2Genl)) || pcase_var.eql($$arg3Genl)) || pcase_var.eql($$arg4Genl)) || pcase_var.eql($$arg5Genl)) || pcase_var.eql($$arg6Genl)) {
                        return additional_arg_isa_or_arg_genl_sentences(gaf, mt, $$genls);
                    }
                    if (pcase_var.eql($$resultIsa)) {
                        return additional_result_isa_or_result_genl_sentences(gaf, mt, $$isa);
                    }
                    if (pcase_var.eql($$resultGenl)) {
                        return additional_result_isa_or_result_genl_sentences(gaf, mt, $$resultGenl);
                    }
                    if ((pcase_var.eql($$genls) || pcase_var.eql($$disjointWith)) || pcase_var.eql($$genlInverse)) {
                        SubLObject sentences = NIL;
                        final SubLObject expansion = verbosifier.el_expansion_one_step(gaf, mt);
                        if (!expansion.equal(gaf)) {
                            final SubLObject cnfs = clausifier.cnf_clausal_form(expansion, mt);
                            if (!$$True.eql(cnfs)) {
                                if (cnfs.isCons()) {
                                    SubLObject cdolist_list_var = cnfs;
                                    SubLObject cnf = NIL;
                                    cnf = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        sentences = nconc(cnf_fol_sentences(cnf, mt), sentences);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        cnf = cdolist_list_var.first();
                                    } 
                                } else {
                                    sentences = list(fol_unhandled($EXPANSION, expansion));
                                }
                            }
                        }
                        return sentences;
                    }
                }

        }
        return NIL;
    }

    public static SubLObject additional_arg_isa_or_arg_genl_sentences(final SubLObject gaf, final SubLObject mt, final SubLObject arg_pred) {
        SubLObject predicate = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(gaf, gaf, $list131);
        predicate = gaf.first();
        final SubLObject current = args = gaf.rest();
        SubLObject current_$36;
        final SubLObject datum_$35 = current_$36 = args;
        SubLObject pred = NIL;
        SubLObject col = NIL;
        destructuring_bind_must_consp(current_$36, datum_$35, $list155);
        pred = current_$36.first();
        current_$36 = current_$36.rest();
        destructuring_bind_must_consp(current_$36, datum_$35, $list155);
        col = current_$36.first();
        current_$36 = current_$36.rest();
        if (NIL == current_$36) {
            if (NIL != fort_types_interface.functor_p(pred)) {
                return list(fol_unhandled($FUNCTION_ARG_CONSTRAINT, gaf));
            }
            if (NIL != fort_types_interface.predicate_p(pred)) {
                final SubLObject v_arity = arity.arity(pred);
                if (v_arity.isInteger()) {
                    final SubLObject v_variables = fol_sequence_variable_args_for_arity(v_arity);
                    final SubLObject index = ($$isa.eql(arg_pred)) ? kb_accessors.isa_pred_arg(predicate) : kb_accessors.genl_pred_arg(predicate);
                    final SubLObject var = nth(number_utilities.f_1_(index), v_variables);
                    if (index.numG(v_arity)) {
                        return list(fol_unhandled($ILL_FORMED, gaf));
                    }
                    final SubLObject expansion_cnf = list(list(bq_cons(pred, append(v_variables, NIL))), list(list(arg_pred, var, col)));
                    return cnf_fol_sentences(expansion_cnf, mt);
                }
            } else {
                if (NIL != nonstandard_sentential_relation_p(pred)) {
                    return list(fol_unhandled($NONSTANDARD_SENTENTIAL_RELATION, pred));
                }
                return list(fol_unhandled($UNEXPECTED, pred));
            }
        } else {
            cdestructuring_bind_error(datum_$35, $list155);
        }
        return NIL;
    }

    public static SubLObject additional_result_isa_or_result_genl_sentences(final SubLObject gaf, final SubLObject mt, final SubLObject result_pred) {
        SubLObject predicate = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(gaf, gaf, $list131);
        predicate = gaf.first();
        final SubLObject current = args = gaf.rest();
        SubLObject current_$38;
        final SubLObject datum_$37 = current_$38 = args;
        SubLObject func = NIL;
        SubLObject col = NIL;
        destructuring_bind_must_consp(current_$38, datum_$37, $list160);
        func = current_$38.first();
        current_$38 = current_$38.rest();
        destructuring_bind_must_consp(current_$38, datum_$37, $list160);
        col = current_$38.first();
        current_$38 = current_$38.rest();
        if (NIL == current_$38) {
            final SubLObject v_arity = arity.arity(func);
            if (v_arity.isInteger()) {
                final SubLObject v_variables = fol_sequence_variable_args_for_arity(v_arity);
                final SubLObject expansion_cnf = list(NIL, list(list(result_pred, bq_cons(func, append(v_variables, NIL)), col)));
                return cnf_fol_sentences(expansion_cnf, mt);
            }
        } else {
            cdestructuring_bind_error(datum_$37, $list160);
        }
        return NIL;
    }

    public static SubLObject nonstandard_sentential_relation_p(final SubLObject v_object) {
        return makeBoolean((NIL != cyc_const_bounded_existential_operator_p(v_object)) || (NIL != user_defined_sentential_relation_p(v_object)));
    }

    public static SubLObject clear_fol_sequence_variable_args_for_arity() {
        final SubLObject cs = $fol_sequence_variable_args_for_arity_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_fol_sequence_variable_args_for_arity(final SubLObject v_arity) {
        return memoization_state.caching_state_remove_function_results_with_args($fol_sequence_variable_args_for_arity_caching_state$.getGlobalValue(), list(v_arity), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fol_sequence_variable_args_for_arity_internal(final SubLObject v_arity) {
        SubLObject args = NIL;
        SubLObject i;
        SubLObject arg;
        for (i = NIL, i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
            arg = cycl_variables.make_el_var(cconcatenate($$$ARG, format_nil.format_nil_a_no_copy(number_utilities.f_1X(i))));
            args = cons(arg, args);
        }
        return nreverse(args);
    }

    public static SubLObject fol_sequence_variable_args_for_arity(final SubLObject v_arity) {
        SubLObject caching_state = $fol_sequence_variable_args_for_arity_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(FOL_SEQUENCE_VARIABLE_ARGS_FOR_ARITY, $fol_sequence_variable_args_for_arity_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_arity, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(fol_sequence_variable_args_for_arity_internal(v_arity)));
            memoization_state.caching_state_put(caching_state, v_arity, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject kb_fol_additional_sentences_for_term(final SubLObject fort, final SubLObject mt_ceiling, final SubLObject allow_equiv_relationP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentences = NIL;
        if (NIL == list_utilities.member_eqP(fort, $unfolifiable_terms$.getGlobalValue())) {
            if (((NIL != fort_types_interface.collection_p(fort)) && (NIL != kb_fol_under_mt_ceilingP($$UniversalVocabularyMt, mt_ceiling))) && ($fol_isa_handling$.getDynamicValue(thread) == $UNARY_PREDICATE)) {
                if (NIL != allow_equiv_relationP) {
                    sentences = cons(list($$equiv, list($list165, $sym166$_X, fol_transform_arg(fort)), bq_cons(listS($$FOL_PredicateFn, fort, $list168), $list169)), sentences);
                } else {
                    sentences = cons(list($$implies, list($list165, $sym166$_X, fol_transform_arg(fort)), bq_cons(listS($$FOL_PredicateFn, fort, $list168), $list169)), sentences);
                    sentences = cons(list($$implies, bq_cons(listS($$FOL_PredicateFn, fort, $list168), $list169), list($list165, $sym166$_X, fol_transform_arg(fort))), sentences);
                }
            }
            if (fort.eql($$genlMt) && ($FLAT != $fol_mt_handling$.getDynamicValue(thread))) {
                sentences = cons($list171, sentences);
            }
            if ((NIL != list_utilities.member_eqP($fol_mt_handling$.getDynamicValue(thread), $list172)) && (NIL != mt_vars.core_microtheory_p(fort))) {
                sentences = cons(list($list173, fol_transform_arg(fort)), sentences);
            }
            if (NIL != fort_types_interface.predicate_p(fort)) {
                final SubLObject items_var = kb_fol_predicate_arg_type_sentences(fort);
                if (items_var.isVector()) {
                    final SubLObject vector_var = items_var;
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject item;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        item = aref(vector_var, element_num);
                        sentences = cons(item, sentences);
                    }
                } else {
                    SubLObject cdolist_list_var = items_var;
                    SubLObject item2 = NIL;
                    item2 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        sentences = cons(item2, sentences);
                        cdolist_list_var = cdolist_list_var.rest();
                        item2 = cdolist_list_var.first();
                    } 
                }
                if ((NIL != arity.binaryP(fort)) && (NIL != kb_fol_under_mt_ceilingP(mt_vars.$anect_mt$.getGlobalValue(), mt_ceiling))) {
                    SubLObject cdolist_list_var2 = kb_fol_transitive_binary_predicate_sentences(fort);
                    SubLObject sentence = NIL;
                    sentence = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        sentences = cons(sentence, sentences);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        sentence = cdolist_list_var2.first();
                    } 
                    cdolist_list_var2 = kb_fol_symmetric_binary_predicate_sentences(fort);
                    sentence = NIL;
                    sentence = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        sentences = cons(sentence, sentences);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        sentence = cdolist_list_var2.first();
                    } 
                    cdolist_list_var2 = kb_fol_asymmetric_binary_predicate_sentences(fort);
                    sentence = NIL;
                    sentence = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        sentences = cons(sentence, sentences);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        sentence = cdolist_list_var2.first();
                    } 
                    cdolist_list_var2 = kb_fol_reflexive_binary_predicate_sentences(fort);
                    sentence = NIL;
                    sentence = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        sentences = cons(sentence, sentences);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        sentence = cdolist_list_var2.first();
                    } 
                    cdolist_list_var2 = kb_fol_irreflexive_binary_predicate_sentences(fort);
                    sentence = NIL;
                    sentence = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        sentences = cons(sentence, sentences);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        sentence = cdolist_list_var2.first();
                    } 
                    cdolist_list_var2 = kb_fol_tva_sentences(fort);
                    sentence = NIL;
                    sentence = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        sentences = cons(sentence, sentences);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        sentence = cdolist_list_var2.first();
                    } 
                }
            }
            if ((NIL != fort_types_interface.fixed_arity_functor_p(fort)) && arity.arity(fort).isInteger()) {
                SubLObject items_var = kb_fol_nat_function_sentences(fort);
                if (items_var.isVector()) {
                    final SubLObject vector_var = items_var;
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject item;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        item = aref(vector_var, element_num);
                        sentences = cons(item, sentences);
                    }
                } else {
                    SubLObject cdolist_list_var = items_var;
                    SubLObject item2 = NIL;
                    item2 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        sentences = cons(item2, sentences);
                        cdolist_list_var = cdolist_list_var.rest();
                        item2 = cdolist_list_var.first();
                    } 
                }
                items_var = kb_fol_nat_argument_sentences(fort);
                if (items_var.isVector()) {
                    final SubLObject vector_var = items_var;
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject item;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        item = aref(vector_var, element_num);
                        sentences = cons(item, sentences);
                    }
                } else {
                    SubLObject cdolist_list_var = items_var;
                    SubLObject item2 = NIL;
                    item2 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        sentences = cons(item2, sentences);
                        cdolist_list_var = cdolist_list_var.rest();
                        item2 = cdolist_list_var.first();
                    } 
                }
                items_var = kb_fol_result_isa_sentences(fort);
                if (items_var.isVector()) {
                    final SubLObject vector_var = items_var;
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject item;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        item = aref(vector_var, element_num);
                        sentences = cons(item, sentences);
                    }
                } else {
                    SubLObject cdolist_list_var = items_var;
                    SubLObject item2 = NIL;
                    item2 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        sentences = cons(item2, sentences);
                        cdolist_list_var = cdolist_list_var.rest();
                        item2 = cdolist_list_var.first();
                    } 
                }
            }
        }
        return nreverse(sentences);
    }

    public static SubLObject do_arg_isa_gafs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list174);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject gaf_var = NIL;
        SubLObject argnum_var = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list174);
        gaf_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list174);
        argnum_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list174);
        pred = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject argnum_1 = $sym175$ARGNUM_1;
            final SubLObject arg_isa_pred = $sym176$ARG_ISA_PRED;
            final SubLObject v_arity = $sym177$ARITY;
            return list(PWHEN, list(FIXED_ARITY_PREDICATE_P, pred), list(CLET, list(list(v_arity, list(ARITY, pred))), list(PWHEN, v_arity, list(CDOTIMES, list(argnum_1, v_arity), list(CLET, list(list(argnum_var, list($sym183$1_, argnum_1)), list(arg_isa_pred, list(ARG_ISA_PRED, argnum_var))), listS(DO_GAF_ARG_INDEX, listS(gaf_var, pred, $PREDICATE, arg_isa_pred, $list187), append(body, NIL)))))));
        }
        cdestructuring_bind_error(datum, $list174);
        return NIL;
    }

    public static SubLObject kb_fol_predicate_arg_type_sentences(final SubLObject pred) {
        SubLObject fol_sentences = NIL;
        if (NIL != fort_types_interface.fixed_arity_predicate_p(pred)) {
            final SubLObject v_arity = arity.arity(pred);
            if (NIL != v_arity) {
                SubLObject argnum_1;
                SubLObject argnum;
                SubLObject pred_var;
                SubLObject arg_isa_pred;
                SubLObject iterator_var;
                SubLObject done_var;
                SubLObject token_var;
                SubLObject final_index_spec;
                SubLObject valid;
                SubLObject final_index_iterator;
                SubLObject done_var_$39;
                SubLObject token_var_$40;
                SubLObject gaf;
                SubLObject valid_$41;
                SubLObject constraint_col;
                SubLObject mt;
                SubLObject constraint_asent;
                SubLObject arg_type_cnf;
                SubLObject items_var;
                SubLObject vector_var;
                SubLObject backwardP_var;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject item;
                SubLObject cdolist_list_var;
                SubLObject item2;
                SubLObject _prev_bind_0;
                SubLObject _values;
                for (argnum_1 = NIL, argnum_1 = ZERO_INTEGER; argnum_1.numL(v_arity); argnum_1 = add(argnum_1, ONE_INTEGER)) {
                    argnum = number_utilities.f_1X(argnum_1);
                    arg_isa_pred = pred_var = kb_accessors.arg_isa_pred(argnum, UNPROVIDED, UNPROVIDED);
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(pred, ONE_INTEGER, pred_var)) {
                        iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(pred, ONE_INTEGER, pred_var);
                        done_var = NIL;
                        token_var = NIL;
                        while (NIL == done_var) {
                            final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    done_var_$39 = NIL;
                                    token_var_$40 = NIL;
                                    while (NIL == done_var_$39) {
                                        gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$40);
                                        valid_$41 = makeBoolean(!token_var_$40.eql(gaf));
                                        if (NIL != valid_$41) {
                                            constraint_col = assertions_high.gaf_arg2(gaf);
                                            mt = assertions_high.assertion_mt(gaf);
                                            constraint_asent = replace_formula_arg(argnum, $sym189$_INS, argnum_variable_formula(pred));
                                            arg_type_cnf = list(list(constraint_asent), list(list($$isa, $sym189$_INS, constraint_col)));
                                            items_var = cnf_fol_sentences(arg_type_cnf, mt);
                                            if (items_var.isVector()) {
                                                vector_var = items_var;
                                                backwardP_var = NIL;
                                                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                                    item = aref(vector_var, element_num);
                                                    fol_sentences = cons(item, fol_sentences);
                                                }
                                            } else {
                                                cdolist_list_var = items_var;
                                                item2 = NIL;
                                                item2 = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    fol_sentences = cons(item2, fol_sentences);
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    item2 = cdolist_list_var.first();
                                                } 
                                            }
                                        }
                                        done_var_$39 = makeBoolean(NIL == valid_$41);
                                    } 
                                } finally {
                                    _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                    try {
                                        bind($is_thread_performing_cleanupP$, T);
                                        _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }
            }
        }
        return fol_sentences;
    }

    public static SubLObject kb_fol_transitive_binary_predicate_sentences(final SubLObject predicate) {
        if (NIL != kb_accessors.transitive_predicateP(predicate)) {
            final SubLObject expansion_cnf = list(list(bq_cons(predicate, $list190), bq_cons(predicate, $list191)), list(bq_cons(predicate, $list192)));
            return cnf_fol_sentences(expansion_cnf, mt_vars.$anect_mt$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject kb_fol_symmetric_binary_predicate_sentences(final SubLObject predicate) {
        if (NIL != kb_accessors.symmetric_predicateP(predicate)) {
            final SubLObject expansion_cnf = list(list(bq_cons(predicate, $list190)), list(bq_cons(predicate, $list193)));
            return cnf_fol_sentences(expansion_cnf, mt_vars.$anect_mt$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject kb_fol_asymmetric_binary_predicate_sentences(final SubLObject predicate) {
        if (NIL != kb_accessors.asymmetric_predicateP(predicate)) {
            final SubLObject expansion_cnf = bq_cons(list(bq_cons(predicate, $list190), bq_cons(predicate, $list193)), $list135);
            return cnf_fol_sentences(expansion_cnf, mt_vars.$anect_mt$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject kb_fol_reflexive_binary_predicate_sentences(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fol_sentences = NIL;
        if (NIL != kb_accessors.reflexive_predicateP(predicate)) {
            final SubLObject arg_constraint_dict = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
            if (NIL != fort_types_interface.fixed_arity_predicate_p(predicate)) {
                final SubLObject v_arity = arity.arity(predicate);
                if (NIL != v_arity) {
                    SubLObject argnum_1;
                    SubLObject argnum;
                    SubLObject pred_var;
                    SubLObject arg_isa_pred;
                    SubLObject iterator_var;
                    SubLObject done_var;
                    SubLObject token_var;
                    SubLObject final_index_spec;
                    SubLObject valid;
                    SubLObject final_index_iterator;
                    SubLObject done_var_$42;
                    SubLObject token_var_$43;
                    SubLObject gaf;
                    SubLObject valid_$44;
                    SubLObject mt;
                    SubLObject constraint_col;
                    SubLObject _prev_bind_0;
                    SubLObject _values;
                    for (argnum_1 = NIL, argnum_1 = ZERO_INTEGER; argnum_1.numL(v_arity); argnum_1 = add(argnum_1, ONE_INTEGER)) {
                        argnum = number_utilities.f_1X(argnum_1);
                        arg_isa_pred = pred_var = kb_accessors.arg_isa_pred(argnum, UNPROVIDED, UNPROVIDED);
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, ONE_INTEGER, pred_var)) {
                            iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, ONE_INTEGER, pred_var);
                            done_var = NIL;
                            token_var = NIL;
                            while (NIL == done_var) {
                                final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                        done_var_$42 = NIL;
                                        token_var_$43 = NIL;
                                        while (NIL == done_var_$42) {
                                            gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$43);
                                            valid_$44 = makeBoolean(!token_var_$43.eql(gaf));
                                            if (NIL != valid_$44) {
                                                mt = assertions_high.assertion_mt(gaf);
                                                if (NIL != forts.fort_p(mt)) {
                                                    constraint_col = assertions_high.gaf_arg2(gaf);
                                                    dictionary_utilities.dictionary_push(arg_constraint_dict, mt, constraint_col);
                                                }
                                            }
                                            done_var_$42 = makeBoolean(NIL == valid_$44);
                                        } 
                                    } finally {
                                        _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            _values = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    }
                }
            }
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(arg_constraint_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject mt2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject constraint_cols = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject isa_neg_lits = NIL;
                SubLObject cdolist_list_var = genls.min_cols(constraint_cols, mt2, UNPROVIDED);
                SubLObject constraint_col2 = NIL;
                constraint_col2 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    isa_neg_lits = cons(list($$isa, $sym166$_X, constraint_col2), isa_neg_lits);
                    cdolist_list_var = cdolist_list_var.rest();
                    constraint_col2 = cdolist_list_var.first();
                } 
                final SubLObject mt_specific_cnf = list(isa_neg_lits, list(bq_cons(predicate, $list194)));
                final SubLObject items_var = cnf_fol_sentences(mt_specific_cnf, mt2);
                if (items_var.isVector()) {
                    final SubLObject vector_var = items_var;
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject item;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        item = aref(vector_var, element_num);
                        fol_sentences = cons(item, fol_sentences);
                    }
                } else {
                    SubLObject cdolist_list_var2 = items_var;
                    SubLObject item2 = NIL;
                    item2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        fol_sentences = cons(item2, fol_sentences);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        item2 = cdolist_list_var2.first();
                    } 
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        return fol_sentences;
    }

    public static SubLObject kb_fol_irreflexive_binary_predicate_sentences(final SubLObject predicate) {
        if (NIL != kb_accessors.irreflexive_predicateP(predicate)) {
            final SubLObject expansion_cnf = bq_cons(list(bq_cons(predicate, $list194)), $list135);
            return cnf_fol_sentences(expansion_cnf, mt_vars.$anect_mt$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject kb_fol_tva_sentences(final SubLObject predicate) {
        SubLObject sentences = NIL;
        if (NIL != tva_utilities.some_tva_for_predicate(predicate)) {
            SubLObject pred_var = $$transitiveViaArg;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$45 = NIL;
                            final SubLObject token_var_$46 = NIL;
                            while (NIL == done_var_$45) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$46);
                                final SubLObject valid_$47 = makeBoolean(!token_var_$46.eql(gaf));
                                if (NIL != valid_$47) {
                                    final SubLObject items_var = kb_fol_tva_sentences_int(gaf);
                                    if (items_var.isVector()) {
                                        final SubLObject vector_var = items_var;
                                        final SubLObject backwardP_var = NIL;
                                        SubLObject length;
                                        SubLObject v_iteration;
                                        SubLObject element_num;
                                        SubLObject item;
                                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                            item = aref(vector_var, element_num);
                                            sentences = cons(item, sentences);
                                        }
                                    } else {
                                        SubLObject cdolist_list_var = items_var;
                                        SubLObject item2 = NIL;
                                        item2 = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            sentences = cons(item2, sentences);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            item2 = cdolist_list_var.first();
                                        } 
                                    }
                                }
                                done_var_$45 = makeBoolean(NIL == valid_$47);
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
                    done_var = makeBoolean(NIL == valid);
                } 
            }
            pred_var = $$transitiveViaArgInverse;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$46 = NIL;
                            final SubLObject token_var_$47 = NIL;
                            while (NIL == done_var_$46) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$47);
                                final SubLObject valid_$48 = makeBoolean(!token_var_$47.eql(gaf));
                                if (NIL != valid_$48) {
                                    final SubLObject items_var = kb_fol_tva_sentences_int(gaf);
                                    if (items_var.isVector()) {
                                        final SubLObject vector_var = items_var;
                                        final SubLObject backwardP_var = NIL;
                                        SubLObject length;
                                        SubLObject v_iteration;
                                        SubLObject element_num;
                                        SubLObject item;
                                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                            item = aref(vector_var, element_num);
                                            sentences = cons(item, sentences);
                                        }
                                    } else {
                                        SubLObject cdolist_list_var = items_var;
                                        SubLObject item2 = NIL;
                                        item2 = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            sentences = cons(item2, sentences);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            item2 = cdolist_list_var.first();
                                        } 
                                    }
                                }
                                done_var_$46 = makeBoolean(NIL == valid_$48);
                            } 
                        } finally {
                            final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values2 = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values2);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_2);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        }
        return sentences;
    }

    public static SubLObject kb_fol_tva_sentences_int(final SubLObject tva_gaf) {
        final SubLObject tva_pred = assertions_high.gaf_predicate(tva_gaf);
        final SubLObject pred = assertions_high.gaf_arg1(tva_gaf);
        final SubLObject trans_pred = assertions_high.gaf_arg2(tva_gaf);
        final SubLObject argnum = assertions_high.gaf_arg3(tva_gaf);
        final SubLObject pred_neg_lit = kb_fol_tva_pred_neg_lit(pred, argnum);
        final SubLObject trans_pred_neg_lit = (tva_pred.eql($$transitiveViaArg)) ? bq_cons(trans_pred, $list197) : bq_cons(trans_pred, $list198);
        final SubLObject pred_pos_lit = kb_fol_tva_pred_pos_lit(pred, argnum);
        final SubLObject expansion_cnf = clauses.make_cnf(list(pred_neg_lit, trans_pred_neg_lit), list(pred_pos_lit));
        return cnf_fol_sentences(expansion_cnf, assertions_high.assertion_mt(tva_gaf));
    }

    public static SubLObject kb_fol_tva_pred_neg_lit(final SubLObject pred, final SubLObject argnum) {
        return replace_argnum_variable_formula(pred, argnum, $sym199$_OLD);
    }

    public static SubLObject kb_fol_tva_pred_pos_lit(final SubLObject pred, final SubLObject argnum) {
        return replace_argnum_variable_formula(pred, argnum, $sym200$_NEW);
    }

    public static SubLObject replace_argnum_variable_formula(final SubLObject pred, final SubLObject argnum, final SubLObject new_arg) {
        return replace_formula_arg(argnum, new_arg, argnum_variable_formula(pred));
    }

    public static SubLObject argnum_variable_formula(final SubLObject reln) {
        SubLObject formula = make_el_formula(reln, NIL, UNPROVIDED);
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject argnum;
        SubLObject el_var;
        for (cdotimes_end_var = arity.arity(reln), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            argnum = number_utilities.f_1X(i);
            el_var = cycl_variables.make_el_var(cconcatenate($$$ARG, string_utilities.str(argnum)));
            formula = cons(el_var, formula);
        }
        return nreverse(formula);
    }

    public static SubLObject kb_fol_nat_function_sentences(final SubLObject func) {
        if (NIL != arity.arity(func)) {
            final SubLObject expansion_lit = list($$natFunction, argnum_variable_formula(func), func);
            return cnf_fol_sentences(clause_utilities.make_gaf_cnf(expansion_lit), $$UniversalVocabularyMt);
        }
        return NIL;
    }

    public static SubLObject kb_fol_nat_argument_sentences(final SubLObject func) {
        SubLObject fol_sentences = NIL;
        final SubLObject nat = argnum_variable_formula(func);
        final SubLObject v_arity = arity.arity(func);
        if (NIL != v_arity) {
            SubLObject i_1;
            SubLObject i;
            SubLObject arg_var;
            SubLObject expansion_lit;
            SubLObject items_var;
            SubLObject vector_var;
            SubLObject backwardP_var;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject item;
            SubLObject cdolist_list_var;
            SubLObject item2;
            for (i_1 = NIL, i_1 = ZERO_INTEGER; i_1.numL(v_arity); i_1 = add(i_1, ONE_INTEGER)) {
                i = number_utilities.f_1X(i_1);
                arg_var = cycl_utilities.nat_arg(nat, i, UNPROVIDED);
                expansion_lit = list($$natArgument, nat, i, arg_var);
                items_var = cnf_fol_sentences(clause_utilities.make_gaf_cnf(expansion_lit), $$UniversalVocabularyMt);
                if (items_var.isVector()) {
                    vector_var = items_var;
                    backwardP_var = NIL;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        item = aref(vector_var, element_num);
                        fol_sentences = cons(item, fol_sentences);
                    }
                } else {
                    cdolist_list_var = items_var;
                    item2 = NIL;
                    item2 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        fol_sentences = cons(item2, fol_sentences);
                        cdolist_list_var = cdolist_list_var.rest();
                        item2 = cdolist_list_var.first();
                    } 
                }
            }
        }
        return nreverse(fol_sentences);
    }

    public static SubLObject kb_fol_result_isa_sentences(final SubLObject func) {
        SubLObject fol_sentences = NIL;
        final SubLObject nat = argnum_variable_formula(func);
        final SubLObject pred_var = $$resultIsa;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(func, ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(func, ONE_INTEGER, pred_var);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                        SubLObject done_var_$51 = NIL;
                        final SubLObject token_var_$52 = NIL;
                        while (NIL == done_var_$51) {
                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$52);
                            final SubLObject valid_$53 = makeBoolean(!token_var_$52.eql(gaf));
                            if (NIL != valid_$53) {
                                final SubLObject col = assertions_high.gaf_arg2(gaf);
                                final SubLObject mt = assertions_high.assertion_mt(gaf);
                                final SubLObject cnf = list(NIL, list(list($$isa, nat, col)));
                                final SubLObject items_var = cnf_fol_sentences(cnf, mt);
                                if (items_var.isVector()) {
                                    final SubLObject vector_var = items_var;
                                    final SubLObject backwardP_var = NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject element_num;
                                    SubLObject item;
                                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                        element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                        item = aref(vector_var, element_num);
                                        fol_sentences = cons(item, fol_sentences);
                                    }
                                } else {
                                    SubLObject cdolist_list_var = items_var;
                                    SubLObject item2 = NIL;
                                    item2 = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        fol_sentences = cons(item2, fol_sentences);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        item2 = cdolist_list_var.first();
                                    } 
                                }
                            }
                            done_var_$51 = makeBoolean(NIL == valid_$53);
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
                done_var = makeBoolean(NIL == valid);
            } 
        }
        return nreverse(fol_sentences);
    }

    public static SubLObject asent_sentence(final SubLObject asent, final SubLObject mt, final SubLObject mt_handling) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($fol_translation_type$.getDynamicValue(thread) == $SET_THEORY) {
            return asent_set_sentence(asent, mt, mt_handling);
        }
        return asent_fol_sentence(asent, mt, mt_handling);
    }

    public static SubLObject asent_fol_sentence(final SubLObject asent, final SubLObject mt, final SubLObject mt_handling) {
        SubLObject fol_sentence = NIL;
        if (NIL != sequence_term(asent)) {
            fol_sentence = append(fol_sentence, list(fol_unhandled($SEQUENCE_VAR, sequence_term(asent))));
        } else {
            final SubLObject pcase_var;
            final SubLObject predicate = pcase_var = cycl_utilities.atomic_sentence_predicate(asent);
            if (pcase_var.eql($$isa)) {
                fol_sentence = isa_asent_fol_sentence(asent, mt, mt_handling);
            } else
                if (pcase_var.eql($$different)) {
                    fol_sentence = different_asent_fol_sentence(asent);
                } else
                    if (pcase_var.eql($$genlMt)) {
                        fol_sentence = genlmt_asent_fol_sentence(asent);
                    } else {
                        fol_sentence = generic_asent_fol_sentence(asent, mt, mt_handling);
                    }


        }
        return fol_sentence;
    }

    public static SubLObject genlmt_asent_fol_sentence(final SubLObject asent) {
        final SubLObject operator = cycl_utilities.formula_operator(asent);
        final SubLObject args = cycl_utilities.formula_args(asent, UNPROVIDED);
        final SubLObject fol_predicate = fol_transform_predicate(operator, $MT_VISIBLE);
        final SubLObject fol_args = fol_transform_args(args);
        return make_formula(fol_predicate, fol_args, UNPROVIDED);
    }

    public static SubLObject different_asent_fol_sentence(final SubLObject asent) {
        final SubLObject args = cycl_utilities.formula_args(asent, UNPROVIDED);
        final SubLObject fol_args = Mapping.mapcar(FOL_TRANSFORM_ARG, args);
        final SubLObject fol_equals = make_fol_predicate($$equals, TWO_INTEGER);
        SubLObject fol_sentences = NIL;
        SubLObject cdolist_list_var = list_utilities.pick_two(fol_args);
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject new_arg1 = NIL;
            SubLObject new_arg2 = NIL;
            destructuring_bind_must_consp(current, datum, $list208);
            new_arg1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list208);
            new_arg2 = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject fol_sentence = cycl_utilities.negate(make_binary_formula(fol_equals, new_arg1, new_arg2));
                fol_sentences = cons(fol_sentence, fol_sentences);
            } else {
                cdestructuring_bind_error(datum, $list208);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return simplifier.conjoin(nreverse(fol_sentences), UNPROVIDED);
    }

    public static SubLObject generic_asent_fol_sentence(final SubLObject asent, final SubLObject mt, final SubLObject mt_handling) {
        if (mt_handling.eql($MT_ARGUMENT)) {
            final SubLObject operator = cycl_utilities.formula_operator(asent);
            final SubLObject args = cycl_utilities.formula_args(asent, UNPROVIDED);
            final SubLObject fol_predicate = fol_transform_predicate(operator, mt_handling);
            final SubLObject fol_args = cons(fol_transform_microtheory($sym83$_MT), fol_transform_args(args));
            return make_formula(fol_predicate, fol_args, UNPROVIDED);
        }
        final SubLObject operator = cycl_utilities.formula_operator(asent);
        final SubLObject args = cycl_utilities.formula_args(asent, UNPROVIDED);
        final SubLObject fol_predicate = fol_transform_predicate(operator, mt_handling);
        final SubLObject fol_args = fol_transform_args(args);
        return make_formula(fol_predicate, fol_args, UNPROVIDED);
    }

    public static SubLObject isa_asent_fol_sentence(final SubLObject asent, final SubLObject mt, final SubLObject mt_handling) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = $fol_isa_handling$.getDynamicValue(thread);
        if (pcase_var.eql($ISA)) {
            return isa_asent_fol_sentence_as_isa(asent, mt, mt_handling);
        }
        if (pcase_var.eql($UNARY_PREDICATE)) {
            SubLObject result = isa_asent_fol_sentence_as_unary_predicate(asent, mt_handling);
            if (NIL != contains_fol_unhandled_expression_p(result)) {
                result = isa_asent_fol_sentence_as_isa(asent, mt, mt_handling);
            }
            return result;
        }
        return NIL;
    }

    public static SubLObject isa_asent_fol_sentence_as_isa(final SubLObject asent, final SubLObject mt, final SubLObject mt_handling) {
        return generic_asent_fol_sentence(asent, mt, mt_handling);
    }

    public static SubLObject isa_asent_fol_sentence_as_unary_predicate(final SubLObject asent, final SubLObject mt_handling) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject v_term = NIL;
        SubLObject col = NIL;
        destructuring_bind_must_consp(current, datum, $list210);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list210);
        col = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list210);
            return NIL;
        }
        if (mt_handling.eql($MT_ARGUMENT)) {
            final SubLObject predicate = fol_transform_col_as_predicate(col, mt_handling);
            final SubLObject args = list(fol_transform_microtheory($sym83$_MT), fol_transform_arg(v_term));
            return make_formula(predicate, args, UNPROVIDED);
        }
        final SubLObject predicate = fol_transform_col_as_predicate(col, mt_handling);
        final SubLObject arg = fol_transform_arg(v_term);
        return make_unary_formula(predicate, arg);
    }

    public static SubLObject fol_transform_args(final SubLObject args) {
        SubLObject fol_args = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            fol_args = cons(fol_transform_arg(arg), fol_args);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return nreverse(fol_args);
    }

    public static SubLObject fol_transform_arg(final SubLObject arg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != list_utilities.member_eqP(arg, $unfolifiable_terms$.getGlobalValue())) {
            return fol_unhandled($EXPLICITLY_FORBIDDEN_TERM, arg);
        }
        if (NIL != constant_p(arg)) {
            return make_fol_atomic_term(arg);
        }
        if (NIL != nart_handles.nart_p(arg)) {
            final SubLObject nart_formula = narts_high.nart_hl_formula(arg);
            return fol_transform_arg(nart_formula);
        }
        if (NIL != variables.variable_p(arg)) {
            if (NIL != $fol_current_assertion$.getDynamicValue(thread)) {
                final SubLObject el_var = assertions_high.assertion_hl_variable_to_el($fol_current_assertion$.getDynamicValue(thread), arg);
                if (NIL != el_var) {
                    return el_var;
                }
            }
            return arg;
        }
        if (NIL != cycl_grammar.el_variable_p(arg)) {
            return arg;
        }
        if (arg.isNumber()) {
            return make_fol_number(arg);
        }
        if (arg.isString()) {
            return make_fol_string(arg);
        }
        if (NIL != assertion_handles.assertion_p(arg)) {
            return fol_unhandled($META_ASSERTION, arg);
        }
        if (arg.isKeyword()) {
            return fol_unhandled($META_VARIABLE, arg);
        }
        if (arg.isSymbol()) {
            return fol_unhandled($ILL_FORMED, arg);
        }
        if (NIL == possibly_naut_p(arg)) {
            return fol_unhandled($UNEXPECTED, arg);
        }
        if (NIL != subl_escape_p(arg)) {
            return fol_unhandled($SUBL_ESCAPE, arg);
        }
        if (NIL != fort_types_interface.sentential_relation_p(cycl_utilities.formula_operator(arg))) {
            return fol_unhandled($META_SENTENCE, arg);
        }
        SubLObject fol_sentence = NIL;
        final SubLObject function = cycl_utilities.formula_operator(arg);
        final SubLObject args = cycl_utilities.formula_args(arg, UNPROVIDED);
        final SubLObject fol_function = fol_transform_function(function);
        final SubLObject fol_args = fol_transform_args(args);
        fol_sentence = make_formula(fol_function, fol_args, UNPROVIDED);
        if (NIL != sequence_term(arg)) {
            fol_sentence = append(fol_sentence, list(fol_unhandled($SEQUENCE_VAR, sequence_term(arg))));
        }
        return fol_sentence;
    }

    public static SubLObject fol_transform_microtheory(final SubLObject arg) {
        if (NIL != list_utilities.member_eqP(arg, $unfolifiable_terms$.getGlobalValue())) {
            return fol_unhandled($EXPLICITLY_FORBIDDEN_TERM, arg);
        }
        if (arg.isNumber()) {
            return fol_unhandled($ILL_FORMED, arg);
        }
        if (arg.isString()) {
            return fol_unhandled($ILL_FORMED, arg);
        }
        return fol_transform_arg(arg);
    }

    public static SubLObject asent_set_sentence(final SubLObject asent, final SubLObject mt, final SubLObject mt_handling) {
        SubLObject set_sentence = NIL;
        if (NIL != sequence_term(asent)) {
            set_sentence = append(set_sentence, list(fol_unhandled($SEQUENCE_VAR, sequence_term(asent))));
        } else {
            final SubLObject pcase_var;
            final SubLObject predicate = pcase_var = cycl_utilities.atomic_sentence_predicate(asent);
            if (pcase_var.eql($$isa)) {
                set_sentence = isa_asent_set_sentence(asent, mt, mt_handling);
            } else
                if (pcase_var.eql($$different)) {
                    set_sentence = different_asent_set_sentence(asent);
                } else
                    if (pcase_var.eql($$genlMt)) {
                        set_sentence = genlmt_asent_set_sentence(asent);
                    } else {
                        set_sentence = generic_asent_set_sentence(asent, mt, mt_handling);
                    }


        }
        return set_sentence;
    }

    public static SubLObject genlmt_asent_set_sentence(final SubLObject asent) {
        final SubLObject operator = cycl_utilities.formula_operator(asent);
        final SubLObject args = cycl_utilities.formula_args(asent, UNPROVIDED);
        final SubLObject set_predicate = set_transform_predicate(operator, $MT_VISIBLE);
        final SubLObject set_args = set_transform_args(args);
        return make_formula(set_predicate, set_args, UNPROVIDED);
    }

    public static SubLObject generic_asent_set_sentence(final SubLObject asent, final SubLObject mt, final SubLObject mt_handling) {
        if (mt_handling.eql($MT_ARGUMENT)) {
            final SubLObject operator = cycl_utilities.formula_operator(asent);
            final SubLObject args = cycl_utilities.formula_args(asent, UNPROVIDED);
            final SubLObject set_predicate = set_transform_arg(operator);
            final SubLObject set_args = cons(set_transform_microtheory($sym83$_MT), set_transform_args(args));
            return make_formula(set_transform_predicate($$memberOfSet, mt_handling), cons(set_predicate, set_args), UNPROVIDED);
        }
        final SubLObject operator = cycl_utilities.formula_operator(asent);
        final SubLObject args = cycl_utilities.formula_args(asent, UNPROVIDED);
        final SubLObject set_predicate = set_transform_arg(operator);
        final SubLObject set_args = set_transform_args(args);
        return make_formula(set_transform_predicate($$memberOfSet, mt_handling), cons(set_predicate, set_args), UNPROVIDED);
    }

    public static SubLObject isa_asent_set_sentence(final SubLObject asent, final SubLObject mt, final SubLObject mt_handling) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = $fol_isa_handling$.getDynamicValue(thread);
        if (pcase_var.eql($ISA)) {
            return generic_asent_set_sentence(asent, mt, mt_handling);
        }
        if (pcase_var.eql($UNARY_PREDICATE)) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
            SubLObject v_term = NIL;
            SubLObject col = NIL;
            destructuring_bind_must_consp(current, datum, $list210);
            v_term = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list210);
            col = current.first();
            current = current.rest();
            if (NIL == current) {
                if (mt_handling.eql($MT_ARGUMENT)) {
                    final SubLObject predicate = set_transform_arg(col);
                    final SubLObject args = list(set_transform_microtheory($sym83$_MT), set_transform_arg(v_term));
                    return make_formula(set_transform_predicate($$memberOfSet, mt_handling), cons(predicate, args), UNPROVIDED);
                }
                final SubLObject predicate = set_transform_arg(col);
                final SubLObject arg = set_transform_arg(v_term);
                return make_formula(set_transform_predicate($$memberOfSet, mt_handling), list(predicate, arg), UNPROVIDED);
            } else {
                cdestructuring_bind_error(datum, $list210);
            }
        }
        return NIL;
    }

    public static SubLObject different_asent_set_sentence(final SubLObject asent) {
        return different_asent_fol_sentence(asent);
    }

    public static SubLObject set_transform_args(final SubLObject args) {
        if (length(args).eql(ONE_INTEGER)) {
            return set_transform_arg(args.first());
        }
        return make_binary_formula(set_transform_function($$SetifyArgumentFn), set_transform_arg(args.first()), set_transform_args(args.rest()));
    }

    public static SubLObject set_transform_function(final SubLObject operator) {
        return fol_transform_function(operator);
    }

    public static SubLObject set_transform_arg(final SubLObject arg) {
        return fol_transform_arg(arg);
    }

    public static SubLObject set_transform_microtheory(final SubLObject mt) {
        return fol_transform_microtheory(mt);
    }

    public static SubLObject set_transform_predicate(final SubLObject operator, final SubLObject mt_handling) {
        return make_fol_predicate(operator, TWO_INTEGER);
    }

    public static SubLObject fol_transform_predicate(final SubLObject operator, final SubLObject mt_handling) {
        if (NIL != list_utilities.member_eqP(operator, $unfolifiable_terms$.getGlobalValue())) {
            return fol_unhandled($EXPLICITLY_FORBIDDEN_TERM, operator);
        }
        if (operator.eql($$mtVisible)) {
            return make_fol_predicate(operator, ONE_INTEGER);
        }
        if (operator.eql($$ist)) {
            return fol_unhandled($IST, operator);
        }
        if (NIL != list_utilities.member_eqP(operator, $list219)) {
            return operator;
        }
        if (NIL != forts.fort_p(operator)) {
            if (NIL == fort_types_interface.predicateP(operator)) {
                return fol_unhandled($NON_PREDICATE, operator);
            }
            final SubLObject v_arity = arity.arity(operator);
            if (!v_arity.isInteger()) {
                if (NIL != arity.arity_max(operator)) {
                    return fol_unhandled($VARIABLE_ARITY_PREDICATE, operator);
                }
                return fol_unhandled($UNBOUNDED_ARITY_PREDICATE, operator);
            } else {
                if (mt_handling.eql($MT_ARGUMENT)) {
                    return make_fol_predicate(operator, add(v_arity, ONE_INTEGER));
                }
                return make_fol_predicate(operator, v_arity);
            }
        } else {
            if (NIL == variables.fully_bound_p(operator)) {
                return fol_unhandled($PREDICATE_QUANTIFICATION, operator);
            }
            if (NIL != cycl_grammar.el_variable_p(operator)) {
                return fol_unhandled($PREDICATE_QUANTIFICATION, operator);
            }
            if (operator.isKeyword()) {
                return fol_unhandled($META_VARIABLE, operator);
            }
            if (operator.isSymbol()) {
                return fol_unhandled($ILL_FORMED, operator);
            }
            if (operator.isString()) {
                return fol_unhandled($ILL_FORMED, operator);
            }
            if (NIL == possibly_naut_p(operator)) {
                return fol_unhandled($UNEXPECTED, operator);
            }
            if ($$Kappa.eql(cycl_utilities.naut_functor(operator))) {
                return fol_unhandled($KAPPA, operator);
            }
            return fol_unhandled($ILL_FORMED, operator);
        }
    }

    public static SubLObject fol_transform_col_as_predicate(final SubLObject operator, final SubLObject mt_handling) {
        if (NIL != list_utilities.member_eqP(operator, $unfolifiable_terms$.getGlobalValue())) {
            return fol_unhandled($EXPLICITLY_FORBIDDEN_TERM, operator);
        }
        if (NIL != forts.fort_p(operator)) {
            if (NIL == fort_types_interface.collectionP(operator)) {
                return fol_unhandled($NON_COLLECTION, operator);
            }
            if (mt_handling.eql($MT_ARGUMENT)) {
                return make_fol_predicate(operator, TWO_INTEGER);
            }
            return make_fol_predicate(operator, ONE_INTEGER);
        } else {
            if (NIL == variables.fully_bound_p(operator)) {
                return fol_unhandled($COLLECTION_QUANTIFICATION, operator);
            }
            if (NIL != cycl_grammar.el_variable_p(operator)) {
                return fol_unhandled($COLLECTION_QUANTIFICATION, operator);
            }
            if ((NIL != possibly_naut_p(operator)) && (NIL != fort_types_interface.functor_p(cycl_utilities.formula_operator(operator)))) {
                return fol_unhandled($ILL_FORMED, operator);
            }
            if (operator.isKeyword()) {
                return fol_unhandled($META_VARIABLE, operator);
            }
            if (operator.isSymbol()) {
                return fol_unhandled($ILL_FORMED, operator);
            }
            if (operator.isString()) {
                return fol_unhandled($ILL_FORMED, operator);
            }
            return fol_unhandled($UNEXPECTED, operator);
        }
    }

    public static SubLObject fol_transform_function(final SubLObject operator) {
        if (NIL != list_utilities.member_eqP(operator, $unfolifiable_terms$.getGlobalValue())) {
            return fol_unhandled($EXPLICITLY_FORBIDDEN_TERM, operator);
        }
        if (operator.eql($$SetifyArgumentFn)) {
            return make_fol_function(operator, TWO_INTEGER);
        }
        if (NIL != forts.fort_p(operator)) {
            if (NIL == fort_types_interface.functionP(operator)) {
                return fol_unhandled($NON_FUNCTION, operator);
            }
            if (NIL != fort_types_interface.scoping_relation_p(operator)) {
                return fol_unhandled($SCOPING_RELATION, operator);
            }
            final SubLObject v_arity = arity.arity(operator);
            if (v_arity.isInteger()) {
                return make_fol_function(operator, v_arity);
            }
            if (NIL != arity.arity_max(operator)) {
                return fol_unhandled($VARIABLE_ARITY_FUNCTION, operator);
            }
            return fol_unhandled($UNBOUNDED_ARITY_FUNCTION, operator);
        } else {
            if (NIL == variables.fully_bound_p(operator)) {
                return fol_unhandled($FUNCTION_QUANTIFICATION, operator);
            }
            if (NIL != cycl_grammar.el_variable_p(operator)) {
                return fol_unhandled($FUNCTION_QUANTIFICATION, operator);
            }
            if (operator.isKeyword()) {
                return fol_unhandled($META_VARIABLE, operator);
            }
            if (operator.isSymbol()) {
                return fol_unhandled($ILL_FORMED, operator);
            }
            if (operator.isString()) {
                return fol_unhandled($ILL_FORMED, operator);
            }
            if (NIL == possibly_naut_p(operator)) {
                return fol_unhandled($UNEXPECTED, operator);
            }
            if ($$Lambda.eql(cycl_utilities.naut_functor(operator))) {
                return fol_unhandled($LAMBDA, operator);
            }
            return fol_unhandled($ILL_FORMED, operator);
        }
    }

    public static SubLObject fol_term_p(final SubLObject v_object) {
        return makeBoolean((NIL != fol_represented_term_p(v_object)) || (NIL != fol_unrepresented_term_p(v_object)));
    }

    public static SubLObject fol_represented_term_p(final SubLObject v_object) {
        return makeBoolean(((((NIL != fol_atomic_term_p(v_object)) || (NIL != fol_string_constant_p(v_object))) || (NIL != fol_number_constant_p(v_object))) || (NIL != fol_predicate_p(v_object))) || (NIL != fol_function_p(v_object)));
    }

    public static SubLObject fol_unrepresented_term_p(final SubLObject v_object) {
        return makeBoolean((NIL != fol_string_p(v_object)) || (NIL != fol_number_p(v_object)));
    }

    public static SubLObject make_fol_atomic_term(final SubLObject v_object) {
        return make_unary_formula($$FOL_AtomicTermFn, v_object);
    }

    public static SubLObject fol_atomic_term_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_formula_p(v_object)) && $$FOL_AtomicTermFn.eql(cycl_utilities.formula_operator(v_object)));
    }

    public static SubLObject make_fol_predicate(final SubLObject v_object, final SubLObject v_arity) {
        assert NIL != integerp(v_arity) : "Types.integerp(v_arity) " + "CommonSymbols.NIL != Types.integerp(v_arity) " + v_arity;
        return make_binary_formula($$FOL_PredicateFn, v_object, v_arity);
    }

    public static SubLObject fol_predicate_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_formula_p(v_object)) && $$FOL_PredicateFn.eql(cycl_utilities.formula_operator(v_object)));
    }

    public static SubLObject make_fol_function(final SubLObject v_object, final SubLObject v_arity) {
        assert NIL != integerp(v_arity) : "Types.integerp(v_arity) " + "CommonSymbols.NIL != Types.integerp(v_arity) " + v_arity;
        return make_binary_formula($$FOL_FunctionFn, v_object, v_arity);
    }

    public static SubLObject fol_function_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_formula_p(v_object)) && $$FOL_FunctionFn.eql(cycl_utilities.formula_operator(v_object)));
    }

    public static SubLObject fol_function_arity(final SubLObject v_object) {
        return cycl_utilities.formula_arg2(v_object, UNPROVIDED);
    }

    public static SubLObject make_fol_string(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(v_object) : "Types.stringp error :" + v_object;
        final SubLObject pcase_var = $fol_string_handling$.getDynamicValue(thread);
        if (pcase_var.eql($ALLOWED)) {
            return make_unary_formula($$FOL_StringFn, v_object);
        }
        if (pcase_var.eql($DWIM_TO_DISTINCT_CONSTANTS)) {
            return make_unary_formula($$FOL_StringConstantFn, v_object);
        }
        if (pcase_var.eql($DWIM_TO_SINGLE_CONSTANT)) {
            return make_fol_atomic_term($const242$Canonical_String);
        }
        return Errors.error($str243$unexpected_string_handling_direct, $fol_string_handling$.getDynamicValue(thread));
    }

    public static SubLObject fol_string_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_formula_p(v_object)) && $$FOL_StringFn.eql(cycl_utilities.formula_operator(v_object)));
    }

    public static SubLObject fol_string_constant_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_formula_p(v_object)) && $$FOL_StringConstantFn.eql(cycl_utilities.formula_operator(v_object)));
    }

    public static SubLObject make_fol_number(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != numberp(v_object) : "Types.numberp error :" + v_object;
        final SubLObject pcase_var = $fol_number_handling$.getDynamicValue(thread);
        if (pcase_var.eql($ALLOWED)) {
            return make_unary_formula($$FOL_NumberFn, v_object);
        }
        if (pcase_var.eql($DWIM_FLOATS_TO_DISTINCT_CONSTANTS)) {
            if (v_object.isDouble()) {
                return make_unary_formula($$FOL_NumberConstantFn, v_object);
            }
            return make_unary_formula($$FOL_NumberFn, v_object);
        } else {
            if (pcase_var.eql($DWIM_ALL_TO_DISTINCT_CONSTANTS)) {
                return make_unary_formula($$FOL_NumberConstantFn, v_object);
            }
            return Errors.error($str248$unexpected_number_handling_direct, $fol_number_handling$.getDynamicValue(thread));
        }
    }

    public static SubLObject fol_number_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_formula_p(v_object)) && $$FOL_NumberFn.eql(cycl_utilities.formula_operator(v_object)));
    }

    public static SubLObject fol_number_constant_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_formula_p(v_object)) && $$FOL_NumberConstantFn.eql(cycl_utilities.formula_operator(v_object)));
    }

    public static SubLObject fol_cafP(final SubLObject v_object) {
        return makeBoolean((NIL != fol_atomic_sentenceP(v_object)) && (NIL != fol_closedP(v_object)));
    }

    public static SubLObject fol_atomic_sentenceP(final SubLObject v_object) {
        return makeBoolean((NIL != el_formula_p(v_object)) && (NIL != fol_predicate_p(cycl_utilities.formula_operator(v_object))));
    }

    public static SubLObject fol_closedP(final SubLObject focycl) {
        return makeBoolean((NIL != groundP(focycl, symbol_function($sym249$EL_VAR_))) || (NIL != no_free_variablesP(focycl_to_cycl(focycl), symbol_function($sym249$EL_VAR_))));
    }

    public static SubLObject fol_sentences_data_mentioning_term(final SubLObject fol_sentences_data, final SubLObject v_term) {
        SubLObject data = NIL;
        SubLObject cdolist_list_var = fol_sentences_data;
        SubLObject datum = NIL;
        datum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject fol_sentences = second(datum);
            if (NIL != list_utilities.tree_find(v_term, fol_sentences, UNPROVIDED, UNPROVIDED)) {
                data = cons(datum, data);
            }
            cdolist_list_var = cdolist_list_var.rest();
            datum = cdolist_list_var.first();
        } 
        return nreverse(data);
    }

    public static SubLObject all_fol_predicates_and_arguments_mentioned_in_analysis(final SubLObject analysis) {
        return all_fol_predicates_and_arguments_mentioned_in_analysis_data(fol_sentences_analysis_data(analysis));
    }

    public static SubLObject all_fol_predicates_and_arguments_mentioned_in_analysis_data(final SubLObject analysis_data) {
        SubLObject all_predicates = NIL;
        SubLObject all_arguments = NIL;
        SubLObject cdolist_list_var = analysis_data;
        SubLObject fol_datum = NIL;
        fol_datum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = all_fol_predicates_and_arguments_mentioned_in_fol_datum(fol_datum);
            SubLObject predicates = NIL;
            SubLObject v_arguments = NIL;
            destructuring_bind_must_consp(current, datum, $list250);
            predicates = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list250);
            v_arguments = current.first();
            current = current.rest();
            if (NIL == current) {
                all_predicates = append(predicates, all_predicates);
                all_arguments = append(v_arguments, all_arguments);
            } else {
                cdestructuring_bind_error(datum, $list250);
            }
            cdolist_list_var = cdolist_list_var.rest();
            fol_datum = cdolist_list_var.first();
        } 
        return list(list_utilities.fast_delete_duplicates(all_predicates, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), list_utilities.fast_delete_duplicates(all_arguments, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject all_fol_predicates_and_arguments_mentioned_in_fol_datum(final SubLObject fol_datum) {
        SubLObject v_term = NIL;
        SubLObject fol_sentences = NIL;
        destructuring_bind_must_consp(fol_datum, fol_datum, $list76);
        v_term = fol_datum.first();
        SubLObject current = fol_datum.rest();
        destructuring_bind_must_consp(current, fol_datum, $list76);
        fol_sentences = current.first();
        current = current.rest();
        final SubLObject unhandled_fol_sentences = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, fol_datum, $list76);
        current = current.rest();
        if (NIL == current) {
            return all_fol_predicates_and_arguments_mentioned_in_fol_sentences(fol_sentences, UNPROVIDED);
        }
        cdestructuring_bind_error(fol_datum, $list76);
        return NIL;
    }

    public static SubLObject all_fol_predicates_and_arguments_mentioned_in_fol_sentences(final SubLObject fol_sentences, SubLObject atomicP) {
        if (atomicP == UNPROVIDED) {
            atomicP = NIL;
        }
        SubLObject all_predicates = NIL;
        SubLObject all_arguments = NIL;
        SubLObject cdolist_list_var = fol_sentences;
        SubLObject focycl_sentence = NIL;
        focycl_sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = all_fol_predicates_and_arguments_mentioned_in_focycl_sentence(focycl_sentence, atomicP);
            SubLObject predicates = NIL;
            SubLObject v_arguments = NIL;
            destructuring_bind_must_consp(current, datum, $list250);
            predicates = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list250);
            v_arguments = current.first();
            current = current.rest();
            if (NIL == current) {
                all_predicates = append(predicates, all_predicates);
                all_arguments = append(v_arguments, all_arguments);
            } else {
                cdestructuring_bind_error(datum, $list250);
            }
            cdolist_list_var = cdolist_list_var.rest();
            focycl_sentence = cdolist_list_var.first();
        } 
        return list(list_utilities.fast_delete_duplicates(all_predicates, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), list_utilities.fast_delete_duplicates(all_arguments, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject all_fol_predicates_and_arguments_mentioned_in_focycl_sentence(final SubLObject focycl_sentence, final SubLObject atomicP) {
        if (NIL != atomicP) {
            SubLObject fol_predicate = NIL;
            SubLObject fol_args = NIL;
            destructuring_bind_must_consp(focycl_sentence, focycl_sentence, $list251);
            fol_predicate = focycl_sentence.first();
            final SubLObject current = fol_args = focycl_sentence.rest();
            return list(list(fol_predicate), fol_args);
        }
        final SubLObject atomic_sentences = list_utilities.tree_find_all_if(symbol_function($sym252$FOL_ATOMIC_SENTENCE_), focycl_sentence, UNPROVIDED);
        return all_fol_predicates_and_arguments_mentioned_in_fol_sentences(atomic_sentences, T);
    }

    public static SubLObject fol_header_to_stream(final SubLObject fol_sentences_analysis, final SubLObject output_format, final SubLObject stream) {
        if (output_format.eql($TPTP)) {
            return fol_header_to_tptp_stream(fol_sentences_analysis, stream);
        }
        if (output_format.eql($CYCL)) {
            return fol_header_to_cycl_stream(fol_sentences_analysis, stream);
        }
        if (output_format == $ALCHEMY) {
            return fol_header_to_alchemy_stream(fol_sentences_analysis, stream);
        }
        return Errors.error($str74$Unrecognized_output_format___s, output_format);
    }

    public static SubLObject fol_datum_to_stream(final SubLObject datum, final SubLObject output_format, final SubLObject stream) {
        if (output_format.eql($TPTP)) {
            return fol_datum_to_tptp_stream(datum, stream);
        }
        if (output_format.eql($CYCL)) {
            return fol_datum_to_cycl_stream(datum, stream);
        }
        if (output_format == $ALCHEMY) {
            return fol_datum_to_alchemy_stream(datum, stream);
        }
        return Errors.error($str74$Unrecognized_output_format___s, output_format);
    }

    public static SubLObject fol_sentences_to_cycl_stream(final SubLObject fol_sentences_analysis, final SubLObject stream) {
        final SubLObject v_properties = fol_sentences_analysis_generation_properties(fol_sentences_analysis);
        fol_header_to_cycl_stream(v_properties, stream);
        SubLObject cdolist_list_var;
        final SubLObject fol_sentences_data = cdolist_list_var = fol_sentences_analysis_data(fol_sentences_analysis);
        SubLObject datum = NIL;
        datum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            fol_datum_to_cycl_stream(datum, stream);
            cdolist_list_var = cdolist_list_var.rest();
            datum = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject fol_header_to_cycl_stream(final SubLObject analysis, final SubLObject stream) {
        return NIL;
    }

    public static SubLObject fol_datum_to_cycl_stream(final SubLObject datum, final SubLObject stream) {
        SubLObject v_term = NIL;
        SubLObject fol_sentences = NIL;
        destructuring_bind_must_consp(datum, datum, $list76);
        v_term = datum.first();
        SubLObject current = datum.rest();
        destructuring_bind_must_consp(current, datum, $list76);
        fol_sentences = current.first();
        current = current.rest();
        final SubLObject unhandled_fol_sentences = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list76);
        current = current.rest();
        if (NIL == current) {
            if (NIL != assertion_handles.assertion_p(v_term)) {
                final SubLObject ass = v_term;
                format(stream, $str253$______S, assertion_handles.assertion_id(ass));
                SubLObject cdolist_list_var = fol_sentences;
                SubLObject sentence = NIL;
                sentence = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    format_cycl_expression.format_cycl_expression(sentence, stream, ZERO_INTEGER);
                    cdolist_list_var = cdolist_list_var.rest();
                    sentence = cdolist_list_var.first();
                } 
            } else
                if (NIL != forts.fort_p(v_term)) {
                    final SubLObject fort = v_term;
                    format(stream, $str253$______S, fort);
                    SubLObject cdolist_list_var = fol_sentences;
                    SubLObject sentence = NIL;
                    sentence = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        format_cycl_expression.format_cycl_expression(sentence, stream, ZERO_INTEGER);
                        cdolist_list_var = cdolist_list_var.rest();
                        sentence = cdolist_list_var.first();
                    } 
                }

        } else {
            cdestructuring_bind_error(datum, $list76);
        }
        return NIL;
    }

    public static SubLObject fol_query_to_cycl_stream(final SubLObject fol_query, final SubLObject fol_sentences_analysis, final SubLObject stream) {
        format(stream, $str254$_____QUERY_);
        format_cycl_expression.format_cycl_expression(fol_query, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject assertions_to_tptp_stream(final SubLObject assertions, final SubLObject stream) {
        final SubLObject fol_sentences_analysis = fol_sentences(assertions, NIL, NIL, UNPROVIDED);
        return fol_sentences_to_tptp_stream(fol_sentences_analysis, stream);
    }

    public static SubLObject fol_sentences_to_tptp_stream(final SubLObject fol_sentences_analysis, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        fol_header_to_tptp_stream(fol_sentences_analysis, stream);
        final SubLObject _prev_bind_0 = $tptp_axiom_count$.currentBinding(thread);
        try {
            $tptp_axiom_count$.bind(ZERO_INTEGER, thread);
            SubLObject cdolist_list_var;
            final SubLObject fol_sentences_data = cdolist_list_var = fol_sentences_analysis_data(fol_sentences_analysis);
            SubLObject datum = NIL;
            datum = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                fol_datum_to_tptp_stream(datum, stream);
                cdolist_list_var = cdolist_list_var.rest();
                datum = cdolist_list_var.first();
            } 
        } finally {
            $tptp_axiom_count$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject fol_header_to_tptp_stream(final SubLObject fol_sentences_analysis, final SubLObject stream) {
        final SubLObject v_properties = fol_sentences_analysis_generation_properties(fol_sentences_analysis);
        final SubLObject header = fol_generate_tptp_header(v_properties);
        princ(header, stream);
        return stream;
    }

    public static SubLObject fol_datum_to_tptp_stream(final SubLObject datum, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_term = NIL;
        SubLObject fol_sentences = NIL;
        destructuring_bind_must_consp(datum, datum, $list76);
        v_term = datum.first();
        SubLObject current = datum.rest();
        destructuring_bind_must_consp(current, datum, $list76);
        fol_sentences = current.first();
        current = current.rest();
        final SubLObject unhandled_fol_sentences = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list76);
        current = current.rest();
        if (NIL == current) {
            if (NIL != fol_sentences) {
                output_tptp_term_comment(v_term, stream);
            }
            SubLObject cdolist_list_var = fol_sentences;
            SubLObject focycl = NIL;
            focycl = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                $tptp_axiom_count$.setDynamicValue(add($tptp_axiom_count$.getDynamicValue(thread), ONE_INTEGER), thread);
                output_focycl_as_tptp(stream, focycl, $tptp_axiom_count$.getDynamicValue(thread));
                cdolist_list_var = cdolist_list_var.rest();
                focycl = cdolist_list_var.first();
            } 
        } else {
            cdestructuring_bind_error(datum, $list76);
        }
        return NIL;
    }

    public static SubLObject output_tptp_term_comment(final SubLObject v_term, final SubLObject stream) {
        if (NIL != assertion_handles.assertion_p(v_term)) {
            format(stream, $str255$__Cyc_Assertion___a___, assertion_handles.assertion_id(v_term));
        } else
            if (NIL != nart_handles.nart_p(v_term)) {
                format(stream, $str256$__Cyc_NART___a___, nart_handles.nart_id(v_term));
            } else
                if (NIL != constant_p(v_term)) {
                    format(stream, $str257$__Cyc_Constant___a___, constants_high.constant_internal_id(v_term));
                } else
                    if (NIL != possibly_cycl_sentence_p(v_term)) {
                        format(stream, $str258$__CycL_Sentence___a___, v_term);
                    } else {
                        Errors.error($str259$Unexpected_object__s, v_term);
                    }



        return stream;
    }

    public static SubLObject fol_query_to_tptp_stream(final SubLObject fol_query, final SubLObject fol_sentences_analysis, final SubLObject stream) {
        final SubLObject i = compute_tptp_query_index_number(fol_sentences_analysis);
        output_fol_query_as_tptp(stream, fol_query, i);
        return NIL;
    }

    public static SubLObject fol_generate_tptp_header(final SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject header = getf(v_properties, $HEADER, UNPROVIDED);
        if (NIL != header) {
            return header;
        }
        final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $print_length$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $print_level$.currentBinding(thread);
        try {
            $print_pretty$.bind(NIL, thread);
            $print_length$.bind(NIL, thread);
            $print_level$.bind(NIL, thread);
            header = $str260$_________________________________;
            header = fol_tptp_header_add_field(header, $$$File, $str262$CYC_10___TPTP_v2_2_0__Released_2_);
            header = fol_tptp_header_add_field(header, $$$Domain, $str264$Knowledge_Representation_Common_S);
            header = fol_tptp_header_add_field(header, $$$Problem, $str266$Reasoning_with_the_Cyc_Common_Sen);
            header = fol_tptp_header_add_field(header, $$$Version, tptp_properties_for_header(v_properties));
            header = fol_tptp_header_add_field(header, $$$English, $str269$The_Cyc_KB_contains_assertions_fo);
            header = fol_tptp_header_add_blankline(header);
            header = fol_tptp_header_add_blankline(header);
            header = fol_tptp_header_add_field(header, $$$Refs, $str271$);
            header = fol_tptp_header_add_field(header, $$$Source, $str271$);
            header = fol_tptp_header_add_field(header, $$$Names, $str271$);
            header = fol_tptp_header_add_field(header, $$$Status, $$$unknown);
            header = fol_tptp_header_add_field(header, $$$Rating, $str277$1_0);
            header = fol_tptp_header_add_field(header, $$$Syntax, $str279$_blank_);
            header = fol_tptp_header_add_field(header, $$$Comments, $str281$To_obtain_a_First_Orderification_);
            header = fol_tptp_header_add_field(header, $$$Bugfixes, $str271$);
            header = cconcatenate(header, $str283$_________________________________);
            return header;
        } finally {
            $print_level$.rebind(_prev_bind_3, thread);
            $print_length$.rebind(_prev_bind_2, thread);
            $print_pretty$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject fol_tptp_header_add_field(final SubLObject header, final SubLObject fieldname, final SubLObject content) {
        return cconcatenate(header, new SubLObject[]{ $str285$__, fieldname, $str286$___, content, $str287$_ });
    }

    public static SubLObject fol_tptp_header_add_blankline(final SubLObject header) {
        return cconcatenate(header, $str288$__);
    }

    public static SubLObject tptp_properties_for_header(final SubLObject v_properties) {
        return cconcatenate($folification_version$.getGlobalValue(), new SubLObject[]{ $str289$__, format_nil.format_nil_s(list_utilities.filter_plist(v_properties, $sym290$TPTP_PROPERTY_APPROPRIATE_FOR_PRINTING_)) });
    }

    public static SubLObject tptp_property_appropriate_for_printingP(final SubLObject property) {
        return makeBoolean(property != $OUTPUT_FILENAME);
    }

    public static SubLObject clear_compute_tptp_query_index_number() {
        final SubLObject cs = $compute_tptp_query_index_number_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_compute_tptp_query_index_number(final SubLObject fol_sentences_analysis) {
        return memoization_state.caching_state_remove_function_results_with_args($compute_tptp_query_index_number_caching_state$.getGlobalValue(), list(fol_sentences_analysis), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject compute_tptp_query_index_number_internal(final SubLObject fol_sentences_analysis) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $tptp_query_name$.getDynamicValue(thread)) {
            return $tptp_query_name$.getDynamicValue(thread);
        }
        final SubLObject fol_sentences_data = fol_sentences_analysis_data(fol_sentences_analysis);
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = fol_sentences_data;
        SubLObject datum = NIL;
        datum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum_$57 = current = datum;
            SubLObject v_term = NIL;
            SubLObject fol_sentences = NIL;
            destructuring_bind_must_consp(current, datum_$57, $list76);
            v_term = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum_$57, $list76);
            fol_sentences = current.first();
            current = current.rest();
            final SubLObject unhandled_fol_sentences = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum_$57, $list76);
            current = current.rest();
            if (NIL == current) {
                count = add(count, length(fol_sentences));
            } else {
                cdestructuring_bind_error(datum_$57, $list76);
            }
            cdolist_list_var = cdolist_list_var.rest();
            datum = cdolist_list_var.first();
        } 
        return number_utilities.f_1X(count);
    }

    public static SubLObject compute_tptp_query_index_number(final SubLObject fol_sentences_analysis) {
        SubLObject caching_state = $compute_tptp_query_index_number_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(COMPUTE_TPTP_QUERY_INDEX_NUMBER, $compute_tptp_query_index_number_caching_state$, ONE_INTEGER, EQ, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, fol_sentences_analysis, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(compute_tptp_query_index_number_internal(fol_sentences_analysis)));
            memoization_state.caching_state_put(caching_state, fol_sentences_analysis, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject output_focycl_as_tptp(final SubLObject stream, final SubLObject focycl, final SubLObject i) {
        output_tptp_axiom(stream, focycl, i);
        return NIL;
    }

    public static SubLObject output_fol_query_as_tptp(final SubLObject stream, final SubLObject focycl, final SubLObject i) {
        output_tptp_query(stream, focycl, i);
        return NIL;
    }

    public static SubLObject output_tptp_axiom(final SubLObject stream, final SubLObject fol_sentence, final SubLObject i) {
        final SubLObject quantified_fol_sentence = explicitify_implicit_universal_quantifiers(fol_sentence);
        format(stream, $str293$fof__a_axiom_, tptp_axiom_id(i));
        output_tptp_sentence_recursive(stream, quantified_fol_sentence);
        format(stream, $str294$____);
        return NIL;
    }

    public static SubLObject tptp_axiom_id(final SubLObject i) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $tptp_axiom_prefix$.getDynamicValue(thread)) {
            return cconcatenate($tptp_axiom_prefix$.getDynamicValue(thread), string_utilities.str(i));
        }
        return i;
    }

    public static SubLObject output_tptp_query(final SubLObject stream, final SubLObject fol_query, final SubLObject i) {
        final SubLObject quantified_fol_query = explicitify_implicit_existential_quantifiers(fol_query);
        format(stream, $str295$fof__a_conjecture_, i);
        output_tptp_sentence_recursive(stream, quantified_fol_query);
        format(stream, $str294$____);
        return NIL;
    }

    public static SubLObject output_tptp_sentence_recursive(final SubLObject stream, final SubLObject fol_sentence) {
        SubLObject operator = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(fol_sentence, fol_sentence, $list296);
        operator = fol_sentence.first();
        final SubLObject current = args = fol_sentence.rest();
        final SubLObject pcase_var = operator;
        if (pcase_var.eql($$implies)) {
            SubLObject current_$59;
            final SubLObject datum_$58 = current_$59 = args;
            SubLObject antecedent = NIL;
            SubLObject consequent = NIL;
            destructuring_bind_must_consp(current_$59, datum_$58, $list297);
            antecedent = current_$59.first();
            current_$59 = current_$59.rest();
            destructuring_bind_must_consp(current_$59, datum_$58, $list297);
            consequent = current_$59.first();
            current_$59 = current_$59.rest();
            if (NIL == current_$59) {
                princ($str298$_, stream);
                output_tptp_sentence_recursive(stream, antecedent);
                princ($str299$____, stream);
                output_tptp_sentence_recursive(stream, consequent);
                princ($str300$_, stream);
            } else {
                cdestructuring_bind_error(datum_$58, $list297);
            }
        } else
            if (pcase_var.eql($$and)) {
                princ($str298$_, stream);
                output_tptp_sentence_recursive(stream, args.first());
                SubLObject cdolist_list_var = args.rest();
                SubLObject conjunct = NIL;
                conjunct = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    princ($str302$___, stream);
                    output_tptp_sentence_recursive(stream, conjunct);
                    cdolist_list_var = cdolist_list_var.rest();
                    conjunct = cdolist_list_var.first();
                } 
                princ($str300$_, stream);
            } else
                if (pcase_var.eql($$or)) {
                    princ($str298$_, stream);
                    output_tptp_sentence_recursive(stream, args.first());
                    SubLObject cdolist_list_var = args.rest();
                    SubLObject disjunct = NIL;
                    disjunct = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        princ($str304$___, stream);
                        output_tptp_sentence_recursive(stream, disjunct);
                        cdolist_list_var = cdolist_list_var.rest();
                        disjunct = cdolist_list_var.first();
                    } 
                    princ($str300$_, stream);
                } else
                    if (pcase_var.eql($$not)) {
                        princ($str306$__, stream);
                        output_tptp_sentence_recursive(stream, args.first());
                        princ($str300$_, stream);
                    } else
                        if (pcase_var.eql($$thereExists)) {
                            SubLObject current_$60;
                            final SubLObject datum_$59 = current_$60 = args;
                            SubLObject el_var = NIL;
                            SubLObject fol_subsentence = NIL;
                            destructuring_bind_must_consp(current_$60, datum_$59, $list308);
                            el_var = current_$60.first();
                            current_$60 = current_$60.rest();
                            destructuring_bind_must_consp(current_$60, datum_$59, $list308);
                            fol_subsentence = current_$60.first();
                            current_$60 = current_$60.rest();
                            if (NIL == current_$60) {
                                format(stream, $str309$_____a____, fol_tptp_el_var_name(el_var));
                                output_tptp_sentence_recursive(stream, fol_subsentence);
                                princ($str300$_, stream);
                            } else {
                                cdestructuring_bind_error(datum_$59, $list308);
                            }
                        } else
                            if (pcase_var.eql($$forAll)) {
                                SubLObject current_$61;
                                final SubLObject datum_$60 = current_$61 = args;
                                SubLObject el_var = NIL;
                                SubLObject fol_subsentence = NIL;
                                destructuring_bind_must_consp(current_$61, datum_$60, $list308);
                                el_var = current_$61.first();
                                current_$61 = current_$61.rest();
                                destructuring_bind_must_consp(current_$61, datum_$60, $list308);
                                fol_subsentence = current_$61.first();
                                current_$61 = current_$61.rest();
                                if (NIL == current_$61) {
                                    format(stream, $str311$_____a____, fol_tptp_el_var_name(el_var));
                                    output_tptp_sentence_recursive(stream, fol_subsentence);
                                    princ($str300$_, stream);
                                } else {
                                    cdestructuring_bind_error(datum_$60, $list308);
                                }
                            } else
                                if (pcase_var.eql($$equals) || pcase_var.eql($$equalSymbols)) {
                                    SubLObject current_$62;
                                    final SubLObject datum_$61 = current_$62 = args;
                                    SubLObject arg1 = NIL;
                                    SubLObject arg2 = NIL;
                                    destructuring_bind_must_consp(current_$62, datum_$61, $list133);
                                    arg1 = current_$62.first();
                                    current_$62 = current_$62.rest();
                                    destructuring_bind_must_consp(current_$62, datum_$61, $list133);
                                    arg2 = current_$62.first();
                                    current_$62 = current_$62.rest();
                                    if (NIL == current_$62) {
                                        princ($str298$_, stream);
                                        output_tptp_arg(stream, arg1);
                                        princ($str313$___, stream);
                                        output_tptp_arg(stream, arg2);
                                        princ($str300$_, stream);
                                    } else {
                                        cdestructuring_bind_error(datum_$61, $list133);
                                    }
                                } else {
                                    princ($str298$_, stream);
                                    output_tptp_predicate(stream, operator);
                                    princ($str298$_, stream);
                                    output_tptp_arg(stream, args.first());
                                    SubLObject cdolist_list_var = args.rest();
                                    SubLObject arg3 = NIL;
                                    arg3 = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        princ($str314$_, stream);
                                        output_tptp_arg(stream, arg3);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        arg3 = cdolist_list_var.first();
                                    } 
                                    princ($str315$__, stream);
                                }






        return NIL;
    }

    public static SubLObject output_tptp_arg(final SubLObject stream, final SubLObject v_object) {
        if (NIL != fol_function_p(v_object)) {
            return output_tptp_function(stream, v_object);
        }
        if (NIL != fol_atomic_term_p(v_object)) {
            return output_tptp_atomic_term(stream, v_object);
        }
        if (NIL != fol_string_constant_p(v_object)) {
            return output_tptp_string_constant(stream, v_object);
        }
        if (NIL != fol_string_p(v_object)) {
            return output_tptp_string(stream, v_object);
        }
        if (NIL != fol_number_constant_p(v_object)) {
            return output_tptp_number_constant(stream, v_object);
        }
        if (NIL != fol_number_p(v_object)) {
            return output_tptp_number(stream, v_object);
        }
        if (NIL != cycl_grammar.el_variable_p(v_object)) {
            return output_tptp_variable(stream, v_object);
        }
        if (NIL != possibly_naut_p(v_object)) {
            return output_tptp_nat(stream, v_object);
        }
        return Errors.error($str316$unexpected_FOL_term__s, v_object);
    }

    public static SubLObject output_tptp_nat(final SubLObject stream, final SubLObject fol_nat) {
        SubLObject fol_function = NIL;
        SubLObject fol_args = NIL;
        destructuring_bind_must_consp(fol_nat, fol_nat, $list317);
        fol_function = fol_nat.first();
        final SubLObject current = fol_args = fol_nat.rest();
        final SubLObject v_arity = fol_function_arity(fol_function);
        if (v_arity.isZero()) {
            output_tptp_zero_arity_function(stream, fol_function);
        } else {
            output_tptp_function(stream, fol_function);
            princ($str298$_, stream);
            if (NIL != fol_args) {
                output_tptp_arg(stream, fol_args.first());
            }
            SubLObject cdolist_list_var = fol_args.rest();
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                princ($str314$_, stream);
                output_tptp_arg(stream, arg);
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            } 
            princ($str300$_, stream);
        }
        return NIL;
    }

    public static SubLObject output_tptp_predicate(final SubLObject stream, final SubLObject fol_predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fol_predicate_fn = NIL;
        SubLObject cycl_predicate = NIL;
        SubLObject v_arity = NIL;
        destructuring_bind_must_consp(fol_predicate, fol_predicate, $list318);
        fol_predicate_fn = fol_predicate.first();
        SubLObject current = fol_predicate.rest();
        destructuring_bind_must_consp(current, fol_predicate, $list318);
        cycl_predicate = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, fol_predicate, $list318);
        v_arity = current.first();
        current = current.rest();
        if (NIL == current) {
            if ($fol_translation_type$.getDynamicValue(thread) == $SET_THEORY) {
                princ(make_tptp_symbol_name(cconcatenate($str319$p_, string_utilities.str(cycl_predicate))), stream);
            } else {
                princ(make_tptp_symbol_name(string_utilities.str(cycl_predicate)), stream);
            }
        } else {
            cdestructuring_bind_error(fol_predicate, $list318);
        }
        return NIL;
    }

    public static SubLObject output_tptp_function(final SubLObject stream, final SubLObject fol_function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fol_function_fn = NIL;
        SubLObject cycl_function = NIL;
        SubLObject v_arity = NIL;
        destructuring_bind_must_consp(fol_function, fol_function, $list320);
        fol_function_fn = fol_function.first();
        SubLObject current = fol_function.rest();
        destructuring_bind_must_consp(current, fol_function, $list320);
        cycl_function = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, fol_function, $list320);
        v_arity = current.first();
        current = current.rest();
        if (NIL == current) {
            if ($fol_translation_type$.getDynamicValue(thread) == $SET_THEORY) {
                princ(make_tptp_symbol_name(cconcatenate($str321$f_, string_utilities.str(cycl_function))), stream);
            } else {
                princ(make_tptp_symbol_name(cconcatenate($str321$f_, string_utilities.str(cycl_function))), stream);
            }
        } else {
            cdestructuring_bind_error(fol_function, $list320);
        }
        return NIL;
    }

    public static SubLObject output_tptp_zero_arity_function(final SubLObject stream, final SubLObject fol_function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fol_function_fn = NIL;
        SubLObject cycl_function = NIL;
        SubLObject v_arity = NIL;
        destructuring_bind_must_consp(fol_function, fol_function, $list320);
        fol_function_fn = fol_function.first();
        SubLObject current = fol_function.rest();
        destructuring_bind_must_consp(current, fol_function, $list320);
        cycl_function = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, fol_function, $list320);
        v_arity = current.first();
        current = current.rest();
        if (NIL == current) {
            if ($fol_translation_type$.getDynamicValue(thread) == $SET_THEORY) {
                princ(make_tptp_symbol_name(string_utilities.str(cycl_function)), stream);
            } else {
                princ(make_tptp_symbol_name(cconcatenate($str322$c_zero_arity_function_application, string_utilities.str(cycl_function))), stream);
            }
        } else {
            cdestructuring_bind_error(fol_function, $list320);
        }
        return NIL;
    }

    public static SubLObject output_tptp_atomic_term(final SubLObject stream, final SubLObject fol_atomic_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fol_atomic_term_fn = NIL;
        SubLObject cycl_atomic_term = NIL;
        destructuring_bind_must_consp(fol_atomic_term, fol_atomic_term, $list323);
        fol_atomic_term_fn = fol_atomic_term.first();
        SubLObject current = fol_atomic_term.rest();
        destructuring_bind_must_consp(current, fol_atomic_term, $list323);
        cycl_atomic_term = current.first();
        current = current.rest();
        if (NIL == current) {
            if ($fol_translation_type$.getDynamicValue(thread) == $SET_THEORY) {
                princ(make_tptp_symbol_name(constants_high.constant_name(cycl_atomic_term)), stream);
            } else {
                princ(make_tptp_symbol_name(cconcatenate($str324$c_, constants_high.constant_name(cycl_atomic_term))), stream);
            }
        } else {
            cdestructuring_bind_error(fol_atomic_term, $list323);
        }
        return NIL;
    }

    public static SubLObject output_tptp_string_constant(final SubLObject stream, final SubLObject fol_string) {
        SubLObject fol_string_constant_fn = NIL;
        SubLObject subl_string = NIL;
        destructuring_bind_must_consp(fol_string, fol_string, $list325);
        fol_string_constant_fn = fol_string.first();
        SubLObject current = fol_string.rest();
        destructuring_bind_must_consp(current, fol_string, $list325);
        subl_string = current.first();
        current = current.rest();
        if (NIL == current) {
            princ(make_tptp_symbol_name(cconcatenate($str326$s_, subl_string)), stream);
        } else {
            cdestructuring_bind_error(fol_string, $list325);
        }
        return NIL;
    }

    public static SubLObject output_tptp_string(final SubLObject stream, final SubLObject fol_string) {
        SubLObject fol_string_fn = NIL;
        SubLObject subl_string = NIL;
        destructuring_bind_must_consp(fol_string, fol_string, $list327);
        fol_string_fn = fol_string.first();
        SubLObject current = fol_string.rest();
        destructuring_bind_must_consp(current, fol_string, $list327);
        subl_string = current.first();
        current = current.rest();
        if (NIL == current) {
            princ($str328$_, stream);
            princ(tptp_string_stringify(subl_string), stream);
            princ($str328$_, stream);
        } else {
            cdestructuring_bind_error(fol_string, $list327);
        }
        return NIL;
    }

    public static SubLObject output_tptp_number_constant(final SubLObject stream, final SubLObject fol_number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fol_number_constant_fn = NIL;
        SubLObject subl_number = NIL;
        destructuring_bind_must_consp(fol_number, fol_number, $list329);
        fol_number_constant_fn = fol_number.first();
        SubLObject current = fol_number.rest();
        destructuring_bind_must_consp(current, fol_number, $list329);
        subl_number = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
            try {
                $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                princ(make_tptp_symbol_name(cconcatenate($str331$n_, format_nil.format_nil_a_no_copy(subl_number))), stream);
            } finally {
                $read_default_float_format$.rebind(_prev_bind_0, thread);
            }
        } else {
            cdestructuring_bind_error(fol_number, $list329);
        }
        return NIL;
    }

    public static SubLObject output_tptp_number(final SubLObject stream, final SubLObject fol_number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fol_number_fn = NIL;
        SubLObject subl_number = NIL;
        destructuring_bind_must_consp(fol_number, fol_number, $list332);
        fol_number_fn = fol_number.first();
        SubLObject current = fol_number.rest();
        destructuring_bind_must_consp(current, fol_number, $list332);
        subl_number = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
            try {
                $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                princ(tptp_number_stringify(format_nil.format_nil_a(subl_number)), stream);
            } finally {
                $read_default_float_format$.rebind(_prev_bind_0, thread);
            }
        } else {
            cdestructuring_bind_error(fol_number, $list332);
        }
        return NIL;
    }

    public static SubLObject output_tptp_variable(final SubLObject stream, final SubLObject el_var) {
        princ(fol_tptp_el_var_name(el_var), stream);
        return NIL;
    }

    public static SubLObject fol_tptp_el_var_name(final SubLObject el_var) {
        return tptp_upcase_stringify(cycl_variables.el_var_name(el_var));
    }

    public static SubLObject tptp_string_stringify(final SubLObject string) {
        return list_utilities.delete_if_not(TPTP_STRING_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject clear_tptp_long_symbol_name_cache() {
        $tptp_long_symbol_name_cache$.setGlobalValue(make_hash_table($int$256, symbol_function(EQUAL), UNPROVIDED));
        return $tptp_long_symbol_name_cache$.getGlobalValue();
    }

    public static SubLObject make_tptp_symbol_name(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject name = tptp_downcase_stringify(string);
        if (length(name).numGE($tptp_long_symbol_min_length$.getDynamicValue(thread))) {
            final SubLObject cached_name = gethash_without_values(name, $tptp_long_symbol_name_cache$.getGlobalValue(), UNPROVIDED);
            if (NIL != cached_name) {
                name = cached_name;
            } else {
                final SubLObject i = hash_table_count($tptp_long_symbol_name_cache$.getGlobalValue());
                final SubLObject new_name = cconcatenate($str336$ls_, string_utilities.str(i));
                sethash(name, $tptp_long_symbol_name_cache$.getGlobalValue(), new_name);
                name = new_name;
            }
        }
        return name;
    }

    public static SubLObject tptp_downcase_stringify(SubLObject string) {
        string = string_utilities.char_subst(CHAR_underbar, CHAR_hyphen, string);
        string = string_utilities.char_subst(CHAR_underbar, CHAR_colon, string);
        string = list_utilities.delete_if_not(TPTP_NON_NUMERIC_ATOM_CHAR_P, Strings.string_downcase(string, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == alpha_char_p(string_utilities.first_char(string))) {
            string = cconcatenate($str338$tptp_, string);
        }
        return string;
    }

    public static SubLObject tptp_upcase_stringify(final SubLObject string) {
        return list_utilities.delete_if_not(TPTP_NON_NUMERIC_ATOM_CHAR_P, Strings.string_upcase(string, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject tptp_number_stringify(final SubLObject string) {
        return list_utilities.delete_if_not(TPTP_NUMERIC_ATOM_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject tptp_string_char_p(final SubLObject character) {
        if (((!CHAR_quotation.eql(character)) && (!CHAR_backslash.eql(character))) && (!CHAR_newline.eql(character))) {
            final SubLObject code = char_code(character);
            if (code.numGE($int$32) && code.numLE($int$126)) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject tptp_non_numeric_atom_char_p(final SubLObject character) {
        return makeBoolean((NIL != alphanumericp(character)) || CHAR_underbar.eql(character));
    }

    public static SubLObject tptp_numeric_atom_char_p(final SubLObject character) {
        return makeBoolean(((NIL != alphanumericp(character)) || CHAR_underbar.eql(character)) || CHAR_period.eql(character));
    }

    public static SubLObject fol_sentences_to_alchemy_stream(final SubLObject fol_sentences_analysis, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fol_sentences_data = fol_sentences_analysis_data(fol_sentences_analysis);
        final SubLObject v_properties = fol_sentences_analysis_generation_properties(fol_sentences_analysis);
        final SubLObject include_commentsP = getf(v_properties, $kw48$INCLUDE_COMMENTS_, T);
        if (NIL != include_commentsP) {
            fol_header_to_alchemy_stream(fol_sentences_analysis, stream);
        }
        final SubLObject _prev_bind_0 = $include_alchemy_commentsP$.currentBinding(thread);
        try {
            $include_alchemy_commentsP$.bind(include_commentsP, thread);
            SubLObject cdolist_list_var = fol_sentences_data;
            SubLObject datum = NIL;
            datum = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                fol_datum_to_alchemy_stream(datum, stream);
                cdolist_list_var = cdolist_list_var.rest();
                datum = cdolist_list_var.first();
            } 
        } finally {
            $include_alchemy_commentsP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject fol_header_to_alchemy_stream(final SubLObject fol_sentences_analysis, final SubLObject stream) {
        final SubLObject v_properties = fol_sentences_analysis_generation_properties(fol_sentences_analysis);
        final SubLObject header = fol_generate_alchemy_header(v_properties);
        princ(header, stream);
        return stream;
    }

    public static SubLObject fol_datum_to_alchemy_stream(final SubLObject datum, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_term = NIL;
        SubLObject fol_sentences = NIL;
        destructuring_bind_must_consp(datum, datum, $list76);
        v_term = datum.first();
        SubLObject current = datum.rest();
        destructuring_bind_must_consp(current, datum, $list76);
        fol_sentences = current.first();
        current = current.rest();
        final SubLObject unhandled_fol_sentences = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list76);
        current = current.rest();
        if (NIL == current) {
            if ((NIL != fol_sentences) && (NIL != $include_alchemy_commentsP$.getDynamicValue(thread))) {
                terpri(stream);
                output_alchemy_term_comment(v_term, stream);
            }
            SubLObject hardP = makeBoolean(((NIL != $alchemy_output_monotonic_rule_indicator$.getDynamicValue(thread)) && (NIL != assertion_handles.assertion_p(v_term))) && ($MONOTONIC == assertions_high.assertion_strength(v_term)));
            SubLObject cdolist_list_var = fol_sentences;
            SubLObject focycl = NIL;
            focycl = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == alchemy_export.alchemy_skip_fol_sentenceP(focycl)) {
                    if (cycl_utilities.formula_arg0(focycl).eql($$equiv)) {
                        hardP = T;
                    }
                    alchemy_export.alchemy_export_sentence(focycl, stream, T, hardP);
                }
                cdolist_list_var = cdolist_list_var.rest();
                focycl = cdolist_list_var.first();
            } 
        } else {
            cdestructuring_bind_error(datum, $list76);
        }
        return NIL;
    }

    public static SubLObject output_alchemy_term_comment(final SubLObject v_term, final SubLObject stream) {
        terpri(stream);
        if (NIL != assertion_handles.assertion_p(v_term)) {
            SubLObject assertion_string = NIL;
            assertion_string = string_utilities.string_substitute($$$_, string_utilities.$new_line_string$.getGlobalValue(), format(NIL, $str344$_A, uncanonicalizer.assertion_el_formula(v_term)), UNPROVIDED);
            format(stream, $str345$___Cyc_Assertion__a, assertion_string);
        } else
            if (NIL != nart_handles.nart_p(v_term)) {
                format(stream, $str346$___Cyc_NART__a, cycl_utilities.hl_to_el(v_term));
            } else
                if (NIL != constant_p(v_term)) {
                    format(stream, $str347$___Cyc_Constant___a_, constants_high.constant_internal_id(v_term));
                } else
                    if (NIL != possibly_cycl_sentence_p(v_term)) {
                        final SubLObject representation = string_utilities.string_substitute($$$_, string_utilities.$new_line_string$.getGlobalValue(), format(NIL, $str344$_A, v_term), UNPROVIDED);
                        format(stream, $str348$___CycL_Sentence___a_, representation);
                    } else {
                        Errors.error($str259$Unexpected_object__s, v_term);
                    }



        return stream;
    }

    public static SubLObject fol_generate_alchemy_header(final SubLObject v_properties) {
        return $str271$;
    }

    public static SubLObject focycl_to_cycl(final SubLObject focycl) {
        if (NIL != fol_function_p(focycl)) {
            return cycl_utilities.formula_arg1(focycl, UNPROVIDED);
        }
        if (NIL != fol_predicate_p(focycl)) {
            return cycl_utilities.formula_arg1(focycl, UNPROVIDED);
        }
        if (NIL != fol_atomic_term_p(focycl)) {
            return cycl_utilities.formula_arg1(focycl, UNPROVIDED);
        }
        if (NIL != fol_string_constant_p(focycl)) {
            return cycl_utilities.formula_arg1(focycl, UNPROVIDED);
        }
        if (NIL != fol_string_p(focycl)) {
            return cycl_utilities.formula_arg1(focycl, UNPROVIDED);
        }
        if (NIL != fol_number_constant_p(focycl)) {
            return cycl_utilities.formula_arg1(focycl, UNPROVIDED);
        }
        if (NIL != fol_number_p(focycl)) {
            return cycl_utilities.formula_arg1(focycl, UNPROVIDED);
        }
        if (NIL != cycl_grammar.el_variable_p(focycl)) {
            return focycl;
        }
        if (NIL != fort_types_interface.sentential_relation_p(focycl)) {
            return focycl;
        }
        if (NIL != el_formula_p(focycl)) {
            return Mapping.mapcar(symbol_function(FOCYCL_TO_CYCL), focycl);
        }
        return Errors.error($str316$unexpected_FOL_term__s, focycl);
    }

    public static SubLObject generate_symbol_index_file_from_kb(final SubLObject filename, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentence_index = ZERO_INTEGER;
        final SubLObject predicate_set = set.new_set(symbol_function(EQ), UNPROVIDED);
        final SubLObject function_set = set.new_set(symbol_function(EQ), UNPROVIDED);
        final SubLObject term_set = set.new_set(symbol_function(EQ), UNPROVIDED);
        SubLObject term_count = NIL;
        SubLObject sentence_count = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str53$Unable_to_open__S, filename);
            }
            final SubLObject stream_$67 = stream;
            final SubLObject current;
            final SubLObject datum = current = v_properties;
            final SubLObject mt_handling_tail = property_list_member($MT_HANDLING, current);
            final SubLObject mt_handling = (NIL != mt_handling_tail) ? cadr(mt_handling_tail) : NIL;
            final SubLObject mt_ceiling_tail = property_list_member($MT_CEILING, current);
            final SubLObject mt_ceiling = (NIL != mt_ceiling_tail) ? cadr(mt_ceiling_tail) : NIL;
            final SubLObject isa_handling_tail = property_list_member($ISA_HANDLING, current);
            final SubLObject isa_handling = (NIL != isa_handling_tail) ? cadr(isa_handling_tail) : NIL;
            final SubLObject rule_macro_predicate_handling_tail = property_list_member($RULE_MACRO_PREDICATE_HANDLING, current);
            final SubLObject rule_macro_predicate_handling = (NIL != rule_macro_predicate_handling_tail) ? cadr(rule_macro_predicate_handling_tail) : NIL;
            final SubLObject include_horn_tail = property_list_member($INCLUDE_HORN, current);
            final SubLObject include_horn = (NIL != include_horn_tail) ? cadr(include_horn_tail) : T;
            final SubLObject term_types_tail = property_list_member($TERM_TYPES, current);
            final SubLObject term_types = (NIL != term_types_tail) ? cadr(term_types_tail) : $ALL;
            final SubLObject _prev_bind_2 = $fol_mt_handling$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $fol_isa_handling$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $fol_rmp_handling$.currentBinding(thread);
            try {
                $fol_mt_handling$.bind(mt_handling, thread);
                $fol_isa_handling$.bind(isa_handling, thread);
                $fol_rmp_handling$.bind(rule_macro_predicate_handling, thread);
                final SubLObject idx = assertion_handles.do_assertions_table();
                final SubLObject mess = $$$Converting_assertions_to_FOL;
                final SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                final SubLObject _prev_bind_0_$68 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_1_$69 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_2_$70 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble(mess);
                        final SubLObject idx_$71 = idx;
                        if (NIL == id_index_objects_empty_p(idx_$71, $SKIP)) {
                            final SubLObject idx_$72 = idx_$71;
                            if (NIL == id_index_dense_objects_empty_p(idx_$72, $SKIP)) {
                                final SubLObject vector_var = id_index_dense_objects(idx_$72);
                                final SubLObject backwardP_var = NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject a_id;
                                SubLObject a_handle;
                                SubLObject ass;
                                SubLObject cdolist_list_var;
                                SubLObject sentences;
                                SubLObject sentence;
                                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                    a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                    a_handle = aref(vector_var, a_id);
                                    if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        if (NIL != id_index_tombstone_p(a_handle)) {
                                            a_handle = $SKIP;
                                        }
                                        ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                        if (NIL != kb_fol_assertion_under_mt_ceilingP(ass, mt_ceiling)) {
                                            sentences = cdolist_list_var = assertion_fol_sentences(ass);
                                            sentence = NIL;
                                            sentence = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                if (NIL != fol_sentence_allowed_by_horn_handling(sentence, include_horn)) {
                                                    sentence_index = add(sentence_index, ONE_INTEGER);
                                                    generate_symbol_index_file_from_kb_int(stream_$67, sentence_index, sentence, term_types, predicate_set, function_set, term_set);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                sentence = cdolist_list_var.first();
                                            } 
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                    }
                                }
                            }
                            final SubLObject idx_$73 = idx_$71;
                            if ((NIL == id_index_sparse_objects_empty_p(idx_$73)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                final SubLObject sparse = id_index_sparse_objects(idx_$73);
                                SubLObject a_id2 = id_index_sparse_id_threshold(idx_$73);
                                final SubLObject end_id = id_index_next_id(idx_$73);
                                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                while (a_id2.numL(end_id)) {
                                    final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                        final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                        if (NIL != kb_fol_assertion_under_mt_ceilingP(ass2, mt_ceiling)) {
                                            SubLObject cdolist_list_var2;
                                            final SubLObject sentences2 = cdolist_list_var2 = assertion_fol_sentences(ass2);
                                            SubLObject sentence2 = NIL;
                                            sentence2 = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                if (NIL != fol_sentence_allowed_by_horn_handling(sentence2, include_horn)) {
                                                    sentence_index = add(sentence_index, ONE_INTEGER);
                                                    generate_symbol_index_file_from_kb_int(stream_$67, sentence_index, sentence2, term_types, predicate_set, function_set, term_set);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                sentence2 = cdolist_list_var2.first();
                                            } 
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                    }
                                    a_id2 = add(a_id2, ONE_INTEGER);
                                } 
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$69 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$69, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_2_$70, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_1_$69, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_0_$68, thread);
                }
                final SubLObject _prev_bind_0_$70 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$70 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    final SubLObject message = $$$Converting_forts_to_FOL;
                    final SubLObject total_$77 = forts.fort_count();
                    SubLObject sofar_$78 = ZERO_INTEGER;
                    final SubLObject _prev_bind_0_$71 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$71 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$71 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble(message);
                            SubLObject cdolist_list_var3 = forts.do_forts_tables();
                            SubLObject table_var = NIL;
                            table_var = cdolist_list_var3.first();
                            while (NIL != cdolist_list_var3) {
                                final SubLObject idx_$74 = table_var;
                                if (NIL == id_index_objects_empty_p(idx_$74, $SKIP)) {
                                    final SubLObject idx_$75 = idx_$74;
                                    if (NIL == id_index_dense_objects_empty_p(idx_$75, $SKIP)) {
                                        final SubLObject vector_var2 = id_index_dense_objects(idx_$75);
                                        final SubLObject backwardP_var2 = NIL;
                                        SubLObject length2;
                                        SubLObject v_iteration2;
                                        SubLObject id;
                                        SubLObject fort;
                                        SubLObject allow_equiv_relationP;
                                        SubLObject cdolist_list_var_$84;
                                        SubLObject sentences3;
                                        SubLObject sentence3;
                                        for (length2 = length(vector_var2), v_iteration2 = NIL, v_iteration2 = ZERO_INTEGER; v_iteration2.numL(length2); v_iteration2 = add(v_iteration2, ONE_INTEGER)) {
                                            id = (NIL != backwardP_var2) ? subtract(length2, v_iteration2, ONE_INTEGER) : v_iteration2;
                                            fort = aref(vector_var2, id);
                                            if ((NIL == id_index_tombstone_p(fort)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                                if (NIL != id_index_tombstone_p(fort)) {
                                                    fort = $SKIP;
                                                }
                                                sofar_$78 = add(sofar_$78, ONE_INTEGER);
                                                note_percent_progress(sofar_$78, total_$77);
                                                allow_equiv_relationP = getf(v_properties, $kw43$ALLOW_EQUIV_RELATION_, NIL);
                                                sentences3 = cdolist_list_var_$84 = kb_fol_additional_sentences_for_term(fort, mt_ceiling, allow_equiv_relationP);
                                                sentence3 = NIL;
                                                sentence3 = cdolist_list_var_$84.first();
                                                while (NIL != cdolist_list_var_$84) {
                                                    if (NIL != fol_sentence_allowed_by_horn_handling(sentence3, include_horn)) {
                                                        sentence_index = add(sentence_index, ONE_INTEGER);
                                                        generate_symbol_index_file_from_kb_int(stream_$67, sentence_index, sentence3, term_types, predicate_set, function_set, term_set);
                                                    }
                                                    cdolist_list_var_$84 = cdolist_list_var_$84.rest();
                                                    sentence3 = cdolist_list_var_$84.first();
                                                } 
                                            }
                                        }
                                    }
                                    final SubLObject idx_$76 = idx_$74;
                                    if ((NIL == id_index_sparse_objects_empty_p(idx_$76)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        final SubLObject sparse2 = id_index_sparse_objects(idx_$76);
                                        SubLObject id2 = id_index_sparse_id_threshold(idx_$76);
                                        final SubLObject end_id2 = id_index_next_id(idx_$76);
                                        final SubLObject v_default2 = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                        while (id2.numL(end_id2)) {
                                            final SubLObject fort2 = gethash_without_values(id2, sparse2, v_default2);
                                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(fort2))) {
                                                sofar_$78 = add(sofar_$78, ONE_INTEGER);
                                                note_percent_progress(sofar_$78, total_$77);
                                                final SubLObject allow_equiv_relationP2 = getf(v_properties, $kw43$ALLOW_EQUIV_RELATION_, NIL);
                                                SubLObject cdolist_list_var_$85;
                                                final SubLObject sentences4 = cdolist_list_var_$85 = kb_fol_additional_sentences_for_term(fort2, mt_ceiling, allow_equiv_relationP2);
                                                SubLObject sentence4 = NIL;
                                                sentence4 = cdolist_list_var_$85.first();
                                                while (NIL != cdolist_list_var_$85) {
                                                    if (NIL != fol_sentence_allowed_by_horn_handling(sentence4, include_horn)) {
                                                        sentence_index = add(sentence_index, ONE_INTEGER);
                                                        generate_symbol_index_file_from_kb_int(stream_$67, sentence_index, sentence4, term_types, predicate_set, function_set, term_set);
                                                    }
                                                    cdolist_list_var_$85 = cdolist_list_var_$85.rest();
                                                    sentence4 = cdolist_list_var_$85.first();
                                                } 
                                            }
                                            id2 = add(id2, ONE_INTEGER);
                                        } 
                                    }
                                }
                                cdolist_list_var3 = cdolist_list_var3.rest();
                                table_var = cdolist_list_var3.first();
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$72 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$72, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_6, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2_$71, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1_$71, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0_$71, thread);
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$70, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$70, thread);
                }
            } finally {
                $fol_rmp_handling$.rebind(_prev_bind_4, thread);
                $fol_isa_handling$.rebind(_prev_bind_3, thread);
                $fol_mt_handling$.rebind(_prev_bind_2, thread);
            }
            sentence_count = sentence_index;
            term_count = add(set.set_size(predicate_set), set.set_size(function_set), set.set_size(term_set));
        } finally {
            final SubLObject _prev_bind_7 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values3 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values3);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_7, thread);
            }
        }
        return values(term_count, sentence_count);
    }

    public static SubLObject fol_sentence_allowed_by_horn_handling(final SubLObject sentence, final SubLObject include_horn) {
        if (NIL != include_horn) {
            return T;
        }
        if (NIL != el_disjunction_p(sentence)) {
            return T;
        }
        if ((NIL != el_implication_p(sentence)) && (NIL != el_disjunction_p(cycl_utilities.sentence_arg2(sentence, UNPROVIDED)))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject generate_symbol_index_file_from_kb_int(final SubLObject stream, final SubLObject sentence_index, final SubLObject sentence, final SubLObject term_types, final SubLObject predicate_set, final SubLObject function_set, final SubLObject term_set) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject predicates = categorize_fol_terms(sentence);
        final SubLObject functions = thread.secondMultipleValue();
        final SubLObject terms = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if ((term_types == $ALL) || (NIL != list_utilities.member_eqP($PREDICATE, term_types))) {
            SubLObject cdolist_list_var = predicates;
            SubLObject predicate = NIL;
            predicate = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                set.set_add(predicate, predicate_set);
                format(stream, $str354$_S_, sentence_index);
                print_symbol_index_term_string(stream, predicate, $PREDICATE);
                terpri(stream);
                cdolist_list_var = cdolist_list_var.rest();
                predicate = cdolist_list_var.first();
            } 
        }
        if ((term_types == $ALL) || (NIL != list_utilities.member_eqP($FUNCTION, term_types))) {
            SubLObject cdolist_list_var = functions;
            SubLObject function = NIL;
            function = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                set.set_add(function, function_set);
                format(stream, $str354$_S_, sentence_index);
                print_symbol_index_term_string(stream, function, $FUNCTION);
                terpri(stream);
                cdolist_list_var = cdolist_list_var.rest();
                function = cdolist_list_var.first();
            } 
        }
        if ((term_types == $ALL) || (NIL != list_utilities.member_eqP($TERM, term_types))) {
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                set.set_add(v_term, term_set);
                format(stream, $str354$_S_, sentence_index);
                print_symbol_index_term_string(stream, v_term, $TERM);
                terpri(stream);
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject categorize_fol_terms(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject predicates = NIL;
        SubLObject functions = NIL;
        SubLObject terms = NIL;
        final SubLObject _prev_bind_0 = $categorize_fol_predicates$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $categorize_fol_functions$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $categorize_fol_terms$.currentBinding(thread);
        try {
            $categorize_fol_predicates$.bind(NIL, thread);
            $categorize_fol_functions$.bind(NIL, thread);
            $categorize_fol_terms$.bind(NIL, thread);
            cycl_utilities.expression_map(CATEGORIZE_FOL_TERMS_INT, sentence, UNPROVIDED, UNPROVIDED);
            predicates = nreverse($categorize_fol_predicates$.getDynamicValue(thread));
            functions = nreverse($categorize_fol_functions$.getDynamicValue(thread));
            terms = nreverse($categorize_fol_terms$.getDynamicValue(thread));
        } finally {
            $categorize_fol_terms$.rebind(_prev_bind_3, thread);
            $categorize_fol_functions$.rebind(_prev_bind_2, thread);
            $categorize_fol_predicates$.rebind(_prev_bind_0, thread);
        }
        return values(predicates, functions, terms);
    }

    public static SubLObject categorize_fol_terms_int(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (v_object.isCons()) {
            final SubLObject pcase_var = v_object.first();
            if (pcase_var.eql($$FOL_PredicateFn)) {
                final SubLObject item_var = second(v_object);
                if (NIL == member(item_var, $categorize_fol_predicates$.getDynamicValue(thread), symbol_function(EQ), symbol_function(IDENTITY))) {
                    $categorize_fol_predicates$.setDynamicValue(cons(item_var, $categorize_fol_predicates$.getDynamicValue(thread)), thread);
                }
            } else
                if (pcase_var.eql($$FOL_FunctionFn)) {
                    final SubLObject item_var = second(v_object);
                    if (NIL == member(item_var, $categorize_fol_functions$.getDynamicValue(thread), symbol_function(EQ), symbol_function(IDENTITY))) {
                        $categorize_fol_functions$.setDynamicValue(cons(item_var, $categorize_fol_functions$.getDynamicValue(thread)), thread);
                    }
                } else
                    if (pcase_var.eql($$FOL_AtomicTermFn)) {
                        final SubLObject item_var = second(v_object);
                        if (NIL == member(item_var, $categorize_fol_terms$.getDynamicValue(thread), symbol_function(EQ), symbol_function(IDENTITY))) {
                            $categorize_fol_terms$.setDynamicValue(cons(item_var, $categorize_fol_terms$.getDynamicValue(thread)), thread);
                        }
                    }


        }
        return NIL;
    }

    public static SubLObject print_symbol_index_term_string(final SubLObject stream, final SubLObject v_term, final SubLObject v_class) {
        if (NIL != constant_p(v_term)) {
            princ(fol_constant_string(v_term), stream);
        } else
            if (NIL != nart_handles.nart_p(v_term)) {
                princ(fol_nart_string(v_term), stream);
            } else {
                Errors.error($str358$time_to_handle_non_forts);
            }

        if (v_class.eql($PREDICATE)) {
            princ($str359$_P, stream);
        } else
            if (v_class.eql($FUNCTION)) {
                princ($str360$_F, stream);
            } else
                if (v_class.eql($TERM)) {
                    princ($str361$_T, stream);
                } else {
                    Errors.error($str362$time_to_handle__S, v_class);
                }


        return NIL;
    }

    public static SubLObject fol_constant_string(final SubLObject constant) {
        return constants_high.constant_name(constant);
    }

    public static SubLObject clear_fol_nart_string() {
        final SubLObject cs = $fol_nart_string_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_fol_nart_string(final SubLObject nart) {
        return memoization_state.caching_state_remove_function_results_with_args($fol_nart_string_caching_state$.getGlobalValue(), list(nart), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fol_nart_string_internal(final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = NIL;
        final SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
        try {
            $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
            string = cb_fort_display_string(nart);
        } finally {
            $read_default_float_format$.rebind(_prev_bind_0, thread);
        }
        string = list_utilities.nsubstitute_if_not(CHAR_underbar, symbol_function(VALID_CONSTANT_NAME_CHAR_P), string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return string;
    }

    public static SubLObject fol_nart_string(final SubLObject nart) {
        SubLObject caching_state = $fol_nart_string_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(FOL_NART_STRING, $fol_nart_string_caching_state$, NIL, EQ, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, nart, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(fol_nart_string_internal(nart)));
            memoization_state.caching_state_put(caching_state, nart, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject write_deepak_opencyc_queries(final SubLObject filename, final SubLObject fol_sentences_analysis) {
        final SubLObject opencyc = arete.load_arete_experiment($str367$opencyc_all_20050422_non_conditio);
        final SubLObject answerable = kbq_query_run.kbq_answerable_query_set_run(opencyc);
        final SubLObject queries = kbq_query_run.kbq_query_set_run_queries(answerable);
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(filename, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str53$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
            SubLObject cdolist_list_var = queries;
            SubLObject query_spec = NIL;
            query_spec = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                kbq_fol_sentence_to_stream(query_spec, fol_sentences_analysis, $TPTP, $deepak_folification_properties$.getGlobalValue(), s);
                cdolist_list_var = cdolist_list_var.rest();
                query_spec = cdolist_list_var.first();
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
        return length(queries);
    }

    public static SubLObject deepak_kb_fol_sentences(SubLObject sample_rate) {
        if (sample_rate == UNPROVIDED) {
            sample_rate = ONE_INTEGER;
        }
        final SubLObject folification_properties = putf(copy_list($deepak_folification_properties$.getGlobalValue()), $SAMPLE_RATE, sample_rate);
        final SubLObject plist = kb_fol_sentences(folification_properties);
        print_folification_summary(plist, T);
        return plist;
    }

    public static SubLObject deepak_fol_query_to_tptp_stream(final SubLObject cycl_query, final SubLObject mt, final SubLObject fol_sentences_analysis, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject fol_query = query_fol_sentence(cycl_query, mt, $deepak_folification_properties$.getGlobalValue());
        fol_query_to_stream(fol_query, fol_sentences_analysis, $TPTP, stream);
        return NIL;
    }

    public static SubLObject deepak_assertion_fol_sentences(final SubLObject assertion_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject assertion = assertion_handles.find_assertion_by_id(assertion_id);
        print(assertion, UNPROVIDED);
        final SubLObject _prev_bind_0 = $fol_mt_handling$.currentBinding(thread);
        try {
            $fol_mt_handling$.bind($MT_ARGUMENT, thread);
            result = assertion_fol_sentences(assertion);
        } finally {
            $fol_mt_handling$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject deepak_queries_timing_test() {
        return deepak_queries_timing_test_int($deepak_queries$.getGlobalValue(), NIL, NIL, T);
    }

    public static SubLObject deepak_queries_timing_test_2(SubLObject max_time, SubLObject verboseP, SubLObject forget_ephemeral_termsP) {
        if (max_time == UNPROVIDED) {
            max_time = $int$60;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = T;
        }
        if (forget_ephemeral_termsP == UNPROVIDED) {
            forget_ephemeral_termsP = T;
        }
        return deepak_queries_timing_test_int($deepak_queries_2$.getGlobalValue(), max_time, verboseP, forget_ephemeral_termsP);
    }

    public static SubLObject deepak_queries_timing_test_int(final SubLObject queries, final SubLObject max_time, final SubLObject verboseP, final SubLObject forget_ephemeral_termsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject times = NIL;
        if (NIL != forget_ephemeral_termsP) {
            kb_cleanup.forget_ephemeral_terms(UNPROVIDED);
        }
        SubLObject cdolist_list_var = queries;
        SubLObject query = NIL;
        query = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject conditional_sentenceP = inference_strategist.inference_conditional_sentence_p(designated_sentence(query));
            SubLObject time = NIL;
            SubLObject result = NIL;
            SubLObject halt_reason = NIL;
            final SubLObject time_var = get_internal_real_time();
            thread.resetMultipleValues();
            final SubLObject result_$88 = inference_kernel.new_cyc_query(query, NIL, listS($kw88$CONDITIONAL_SENTENCE_, conditional_sentenceP, $MAX_TIME, max_time, $list372));
            final SubLObject halt_reason_$89 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = result_$88;
            halt_reason = halt_reason_$89;
            time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            if (NIL == result) {
                time = $FAILURE;
            }
            if (NIL != verboseP) {
                format(T, $str374$_S___s___s____, new SubLObject[]{ query, halt_reason, time });
                force_output(UNPROVIDED);
            }
            times = cons(time, times);
            cdolist_list_var = cdolist_list_var.rest();
            query = cdolist_list_var.first();
        } 
        return nreverse(times);
    }

    public static SubLObject declare_folification_file() {
        declareFunction(me, "fol_translation_type_property_p", "FOL-TRANSLATION-TYPE-PROPERTY-P", 1, 0, false);
        declareFunction(me, "fol_mt_handling_property_p", "FOL-MT-HANDLING-PROPERTY-P", 1, 0, false);
        declareFunction(me, "fol_isa_handling_property_p", "FOL-ISA-HANDLING-PROPERTY-P", 1, 0, false);
        declareFunction(me, "fol_rmp_handling_property_p", "FOL-RMP-HANDLING-PROPERTY-P", 1, 0, false);
        declareFunction(me, "fol_string_handling_property_p", "FOL-STRING-HANDLING-PROPERTY-P", 1, 0, false);
        declareFunction(me, "fol_number_handling_property_p", "FOL-NUMBER-HANDLING-PROPERTY-P", 1, 0, false);
        declareFunction(me, "fol_output_format_p", "FOL-OUTPUT-FORMAT-P", 1, 0, false);
        declareFunction(me, "new_fol_sentences_analysis", "NEW-FOL-SENTENCES-ANALYSIS", 9, 0, false);
        declareFunction(me, "fol_sentences_analysis_data", "FOL-SENTENCES-ANALYSIS-DATA", 1, 0, false);
        declareFunction(me, "fol_sentences_analysis_generation_properties", "FOL-SENTENCES-ANALYSIS-GENERATION-PROPERTIES", 1, 0, false);
        declareFunction(me, "fol_sentences_analysis_rejection_statistics", "FOL-SENTENCES-ANALYSIS-REJECTION-STATISTICS", 1, 0, false);
        declareFunction(me, "folify_kb", "FOLIFY-KB", 1, 0, false);
        declareFunction(me, "kb_fol_sentences", "KB-FOL-SENTENCES", 0, 1, false);
        declareFunction(me, "cycl_assertions_to_fol", "CYCL-ASSERTIONS-TO-FOL", 1, 2, false);
        declareFunction(me, "cycl_sentences_to_fol", "CYCL-SENTENCES-TO-FOL", 1, 1, false);
        declareFunction(me, "fol_sentences", "FOL-SENTENCES", 3, 1, false);
        declareFunction(me, "assertions_fol_sentences_data", "ASSERTIONS-FOL-SENTENCES-DATA", 9, 0, false);
        declareFunction(me, "sentences_fol_sentences_data", "SENTENCES-FOL-SENTENCES-DATA", 9, 0, false);
        declareFunction(me, "forts_fol_sentences_data", "FORTS-FOL-SENTENCES-DATA", 9, 0, false);
        declareFunction(me, "load_fol_sentences_analysis", "LOAD-FOL-SENTENCES-ANALYSIS", 1, 0, false);
        declareFunction(me, "fol_sentences_input_item_type", "FOL-SENTENCES-INPUT-ITEM-TYPE", 1, 0, false);
        declareFunction(me, "fol_sentences_analysis_nmerge_fol_sentences_data", "FOL-SENTENCES-ANALYSIS-NMERGE-FOL-SENTENCES-DATA", 2, 0, false);
        declareFunction(me, "fol_sentences_to_file", "FOL-SENTENCES-TO-FILE", 3, 0, false);
        declareFunction(me, "fol_sentences_to_stream", "FOL-SENTENCES-TO-STREAM", 2, 1, false);
        declareFunction(me, "fol_sentences_symbol_count", "FOL-SENTENCES-SYMBOL-COUNT", 1, 0, false);
        declareFunction(me, "query_fol_sentence", "QUERY-FOL-SENTENCE", 2, 1, false);
        declareFunction(me, "fol_query_to_stream", "FOL-QUERY-TO-STREAM", 3, 1, false);
        declareFunction(me, "kbq_fol_sentence", "KBQ-FOL-SENTENCE", 1, 1, false);
        declareFunction(me, "kbq_fol_sentence_to_stream", "KBQ-FOL-SENTENCE-TO-STREAM", 3, 2, false);
        declareFunction(me, "assertion_fol_sentences_to_stream", "ASSERTION-FOL-SENTENCES-TO-STREAM", 2, 1, false);
        declareFunction(me, "make_and_postprocess_fol_sentences_datum", "MAKE-AND-POSTPROCESS-FOL-SENTENCES-DATUM", 6, 0, false);
        declareFunction(me, "make_fol_sentences_datum", "MAKE-FOL-SENTENCES-DATUM", 2, 0, false);
        declareFunction(me, "postprocess_fol_sentences_datum", "POSTPROCESS-FOL-SENTENCES-DATUM", 5, 0, false);
        declareFunction(me, "postprocess_fol_sentences_datum_output", "POSTPROCESS-FOL-SENTENCES-DATUM-OUTPUT", 3, 0, false);
        declareFunction(me, "postprocess_fol_sentences_datum_analysis", "POSTPROCESS-FOL-SENTENCES-DATUM-ANALYSIS", 3, 0, false);
        declareFunction(me, "possibly_save_fol_sentences_analysis", "POSSIBLY-SAVE-FOL-SENTENCES-ANALYSIS", 2, 0, false);
        declareFunction(me, "update_fol_analysis_counts", "UPDATE-FOL-ANALYSIS-COUNTS", 1, 0, false);
        declareFunction(me, "check_folification_properties", "CHECK-FOLIFICATION-PROPERTIES", 18, 0, false);
        declareFunction(me, "kb_fol_assertion_under_mt_ceilingP", "KB-FOL-ASSERTION-UNDER-MT-CEILING?", 2, 0, false);
        declareFunction(me, "kb_fol_under_mt_ceilingP", "KB-FOL-UNDER-MT-CEILING?", 2, 0, false);
        declareFunction(me, "assertion_fol_sentences", "ASSERTION-FOL-SENTENCES", 1, 0, false);
        declareFunction(me, "assertion_fol_sentences_int", "ASSERTION-FOL-SENTENCES-INT", 2, 0, false);
        declareFunction(me, "sentence_fol_sentences", "SENTENCE-FOL-SENTENCES", 2, 0, false);
        declareFunction(me, "fol_expand_sentence", "FOL-EXPAND-SENTENCE", 2, 0, false);
        declareFunction(me, "fol_expandible_expressionP", "FOL-EXPANDIBLE-EXPRESSION?", 1, 0, false);
        declareFunction(me, "fol_expandible_rmpP", "FOL-EXPANDIBLE-RMP?", 1, 0, false);
        declareFunction(me, "fol_expand_one_step", "FOL-EXPAND-ONE-STEP", 1, 1, false);
        declareFunction(me, "cnf_clausal_form_for_fol", "CNF-CLAUSAL-FORM-FOR-FOL", 2, 0, false);
        declareFunction(me, "cnf_fol_sentences", "CNF-FOL-SENTENCES", 2, 0, false);
        declareFunction(me, "partition_fol_unhandled_sentences", "PARTITION-FOL-UNHANDLED-SENTENCES", 1, 0, false);
        declareFunction(me, "fol_sentences_datum_update_rejection_statistics", "FOL-SENTENCES-DATUM-UPDATE-REJECTION-STATISTICS", 2, 0, false);
        declareFunction(me, "update_fol_rejection_statistics_for_expression", "UPDATE-FOL-REJECTION-STATISTICS-FOR-EXPRESSION", 2, 0, false);
        declareFunction(me, "print_folification_summary", "PRINT-FOLIFICATION-SUMMARY", 1, 1, false);
        declareFunction(me, "print_fol_rejection_statistics", "PRINT-FOL-REJECTION-STATISTICS", 1, 1, false);
        declareFunction(me, "pretty_print_fol_rejection_statistics", "PRETTY-PRINT-FOL-REJECTION-STATISTICS", 1, 1, false);
        declareFunction(me, "fol_unhandled_explanation", "FOL-UNHANDLED-EXPLANATION", 1, 0, false);
        declareFunction(me, "fol_unhandled_expression_p", "FOL-UNHANDLED-EXPRESSION-P", 1, 0, false);
        declareFunction(me, "contains_fol_unhandled_expression_p", "CONTAINS-FOL-UNHANDLED-EXPRESSION-P", 1, 0, false);
        declareFunction(me, "fol_unhandled", "FOL-UNHANDLED", 2, 0, false);
        declareFunction(me, "additional_gaf_fol_sentences", "ADDITIONAL-GAF-FOL-SENTENCES", 2, 0, false);
        declareFunction(me, "additional_arg_isa_or_arg_genl_sentences", "ADDITIONAL-ARG-ISA-OR-ARG-GENL-SENTENCES", 3, 0, false);
        declareFunction(me, "additional_result_isa_or_result_genl_sentences", "ADDITIONAL-RESULT-ISA-OR-RESULT-GENL-SENTENCES", 3, 0, false);
        declareFunction(me, "nonstandard_sentential_relation_p", "NONSTANDARD-SENTENTIAL-RELATION-P", 1, 0, false);
        declareFunction(me, "clear_fol_sequence_variable_args_for_arity", "CLEAR-FOL-SEQUENCE-VARIABLE-ARGS-FOR-ARITY", 0, 0, false);
        declareFunction(me, "remove_fol_sequence_variable_args_for_arity", "REMOVE-FOL-SEQUENCE-VARIABLE-ARGS-FOR-ARITY", 1, 0, false);
        declareFunction(me, "fol_sequence_variable_args_for_arity_internal", "FOL-SEQUENCE-VARIABLE-ARGS-FOR-ARITY-INTERNAL", 1, 0, false);
        declareFunction(me, "fol_sequence_variable_args_for_arity", "FOL-SEQUENCE-VARIABLE-ARGS-FOR-ARITY", 1, 0, false);
        declareFunction(me, "kb_fol_additional_sentences_for_term", "KB-FOL-ADDITIONAL-SENTENCES-FOR-TERM", 3, 0, false);
        declareMacro(me, "do_arg_isa_gafs", "DO-ARG-ISA-GAFS");
        declareFunction(me, "kb_fol_predicate_arg_type_sentences", "KB-FOL-PREDICATE-ARG-TYPE-SENTENCES", 1, 0, false);
        declareFunction(me, "kb_fol_transitive_binary_predicate_sentences", "KB-FOL-TRANSITIVE-BINARY-PREDICATE-SENTENCES", 1, 0, false);
        declareFunction(me, "kb_fol_symmetric_binary_predicate_sentences", "KB-FOL-SYMMETRIC-BINARY-PREDICATE-SENTENCES", 1, 0, false);
        declareFunction(me, "kb_fol_asymmetric_binary_predicate_sentences", "KB-FOL-ASYMMETRIC-BINARY-PREDICATE-SENTENCES", 1, 0, false);
        declareFunction(me, "kb_fol_reflexive_binary_predicate_sentences", "KB-FOL-REFLEXIVE-BINARY-PREDICATE-SENTENCES", 1, 0, false);
        declareFunction(me, "kb_fol_irreflexive_binary_predicate_sentences", "KB-FOL-IRREFLEXIVE-BINARY-PREDICATE-SENTENCES", 1, 0, false);
        declareFunction(me, "kb_fol_tva_sentences", "KB-FOL-TVA-SENTENCES", 1, 0, false);
        declareFunction(me, "kb_fol_tva_sentences_int", "KB-FOL-TVA-SENTENCES-INT", 1, 0, false);
        declareFunction(me, "kb_fol_tva_pred_neg_lit", "KB-FOL-TVA-PRED-NEG-LIT", 2, 0, false);
        declareFunction(me, "kb_fol_tva_pred_pos_lit", "KB-FOL-TVA-PRED-POS-LIT", 2, 0, false);
        declareFunction(me, "replace_argnum_variable_formula", "REPLACE-ARGNUM-VARIABLE-FORMULA", 3, 0, false);
        declareFunction(me, "argnum_variable_formula", "ARGNUM-VARIABLE-FORMULA", 1, 0, false);
        declareFunction(me, "kb_fol_nat_function_sentences", "KB-FOL-NAT-FUNCTION-SENTENCES", 1, 0, false);
        declareFunction(me, "kb_fol_nat_argument_sentences", "KB-FOL-NAT-ARGUMENT-SENTENCES", 1, 0, false);
        declareFunction(me, "kb_fol_result_isa_sentences", "KB-FOL-RESULT-ISA-SENTENCES", 1, 0, false);
        declareFunction(me, "asent_sentence", "ASENT-SENTENCE", 3, 0, false);
        declareFunction(me, "asent_fol_sentence", "ASENT-FOL-SENTENCE", 3, 0, false);
        declareFunction(me, "genlmt_asent_fol_sentence", "GENLMT-ASENT-FOL-SENTENCE", 1, 0, false);
        declareFunction(me, "different_asent_fol_sentence", "DIFFERENT-ASENT-FOL-SENTENCE", 1, 0, false);
        declareFunction(me, "generic_asent_fol_sentence", "GENERIC-ASENT-FOL-SENTENCE", 3, 0, false);
        declareFunction(me, "isa_asent_fol_sentence", "ISA-ASENT-FOL-SENTENCE", 3, 0, false);
        declareFunction(me, "isa_asent_fol_sentence_as_isa", "ISA-ASENT-FOL-SENTENCE-AS-ISA", 3, 0, false);
        declareFunction(me, "isa_asent_fol_sentence_as_unary_predicate", "ISA-ASENT-FOL-SENTENCE-AS-UNARY-PREDICATE", 2, 0, false);
        declareFunction(me, "fol_transform_args", "FOL-TRANSFORM-ARGS", 1, 0, false);
        declareFunction(me, "fol_transform_arg", "FOL-TRANSFORM-ARG", 1, 0, false);
        declareFunction(me, "fol_transform_microtheory", "FOL-TRANSFORM-MICROTHEORY", 1, 0, false);
        declareFunction(me, "asent_set_sentence", "ASENT-SET-SENTENCE", 3, 0, false);
        declareFunction(me, "genlmt_asent_set_sentence", "GENLMT-ASENT-SET-SENTENCE", 1, 0, false);
        declareFunction(me, "generic_asent_set_sentence", "GENERIC-ASENT-SET-SENTENCE", 3, 0, false);
        declareFunction(me, "isa_asent_set_sentence", "ISA-ASENT-SET-SENTENCE", 3, 0, false);
        declareFunction(me, "different_asent_set_sentence", "DIFFERENT-ASENT-SET-SENTENCE", 1, 0, false);
        declareFunction(me, "set_transform_args", "SET-TRANSFORM-ARGS", 1, 0, false);
        declareFunction(me, "set_transform_function", "SET-TRANSFORM-FUNCTION", 1, 0, false);
        declareFunction(me, "set_transform_arg", "SET-TRANSFORM-ARG", 1, 0, false);
        declareFunction(me, "set_transform_microtheory", "SET-TRANSFORM-MICROTHEORY", 1, 0, false);
        declareFunction(me, "set_transform_predicate", "SET-TRANSFORM-PREDICATE", 2, 0, false);
        declareFunction(me, "fol_transform_predicate", "FOL-TRANSFORM-PREDICATE", 2, 0, false);
        declareFunction(me, "fol_transform_col_as_predicate", "FOL-TRANSFORM-COL-AS-PREDICATE", 2, 0, false);
        declareFunction(me, "fol_transform_function", "FOL-TRANSFORM-FUNCTION", 1, 0, false);
        declareFunction(me, "fol_term_p", "FOL-TERM-P", 1, 0, false);
        declareFunction(me, "fol_represented_term_p", "FOL-REPRESENTED-TERM-P", 1, 0, false);
        declareFunction(me, "fol_unrepresented_term_p", "FOL-UNREPRESENTED-TERM-P", 1, 0, false);
        declareFunction(me, "make_fol_atomic_term", "MAKE-FOL-ATOMIC-TERM", 1, 0, false);
        declareFunction(me, "fol_atomic_term_p", "FOL-ATOMIC-TERM-P", 1, 0, false);
        declareFunction(me, "make_fol_predicate", "MAKE-FOL-PREDICATE", 2, 0, false);
        declareFunction(me, "fol_predicate_p", "FOL-PREDICATE-P", 1, 0, false);
        declareFunction(me, "make_fol_function", "MAKE-FOL-FUNCTION", 2, 0, false);
        declareFunction(me, "fol_function_p", "FOL-FUNCTION-P", 1, 0, false);
        declareFunction(me, "fol_function_arity", "FOL-FUNCTION-ARITY", 1, 0, false);
        declareFunction(me, "make_fol_string", "MAKE-FOL-STRING", 1, 0, false);
        declareFunction(me, "fol_string_p", "FOL-STRING-P", 1, 0, false);
        declareFunction(me, "fol_string_constant_p", "FOL-STRING-CONSTANT-P", 1, 0, false);
        declareFunction(me, "make_fol_number", "MAKE-FOL-NUMBER", 1, 0, false);
        declareFunction(me, "fol_number_p", "FOL-NUMBER-P", 1, 0, false);
        declareFunction(me, "fol_number_constant_p", "FOL-NUMBER-CONSTANT-P", 1, 0, false);
        declareFunction(me, "fol_cafP", "FOL-CAF?", 1, 0, false);
        declareFunction(me, "fol_atomic_sentenceP", "FOL-ATOMIC-SENTENCE?", 1, 0, false);
        declareFunction(me, "fol_closedP", "FOL-CLOSED?", 1, 0, false);
        declareFunction(me, "fol_sentences_data_mentioning_term", "FOL-SENTENCES-DATA-MENTIONING-TERM", 2, 0, false);
        declareFunction(me, "all_fol_predicates_and_arguments_mentioned_in_analysis", "ALL-FOL-PREDICATES-AND-ARGUMENTS-MENTIONED-IN-ANALYSIS", 1, 0, false);
        declareFunction(me, "all_fol_predicates_and_arguments_mentioned_in_analysis_data", "ALL-FOL-PREDICATES-AND-ARGUMENTS-MENTIONED-IN-ANALYSIS-DATA", 1, 0, false);
        declareFunction(me, "all_fol_predicates_and_arguments_mentioned_in_fol_datum", "ALL-FOL-PREDICATES-AND-ARGUMENTS-MENTIONED-IN-FOL-DATUM", 1, 0, false);
        declareFunction(me, "all_fol_predicates_and_arguments_mentioned_in_fol_sentences", "ALL-FOL-PREDICATES-AND-ARGUMENTS-MENTIONED-IN-FOL-SENTENCES", 1, 1, false);
        declareFunction(me, "all_fol_predicates_and_arguments_mentioned_in_focycl_sentence", "ALL-FOL-PREDICATES-AND-ARGUMENTS-MENTIONED-IN-FOCYCL-SENTENCE", 2, 0, false);
        declareFunction(me, "fol_header_to_stream", "FOL-HEADER-TO-STREAM", 3, 0, false);
        declareFunction(me, "fol_datum_to_stream", "FOL-DATUM-TO-STREAM", 3, 0, false);
        declareFunction(me, "fol_sentences_to_cycl_stream", "FOL-SENTENCES-TO-CYCL-STREAM", 2, 0, false);
        declareFunction(me, "fol_header_to_cycl_stream", "FOL-HEADER-TO-CYCL-STREAM", 2, 0, false);
        declareFunction(me, "fol_datum_to_cycl_stream", "FOL-DATUM-TO-CYCL-STREAM", 2, 0, false);
        declareFunction(me, "fol_query_to_cycl_stream", "FOL-QUERY-TO-CYCL-STREAM", 3, 0, false);
        declareFunction(me, "assertions_to_tptp_stream", "ASSERTIONS-TO-TPTP-STREAM", 2, 0, false);
        declareFunction(me, "fol_sentences_to_tptp_stream", "FOL-SENTENCES-TO-TPTP-STREAM", 2, 0, false);
        declareFunction(me, "fol_header_to_tptp_stream", "FOL-HEADER-TO-TPTP-STREAM", 2, 0, false);
        declareFunction(me, "fol_datum_to_tptp_stream", "FOL-DATUM-TO-TPTP-STREAM", 2, 0, false);
        declareFunction(me, "output_tptp_term_comment", "OUTPUT-TPTP-TERM-COMMENT", 2, 0, false);
        declareFunction(me, "fol_query_to_tptp_stream", "FOL-QUERY-TO-TPTP-STREAM", 3, 0, false);
        declareFunction(me, "fol_generate_tptp_header", "FOL-GENERATE-TPTP-HEADER", 1, 0, false);
        declareFunction(me, "fol_tptp_header_add_field", "FOL-TPTP-HEADER-ADD-FIELD", 3, 0, false);
        declareFunction(me, "fol_tptp_header_add_blankline", "FOL-TPTP-HEADER-ADD-BLANKLINE", 1, 0, false);
        declareFunction(me, "tptp_properties_for_header", "TPTP-PROPERTIES-FOR-HEADER", 1, 0, false);
        declareFunction(me, "tptp_property_appropriate_for_printingP", "TPTP-PROPERTY-APPROPRIATE-FOR-PRINTING?", 1, 0, false);
        declareFunction(me, "clear_compute_tptp_query_index_number", "CLEAR-COMPUTE-TPTP-QUERY-INDEX-NUMBER", 0, 0, false);
        declareFunction(me, "remove_compute_tptp_query_index_number", "REMOVE-COMPUTE-TPTP-QUERY-INDEX-NUMBER", 1, 0, false);
        declareFunction(me, "compute_tptp_query_index_number_internal", "COMPUTE-TPTP-QUERY-INDEX-NUMBER-INTERNAL", 1, 0, false);
        declareFunction(me, "compute_tptp_query_index_number", "COMPUTE-TPTP-QUERY-INDEX-NUMBER", 1, 0, false);
        declareFunction(me, "output_focycl_as_tptp", "OUTPUT-FOCYCL-AS-TPTP", 3, 0, false);
        declareFunction(me, "output_fol_query_as_tptp", "OUTPUT-FOL-QUERY-AS-TPTP", 3, 0, false);
        declareFunction(me, "output_tptp_axiom", "OUTPUT-TPTP-AXIOM", 3, 0, false);
        declareFunction(me, "tptp_axiom_id", "TPTP-AXIOM-ID", 1, 0, false);
        declareFunction(me, "output_tptp_query", "OUTPUT-TPTP-QUERY", 3, 0, false);
        declareFunction(me, "output_tptp_sentence_recursive", "OUTPUT-TPTP-SENTENCE-RECURSIVE", 2, 0, false);
        declareFunction(me, "output_tptp_arg", "OUTPUT-TPTP-ARG", 2, 0, false);
        declareFunction(me, "output_tptp_nat", "OUTPUT-TPTP-NAT", 2, 0, false);
        declareFunction(me, "output_tptp_predicate", "OUTPUT-TPTP-PREDICATE", 2, 0, false);
        declareFunction(me, "output_tptp_function", "OUTPUT-TPTP-FUNCTION", 2, 0, false);
        declareFunction(me, "output_tptp_zero_arity_function", "OUTPUT-TPTP-ZERO-ARITY-FUNCTION", 2, 0, false);
        declareFunction(me, "output_tptp_atomic_term", "OUTPUT-TPTP-ATOMIC-TERM", 2, 0, false);
        declareFunction(me, "output_tptp_string_constant", "OUTPUT-TPTP-STRING-CONSTANT", 2, 0, false);
        declareFunction(me, "output_tptp_string", "OUTPUT-TPTP-STRING", 2, 0, false);
        declareFunction(me, "output_tptp_number_constant", "OUTPUT-TPTP-NUMBER-CONSTANT", 2, 0, false);
        declareFunction(me, "output_tptp_number", "OUTPUT-TPTP-NUMBER", 2, 0, false);
        declareFunction(me, "output_tptp_variable", "OUTPUT-TPTP-VARIABLE", 2, 0, false);
        declareFunction(me, "fol_tptp_el_var_name", "FOL-TPTP-EL-VAR-NAME", 1, 0, false);
        declareFunction(me, "tptp_string_stringify", "TPTP-STRING-STRINGIFY", 1, 0, false);
        declareFunction(me, "clear_tptp_long_symbol_name_cache", "CLEAR-TPTP-LONG-SYMBOL-NAME-CACHE", 0, 0, false);
        declareFunction(me, "make_tptp_symbol_name", "MAKE-TPTP-SYMBOL-NAME", 1, 0, false);
        declareFunction(me, "tptp_downcase_stringify", "TPTP-DOWNCASE-STRINGIFY", 1, 0, false);
        declareFunction(me, "tptp_upcase_stringify", "TPTP-UPCASE-STRINGIFY", 1, 0, false);
        declareFunction(me, "tptp_number_stringify", "TPTP-NUMBER-STRINGIFY", 1, 0, false);
        declareFunction(me, "tptp_string_char_p", "TPTP-STRING-CHAR-P", 1, 0, false);
        declareFunction(me, "tptp_non_numeric_atom_char_p", "TPTP-NON-NUMERIC-ATOM-CHAR-P", 1, 0, false);
        declareFunction(me, "tptp_numeric_atom_char_p", "TPTP-NUMERIC-ATOM-CHAR-P", 1, 0, false);
        declareFunction(me, "fol_sentences_to_alchemy_stream", "FOL-SENTENCES-TO-ALCHEMY-STREAM", 2, 0, false);
        declareFunction(me, "fol_header_to_alchemy_stream", "FOL-HEADER-TO-ALCHEMY-STREAM", 2, 0, false);
        declareFunction(me, "fol_datum_to_alchemy_stream", "FOL-DATUM-TO-ALCHEMY-STREAM", 2, 0, false);
        declareFunction(me, "output_alchemy_term_comment", "OUTPUT-ALCHEMY-TERM-COMMENT", 2, 0, false);
        declareFunction(me, "fol_generate_alchemy_header", "FOL-GENERATE-ALCHEMY-HEADER", 1, 0, false);
        declareFunction(me, "focycl_to_cycl", "FOCYCL-TO-CYCL", 1, 0, false);
        declareFunction(me, "generate_symbol_index_file_from_kb", "GENERATE-SYMBOL-INDEX-FILE-FROM-KB", 1, 1, false);
        declareFunction(me, "fol_sentence_allowed_by_horn_handling", "FOL-SENTENCE-ALLOWED-BY-HORN-HANDLING", 2, 0, false);
        declareFunction(me, "generate_symbol_index_file_from_kb_int", "GENERATE-SYMBOL-INDEX-FILE-FROM-KB-INT", 7, 0, false);
        declareFunction(me, "categorize_fol_terms", "CATEGORIZE-FOL-TERMS", 1, 0, false);
        declareFunction(me, "categorize_fol_terms_int", "CATEGORIZE-FOL-TERMS-INT", 1, 0, false);
        declareFunction(me, "print_symbol_index_term_string", "PRINT-SYMBOL-INDEX-TERM-STRING", 3, 0, false);
        declareFunction(me, "fol_constant_string", "FOL-CONSTANT-STRING", 1, 0, false);
        declareFunction(me, "clear_fol_nart_string", "CLEAR-FOL-NART-STRING", 0, 0, false);
        declareFunction(me, "remove_fol_nart_string", "REMOVE-FOL-NART-STRING", 1, 0, false);
        declareFunction(me, "fol_nart_string_internal", "FOL-NART-STRING-INTERNAL", 1, 0, false);
        declareFunction(me, "fol_nart_string", "FOL-NART-STRING", 1, 0, false);
        declareFunction(me, "write_deepak_opencyc_queries", "WRITE-DEEPAK-OPENCYC-QUERIES", 2, 0, false);
        declareFunction(me, "deepak_kb_fol_sentences", "DEEPAK-KB-FOL-SENTENCES", 0, 1, false);
        declareFunction(me, "deepak_fol_query_to_tptp_stream", "DEEPAK-FOL-QUERY-TO-TPTP-STREAM", 3, 1, false);
        declareFunction(me, "deepak_assertion_fol_sentences", "DEEPAK-ASSERTION-FOL-SENTENCES", 1, 0, false);
        declareFunction(me, "deepak_queries_timing_test", "DEEPAK-QUERIES-TIMING-TEST", 0, 0, false);
        declareFunction(me, "deepak_queries_timing_test_2", "DEEPAK-QUERIES-TIMING-TEST-2", 0, 3, false);
        declareFunction(me, "deepak_queries_timing_test_int", "DEEPAK-QUERIES-TIMING-TEST-INT", 4, 0, false);
        return NIL;
    }

    public static SubLObject init_folification_file() {
        deflexical("*FOLIFICATION-VERSION*", $str0$0_7_2);
        defparameter("*FOL-TRANSLATION-TYPE*", $REGULAR_FOL);
        defparameter("*FOL-MT-HANDLING*", $MT_VISIBLE_EXCEPT_CORE_MTS);
        defparameter("*FOL-ISA-HANDLING*", $UNARY_PREDICATE);
        defparameter("*FOL-RMP-HANDLING*", $GAF);
        defparameter("*FOL-STRING-HANDLING*", $ALLOWED);
        defparameter("*FOL-NUMBER-HANDLING*", $DWIM_FLOATS_TO_DISTINCT_CONSTANTS);
        deflexical("*UNFOLIFIABLE-TERMS*", $list14);
        deflexical("*FOLIFICATION-UNHANDLED-EXPLANATION-TABLE*", $list15);
        deflexical("*FOL-OUTPUT-FORMATS*", $list16);
        defparameter("*TPTP-QUERY-NAME*", NIL);
        defparameter("*TPTP-AXIOM-PREFIX*", NIL);
        defparameter("*TPTP-AXIOM-COUNT*", NIL);
        defparameter("*CANDIDATE-SENTENCE-COUNT*", NIL);
        defparameter("*HANDLED-SENTENCE-COUNT*", NIL);
        defparameter("*TERM-COUNT*", NIL);
        defparameter("*HANDLED-TERM-COUNT*", NIL);
        defparameter("*PARTIALLY-HANDLED-TERM-COUNT*", NIL);
        defparameter("*UNHANDLED-TERM-COUNT*", NIL);
        defparameter("*FOL-CURRENT-ASSERTION*", NIL);
        deflexical("*FOL-SEQUENCE-VARIABLE-ARGS-FOR-ARITY-CACHING-STATE*", NIL);
        deflexical("*COMPUTE-TPTP-QUERY-INDEX-NUMBER-CACHING-STATE*", NIL);
        deflexical("*TPTP-LONG-SYMBOL-NAME-CACHE*", SubLSystemTrampolineFile.maybeDefault($tptp_long_symbol_name_cache$, $tptp_long_symbol_name_cache$, () -> make_hash_table($int$256, symbol_function(EQUAL), UNPROVIDED)));
        defparameter("*TPTP-LONG-SYMBOL-MIN-LENGTH*", $int$256);
        defparameter("*INCLUDE-ALCHEMY-COMMENTS?*", T);
        defparameter("*ALCHEMY-OUTPUT-MONOTONIC-RULE-INDICATOR*", NIL);
        defparameter("*CATEGORIZE-FOL-PREDICATES*", NIL);
        defparameter("*CATEGORIZE-FOL-FUNCTIONS*", NIL);
        defparameter("*CATEGORIZE-FOL-TERMS*", NIL);
        deflexical("*FOL-NART-STRING-CACHING-STATE*", NIL);
        deflexical("*DEEPAK-FOLIFICATION-PROPERTIES*", $list366);
        deflexical("*DEEPAK-QUERIES*", $list368);
        deflexical("*DEEPAK-QUERIES-2*", $list369);
        return NIL;
    }

    public static SubLObject setup_folification_file() {
        memoization_state.note_globally_cached_function(FOL_SEQUENCE_VARIABLE_ARGS_FOR_ARITY);
        note_funcall_helper_function($sym290$TPTP_PROPERTY_APPROPRIATE_FOR_PRINTING_);
        memoization_state.note_globally_cached_function(COMPUTE_TPTP_QUERY_INDEX_NUMBER);
        declare_defglobal($tptp_long_symbol_name_cache$);
        memoization_state.note_globally_cached_function(FOL_NART_STRING);
        return NIL;
    }

    private static SubLObject _constant_369_initializer() {
        return list(new SubLObject[]{ list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("BaseKB")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Individual")))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("BaseKB")), list(reader_make_constant_shell(makeString("disjointWith")), reader_make_constant_shell(makeString("Baseball-Ball")), reader_make_constant_shell(makeString("Cube")))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("ProductUsageMt")), list(reader_make_constant_shell(makeString("typePrimaryFunction")), reader_make_constant_shell(makeString("Bathtub")), reader_make_constant_shell(makeString("TakingABath")), reader_make_constant_shell(makeString("deviceUsed")))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("AnimalActivitiesMt")), list(reader_make_constant_shell(makeString("typeBehaviorIncapable")), reader_make_constant_shell(makeString("InanimateObject")), reader_make_constant_shell(makeString("AtLeastPartiallyMentalEvent")), reader_make_constant_shell(makeString("doneBy")))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("UnitedStatesSocialLifeMt")), list(reader_make_constant_shell(makeString("genls")), reader_make_constant_shell(makeString("HumanInfant")), reader_make_constant_shell(makeString("HumanPreSchoolageChild")))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("IndustryMt")), list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("subOrganizations")), makeSymbol("?Z"), makeSymbol("?X")), list(reader_make_constant_shell(makeString("hasMembers")), makeSymbol("?X"), makeSymbol("?Y"))), list(reader_make_constant_shell(makeString("hasMembers")), makeSymbol("?Z"), makeSymbol("?Y")))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("ClothingGMt")), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Garment"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Bluish")))))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("WorldCulturalGeographyDataMt")), list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("perpetrator")), reader_make_constant_shell(makeString("BombingOfIraqEvent")), reader_make_constant_shell(makeString("UnitedStatesOfAmerica"))), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Y"), reader_make_constant_shell(makeString("Person"))), list(reader_make_constant_shell(makeString("responsibleFor")), makeSymbol("?Y"), reader_make_constant_shell(makeString("BombingOfIraqEvent"))))))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("UniversalVocabularyMt")), list(reader_make_constant_shell(makeString("disjointWith")), reader_make_constant_shell(makeString("BlowDryer")), reader_make_constant_shell(makeString("Weapon")))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("UniversalVocabularyMt")), list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("GolfCart"))), list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("ArmoredVehicle")))))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("UniversalVocabularyMt")), list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Alice")), reader_make_constant_shell(makeString("Animal"))), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Alice")), reader_make_constant_shell(makeString("Vegetable-Plant"))), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Alice")), reader_make_constant_shell(makeString("Mineral"))))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("ArtifactGVocabularyMt")), list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("FireplacePoker"))), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("productTypeManufacturedIn")), makeSymbol("?X"), reader_make_constant_shell(makeString("Foundry-Building"))))))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("UniversalVocabularyMt")), list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("parts")), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("parts")), makeSymbol("?Y"), makeSymbol("?Z"))), list(reader_make_constant_shell(makeString("parts")), makeSymbol("?X"), makeSymbol("?Z")))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("UniversalVocabularyMt")), list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("covers-Generic")), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("transformedInto")), makeSymbol("?Y"), makeSymbol("?X"))))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("UniversalVocabularyMt")), list(reader_make_constant_shell(makeString("interArgIsa2-1")), reader_make_constant_shell(makeString("anatomicalParts")), list(reader_make_constant_shell(makeString("FruitFn")), reader_make_constant_shell(makeString("BananaTree"))), reader_make_constant_shell(makeString("BananaTree")))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("UniversalVocabularyMt")), list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("performedBy")), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("ArrestingSomeone"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Y"), reader_make_constant_shell(makeString("PrivateSectorEmployee")))))))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("UniversalVocabularyMt")), list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Thinking"))), list(reader_make_constant_shell(makeString("doneBy")), makeSymbol("?X"), makeSymbol("?Y"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Y"), reader_make_constant_shell(makeString("SomethingExisting"))))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("CIAWorldFactbook1997Mt")), list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("permanentMemberOfOrganization")), reader_make_constant_shell(makeString("SouthKorea")), reader_make_constant_shell(makeString("UNSecurityCouncil"))))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("UniversalVocabularyMt")), list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("ScatteredSpaceRegion"))), list(reader_make_constant_shell(makeString("convexSpaceRegionOf")), makeSymbol("?Y"), makeSymbol("?X")), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Z"), list(reader_make_constant_shell(makeString("convexSpaceRegionOf")), makeSymbol("?X"), makeSymbol("?Z")))), list(reader_make_constant_shell(makeString("componentPartOfSpaceRegion")), makeSymbol("?Y"), makeSymbol("?X")))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("ProductPhysicalCharacteristicsMt")), list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("PhoneAnsweringMachineCombo"))), list(reader_make_constant_shell(makeString("uniformColorOfObject")), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Z"), reader_make_constant_shell(makeString("ResetButton"))), list(reader_make_constant_shell(makeString("surfaceParts")), makeSymbol("?Z"), makeSymbol("?X"))), list(reader_make_constant_shell(makeString("uniformColorOfObject")), makeSymbol("?Z"), makeSymbol("?Y")))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("PatternsOfGlobalTerrorism1998Mt")), list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?COMP2"), reader_make_constant_shell(makeString("IBMNetfinityComputer"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?COMP1"), reader_make_constant_shell(makeString("SunMachine"))), list(reader_make_constant_shell(makeString("equivalentHosts")), makeSymbol("?COMP1"), makeSymbol("?COMP2")), list(reader_make_constant_shell(makeString("doneBy")), makeSymbol("?CRACK"), makeSymbol("?HACKER")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?CRACK"), reader_make_constant_shell(makeString("Cracking-CompromisingSecurity"))), list(reader_make_constant_shell(makeString("securityCompromised")), makeSymbol("?CRACK"), makeSymbol("?COMP1"))), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?ACTION"), list(reader_make_constant_shell(makeString("damages")), makeSymbol("?ACTION"), makeSymbol("?COMP2"))))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("NaiveInformationMt")), list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?CUP"), reader_make_constant_shell(makeString("Demitasse"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?COFFEE"), reader_make_constant_shell(makeString("Coffee-Hot"))), list(reader_make_constant_shell(makeString("in-ContOpen")), makeSymbol("?COFFEE"), makeSymbol("?CUP"))), list(reader_make_constant_shell(makeString("orientation")), makeSymbol("?CUP"), reader_make_constant_shell(makeString("RightSideUp"))))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(reader_make_constant_shell(makeString("typeBehaviorIncapable")), reader_make_constant_shell(makeString("Can")), reader_make_constant_shell(makeString("Cancan-StyleOfDance")), reader_make_constant_shell(makeString("performedBy")))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("relationInstanceExists")), reader_make_constant_shell(makeString("biologicalFather")), reader_make_constant_shell(makeString("Cyc")), reader_make_constant_shell(makeString("MaleAnimal"))))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?TERRORIST"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?TERRORIST"), reader_make_constant_shell(makeString("Terrorist"))), list(reader_make_constant_shell(makeString("birthPlace")), makeSymbol("?TERRORIST"), reader_make_constant_shell(makeString("ContinentOfAsia")))))) });
    }

    @Override
    public void declareFunctions() {
        declare_folification_file();
    }

    @Override
    public void initializeVariables() {
        init_folification_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_folification_file();
    }

    
}

/**
 * Total time: 4850 ms synthetic
 */
